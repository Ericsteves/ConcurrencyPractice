package com.cn.designPatterns.structure.ProxyPattern;

public class Proxy implements Sourceable {
	private Sourceable source;
	public Proxy(Sourceable source){
		super();
		this.source = source;
	}
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	public void before(){
		System.out.println("Before proxy!");
	}
	public void after(){
		System.out.println("After proxy!");
	}

}
