package com.cn.designPatterns.behavior.twoclasses.ChainOfResponsibilityPattern;

public class MyHandler2 extends AbstractHandler{

	@Override
	public void operator(int num) {
		if(num >= 10 ){
			System.out.println("I am Handler2,Num : "+num+" is dealed!");
		}else{
			System.out.println("No one deal with Num : "+num);
		}
	}

}
