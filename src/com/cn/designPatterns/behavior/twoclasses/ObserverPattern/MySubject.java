package com.cn.designPatterns.behavior.twoclasses.ObserverPattern;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Update self!!");
		notifyObservers();
	}

}
