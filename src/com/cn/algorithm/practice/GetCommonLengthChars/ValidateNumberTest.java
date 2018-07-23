package com.cn.algorithm.practice.GetCommonLengthChars;

public class ValidateNumberTest {

  public static void main(String[] args) {


    System.out.println(validateNumber(" 0"));
    System.out.println(validateNumber("0.1"));
    System.out.println(validateNumber("1 a"));
    System.out.println(validateNumber("2e10"));

    System.out.println(isNumber(" 0"));
    System.out.println(isNumber("0.1"));
    System.out.println(isNumber("1 a"));
    System.out.println(isNumber("2e10"));

  }

  private static boolean validateNumber(String s) {

    int[][] transTable = new int[][]{    //0INVA,1SPA,2SIG,3DI,4DO,5E
        {-1, 0, 3, 1, 2, -1},            //0初始无输入或者只有space的状态
        {-1, 8, -1, 1, 4, 5},            //1输入了数字之后的状态
        {-1, -1, -1, 4, -1, -1},         //2前面无数字，只输入了Dot的状态
        {-1, -1, -1, 1, 2, -1},          //3输入了符号状态
        {-1, 8, -1, 4, -1, 5},           //4前面有数字和有dot的状态
        {-1, -1, 6, 7, -1, -1},          //5'e' or 'E'输入后的状态
        {-1, -1, -1, 7, -1, -1},         //6输入e之后输入Sign的状态
        {-1, 8, -1, 7, -1, -1},          //7输入e后输入数字的状态
        {-1, 8, -1, -1, -1, -1}          //8前面有有效数输入之后，输入space的状态
    };

    int state = 0;
    int i = 0;

    while (i < s.length()) {

      InputType type = InputType.INVALID;

      if (s.charAt(i) == ' ')
        type = InputType.SPACE;
      else if (s.charAt(i) == '+' || s.charAt(i) == '-')
        type = InputType.SIGN;
      else if (s.charAt(i) == '.')
        type = InputType.DOT;
      else if (s.charAt(i) == 'e' || s.charAt(i) == 'E')
        type = InputType.EXPONENT;
      else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
        type = InputType.DIGIT;

      state = transTable[state][type.num];

      i++;
    }

    return state == 1 || state == 4 || state == 7 || state == 8;
  }


  private enum InputType {
    INVALID(0),      // 0 Include: Alphas, '(', '&' ans so on
    SPACE(1),        // 1
    SIGN(2),         // 2 '+','-'
    DIGIT(3),        // 3 numbers
    DOT(4),          // 4 '.'
    EXPONENT(5);     // 5 'e' 'E'

    int num;

    InputType(int num) {
      this.num = num;
    }

  }


  private static boolean isNumber(String s) {
    if ((s = s.trim()).isEmpty())
      return false;

    String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";

    return s.matches(regex);
  }


}
