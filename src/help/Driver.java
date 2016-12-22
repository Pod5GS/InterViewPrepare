package help;

public class Driver {
	public static void main(String[] args){
		FakeArrayList first = new FakeArrayList(3);
		first.set(2, 'a');
		first.set(1, 'b');
		FakeArrayList second = new FakeArrayList(5);
		second.set(4,'c');
		second.set(1, 'd');
	}
	
}
