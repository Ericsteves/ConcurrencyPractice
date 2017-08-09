package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public abstract class Visitor {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void visit(MedicineA a);
	public abstract void visit(MedicineB b);
	public abstract void visit(MedicineC c);
}
