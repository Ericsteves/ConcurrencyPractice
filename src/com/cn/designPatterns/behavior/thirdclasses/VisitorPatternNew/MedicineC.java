package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class MedicineC extends Medicine{

	public MedicineC(String name, double price) {
		super(name, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
