package com.cn.algorithm;

public class InsertionSort {
	public static void main(String[] args){
		int[] ns = {7,4,8,10,3,2,1};
		int[] sort = insertion(ns);
		for(int n : sort){
			System.out.print(n+"\t");
		}
	}
	public static int[] insertion(int[] ns){
		for(int i=1;i<ns.length;i++){
			if(ns[i-1]>ns[i]){
				int temp = ns[i];
				System.out.println(temp);
				int j=i;
				while(j>0 && ns[j-1]>temp){
					ns[j]=ns[j-1];
					j--;
				}
				ns[j]=temp;
			}
		}
		return ns;
	}
}
