package com.ht.facade.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写的内容...." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名..." + address);

    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中");

    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件");
    }
}
