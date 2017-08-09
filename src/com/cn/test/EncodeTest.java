package com.cn.test;

import java.io.UnsupportedEncodingException;

public class EncodeTest{

    /**
     * 将一段错误解码的字符串重新解码
     */
    public static String convertEncodingFormat(String str, String formatFrom, String FormatTo) {
        String result = null;
        if (!(str == null || str.length() == 0)) {
            try {
                result = new String(str.getBytes(formatFrom), FormatTo);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * test
     */
    public static void main(String[] args) {
        String str = "你好，少年！";
        System.out.println(str);
        // UTF-8编码的byte流强行用iso-8859-1解码，毫无疑问的乱码了
        String str1 = convertEncodingFormat(str, "UTF-8", "iso-8859-1");
        System.out.println(str1);

        // 将str1再转化为byte流,重新用UTF-8解码，乱码问题解决
        String str2 = convertEncodingFormat(str1, "iso-8859-1", "UTF-8");
        System.out.println(str2);
    }

}