package innerclasses;

public   class SOuterClass {
	
	private static int outerVar = 10;
	
	public static class InnerClass {
		private int innerVar = 20;
		
		
		public void display() {
			System.out.println("outer variable  :" + outerVar);
			System.out.println("inner variable : " + innerVar);
		}
	}
	
	public static void main(String[] args) {
//		OuterClass outer = new OuterClass();
//		OuterClass.InnerClass innerObj = outer.new InnerClass();
		
		SOuterClass.InnerClass innerObj = new SOuterClass.InnerClass();
		innerObj.display();
	}

}
