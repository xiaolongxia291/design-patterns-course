package com.wang.design.chapter14;

/**
 * @author tracy
 *
 * 14-责任链模式
 */
public abstract class Approver {
    protected String name;
    protected Approver higherApprover;

    public Approver(String name){
        this.name=name;
    }

    public void setHigherApprover(Approver higherApprover) {
        this.higherApprover = higherApprover;
    }

    public abstract void approve(int amount);//审批方法
}

class Staff extends Approver{
    public Staff(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        System.out.println("-----开始审批-----");
        if(amount<=1000){
            System.out.println("staff"+this.name+"审批通过");
        }else if(this.higherApprover==null){
            System.out.println("staff"+this.name+"审批不通过");
        }else{
            System.out.println("staff"+this.name+"将流程提交给更高权限的工作人员");
            this.higherApprover.approve(amount);
        }
    }
}

class Manager extends Approver{
    public Manager(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        if(amount<=5000){
            System.out.println("manager"+this.name+"审批通过");
        }else if(this.higherApprover==null){
            System.out.println("manager"+this.name+"审批不通过");
        }else{
            System.out.println("manager"+this.name+"将流程提交给更高权限的工作人员");
            this.higherApprover.approve(amount);
        }
    }
}

class CFO extends Approver{
    public CFO(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        if(amount<=10000){
            System.out.println("cfo"+this.name+"审批通过");
        }else{
            System.out.println("cfo"+this.name+"审批不通过");
        }
    }
}