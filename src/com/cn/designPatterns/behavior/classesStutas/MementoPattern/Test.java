package com.cn.designPatterns.behavior.classesStutas.MementoPattern;

public class Test {
	public static void main(String[] args){
		Original org = new Original("Eric");
		
		Storage storage = new Storage(org.createMemento());
		
		System.out.println(org.getValue());
		
		org.setValue("Hary");
		System.out.println(org.getValue());
		
		org.restoreMemento(storage.getMemento());
		System.out.println(org.getValue());
	}
}
