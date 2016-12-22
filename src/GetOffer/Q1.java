package GetOffer;

public class Q1 {
	public boolean Find(int array[][],int target){
		int row = array.length - 1;
		int column = 0;
		while(row >= 0 && (column < array[row].length)){
			if(array[row][column] < target){
				column++;
			}else if(array[row][column] > target){
				row--;
			}else{
				return true;
			}
		}
		return false;
	}
}
