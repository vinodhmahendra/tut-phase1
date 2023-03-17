package innerclasses;

public class OuterClass {
	private int outerVar = 10;
	
	
	public class InnerClass {
		private int innerVar = 20;
		
		public void display() {
			System.out.println("Outer Variable : " +outerVar);
			System.out.println("Inner Variable : " + innerVar);
		}
	}
	
	public static void main(String [] args) {
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObject = outerObj.new InnerClass();
		innerObject.display();
	}

}
