package pkTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		File file = 
	                new File("Output.txt");
		if(file.exists()){
			System.out.println("file exist.");
		}else{
			System.out.println("file not exist.");
		}
		
		String[] names = {"John", "Carl", "Jerry"};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
			writer.write("writing into a file.");
			writer.write("\nHere is an other line.");
			
			for(String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
