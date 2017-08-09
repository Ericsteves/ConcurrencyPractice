package com.cn.test;

public interface Formula {
	
	double calculate(int i);
	
	default double sqrt(int i){
		return Math.sqrt(i);
	}
	
}
