package com.cn.tree;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class Hufuman {
	private String str;
	private String newString="";
	private Node root;
	private boolean flag;
	private ArrayList<String> charList;
	private ArrayList<Node> nodeList;
	
	public void createHfmTree(String str){
		this.str = str;
		charList = new ArrayList<String>();
		nodeList = new ArrayList<Node>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 从给定的字符串中取出字符  
			flag = true;   
			for (int j = 0; j < charList.size(); j++) {    
				if (charList.get(j).charAt(0) == ch) {// 如果找到了同一字符    
					String s = charList.get(j) + ch;     
					charList.set(j, s);     
					flag = false;     
					break;    
				}   
			}   
			if (flag) {
				charList.add(charList.size(), ch + "");   
			}  
		}
		
		for (int i = 0; i < charList.size(); i++) {   
			String data = charList.get(i).charAt(0) + ""; // 获取charList中每段字符串的首个字符   
			int count = charList.get(i).length(); // 列表中字符串的长度就是对应的权值   
			Node node = new Node(data, count); // 创建节点对象   
			nodeList.add(i, node); // 加入到节点队列  
		}
		
		BublleSort(nodeList);  
		while (nodeList.size() > 1) {
			// 当节点数目大于一时   
			// 4.取出权值最小的两个节点，生成一个新的父节点  
			// 5.删除权值最小的两个节点，将父节点存放到列表中   
			Node right = nodeList.remove(0);   
			Node left = nodeList.remove(0);   
			int parentWeight = left.count + right.count;// 父节点权值等于子节点权值之和   
			Node parent = new Node(parentWeight, left,right);   
			nodeList.add(0, parent); // 将父节点置于首位   }
		}
		
		root = nodeList.get(0);
		//System.out.println(root==null);
		output(root);
		printHfm(root);
		System.out.println("Code:"+root.getCode());
	}
	/*
	 * 冒泡排序
	 * 
	 * */
	public void BublleSort(ArrayList<Node> nodelist) {  
		for (int i = 0; i < nodelist.size() - 1; i++) {   
			 for (int j = i + 1; j < nodelist.size(); j++) {    
				 Node temp;    
				 if (nodelist.get(i).count > nodelist.get(j).count) {     
					 temp = nodelist.get(i);     
					 nodelist.set(i, nodelist.get(j));     
					 nodelist.set(j, temp);    
				 }    
			 }  
		 }  
	 }
	 
	 public void output(Node node) {  
		 
		if (node.lChild != null) {   
			output(node.lChild);  
		}  
		
		System.out.print(node.data + ":"+node.count + " ");// 中序遍历
		
			  
		if (node.rChild != null) {   
			output(node.rChild);  
		} 
		
	}  
	public void output() {  
		output(root); 
	}
	
	public void printHfm(Node node){
		if(node == null){
			System.out.println("无法编码");
		}else{
			Node curNode = node;
			if(curNode.lChild != null){
				curNode.lChild.setCode(curNode.getCode()+"1");
				printHfm(curNode.lChild);
				
				curNode.rChild.setCode(curNode.getCode()+"0");
				printHfm(curNode.rChild);
			}
		}
		
	}
	 
	 public static void main(String[] args) {  
		 Hufuman huff = new Hufuman();//创建哈弗曼对象  
		 huff.createHfmTree("sdfassvvdfgsfdfsdfs");//构造树 }
	 }
	 
 }
