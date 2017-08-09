package com.cn.designPatterns.behavior.fatherandson.StrategyPattern;

public class Plus extends AbstractCalculate implements ICalculator{

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int intArray[] = split(exp, "\\+");
		return intArray[0]+intArray[1];
	}

}
