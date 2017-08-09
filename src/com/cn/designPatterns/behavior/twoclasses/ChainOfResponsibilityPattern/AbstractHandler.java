package com.cn.designPatterns.behavior.twoclasses.ChainOfResponsibilityPattern;

public abstract class AbstractHandler {
	
	protected AbstractHandler handler;

	public AbstractHandler getHandler() {
		return handler;
	}

	public void setHandler(AbstractHandler handler) {
		this.handler = handler;
	}
	
	public abstract void operator(int num);
}
