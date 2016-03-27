package com.ht.facade.demo2;

import com.ht.facade.demo1.ILetterProcess;
import com.ht.facade.demo1.LetterProcessImpl;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        // 帮你写信
        letterProcess.writeContext(context);

        // 写好信封
        letterProcess.fillEnvelope(address);

        // 把信放到信封中
        letterProcess.letterInotoEnvelope();

        // 邮递信件
        letterProcess.sendLetter();
    }
}
