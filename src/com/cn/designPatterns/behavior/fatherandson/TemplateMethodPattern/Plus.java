package com.cn.designPatterns.behavior.fatherandson.TemplateMethodPattern;

public class Plus extends AbstractCalculate{

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
