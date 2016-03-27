package com.ht.facade.demo2;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("你好,最近过得好吗?", "北京市朝阳区");
    }
}
