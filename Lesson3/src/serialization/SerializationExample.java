package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
		Person person = new Person("vinodh", 32);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.println("object has been serialized to person.ser");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
