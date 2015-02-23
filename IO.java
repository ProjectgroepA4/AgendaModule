import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO {

	private ObjectInputStream objectInput;
	private ObjectOutputStream objectOutput;
	
	
	public IO(File file) throws IOException {
		objectInput = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		objectOutput = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
	}
	
	public void saveObject(Object o) throws IOException {
		objectOutput.writeObject(o);
	}
}
