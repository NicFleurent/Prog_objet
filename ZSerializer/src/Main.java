import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Stub de la méthode généré automatiquement
		
		/* 
		 * Steps to Serialize
		 * -----------------------------------------------------------------
		 * 1. Your object class should implement Serializable interface
		 * 2. Add import java.io.Serializable;
		 * 3. FileoutPutStream fileout = new FileOutputStream(file path);
		 * 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 * 5. out.writeObject(objectName);
		 * 6. out.close; fileOut.close();
		 * -----------------------------------------------------------------
		 */
		
		/* 
		 * Important note
		 * ---------------------------------------------------------------------------------------------------
		 * 1. Children classes of a parent class that implements Serializable will do so as well
		 * 2. Static field are not serialized (they belong to the class, not an individual object)
		 * 3. The class's definition ("class file") itself is not recorded, cast it as the object type
		 * 4. Fields declared as "transient" aren't serialized, they're ignored
		 * 5. serialVersionUID is a unique version ID
		 * ---------------------------------------------------------------------------------------------------
		 */
		
		//SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
		   //					verifies that the sender and receiver of a serialized object,
		   //					have loaded classes for that object that are compatible
		   //					Ensures object will be compatible between machines
		   //					Number must match. otherwise this will cause a InvalidClassException
		   //					A SerialVersionUID will be calculated based on class properties, members, etc.
		   //					A serializable class can declare its own serialVersionUID explicitly (recommended)
		
		
		User user = new User();
		
		user.name = "Bro";
		user.password = "I<3Pizza";
		

		User user2 = new User();
		
		user2.name = "Bro2";
		user2.password = "I<3Pizza2";
		
		User user3 = new User();
		
		user.name = "Bro3";
		user.password = "I<3Pizza3";
		
		ArrayList<User> listUser = new ArrayList<User>();
		listUser.add(user);
		listUser.add(user2);
		listUser.add(user3);
		
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(listUser);
		out.close();
		fileOut.close();
		
		System.out.println("object info saved! :)");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
	      System.out.println("serialVersionUID: "+serialVersionUID);

	}

}
