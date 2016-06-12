package com.ht.delegate.demo6;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class UserDAO implements AbstractUserDAO {
    @Override
    public boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询Id为" + userId + "的用户信息成功");
            return true;
        } else {
            System.out.println("查询Id为" + userId + "的用户信息失败");
            return false;
        }
    }
}
