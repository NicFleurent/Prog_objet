import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * Steps to deserialize
		 * ---------------------------------------------------------------
		 * 1. Declare your object (don't instantiate)
		 * 2. Your classe should implement Serializable interface
		 * 3. add import java.io.Serializable;
		 * 4. FileInputStream fileIn = new FileInputStream(file path)
		 * 5. ObjectInputStream in = new objectInputStream(fileIn);
		 * 6. objectName = (Class) in.readObject();
		 * 7. in.close(); fileIn.close();
		 * ---------------------------------------------------------------
		 */
		
		User user = null;
		
		ArrayList<User> listUser = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\fleur\\OneDrive - Cégep de Trois-Rivières\\progH23\\ZSerializer\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		listUser = (ArrayList<User>) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(listUser);
		

	}

}
