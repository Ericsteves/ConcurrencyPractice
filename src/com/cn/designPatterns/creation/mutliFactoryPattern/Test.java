package com.cn.designPatterns.creation.mutliFactoryPattern;

public class Test {
	public static void main(String[] args){
		SendFactory sf = new SendFactory();
		Sender sender = sf.produceSms();
		sender.send();
	}
}
