package com.ht.hunbian.demo34;


/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class LS_L extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return super.L_PARAM;
    }

    @Override
    protected String echo(CommandVo vo) {
        return FileManager.ls_l(vo.formateData());

    }
}
