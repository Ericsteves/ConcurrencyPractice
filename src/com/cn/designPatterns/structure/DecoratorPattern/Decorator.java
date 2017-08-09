package com.cn.designPatterns.structure.DecoratorPattern;

public class Decorator implements Sourceable{
	private Sourceable source;
	public Decorator(Sourceable source) {
		super();
		this.source=source;
	}
	@Override
	public void method() {
		System.out.println("Before method");
		source.method();
		System.out.println("After method");
		
	}
	
}
