package com.apex.customer.service.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpUtil {
	public static HttpResponse sendAndReceiveMsgWithGetRequest(String url) throws IOException, ClientProtocolException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendAndReceiveMsgWithPutRequest(String url, String requestMessage)
			throws IOException, ClientProtocolException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPut request = new HttpPut(url);
		// set Entity
		StringEntity stringEntity = new StringEntity(requestMessage);
		request.setEntity(stringEntity);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendAndReceiveMsgWithPostRequest(String url, String requestMessage)
			throws IOException, ClientProtocolException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(url);
		// set Entity
		StringEntity stringEntity = new StringEntity(requestMessage);
		request.setEntity(stringEntity);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendAndReceiveMsgWithDeleteRequest(String url)
			throws IOException, ClientProtocolException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete request = new HttpDelete(url);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static String getResposeString(HttpResponse response) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = read.readLine()) != null) {
			result.append(line + "/n");
		}
		return result.toString();
	}

}
