package org.java;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str="kashi";
		String rev=" ";
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println("Reverse String is"+rev);
	}
}
