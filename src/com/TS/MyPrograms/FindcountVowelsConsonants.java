package com.TS.MyPrograms;

public class FindcountVowelsConsonants {
	
	public static void main(String[] args) {
		
		
		String s="Maharashtra";
		
		char[] ch=s.toCharArray();
		System.out.println(ch.length);
		 int vowelCount=0;
		  int consonantCount=0;
		  for (int i = 0; i < ch.length; i++) {
			 
		 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='0' || ch[i]=='u') {
			 vowelCount++;
		 }else {
			 consonantCount++;
		}
		  }
		  System.out.println("vowels counts :" +vowelCount);
		  System.out.println("vowels countss :" + consonantCount);
		 
	}

}
