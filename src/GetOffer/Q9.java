package GetOffer;

public class Q9 {
	public static boolean equal(double num1, double num2){
		if((num1 - num2 < 0.0000001) && (num1 - num2 > -0.0000001))
			return true;
		else
			return false;
	}
	
	public static double Power(double base, int exponent){
		if(exponent < 0 && equal(base, 0.0)){
			System.out.println("invalid input!");
			return 0.0;
		}
		int absExponent = exponent;
		if(exponent < 0)
			absExponent = -exponent;
		double result = PowerWithAbsExponent(base,absExponent);
		if(exponent < 0)
			result = 1.0 / result;
		return result;
	}
	
	public static double PowerWithAbsExponent(double base, int absExponent){
		if(absExponent == 0)
			return 1.0;
		if(absExponent == 1)
			return base;
		double result = PowerWithAbsExponent(base, absExponent >> 1);
		result *= result;
		if((absExponent & 0x1) == 1)
			result = result * base;
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(Power(2,3));
	}
}
