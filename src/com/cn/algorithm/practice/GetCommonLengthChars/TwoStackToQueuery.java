package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.Stack;

public class TwoStackToQueuery {


  private Stack in = new Stack();
  private Stack out = new Stack();


  public void push(Object o){
    in.push(o);
  }

  public Object pop(){
    if(out.size()==0){
      if(in.size()==0)
        return null;
      while(in.size()!=0){
        out.push(in.pop());
      }
    }

    return out.pop();
  }


  public static void main(String[] args){

    TwoStackToQueuery queuery = new TwoStackToQueuery();

    queuery.push("5");
    queuery.push("2");
    queuery.push("3");

    System.out.println(queuery.pop());
    System.out.println(queuery.pop());
    System.out.println(queuery.pop());
    System.out.println(queuery.pop());

    queuery.push("4");



    System.out.println(queuery.pop());
    System.out.println(queuery.pop());


  }


}
