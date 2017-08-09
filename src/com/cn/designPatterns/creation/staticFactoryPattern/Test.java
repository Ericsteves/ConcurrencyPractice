package com.cn.designPatterns.creation.staticFactoryPattern;

public class Test {
	public static void main(String[] args){
//		SendFactory sf = new SendFactory();
//		Sender sender = sf.produceSms();
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
