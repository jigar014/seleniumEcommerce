package com.corejava.statment;

public class Replace {

	public static void main (String [] args)
	{
		String url = "www. google . com";
		System.out.println(url);
		
		System.out.println(url.replaceAll("\\s+", "%20"));
	}
}