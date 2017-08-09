package com.cn.designPatterns.behavior.fatherandson.TemplateMethodPattern;

public abstract class AbstractCalculate {
	
	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int intArray[] = new int[2];
		intArray[0] = Integer.parseInt(array[0]);
		intArray[1] = Integer.parseInt(array[1]);
		return intArray;
	}
	
	abstract public int calculate(int num1,int num2);
	
	public final int calculate(String exp,String opt){
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}
	
}
