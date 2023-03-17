package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) {
		Person deserializedPerson = null;
		try {
			FileInputStream fileIn = new FileInputStream("person.ser");
			ObjectInputStream in =new ObjectInputStream(fileIn);
			
			deserializedPerson = (Person) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Deserialized Person:");
		System.out.println("Name: " + deserializedPerson.getName());
		System.out.println("Age: "+deserializedPerson.getAge());
	}

}
