package com.cn.designPatterns.behavior.thirdclasses.MediatorPattern;

public class User1 extends User{

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User1 execute!");
	}

}
