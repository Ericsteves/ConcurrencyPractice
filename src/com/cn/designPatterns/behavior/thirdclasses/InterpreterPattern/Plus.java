package com.cn.designPatterns.behavior.thirdclasses.InterpreterPattern;

public class Plus implements Expression{

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
