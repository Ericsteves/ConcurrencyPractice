package com.cn.algorithm.practice.GetCommonLengthChars;

public class LengthOfLastWordTest {

  public static void main(String[] args){

    System.out.println(lengthOfLastWord("Hello World    "));

  }

  private static int lengthOfLastWord(String s){

    if(s.length()==0)
      return 0;

    int n = s.length()-1;

    while(s.charAt(n)==' ')
      n--;

    if(n==0)
      return 0;

    int end = n-1;

    while(end>=0){
      if(s.charAt(end)!=' ')
        end--;
      else
        break;
    }
    return n-end;
  }


}
