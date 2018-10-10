package main.serializationcheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

import main.singletonmodel.RazakSingleton;
/**
 * Use objectinput and ObjectOutput to seralize and de-serialize objects.
 * 
 * @author m1017056
 *
 */
public class TestSerialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RazakSingleton razak1= RazakSingleton.getInstance();
		System.out.println("my object"+razak1);	
		
		try {
			ObjectOutput outputStream = new ObjectOutputStream(new FileOutputStream("razak.sr"));
			outputStream.writeObject(razak1);
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RazakSingleton razak2 = null;
		try {
			ObjectInput objectInput= new ObjectInputStream(new FileInputStream("razak.sr"));
			razak2= (RazakSingleton) objectInput.readObject();
			objectInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("my object "+razak2);
		Set<RazakSingleton> setOfInstances=new HashSet<RazakSingleton>();
		setOfInstances.add(razak1);
		setOfInstances.add(razak2);
		
		System.out.println(setOfInstances.size());
		

	}

}
