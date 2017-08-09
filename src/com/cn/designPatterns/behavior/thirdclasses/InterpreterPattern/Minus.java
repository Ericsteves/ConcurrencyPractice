package com.cn.designPatterns.behavior.thirdclasses.InterpreterPattern;

public class Minus implements Expression{

	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()-context.getNum2();
	}

}
