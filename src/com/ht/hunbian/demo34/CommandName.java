package com.ht.hunbian.demo34;

import com.ht.command.demo2.Command;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public abstract class CommandName {
    private CommandName nextOperator;

    public final String handleMessage(CommandVo vo) {
        String result = "";
        if (vo.getParam().size() == 0 || vo.getParam().contains(this.getOperateParam())) {
            result = this.echo(vo);
        } else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(vo);
            } else {
                result = "命令无法执行";
            }
        }
        return result;
    }

    public void setNext(CommandName operator) {
        this.nextOperator = operator;
    }

    protected abstract String getOperateParam();

    protected abstract String echo(CommandVo vo);

}
