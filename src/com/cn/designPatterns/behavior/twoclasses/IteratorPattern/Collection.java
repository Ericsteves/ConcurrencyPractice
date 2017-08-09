package com.cn.designPatterns.behavior.twoclasses.IteratorPattern;

public interface Collection {
	
	public void setStr(String str[]);
	
	public Iterator iterator();
	
	public Object get(int i);
	
	public int size();
	
}
