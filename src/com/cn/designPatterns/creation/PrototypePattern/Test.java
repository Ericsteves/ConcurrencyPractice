package com.cn.designPatterns.creation.PrototypePattern;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Prototype p = new Prototype();
		p.setName("Eric");
		p.setAge(23);
		//System.out.println(p.getObj().getStr());
		
		Prototype p1 = (Prototype)p.clone();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getObj().getStr());
		
		Prototype p2 = (Prototype)p.deepClone();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getObj().getStr());
	}

}
