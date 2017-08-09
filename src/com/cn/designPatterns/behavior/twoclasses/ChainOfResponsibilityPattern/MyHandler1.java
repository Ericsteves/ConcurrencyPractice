package com.cn.designPatterns.behavior.twoclasses.ChainOfResponsibilityPattern;

public class MyHandler1 extends AbstractHandler{
	private String name;
	
	public MyHandler1(String name) {
		this.name = name;
	}

	@Override
	public void operator(int num) {
		if(num < 10){
			System.out.println("I am Handler1, Num : " + num + " is dealed!");
		}else{
			this.handler.operator(num);
		}
	}
}
