package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class MedicineB extends Medicine{

	public MedicineB(String name, double price) {
		super(name, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
