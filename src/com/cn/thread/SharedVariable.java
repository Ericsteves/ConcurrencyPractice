package com.cn.thread;

public class SharedVariable extends Thread{
	volatile boolean stop = false;
	public void run(){
		while(!stop){
			System.out.println("Thread is running...");
			long time = System.currentTimeMillis();
			while((System.currentTimeMillis()-time)<2000){
				
			}
		}
		System.out.println("Thread is stoped");
	}
	
	public static void main(String[] args) throws InterruptedException{
		SharedVariable sv = new SharedVariable();
		System.out.println("Start thread");
		sv.start();
		sv.sleep(6000);
		System.out.println("Stop thread");
		sv.stop = true;
		sv.sleep(3000);
		System.out.println("Stoped!");
	}
}
