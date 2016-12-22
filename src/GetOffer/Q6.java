package GetOffer;

public class Q6 {
	public int minNumInRotateArray(int[] array){
		if(array.length == 0)
			return 0;
		int low = 0;
		int high = array.length - 1;
		int mid = low;//当旋转数组是原数组时，最小的元素就是第一个元素，所以把mid初始化为low
		while(array[low] >= array[high]){
			if(high - low == 1){
				mid = high;
				break;
			}
			mid = low + (high - low) / 2;
			if(array[low] == array[high] && array[mid] == array[low])
				return minInorder(array,low,high);
			if(array[mid] >= array[low])
				low = mid;
			else if(array[mid] <= array[high])
				high = mid;
		}
		return array[mid];
	}
	
	public int minInorder(int[] array, int low, int high){
		int result = array[low];
		for(int i = low + 1; i <= high; i++){
			if(array[i] < result)
				result = array[i];
		}
		return result;
	}
}
