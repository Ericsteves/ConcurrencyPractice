package com.cn.thread;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class BooleanLatch {

  private final Sync sync = new Sync();

  private static class Sync extends AbstractQueuedSynchronizer{

  }

}
