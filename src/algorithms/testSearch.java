package algorithms;

public class testSearch {
	public static int BinarySearch(int array[], int low, int high, int key){
		if(array == null)
			return -1;
		if(low <= high){
			int mid = low + (high - low) / 2;
			if(array[mid] == key)
				return mid;
			else if(array[mid] > key)
				return BinarySearch(array, low, mid - 1, key);
			else if(array[mid] < key)
				return BinarySearch(array, mid + 1, high, key);
			else
				return -1;
		}else
			return -1;
	}
	public static int BinarySearch(int array[], int key){
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while(low <= high){
			mid = low + (high - low) / 2;
			if(array[mid] == key)
				return mid;
			else if(array[mid] > key)
				high = mid - 1;
			else if(array[mid] < key)
				low = mid + 1;
		}
		return -1;
	}
}
