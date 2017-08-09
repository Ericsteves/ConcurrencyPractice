package com.cn.genarator.collections.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {
	public static void main(String[] args){
		
		Set<String> set = new LinkedHashSet<String>(new CollectionData<>(new Goverment(), 12));
		
		//set.addAll(CollectionData.List(new Goverment(), 12));
		
		System.out.println(set);
		
	}
}
