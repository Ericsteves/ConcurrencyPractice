package com.cn.designPatterns.creation.abstractFactoryPattern;

public class SenderSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
