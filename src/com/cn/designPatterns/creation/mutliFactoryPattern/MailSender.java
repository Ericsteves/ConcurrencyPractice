package com.cn.designPatterns.creation.mutliFactoryPattern;

public class MailSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("This is MailSender!");
	}

}
