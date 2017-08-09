package com.cn.designPatterns.structure.ProxyPattern;

public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("the original method!");
	}

}
