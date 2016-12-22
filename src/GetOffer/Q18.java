package GetOffer;

public class Q18 {
	public static void PrintMatrix(int[][] matrix){
		if(matrix == null)
			return;
		int rows = matrix.length;
		int columns = 0;
		if(rows > 0)
			columns = matrix[0].length;
		else
			return;
		int start = 0;
		while(rows > start * 2 && columns > start * 2){
			PrintMatrixInCircle(matrix,rows,columns,start);
			start++;
		}
	}
	public static void PrintMatrixInCircle(int[][] matrix, int rows, int columns, int start){
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		//从左至右打印一行
		for(int i = start; i <= endX; i++)
			System.out.print(matrix[start][i] + " ");
		if(endY > start){//从上至下打印一行
			for(int i = start + 1; i <= endY; i++)
				System.out.print(matrix[i][endX] + " ");
		}
		if(endX > start && endY > start){//从右至左打印一行
			for(int i = endX - 1; i >= start;i--)
				System.out.print(matrix[endY][i] + " ");
		}
		if(endX > start && endY - 1 > start){//从下往上打印一行
			for(int i = endY - 1; i >= start + 1; i--)
				System.out.print(matrix[i][start] + " ");
		}
	}
	public static void main(String[] args){
		int[][] matrix = {
				{1},
		};
		PrintMatrix(matrix);
	}
}
