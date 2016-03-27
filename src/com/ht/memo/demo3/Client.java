package com.ht.memo.demo3;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 初始化
        originator.setState1("中国");
        originator.setState2("强盛");
        originator.setState3("繁荣");

        // 初始化状态
        System.out.println("初始化状态======" + originator.getState1());

        caretaker.setMemento(originator.createMemento());

        // 修改状态值
        originator.setState1("架构");
        originator.setState2("软件");
        originator.setState3("优秀");

        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());

        // 恢复后状态
        System.out.println("恢复后状态======" + originator.getState1());

    }
}
