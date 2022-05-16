package com.wang.design.chapter7;

/**
 * @author tracy
 * 7-装饰模式
 *
 * Decorator为包装器父类
 */
public abstract class Decorator implements Showable{
    protected Showable show_obj;

    public Decorator(Showable show_obj){
        this.show_obj=show_obj;//注入被装饰对象
    }

    @Override
    public void show() {
        show_obj.show();//调用默认展示方法
    }
}

/**
 * 包装盒
 */
class BoxDecorator extends Decorator{
    public BoxDecorator(Showable show_obj){
        super(show_obj);
    }

    @Override
    public void show() {
        System.out.print("包装盒【");
        show_obj.show();
        System.out.print("】包装盒");
    }
}

/**
 * 蝴蝶结
 */
class BowknotDecorator extends Decorator{
    public BowknotDecorator(Showable show_obj){
        super(show_obj);
    }
    @Override
    public void show() {
        System.out.print("蝴蝶结【");
        show_obj.show();
        System.out.print("】蝴蝶结");
    }
}
