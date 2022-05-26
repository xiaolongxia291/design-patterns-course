package com.wang.design.chapter17;

/**
 * @author tracy
 *
 * 17-备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        // 新建备忘录
        Remember remember=new Remember("待办事项");

        // 插入文本
        remember.append("算法刷题");
        remember.append("买菜");
        remember.append("背单词");

        // 删除一行
        remember.delete();

        // 获取最新备份记录
        remember.latestHistory();

        // 恢复
        remember.recovery();

        // 情况
        remember.clear();

        // 恢复
        remember.recovery();
    }
}
