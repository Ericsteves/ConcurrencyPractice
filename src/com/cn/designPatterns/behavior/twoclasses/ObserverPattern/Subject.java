package com.cn.designPatterns.behavior.twoclasses.ObserverPattern;

public interface Subject {
	
	public void add(Observer observer);
	
	public void delete(Observer observer);
	
	public void notifyObservers();
	
	public void operation();
}
