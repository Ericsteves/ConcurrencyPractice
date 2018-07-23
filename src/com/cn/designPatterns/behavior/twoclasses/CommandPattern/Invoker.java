package com.cn.designPatterns.behavior.twoclasses.CommandPattern;

class Invoker {
	
	private Command command;
	
	Invoker(Command command){
		this.command=command;
	}
	
	void action(){
		command.exe();
	}
}
