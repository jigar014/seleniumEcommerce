package come.reqres.rest.api.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	//Get Method
	public void restClientGet(String url) throws ClientProtocolException, IOException
	{	//creating response
		 CloseableHttpClient httpclient = HttpClients.createDefault();
		 HttpGet httpget = new HttpGet(url);
		 CloseableHttpResponse closeableHttpResponse =  httpclient.execute(httpget);
		 
		 //Getting Status Code
		 int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		 System.out.println(statusCode);
		 
		 
		 //Getting Status String
		 String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		 JSONObject responseJson = new JSONObject(responseString);
		 System.out.println("ResponseJson------->"+responseJson);
		 
		 
		 //Getting Headers
		 Header[] headerArray = closeableHttpResponse.getAllHeaders();
		 HashMap<String, String> headerMap = new HashMap<String, String>();
		 for(Header header : headerArray)
		 {headerMap.put(header.getName(), header.getValue());}
		 System.out.println("All Headers by Map------->>"+headerMap);

	
	}

}
