package com.cn.designPatterns.behavior.twoclasses.ChainOfResponsibilityPattern;

public class Test {
	
	public static void main(String[] args){
		
		AbstractHandler h1 = new MyHandler1("Handler1");
		AbstractHandler h2 = new MyHandler2();
		
		h1.setHandler(h2);
		
		int[] nums = {3,10,5,45};
		
		for(int num : nums){
			h1.operator(num);
		}
	}
}
