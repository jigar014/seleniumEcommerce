package com.apex.customer.service.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;

import com.apex.customer.service.core.HttpUtil;

public class CustomerServiceTest_Delete implements CustomerServiceConstants{

@Test
public void customerServiceTest_Delete () throws ClientProtocolException, IOException
{
	HttpResponse response = HttpUtil.sendAndReceiveMsgWithDeleteRequest(SERVICE_URL);
	
}

	
	
	
}
