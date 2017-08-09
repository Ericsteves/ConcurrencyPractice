package com.cn.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
	public static void main(String[] args){
		
		List<String> list = Arrays.asList("Eric","Hary","Allen","Peter","Jobs");
		
		Collections.sort(list, new Comparator<String>() {
		    public int compare(String a, String b) {
		    	System.out.println(a+" : "+b);
		        return b.compareTo(a);
		    }
		});
		//Collections.sort(list, (String a,String b)->{ return a.compareTo(b);});
		//Collections.sort(list,(String a,String b) -> a.compareTo(b));
		//Collections.sort(list,(a,b) -> a.compareTo(b));
		for(String a : list){
			System.out.println(a);
		}
		
	}
}
