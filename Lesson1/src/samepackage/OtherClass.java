package samepackage;

public class OtherClass {
	
	public void accessPrivateMember() {
		SuperClass s = new SuperClass();
//		s.name = "vinodh"; //	The field SuperClass.name is not visible (compiler error)
	 }
	
	public void accessPackageMember() {
		SuperClass s = new SuperClass();
		s.name = "vinodh"; //	The field SuperClass.name is not visible (compiler error)
	 }
	
	public void accessProtectedMember() {
		SuperClass s = new SuperClass();
		s.name = "vinodh"; //	The field SuperClass.name is now visible 
	 }
	
	public void accessPublicMember() {
		SuperClass s = new SuperClass();
		s.name = "vinodh"; //	The field SuperClass.name is now visible 
	 }

}
