package com.cn.designPatterns.behavior.thirdclasses.VisitorPatternNew;

public class VisitorWorkerOfPharmacy extends Visitor {

  @Override
  public void visit(MedicineA a) {
    System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
  }

  @Override
  public void visit(MedicineB b) {
    System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
  }

  @Override
  public void visit(MedicineC c) {
    System.out.println("药房工作者：" + name + "拿药 ：" + c.getName());
  }

}
