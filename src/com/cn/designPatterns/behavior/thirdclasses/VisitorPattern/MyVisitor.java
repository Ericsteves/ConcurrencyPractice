package com.cn.designPatterns.behavior.thirdclasses.VisitorPattern;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject subject) {
		System.out.println("Visit the subject :"+subject.getSubject());
	}

}
