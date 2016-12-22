package GetOffer;

public class Q7 {
	public int Fibonacci(int n){
		if(n < 2)
			return n;
		int fibNMinusOne = 1;
		int fibNMinusTwo = 0;
		int fibN = 0;
		for(int i = 2; i <= n; i++){
			fibN = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
		return fibN;
	}
	
	public int FrogJump(int n){
		if(n == 1 || n ==2)
			return n;
		int sum = 0;
		int step1 = 1;
		int step2 = 2;
		for(int i = 3; i <= n; i++){
			sum = step1 + step2;
			step2 = step1;
			step1 = sum;
		}
		return sum;
	}
	
	public int RectCover(int n){
		if(n <= 2)
			return n;
		int sum = 0;
		int a = 1;
		int b = 2;
		for(int i = 3; i <= n; i++){
			sum = a + b;
			b = a;
			a = sum;
		}
		return sum;
	}
}
