package com.TS.MyPrograms;

public class EachSecondLetterCapital {
	
	public static void main(String[] args) {
		String s="testing shastra is great";
		
		String[] s1=s.split(" ");
		String s2;
		String s3;
		String s4="";
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				s2=s1[i].substring(0, 1).toUpperCase();
				s3=s1[i].substring(1,s1.length-1).toUpperCase();
				s4=s2.concat(s3);
			}
		
			
		}
		System.out.println(s4);
	}

}
