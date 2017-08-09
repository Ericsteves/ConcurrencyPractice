package com.cn.designPatterns.behavior.twoclasses.ObserverPattern;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	
	private Vector<Observer> vectors = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vectors.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		if(vectors.size()>0){
			vectors.remove(observer);
		}else{
			System.out.println("Vector is NULL!");
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumo = vectors.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
