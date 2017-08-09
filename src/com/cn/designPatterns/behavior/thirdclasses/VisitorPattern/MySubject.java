package com.cn.designPatterns.behavior.thirdclasses.VisitorPattern;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "Eric";
	}

}
