package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringTest {

  public static void main(String[] args) {

    String s = "cbabcadbb";
    String a = "bbbb";
    System.out.println(lengthOfLongestSubstring(s));

    Set<Character> set = new HashSet<>();
    set.add(s.charAt(0));
    set.add(s.charAt(1));
    set.add(s.charAt(2));
    set.add(s.charAt(3));
    set.add(s.charAt(4));
    set.add(s.charAt(5));
    set.add(s.charAt(6));

    for(Character c : set){
      System.out.println(c);
    }

  }

  public static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
      if (set.contains(s.charAt(j))) {
        set.remove(s.charAt(i++));
      } else {
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);
      }
    }
    return ans;
  }

}
