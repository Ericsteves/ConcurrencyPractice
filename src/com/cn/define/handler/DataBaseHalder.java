package com.cn.define.handler;


import com.cn.define.annotation.Column;
import com.cn.define.annotation.Condition;
import com.cn.define.annotation.DataBase;
import com.cn.define.annotation.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DataBaseHalder implements InvocationHandler{
  private Class mInterface;

  public DataBaseHalder(Class object){
    mInterface = object;

    DataBase db = (DataBase) mInterface.getAnnotation(DataBase.class);

    System.out.print("===================================\n");
    System.out.print("connect database : \n");
    System.out.print("ip : " + db.ip() + "\n");
    System.out.print("username : " + db.username() + "\n");
    System.out.print("password : " + db.password() + "\n");
    System.out.print("database : " + db.database() + "\n");
    System.out.print("===================================\n");

  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
      throws Throwable {
    if(method.getName().matches("^get.*")){
      String sql =  "select " + getColumns(method) + " from " + getTable(method)
          + " where " + getCondition(method, args) + ";";
      System.out.print(sql + "\n");
    }

    return null;
  }

  private String getTable(Method method){
    return method.getAnnotation(Table.class).value();
  }

  private String getColumns(Method method){
    String result = "";
    String conn = "";
    for (String col : method.getAnnotation(Column.class).value()) {
      result += conn + col;
      conn = ",";
    }
    return result;
  }

  private String getCondition(Method method, Object[] args) {
    String result = "";
    String andConnect = "";
    Class[] parameterTypes = method.getParameterTypes();

    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
    for(int i = 0; i< parameterAnnotations.length ; i++){
      Class type = parameterTypes[i];
      for(Annotation annotation : parameterAnnotations[i]){
        if(annotation instanceof Condition){
          result += andConnect + parseCondition(type, args[i], (Condition) annotation);
          andConnect = " and ";
        }
      }
    }
    return result;
  }

  private String parseCondition(Class argType, Object arg, Annotation annotation){
    Condition condition = (Condition) annotation;
    String result = condition.value() + " " + condition.compare() + " ";
    if(argType == String.class){
      result += "\"" + arg + "\"";
    }else{
      result += arg;
    }
    return result;
  }
}
