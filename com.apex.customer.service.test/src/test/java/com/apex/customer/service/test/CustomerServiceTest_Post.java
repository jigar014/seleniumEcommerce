package com.apex.customer.service.test;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;

import com.apex.customer.service.core.HttpUtil;
import com.apex.customer.service.core.XMLParserUtil;
import com.apex.customer.service.entity.Customer;

public class CustomerServiceTest_Post implements CustomerServiceConstants{

	@Test
	public void f () throws ClientProtocolException, IOException, JAXBException 
	{
		String requestMessage = XMLParserUtil.getCustomerXMLMessage(new Customer(7005,"FN","LN","ST","CTY"));
		HttpResponse response = HttpUtil.sendAndReceiveMsgWithPostRequest(SERVICE_URL, requestMessage);
		System.out.println(response.getStatusLine().getStatusCode());
	}
	

}
