package com.apex.soap.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Choti {
public static void main(String[] args) throws Exception, Exception {
	String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/10";
	HttpClient client = HttpClientBuilder.create().build();
	HttpGet requestMessage = new HttpGet(url);
	
	HttpResponse response = client.execute(requestMessage);
	System.out.println(response.getStatusLine().getStatusCode());
	System.out.println(response.getStatusLine().getReasonPhrase());
	
	BufferedReader read = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = read.readLine())!=null)
	{
		result.append(line);
		System.out.println(line);
	}


}
}
