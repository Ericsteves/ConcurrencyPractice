package com.cn.designPatterns.creation.abstractFactoryPattern;

public class Test {
	public static void main(String[] args){
//		SendFactory sf = new SendFactory();
//		Sender sender = sf.produceSms();
		Provider provider = new SenderMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
