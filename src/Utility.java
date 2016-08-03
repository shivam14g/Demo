import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Utility {

	Properties p;
	public void createPropertyPath()
	{
		FileInputStream fip = null;
		File file=new File("/home/shivamtiwari1/workspace/newProject/src/page.property");
		try
		{	
			fip=new FileInputStream(file);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		p=new Properties();
		try {
			p.load(fip);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public String getLocatorId(String locatorName)
	{
		return p.getProperty(locatorName);
		
	}
	
}
