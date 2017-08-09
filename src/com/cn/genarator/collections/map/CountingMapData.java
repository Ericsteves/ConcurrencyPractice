package com.cn.genarator.collections.map;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingMapData extends AbstractMap<Integer, String>{
	
	private int size;
	private static String[] chs = ("we are the world ! yes we just are on the earth ".split(" "));
	public CountingMapData(int size) {
		this.size = size<0 ? 0 : size; 
	}
	
	
	private static class Entry implements Map.Entry<Integer, String>{
		
		int index;
		
		public Entry(int index) {
			this.index = index;
		}
		
		@Override
		public Integer getKey() {
			return Integer.valueOf(index);
		}

		@Override
		public String getValue() {
			return chs[index % chs.length]+Integer.toString(index/(chs.length));
		}

		@Override
		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}
		
		public boolean equals(Object o){
			return Integer.valueOf(index).equals(o);
		}
		
		public int hashCode(){
			return Integer.valueOf(index).hashCode();
		}
	}
	
	@Override
	public Set<Map.Entry<Integer, String>> entrySet() {
		Set<Map.Entry<Integer, String>> entities = new LinkedHashSet<Map.Entry<Integer, String>>();
		
		for(int i=0; i<size; i++){
			entities.add(new Entry(i));
		}
		
		return entities;
	}

	
	public static void main(String[] args){
		
		System.out.println(new CountingMapData(60));
		
	}
}
