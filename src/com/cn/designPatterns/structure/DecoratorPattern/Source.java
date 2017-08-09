package com.cn.designPatterns.structure.DecoratorPattern;

public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
