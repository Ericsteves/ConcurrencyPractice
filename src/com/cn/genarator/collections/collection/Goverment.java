package com.cn.genarator.collections.collection;

import com.cn.genarator.collections.Generator;

public class Goverment implements Generator<String>{
	
	String[] f = ("we are the world ! yes we just are on the earth ".split(" "));
	
	private int index ;
	
	@Override
	public String next() {
		return f[index++];
	}
	
}
