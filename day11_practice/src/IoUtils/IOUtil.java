package IoUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.core.Employee;

public interface IOUtil {
static void storeEmpDetails(String filename,Map<String,Employee>emps) throws IOException {
	try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)) )
	{
		out.writeObject(emps);
	}//sereilization
}


@SuppressWarnings("unchecked")
static  Map<String,Employee> restoreEmpDetails(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
	try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)) ){
		
	
	return ( Map<String,Employee>)in.readObject();
	}//deserialiazation
}
}
