package com.cn.designPatterns.behavior.twoclasses.ObserverPattern;

public class Observer2 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer2 has received!");
	}

}
