package com.cn.designPatterns.creation.Singleton;

public class SyncSingleton {
	private SyncSingleton(){};
	
	/*
	 * 使用一个内部类来维护单例
	 * 
	 * */
	private static class SingletonFactory{
		private static SyncSingleton instance = new SyncSingleton();
	}
	
	public static SyncSingleton getInstance(){
		return SingletonFactory.instance;
	}
}
