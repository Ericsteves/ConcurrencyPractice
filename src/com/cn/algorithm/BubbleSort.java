package com.cn.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ns = {8,2,5,13,29,5,9,7,14};
		int[] nss = bubbleSort_2(ns);
		for(int n : nss){
			System.out.print(n + "\t");
		}
	}
	//冒泡排序
	public static int[] bubbleSort(int[] ns){
		for(int i=0;i<ns.length-1;i++)
		{
			for(int j=0;j<ns.length-i;j++)
			{
				if(ns[i] > ns[i+1])
				{
					int n = ns[i];
					ns[i] = ns[i+1];
					ns[i+1] = n;
				}
			}
		}
		return ns;
	}
	//冒泡排序改进：使用标志位pos，省去不必要的排序对比
	public static int[] bubbleSort_1(int[] ns){
		int i = ns.length - 1;
		while(i > 1)
		{
			int pos = 0;
			for(int j = 0; j<i ;j++)
			{
				if(ns[j]>ns[j+1])
				{
					pos = j;
					int temp = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = temp;
				}
			}
			i = pos;
		}
		return ns;
	}
	//冒泡算法改进:双向进行查找，分别查找到最大最小，然后缩小范围
	public static int[] bubbleSort_2(int[] ns){
		int high = ns.length -1;
		int low = 0;
		while(low < high)
		{
			for(int i = low; i<high ; i++)
			{
				if(ns[i]>ns[i+1])
				{
					int temp = ns[i];
					ns[i] = ns[i+1];
					ns[i+1] = temp;
				}
			}
			high--;
			for(int j = high; j>0 ;j--)
			{
				if(ns[j]<ns[j-1])
				{
					int temp = ns[j];
					ns[j] = ns[j-1];
					ns[j-1] = temp;
				}
			}
			low++;
		}
		return ns;
	}

}
