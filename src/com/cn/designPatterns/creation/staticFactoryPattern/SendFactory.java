package com.cn.designPatterns.creation.staticFactoryPattern;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
