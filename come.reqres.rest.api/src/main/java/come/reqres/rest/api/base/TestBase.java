package come.reqres.rest.api.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src\\main\\java\\come\\reqres\\rest\\api\\config\\config.properties");
			//C:\Users\HP\workspace\come.reqres.rest.api\src\main\java\come\reqres\rest\api\config\config.properties
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
