package com.cn.genarator.collections.collection;

import java.util.ArrayList;

import com.cn.genarator.collections.Generator;

@SuppressWarnings("serial")
public class CollectionData<T> extends ArrayList<T> {
	
	//constractor
	public CollectionData(Generator<T> gen , int quantity){
		for(int i=0; i<quantity; i++){
			add(gen.next());
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> CollectionData<T> List(Generator<T> gen , int quantity){
		return new CollectionData(gen , quantity);
	}
}
