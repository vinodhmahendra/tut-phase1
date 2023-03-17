package innerclasses;

public class LOuterClass {
	
	private int outerVar = 10;
	
	public void display() {
		class LocalClass {
			private int localVar = 20;
			
			public void display () {
				System.out.println("Outer Variable: " + outerVar);
				System.out.println("Local Variable: " + localVar);
			}
		}
		LocalClass localObj = new LocalClass();
		localObj.display();
	}

	public static void main(String[] args) {
		LOuterClass outerObj = new LOuterClass();
		outerObj.display();
	}
}
