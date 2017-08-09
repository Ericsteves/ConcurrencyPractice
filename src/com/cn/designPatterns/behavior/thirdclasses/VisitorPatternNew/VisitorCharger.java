package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class VisitorCharger extends Visitor{

	@Override
	public void visit(MedicineA a) {
		// TODO Auto-generated method stub
		System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
	}

	@Override
	public void visit(MedicineB b) {
		// TODO Auto-generated method stub
		System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
	}

	@Override
	public void visit(MedicineC c) {
		System.out.println("划价员：" + name +"给药" + c.getName() +"划价:" + c.getPrice());
	}
	
}
