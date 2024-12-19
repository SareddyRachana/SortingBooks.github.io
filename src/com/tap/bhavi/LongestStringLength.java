package com.tap.bhavi;

import java.util.Scanner;

public class LongestStringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = sc.nextInt();
		int length = findLengthofString(input,n);
		System.out.println(length);

	}

	public static int findLengthofString(String input, int k) {
		if(input.length()<k) {
			return 0;
		}
		int maxLen = 0;
		for(int i=0; i<input.length()-k; i++) {
			for(int j=i+k-1; j<input.length(); j++) {
				String substring = input.substring(i,j+1);
				if(isValidSubstring(substring,k)) {
					maxLen = Math.max(maxLen, substring.length());
				}
			}
		}
		
		return maxLen;
	}

	private static boolean isValidSubstring(String substring, int k) {
		for(char c : substring.toCharArray()) {
			if(substring.lastIndexOf(c) - substring.indexOf(c) + 1 < k) {
				return false;
			}
		}
		
		return true;
	}

}
