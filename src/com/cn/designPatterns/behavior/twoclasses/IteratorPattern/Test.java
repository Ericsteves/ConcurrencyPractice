package com.cn.designPatterns.behavior.twoclasses.IteratorPattern;

public class Test {

	public static void main(String[] args) {
		Collection collection = new MyCollection();
		String str[] = {"A","B","C","D","E"};
		collection.setStr(str);
		Iterator it = collection.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
