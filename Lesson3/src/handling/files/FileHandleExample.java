package handling.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandleExample {

	public static void main(String[] args) throws IOException{
		
		File file = new File("myfile.txt");
		
		FileWriter writer  = new FileWriter(file);
		
		writer.write("Hello, World");
		writer.close();
		
		
		FileWriter update = new FileWriter(file,true);
		update.write("\n");
		update.write("This text will be appended to the end of the file.");
		update.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ( (line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
		if ( file.delete() ) {
			System.out.println("file deleted successfully");
		}else {
			System.out.println("Failed to delete the file");
		}

	}

}
