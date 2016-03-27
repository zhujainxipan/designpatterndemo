package com.ht.command.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        // 找到需求组
        super.rg.find();

        // 增加一份需求
        super.rg.add();

        // 给出计划
        super.rg.plan();
    }
}
