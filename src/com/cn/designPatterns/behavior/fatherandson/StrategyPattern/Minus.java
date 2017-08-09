package com.cn.designPatterns.behavior.fatherandson.StrategyPattern;

public class Minus extends AbstractCalculate implements ICalculator{

	@Override
	public int calculate(String exp) {
		int intArray[] = split(exp, "-");
		return intArray[0]-intArray[1];
	}

}
