package com.cn.test;

import java.util.Map;

public class EvnironmentVariables {

	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
