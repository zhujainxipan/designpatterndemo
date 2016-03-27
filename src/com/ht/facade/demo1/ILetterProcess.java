package com.ht.facade.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public interface ILetterProcess {
    public void writeContext(String context);
    public void fillEnvelope(String address);
    public void letterInotoEnvelope();
    public void sendLetter();
}
