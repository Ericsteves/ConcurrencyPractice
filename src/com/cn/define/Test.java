package com.cn.define;

import com.cn.define.handler.DataBaseHalder;
import com.cn.define.interfaces.IDataBaseOperation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

  private static <T> T newProxyInstance(Class<T> clazz, InvocationHandler handler){
    return (T) Proxy.newProxyInstance(clazz.getClassLoader(),new Class<?>[]{clazz},handler);
  }

  public static void main(String[] args){

    IDataBaseOperation dataBaseOperation = newProxyInstance(IDataBaseOperation.class,new DataBaseHalder(IDataBaseOperation.class));

    dataBaseOperation.getStudentByName("eric");
    dataBaseOperation.getCourseByTeacher("eric");

  }

}
