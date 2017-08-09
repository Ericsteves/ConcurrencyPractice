package com.cn.designPatterns.behavior.twoclasses.IteratorPattern;

public class MyCollection implements Collection{
	
	private String str[];

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return str[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return str.length;
	}

	@Override
	public void setStr(String str[]) {
		// TODO Auto-generated method stub
		this.str = str;
	}

}
