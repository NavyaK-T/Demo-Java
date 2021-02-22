package com.string.demo;
/*
 * Navya
 */
public class StringCalculator {
	public int sum(String input) {
		int resultSum = 0;
		if(input.length() == 0) {
			resultSum=0;
		}else {		
			String[] s = input.split("[,\\.\\!\\:]+");
			
			for(int i=0; i<s.length;i++) {
				if(!s[i].equals(" ")) {
					resultSum = resultSum+Integer.parseInt(s[i]);
				}			
			}
		}
		return resultSum;		
	}
	public static void main(String[] args) {
		String s=" ,12, ,1,. !, : ";
		StringCalculator sc = new StringCalculator();
		int result = sc.sum(s);
		System.out.println("Sum is: "+result);
	}
}
