package com.cn.define.interfaces;


import com.cn.define.annotation.Column;
import com.cn.define.annotation.Condition;
import com.cn.define.annotation.DataBase;
import com.cn.define.annotation.Table;

import java.util.List;
import java.util.Map;

@DataBase(database="SchoolSystem", username="root", password="123456", ip="localhost")
public interface IDataBaseOperation {
  @Table("Student")
  @Column({"name","age","sex"})
  List<Map<String,String>> getStudentByName(@Condition("name") String name);

  @Table("Student")
  @Column({"name","age","sex"})
  List<Map<String,String>> getStudentOlder(@Condition(value = "age", compare = ">") int age);

  @Table("Student")
  @Column({"name","age","sex"})
  List<Map<String,String>> getStudentBySexAndAge(@Condition("sex") String sex, @Condition("age") int age);

  @Table("Teacher join Course on Teacher.id=Course.teacher")
  @Column({"Course.name"})
  List<Map<String,String>> getCourseByTeacher(@Condition("Teacher.name") String teacher);
}
