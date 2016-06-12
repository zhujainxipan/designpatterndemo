package com.ht.delegate.demo6;

/**
 * Created by annuoaichengzhang on 16/6/12.
 * 抽象userDAO:抽象主题角色
 */
interface AbstractUserDAO {
    public boolean findUserById(String userId);
}
