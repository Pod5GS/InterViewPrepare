package algorithms;

public class testSort{
	public static void bubbleSort(int unsorted[]){
	    if(unsorted == null)
	        return;
	    for(int i = unsorted.length - 1; i >= 0; i--){
	        for(int j = 1; j <= i; j++){
	            if(unsorted[j-1] > unsorted[j]){
	                int temp = unsorted[j-1];
	                unsorted[j-1] = unsorted[j];
	                unsorted[j] = temp;
	            }
	        }
	    }
	}
	public static void insertionSort(int unsorted[]){
	    if(unsorted == null)
	        return;
	    for(int i = 1; i < unsorted.length; i++){
	        int index = unsorted[i];
	        int j = i;
	        while(j > 0 && unsorted[j-1] > index){
	            unsorted[j] = unsorted[j-1];
	            j--;
	        }
	        unsorted[j] = index;
	    }
	}
	public static void mergeSort(int unsorted[], int low, int high){
	    if(low < high){
	        int mid = low + (high - low) / 2;
	        mergeSort(unsorted, low, mid);
	        mergeSort(unsorted, mid + 1, high);
	        merge(unsorted, low, mid, high);
	    }
	}
	public static void merge(int unsorted[], int low, int mid, int high){
	    int n1 = mid - low + 1;
	    int n2 = high - mid;
	    int[] L = new int[n1];
	    int[] R = new int[n2];
	    int i, j, k;
	    for(i = 0; i < n1; i++)
	        L[i] = unsorted[low + i];
	    for(j = 0; j < n2; j++)
	        R[j] = unsorted[mid + 1 + j];
	    i = 0;
	    j = 0;
	    k = low;
	    while(i < n1 && j < n2){
	        if(L[i] >= R[j]){
	            unsorted[k] = R[j];
	            j++;
	        }else{
	            unsorted[k] = L[i];
	            i++;
	        }
	        k++;
	    }
	    while(i < n1){
	        unsorted[k] = L[i];
	        i++;
	        k++;
	    }
	    while(i < n2){
	        unsorted[k] = R[j];
	        j++;
	        k++;
	    }
	}
	public static void quickSort(int unsorted[], int low, int high){
	    if(low < high){
	        int pivot = partition(unsorted, low, high);
	        quickSort(unsorted, low, pivot - 1);
	        quickSort(unsorted, pivot + 1, high);
	    }
	}
	public static int partition(int unsorted[], int low, int high){
	    int pivot = unsorted[high];
	    int index = low - 1;
	    int temp = 0;
	    for(int j = low; j <= high - 1; j++){
	        if(unsorted[j] <= pivot){
	            index++;
	            temp = unsorted[index];
	            unsorted[index] = unsorted[j];
	            unsorted[j] = temp;
	        }
	    }
	    temp = unsorted[index + 1];
	    unsorted[index + 1] = unsorted[high];
	    unsorted[high] = temp;
	    return index + 1;
	}
	
	public static void HeapSort(int arr[]){
		int length = arr.length;
		for(int i = length / 2 - 1; i >= 0; i--)
			buildheap(arr, length, i);
		for(int i = length - 1; i >= 0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			buildheap(arr, i, 0);
		}
	}
	
	public static void buildheap(int arr[], int length, int i){
		int largest = i;
		int l = 2 * largest + 1;
		int r = 2 * largest + 2;
		if(l < length && arr[l] > arr[largest])
			largest = l;
		if(r < length && arr[r] > arr[largest])
			largest = r;
		if(largest != i){
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			buildheap(arr, length, largest);
		}
	}
	
	public static void main(String[] args){
		int arr[] = {21,25,49,25,16,8};
		mergeSort(arr,0,arr.length - 1);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ",");
	}
}
