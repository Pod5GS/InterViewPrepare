package GetOffer;

public class Q8 {
	public int numOf1s(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = n & (n-1);
		}
		return count;
	}
}
