package strings;

public class DemoString {

	public static void main(String[] args) {
		String message = "Hello World";
		System.out.println(message);
		
		String firstName = "vinodh";
		String lastName = "mahendra";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		String str1 = "abc";
		String str2 = "def";
		if ( str1.equals(str2) ) {
			System.out.println("strings are equal!");
		}else {
			System.out.println("strings are not equal");
		}
		
		String sentence = "The quick  brown fox jumps over the lazy dog";
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println(message);
		
		String extractWord = message.substring(0, 5);
		System.out.println(extractWord);

	}

}
