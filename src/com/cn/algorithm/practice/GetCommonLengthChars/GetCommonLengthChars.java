package com.cn.algorithm.practice.GetCommonLengthChars;

public class GetCommonLengthChars {

  public static void main(String[] args) {
    String str1 = "1A2C3D4B56";
    String str2 = "B1D23CA45B6A";

    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();

    int[][] dp = getDp(ch1, ch2);

    int m = ch1.length - 1;
    int n = ch2.length - 1;
    int index = dp[m][n] - 1;

    char[] res = new char[index + 1];

    while (index >= 0) {
      if (m > 0 && dp[m][n] == dp[m - 1][n]) {
        m--;
      } else if (n > 0 && dp[m][n] == dp[m][n - 1]) {
        n--;
      } else {
        res[index--] = ch1[m--];
        n--;
      }
    }

    System.out.println(res);

  }


  public static int[][] getDp(char[] ch1, char[] ch2) {

    int[][] dp = new int[ch1.length][ch2.length];

    dp[0][0] = ch1[0] == ch2[0] ? 1 : 0;
    for (int i = 1; i < ch1.length; i++) {
      dp[i][0] = Math.max(dp[i - 1][0], ch1[i] == ch2[0] ? 1 : 0);
    }
    for (int j = 1; j < ch2.length; j++) {
      dp[0][j] = Math.max(dp[0][j - 1], ch2[j] == ch1[0] ? 1 : 0);
    }

    for (int i = 1; i < ch1.length; i++) {
      for (int j = 1; j < ch2.length; j++) {
        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        if (ch1[i] == ch2[j]) {
          dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, dp[i][j]);
        }
      }
    }

    return dp;
  }


}
