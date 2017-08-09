package com.cn.designPatterns.creation.PrototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SerializableObject obj;
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SerializableObject getObj() {
		if(obj==null){
			obj = new SerializableObject();
		}
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	//
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	
	//deep clone
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	
	
}

class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L; 
    private String str = "Test test test!";
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
    
}
