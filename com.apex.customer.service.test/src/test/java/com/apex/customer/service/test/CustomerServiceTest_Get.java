package com.apex.customer.service.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.customer.service.core.HttpUtil;

public class CustomerServiceTest_Get implements CustomerServiceConstants {

	// public static String SERVICE_URL1 = "http://www.thomas-bayer.com/";

	@Test
	public void testwithSucessfulScenario() throws ClientProtocolException, IOException {

		String userId = "2/";
		HttpResponse response = HttpUtil.sendAndReceiveMsgWithGetRequest(SERVICE_URL+userId);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "OK");
		String responseMessage = HttpUtil.getResposeString(response);
		System.out.println(responseMessage);
		Assert.assertTrue(responseMessage.contains("Anne"));
		Assert.assertTrue(responseMessage.contains("<CITY>"));
		Assert.assertFalse(responseMessage.contains("<ERRORCODE>"));
	}

	@Test
	public void testwith404Scenario() throws ClientProtocolException, IOException {
		String userId = "10000/";
		HttpResponse response = HttpUtil.sendAndReceiveMsgWithGetRequest(SERVICE_URL + userId);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_NOT_FOUND);
		Assert.assertEquals(response.getStatusLine().getReasonPhrase(), "Not Found");
		String resposeMessage = HttpUtil.getResposeString(response);
		System.out.println(resposeMessage);
		
	}

}
