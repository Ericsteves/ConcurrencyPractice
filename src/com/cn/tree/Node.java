package com.cn.tree;

public class Node {
	public String code = "0";
	public int codeSize;
	public String data = "node";
	public int count;
	public Node lChild;
	public Node rChild;
	
	public Node(){}
	
	public Node(String data,int count){
		this.data = data;
		this.count = count;
	}
	
	public Node(int count,Node lChild,Node rChild){
		this.count = count;
		this.lChild = lChild;
		this.rChild = rChild;
	}
	
	public Node(String data,int count,Node lChild,Node rChild){
		this.data=data;
		this.count=count;
		this.lChild=lChild;
		this.rChild=rChild;
	}
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code=code;
	}
}
