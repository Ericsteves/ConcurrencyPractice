package com.cn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TwoThread {

  private int start = 1;
  private boolean flag = false;
  private final static Lock lock = new ReentrantLock();



  public static void main(String[] args){
    TwoThread num = new TwoThread();

    Thread a = new Thread(new ANum(num));
    Thread b = new Thread(new BNum(num));
    a.setName("a");
    b.setName("b");

    a.start();
    b.start();

  }

  public static class ANum implements Runnable{

    private TwoThread num;

    public ANum(final TwoThread num){
      this.num = num;
    }

    @Override
    public void run() {
//      while (num.start<=100){
//        if(num.flag){
//          try {
//            lock.lock();
//            System.out.println(Thread.currentThread().getName() + ":" + num.start);
//            num.start++;
//            num.flag = false;
//          }finally {
//            lock.unlock();
//          }
//
//        }else{
//          try {
//            Thread.sleep(10);//防止线程空转
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//        }
//      }
      while (num.start<=100) {
        synchronized (TwoThread.class) {
          if(num.flag){
            System.out.println(Thread.currentThread().getName()+":"+num.start);
            num.start++;
            num.flag = false;
            TwoThread.class.notify();
          }else{
            try {
              TwoThread.class.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  public static class BNum implements Runnable{

    private TwoThread num;

    public BNum(final TwoThread num){
      this.num = num;
    }

    @Override
    public void run() {
//      while(num.start<=100){
//        if(!num.flag){
//          try{
//            lock.lock();
//            System.out.println(Thread.currentThread().getName()+":"+num.start);
//            num.start++;
//            num.flag = true;
//          }finally {
//            lock.unlock();
//          }
//        }else{
//          try {
//            Thread.sleep(10);
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//        }
//      }

      while (num.start<=100) {
        synchronized (TwoThread.class) {
          if(!num.flag){
            System.out.println(Thread.currentThread().getName()+":"+num.start);
            num.start++;
            num.flag = true;
            TwoThread.class.notify();
          }else{
            try {
              TwoThread.class.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }



}
