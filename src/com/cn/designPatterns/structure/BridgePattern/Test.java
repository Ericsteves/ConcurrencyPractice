package com.cn.designPatterns.structure.BridgePattern;

public class Test {
	public static void main(String[] args){
		Bridge bridge = new MyBridge();
		
		Sourceable sub1 = new SourceSub1();
		bridge.setSource(sub1);
		bridge.method();
		
		Sourceable sub2 = new SourceSub2();
		bridge.setSource(sub2);
		bridge.method();
	}
}
