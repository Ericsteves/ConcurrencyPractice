package com.cn.designPatterns.behavior.classesStutas.StatePattern;

public class State {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void method1(){
		System.out.println("Execute 1");
	}
	
	public void method2(){
		System.out.println("Execute 2");
	}
	
}
