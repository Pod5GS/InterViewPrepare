package GetOffer;

public class Q10 {
	public static void Print1ToMaxOfNDigits(int n){
		if(n <= 0)
			return;
		StringBuffer number = new StringBuffer(n);
		for(int i = 0; i < n; i++)
			number.append('0');
		while(!Increment(number)){
			PrintNumber(number);
		}
	}
    
	public static boolean Increment(StringBuffer number){
		boolean isOverflow = false;
		int nTakeOver = 0;
		int nLength = number.length();
		for(int i = nLength - 1; i >= 0; i--){
			int nSum = number.charAt(i) - '0' + nTakeOver;
			if(i == nLength - 1){
				nSum++;
			}
			if(nSum >= 10){
				if(i == 0){
					isOverflow = true;
				}else{
					nSum -= 10;
					nTakeOver = 1;
					number.setCharAt(i, (char)('0' + nSum));
				}
			}else{
				number.setCharAt(i, (char) ('0' + nSum));
				break;
			}
		}
		return isOverflow;
	}
	
	public static void Print1ToMaxOfNDigits_2(int n){
		if(n <= 0)
			return;
		StringBuffer s = new StringBuffer(n);
		for(int i = 0; i < n; i++)
			s.append('0');
		for(int i = 0; i < 10; i++){
			s.setCharAt(0, (char)('0' + i));
			Print1ToMaxOfNDigits_2(s,n,0);
		}
	}
	
	public static void Print1ToMaxOfNDigits_2(StringBuffer s, int n, int index){
		if(index == n - 1){
			PrintNumber(s);
			return;
		}
		for(int i = 0; i < 10; i++){
			s.setCharAt(index + 1, (char)('0' + i));
			Print1ToMaxOfNDigits_2(s,n,index + 1);
		}
	}
	
	public static void PrintNumber(StringBuffer number){
		boolean isBeginning0 = true;
		for(int i = 0; i < number.length(); i++){
			if(isBeginning0 && number.charAt(i) != '0')
				isBeginning0 = false;
			if(!isBeginning0)
				System.out.print(number.charAt(i));
		}
		System.out.println();
	}
	
    public static void main(String[] args){
    	Print1ToMaxOfNDigits_2(6);
    }
}
