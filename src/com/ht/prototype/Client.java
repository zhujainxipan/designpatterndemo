package com.ht.prototype;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(i + "先生,女士");
            mail.setReceiver(i + "@com");
            sendMail(mail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println(mail.getSubject() + ":" + mail.getReceiver() + ":发送成功");
    }
}
