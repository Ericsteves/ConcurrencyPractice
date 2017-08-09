package com.cn.designPatterns.creation.abstractFactoryPattern;

public class SenderMailFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
