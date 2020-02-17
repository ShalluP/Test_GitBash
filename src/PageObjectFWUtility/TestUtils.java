package PageObjectFWUtility;

import java.io.FileReader;
import java.util.Properties;

public class TestUtils {
 public static String readProperty(String key) throws Exception
 {
	 FileReader reader = new FileReader("C:\\Users\\Shallu\\eclipse-workspace\\Wahigur\\src\\PageObjectFWResources.properties");
	 Properties p = new Properties();
	 p.load(reader);
	 return p.getProperty(key);
 }
	public static void main(String[] args) {
		
	}

}
