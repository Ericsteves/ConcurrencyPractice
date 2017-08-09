package com.cn.test;

public class longestPalindrome {
	public static String getLongestPalindrome(String s){
		String result = "";
		
		int max = 0;
		
		for(int i=0;i<s.length();i++){
			
			int pStart = i;
			int pEnd = i+1;
			
			while(pStart >= 0 && pEnd <=s.length()-1 && s.charAt(pStart)==s.charAt(pEnd)){
				System.out.println("1==>"+pStart+"-"+s.charAt(pStart)+":"+pEnd+"-"+s.charAt(pEnd));
				pStart--;
				pEnd++;
			}
			
			if(max<(pEnd-pStart-1)){
				max = pEnd-pStart-1;
				result = s.substring(pStart+1, pEnd);
			}
			
			pStart = i - 1;
			pEnd = i + 1;
			while(pStart >= 0 && pEnd <=s.length()-1 && s.charAt(pStart)==s.charAt(pEnd)){
				System.out.println("2==>"+i+" "+pStart+"-"+s.charAt(pStart)+":"+pEnd+"-"+s.charAt(pEnd));
				pStart--;
				pEnd++;
			}
			
			if(max<(pEnd-pStart-1)){
				max = pEnd-pStart-1;
				result = s.substring(pStart+1, pEnd);
			}
			
		}
		
		System.out.println("The max size is "+max);
		return result;
		
	}
	
	public static void main(String[] agrs){
		System.out.println(getLongestPalindrome("abbadccd"));
	}
}
