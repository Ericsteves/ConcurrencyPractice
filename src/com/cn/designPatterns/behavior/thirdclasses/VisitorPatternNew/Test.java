package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class Test {
	public static void main(String[] args){
		Medicine a = new MedicineA("AAA", 11.0);
		Medicine b = new MedicineB("BBB", 14.2);
		Medicine c = new MedicineC("CCC", 23.11);
		
		Presciption p = new Presciption();
		p.addMedicine(a);
		p.addMedicine(b);
		p.addMedicine(c);
		
		Visitor charger = new VisitorCharger();
		charger.setName("Eric");
		
		Visitor workerofpharmacy = new VisitorWorkerOfPharmacy();
		workerofpharmacy.setName("Hary");
		
		p.accept(charger);
		System.out.println("------------------------------------");
		p.accept(workerofpharmacy);
	}
}
