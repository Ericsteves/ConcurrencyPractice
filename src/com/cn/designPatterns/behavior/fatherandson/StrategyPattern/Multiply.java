package com.cn.designPatterns.behavior.fatherandson.StrategyPattern;

public class Multiply extends AbstractCalculate implements ICalculator{

	@Override
	public int calculate(String exp) {
		int intArray[] = split(exp, "\\*");
		return intArray[0]*intArray[1];
	}

}
