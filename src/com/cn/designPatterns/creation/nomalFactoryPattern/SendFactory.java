package com.cn.designPatterns.creation.nomalFactoryPattern;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type) || "Mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type) || "Sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("Wrong Type!");
			return null;
		}
	}
}
