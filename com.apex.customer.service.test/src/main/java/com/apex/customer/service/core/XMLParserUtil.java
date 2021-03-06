package com.apex.customer.service.core;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.apex.customer.service.entity.Customer;

public class XMLParserUtil {
	public static String getCustomerXMLMessage(Customer customer) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter writer = new StringWriter();
		marshaller.marshal(customer, writer);
		System.out.println(writer);
		String requestMessage = writer.toString();
		return requestMessage;
		}
	
	public static Customer getCustomerStringMessage(String xmlMessage) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer)unMarshaller.unmarshal(new StringReader(xmlMessage));
		return customer;
		}

}
