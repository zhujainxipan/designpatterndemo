package com.ht.facade.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("你好,最近过的好吗");

        letterProcess.fillEnvelope("北京市朝阳区");

        letterProcess.letterInotoEnvelope();

        letterProcess.sendLetter();


    }
}
