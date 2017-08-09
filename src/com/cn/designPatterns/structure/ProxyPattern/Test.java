package com.cn.designPatterns.structure.ProxyPattern;

public class Test {
	public static void main(String[] args){
		Sourceable source = new Source();
		Sourceable proxy = new Proxy(source);
		proxy.method();
	}
}
