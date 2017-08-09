package com.cn.thread;

public class IsInterrupted extends Thread{
	public void run(){
		while(!Thread.currentThread().isInterrupted()){
			System.out.println("Thread is running....");
			long time = System.currentTimeMillis();
			while((System.currentTimeMillis()-time)<1000){
				
			}
		}
		System.out.println("Thread is Stoped!");
	}
	public static void main(String[] args) throws InterruptedException{
		IsInterrupted ii = new IsInterrupted();
		System.out.println("start Thread");
		ii.start();
		ii.sleep(3000);
		System.out.println("stop Thread");
		ii.interrupt();
		ii.sleep(3000);
		System.out.println("Stoped");
	}
}
