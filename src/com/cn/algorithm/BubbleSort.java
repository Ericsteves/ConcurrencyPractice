package com.cn.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ns = {8,2,5,5,9,7};
		int[] nss = bubbleSort(ns);
		for(int n : nss){
			System.out.print(n + "\t");
		}
	}
	public static int[] bubbleSort(int[] ns){
		for(int i=0;i<ns.length-1;i++){
			for(int j=0;j<ns.length-i;j++){
				if(ns[i] > ns[i+1]){
					int n = ns[i];
					ns[i] = ns[i+1];
					ns[i+1] = n;
				}
			}
		}
		return ns;
	}

}
