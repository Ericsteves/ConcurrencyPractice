package com.cn.algorithm.practice.GetCommonLengthChars;

public class AddBinaryTest {

  public static void main(String[] args){



  }

  public static String addBinary(String a,String b){

    char[] aa = a.toCharArray();
    char[] bb = b.toCharArray();

    char[] res;

    int al = a.length();
    int bl = b.length();


    if(al>bl)
      res = new char[bl+1];
    else
      res = new char[al+1];
    int mask = 0;
    int i=res.length-1;

    while(al>=0 || bl>=0){
      if(aa[al]=='1' && bb[bl]=='1' ) {
        if(mask>0)
          res[i] = '1';
        else
          res[i] = '0';
      }
      else
        res[i]= '0';
    }

    return null;

  }

}
