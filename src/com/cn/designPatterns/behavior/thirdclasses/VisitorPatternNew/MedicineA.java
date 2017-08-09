package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class MedicineA extends Medicine{

	public MedicineA(String name, double price) {
		super(name, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
