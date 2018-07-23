package com.cn.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinCalculator {

  private ForkJoinPool pool;

  public ForkJoinCalculator(){
    this.pool = ForkJoinPool.commonPool();
  }

  public long sumUp(long[] ns){

    return pool.invoke(new SumTask(ns,0,ns.length-1));

  }



  private static class SumTask extends RecursiveTask<Long> {

    private long[] ns;
    private int from;
    private int to;

    public SumTask(long[] ns, int from, int to) {
      this.ns = ns;
      this.from = from;
      this.to = to;
    }

    @Override
    protected Long compute() {
      if (to - from < 6) {

        long total = 0;
        for (int i = from; i <= to; i++)
          total += ns[i];

        return total;

      } else {

        int mid = (from + to) >> 1;

        SumTask task1 = new SumTask(ns,from,mid);
        SumTask task2 = new SumTask(ns,mid+1,to);

        task1.fork();
        task2.fork();

        return task1.join()+task2.join();

      }
    }
  }


}
