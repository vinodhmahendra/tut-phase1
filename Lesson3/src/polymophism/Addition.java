package polymophism;

public class Addition {

	public static void main(String[] args) {
		add ( 10,20);
		add ( 10,20,30);

	}
	private static void add(int i, int j, int k) {
		System.out.println(i+j+k);
		
	}
	private static void add(int i, int j) {
		System.out.println(i+j);
	}

}
