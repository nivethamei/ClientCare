package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClientCare_PropertyFile_Utility {
	
	/**
	 * This method is used to read the date from the property file
	 * @throws IOException 
	 */
	public String toReadDataFromPropertyFile(String key) throws IOException {
		
		// Create an object of FIS
		FileInputStream fis=new FileInputStream("./configAppData/commondata.properties");
		// Create an object of properties file
		Properties prop=new Properties();
		// load the datas
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
	}

}
