package com.ht.command.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        // 找到页面组
        super.pg.find();

        // 删除一个页面
        super.pg.delete();

        // 给出计划
        super.rg.plan();
    }
}
