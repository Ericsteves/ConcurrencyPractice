package com.cn.annotation;

import com.cn.annotation.FruitColor.Color;

public class Apple {
	@FruitName
	private String appleName;
	
	@FruitColor(fruitColor=Color.RED)
	private String appleColor;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}
	
	public void displayName(){
		System.out.println(this.getAppleName()+":"+this.getAppleColor());
	}
	
	
	public static void main(String[] args){
		Apple app = new Apple();
		app.setAppleName("Apple");
		app.setAppleColor("...");
		app.displayName();
	}
}
