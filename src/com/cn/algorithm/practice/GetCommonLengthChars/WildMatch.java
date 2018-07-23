package com.cn.algorithm.practice.GetCommonLengthChars;

public class WildMatch {

  public static void main(String[] args){
    System.out.println(chkWildMatch("abc",3,"a",1));

    System.out.println(isMatch("abc","a*"));

    System.out.println(isMatched("abc","a*"));
  }

  public static boolean isMatch(String a,String p){

    boolean[][] dp = new boolean[a.length()+1][p.length()+1];
    dp[0][0] = true;

    for(int i=1;i<a.length()+1;i++){
      for(int j=1;j<p.length()+1;j++){
        if(p.charAt(j-1)=='*'){
          dp[i][j] = dp[i-1][j] || dp[i][j-1];
        }else if(p.charAt(j-1)=='.'){
          dp[i][j] = dp[i-1][j-1];
        }else{
          dp[i][j] = a.charAt(i-1)==p.charAt(j-1) && dp[i-1][j-1];
        }
      }
    }
    return dp[a.length()][p.length()];

  }


  public static boolean chkWildMatch(String A, int lena, String B, int lenb) {
    // write code here
    boolean[][] dynamic = new boolean[lena + 1][lenb + 1];
    dynamic[0][0] = true;

    for (int i = 1; i < lena + 1; i++) {
      for (int j = 1; j < lenb + 1; j++) {
        if (B.charAt(j - 1) == '*') {
          dynamic[i][j] = dynamic[i - 1][j] || dynamic[i][j - 1];//添加1个字符 || 添加0个字符
        } else if (B.charAt(j - 1) == '.') {
          dynamic[i][j] = dynamic[i - 1][j - 1];
        } else {
          dynamic[i][j] = A.charAt(i - 1) == B.charAt(j - 1) && dynamic[i - 1][j - 1];
        }
      }
    }
    return dynamic[lena][lenb];
  }


    // Dynamic Programming Solution
  public static boolean isMatched(String s, String p) {
    boolean[] match = new boolean[s.length()+1];
    for(int i=0; i<match.length; i++){
      match[i] = false;
    }
    match[s.length()] = true;
    for(int i=p.length()-1; i>=0; i--){
      if(p.charAt(i)=='*'){
        for(int j=s.length()-1; j>=0; j--){
          match[j] = match[j]||match[j+1]&&(p.charAt(i-1)=='.'||p.charAt(i-1)==s.charAt(j));
        }
        i--;
      }else {
        for(int j=0; j<s.length(); j++){
          match[j] = match[j+1]&&(p.charAt(i)=='.'||p.charAt(i)==s.charAt(j));
        }
        match[s.length()] = false;
      }
    }

    return match[0];
  }

}
