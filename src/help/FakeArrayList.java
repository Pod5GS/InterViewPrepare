package help;

public class FakeArrayList {
	private int size;
	private char[] data;
	public FakeArrayList(int capacity){
		data = new char[capacity];
		size = 0;
	}
	public int getSize(){
		return size;
	}
	public char get(int index){
		return data[index];
	}
	public void set(int index, char value){
		data[index] = value;
	}
}
