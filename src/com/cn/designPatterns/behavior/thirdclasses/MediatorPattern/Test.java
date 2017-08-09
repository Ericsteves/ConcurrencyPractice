package com.cn.designPatterns.behavior.thirdclasses.MediatorPattern;

import javax.print.attribute.standard.Media;

public class Test {
	public static void main(String[] args){
		
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll(new User2(mediator));
		
	}
}
