package com.cn.test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	   public static int[] twoSum(int[] nums, int target) {
	        int[] n = new int[2];
	        for(int i = 0; i<nums.length-1; i++){
	            for(int j=i+1;j<nums.length;j++){
	                if((nums[i]+nums[j])==target){
	                    n[0]=nums[i];
	                    n[1]=nums[j];
	                    break;
	                }
	            }
	        }
	        return n;
	    }
	   
	   public static int[] twoSum1(int[] nums, int target) {
	      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	      for(int i=0; i<nums.length; i++){
	    	  map.put(nums[i], i);
	      }
	      for(int i=0; i<nums.length; i++){
	    	  int complement = target - nums[i];
	    	  if(map.containsKey(complement) && map.get(complement) != i){
	    		  return new int[] {nums[i],complement};
	    	  }
	      }
	      throw new IllegalArgumentException();
	    }
	   
	   public static int[] twoSum2(int[] nums, int target) {
		      Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		      for(int i=nums.length-1; i>=0; i--){
		    	  int complement = target - nums[i];
		    	  if(map.containsKey(complement)){
		    		  return new int[] {nums[i],complement};
		    	  }
		    	  map.put(nums[i], i);
		      }
		      throw new IllegalArgumentException();
		    }
	   
	   public static int lengthOfLongestSubstring(String s) {
		   
		   int start = 0;
		   int n = 0;
		   char[] chs = s.toCharArray();
		   
		   Map<Character, Integer> map = new HashMap<>();
		  
		   for(int i=0;i<chs.length;i++){
			   if(i==chs.length-1){
				   n = n > (i - map.get(chs[start])) ? n : i - map.get(chs[start]);
			   }else{
				   if(map.containsKey(chs[i])){
						n = n > (i - map.get(chs[start])) ? n : i - map.get(chs[start]);
						start = i;
				   }
			   }
			   map.put(chs[i], i);
		   }
		   
	       return n;
	   }
	   
	   public static void main(String[] args){
		   
		   /*int[] nums = {2,7,11,15};
		   int target = 9;
		   for(int i : twoSum2(nums, target)){
			   System.out.println(i);
		   }*/	
		   
		   System.out.println(lengthOfLongestSubstring("abcacqwdearyyy"));
	   }
}
