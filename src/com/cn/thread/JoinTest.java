package com.cn.thread;

public class JoinTest {
	public static void main(String[] agrs) throws InterruptedException{
		Thread t1 = new Thread(new thread1());
		Thread t2 = new Thread(new thread2());
		
		t1.start();
		t1.join();
		t2.start();
		
	}
}
class thread1 implements Runnable{
	private int count=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count<=10){
			System.out.println("Count:"+count);
			count++;
		}
		System.out.println();
	}
}
class thread2 implements Runnable{
	private int i=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(i<=10){
			System.out.println("i:"+i);
			i++;
		}
		System.out.println();
	}
}