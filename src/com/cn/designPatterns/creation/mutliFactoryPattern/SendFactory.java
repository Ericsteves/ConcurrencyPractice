package com.cn.designPatterns.creation.mutliFactoryPattern;

public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}
}
