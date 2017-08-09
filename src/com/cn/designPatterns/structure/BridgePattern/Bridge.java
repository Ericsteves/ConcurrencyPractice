package com.cn.designPatterns.structure.BridgePattern;

public abstract class Bridge {
	private Sourceable source;

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	
	public void method(){
		source.method();
	}
}
