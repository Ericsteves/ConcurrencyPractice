package com.cn.designPatterns.behavior.thirdclasses.VisitorPattern;

public interface Subject {
	
	public void accept(Visitor visitor);
	
	public String getSubject();
}
