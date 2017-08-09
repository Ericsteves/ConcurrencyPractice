package com.cn.genarator.collections.map;

import java.util.Iterator;

import com.cn.genarator.collections.Generator;

public class Letters implements Generator<Pair<Integer, String>>,Iterable<Integer>{
	
	private int number = 1;
	private int size = 9;
	private char letter = 'a';
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			
			public Integer next(){ return number++;}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return number < size;
			};
			
			public void remove(){
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public Pair<Integer, String> next() {
		// TODO Auto-generated method stub
		return new Pair<Integer, String>(number++, ""+letter++);
	}

}
