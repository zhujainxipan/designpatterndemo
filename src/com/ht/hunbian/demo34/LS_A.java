package com.ht.hunbian.demo34;


/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class LS_A extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return super.A_PARAM;
    }

    @Override
    protected String echo(CommandVo vo) {
        return FileManager.ls_a(vo.formateData());
    }
}
