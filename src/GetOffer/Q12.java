package GetOffer;

public class Q12 {
	public static void reOrderArray(int[] array){
		if(array == null || array.length == 0)
			return;
		int n = array.length;
		int count = 0;
		for(int i = 0; i < n && count < n; i++){
			count++;
			int a = array[i];
			if((a & 0x1) == 0){
				for(int j = i; j < n-1; j++)
					array[j] = array[j + 1];
				array[n - 1] = a;
				i--;
			}
		}
	}
	
	public static void reOrderArray_2(int[] array){
		if(array == null || array.length == 0)
			return;
		int low = 0;
		int high = array.length - 1;
		while(low < high){
			while(low < high && (array[low] & 0x1) == 1)
				low++;
			while(low < high && (array[high] & 0x1) == 0)
				high--;
			if(low < high){
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			}
		}
	}
	
	public static void main(String[] args){
		int array[] = {1,2,3,4,5};
		reOrderArray_2(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
