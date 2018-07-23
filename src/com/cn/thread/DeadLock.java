package com.cn.thread;

public class DeadLock extends Thread{
	static void deathLock(Object lock1,Object lock2){
		try{
			synchronized(lock1){
				Thread.sleep(1000);
				synchronized (lock2) {
					System.out.println(Thread.currentThread());
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void main(String[] agrs) throws InterruptedException{
		final Object lock1 = new Object();
		final Object lock2 = new Object();
		Thread thread1 = new Thread(() -> deathLock(lock1, lock2));
		Thread thread2 = new Thread(() -> deathLock(lock2, lock1));
		
		System.out.println("Starting thread!");
		thread1.start();
		thread2.start();
		Thread.sleep(3000);
		
		System.out.println("Interrupting thread!");
		thread1.interrupt();
		thread2.interrupt();
		Thread.sleep(3000);
		
		System.out.println("Stoped thread!");
	}
}
