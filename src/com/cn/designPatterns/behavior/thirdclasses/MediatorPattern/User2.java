package com.cn.designPatterns.behavior.thirdclasses.MediatorPattern;

public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User2 execute!");
	}

}
