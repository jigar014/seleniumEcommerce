package come.reqres.rest.api.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import come.reqres.rest.api.base.TestBase;
import come.reqres.rest.api.client.RestClient;

public class GetApiTest extends TestBase{
	
	String serviceUrl;
	String apiUrl;
	String url;
	
	
	
@BeforeMethod
public void setUp()
{
	TestBase testBase = new TestBase();
	serviceUrl = prop.getProperty("URL");
	apiUrl = prop.getProperty("serviceURL");
	 url = serviceUrl+apiUrl;
	
}
	
	
	
	
	@Test
  public void getAPITestWithoutHeaders() throws ClientProtocolException, IOException {
		
		RestClient restclient = new RestClient();
		restclient.restClientGet(url);
  }
}
