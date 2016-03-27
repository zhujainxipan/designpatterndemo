package com.ht.memo.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Client {
    public static void main(String[] args) {

        // 声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();

        Body body = new Body();
        body.setState("心情很棒");

        System.out.println("==========男孩现在的状态===========");
        System.out.println(body.getState());

        // 记录下男孩的状态
        caretaker.setMemento(body.createMemento());

        body.changeState();
        System.out.println("==========男孩追女孩子后的状态==========");
        System.out.println(body.getState());

        // 追女孩失败,恢复原状
        body.restoreMemento(caretaker.getMemento());
        System.out.println("===========男孩恢复后的状态==========");
        System.out.println(body.getState());


    }
}
