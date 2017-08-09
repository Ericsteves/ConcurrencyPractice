package com.cn.designPatterns.creation.Singleton;

public class Singleton {
	private static Singleton instance = null;
	private Singleton(){}
	public static Singleton getInstace(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
}
