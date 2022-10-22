package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GroupOperation{
	public static void writeToFile(Group g, File f) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			oos.writeObject(g);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Group readFromFile(File f) {
		Group g = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			g= (Group)ois.readObject();
			return g;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
