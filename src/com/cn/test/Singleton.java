package com.cn.test;

import sun.misc.Unsafe;

public class Singleton {

  private static transient volatile int status = 0;

  private static Singleton instance;

  public Singleton getInstance() {
    Singleton singleton;
    int sc;
    while ((singleton = instance) == null) {
      if ((sc = status) < 0)
        Thread.yield();
      else if (unsafe.compareAndSwapInt(this, STATUS, sc, -1)) {
        try {
          if (singleton == null) {
            instance = singleton = new Singleton();
          }
        } finally {
          status = sc;
        }
        break;
      }
    }
    return singleton;
  }

  private static final Unsafe unsafe;
  private static final long STATUS;

  static {
    try {
      unsafe = Unsafe.getUnsafe();
      Class<?> clazz = Singleton.class;
      STATUS = unsafe.objectFieldOffset(clazz.getDeclaredField("status"));
    } catch (Exception e) {
      throw new Error(e);
    }
  }

}
