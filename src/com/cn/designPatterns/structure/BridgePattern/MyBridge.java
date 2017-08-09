package com.cn.designPatterns.structure.BridgePattern;

public class MyBridge extends Bridge{
	public void method(){
		getSource().method();
	}
}
