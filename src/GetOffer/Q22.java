package GetOffer;

public class Q22 {
	public static boolean VerifySequenceOfBSTtree(int[] array, int start, int end){
		if(array == null || start < 0 || end < 0)
			return false;
		int root = array[end];
		int i = start;
		for( ;i < end; i++){
			if(array[i] > root){
				break;
			}
		}
		for(int j = i; j < end; j++){
			if(array[j] < root){
				return false;
			}
		}
		boolean left = true;
		if(i > start)
			left = VerifySequenceOfBSTtree(array, start, i - 1);
		boolean right = true;
		if(i < end - 1)
			right = VerifySequenceOfBSTtree(array,i,end - 1);
		return left & right;
	}
	public static void main(String[] args) {
        int[] a = new int[]{5, 7, 6, 9, 11, 10, 8};
        int[] b = new int[]{7, 4, 6, 5};
        int[] c = new int[]{11, 10, 9, 8}; 
        System.out.println(VerifySequenceOfBSTtree(a, 0, a.length - 1));
        System.out.println(VerifySequenceOfBSTtree(b, 0, b.length - 1));
        System.out.println(VerifySequenceOfBSTtree(c, 0, c.length - 1));

    }
}
