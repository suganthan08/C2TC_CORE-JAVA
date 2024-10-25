package com.tns.ifet.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is" + byteMin+"Max range of byte is"+byteMax);
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Minshort range of byte is"+ shortMin+"Maxshort range of byte is"+shortMax);
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		
		System.out.println("Minint range of byte is"+ minInt+"Maxint range of byte is"+maxInt);
		
		float f=3234.141243278345f;
		double d=3456.141245123567203678902345678914f;
		System.out.println("float value is "+f+"double value is "+d);
		
		boolean flag=false;
		System.out.println("boolean value is "+flag);

	}

}
