package com.corejava.statment;

public class Stt {
public static void main (String [] args){
	String abcd = "  ABCD EFGH IJKL MNOP QRST UVWX YZ   ";
	String dc = "AAP";
	String de = "PAA";
	
	System.out.println(abcd.length());
	System.out.println(abcd.toUpperCase());
	System.out.println(abcd.toLowerCase());
	System.out.println(de.equals(dc));
	System.out.println(de.compareTo(dc));
	System.out.println(abcd.trim());
	System.out.println(abcd.charAt(23));
	System.out.println(abcd.concat(dc));
	System.out.println(dc.regionMatches(0,de,0,0));
	System.out.println(abcd.replace(" ","%20"));
	
}
}
