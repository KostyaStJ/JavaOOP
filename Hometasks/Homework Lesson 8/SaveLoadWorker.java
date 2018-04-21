package st.kostya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SaveLoadWorker {
	public static void saveOb(File file, Object object) throws IOException {
		if (file==null || object == null) {
			throw new IllegalArgumentException();
			
		}
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))){
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	public static Object loadOb(File file) throws IOException, ClassNotFoundException{
		if (file==null) {
			throw new IllegalArgumentException();
			
		}
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (IOException e) {
			throw e;
		}
	}



}
