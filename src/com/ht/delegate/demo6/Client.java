package com.ht.delegate.demo6;

import java.lang.reflect.Proxy;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class Client {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        DAOLogHandler daoLogHandler = new DAOLogHandler(userDAO);
        // 动态创建代理对象,用于代理一个AbstractUserDAO类型的真实主题对象
        AbstractUserDAO proxy = (AbstractUserDAO) Proxy.newProxyInstance(
                AbstractUserDAO.class.getClassLoader(),
                new Class[]{AbstractUserDAO.class},
                daoLogHandler);
        // 调用代理对象的业务方法
        proxy.findUserById("张无忌");
    }
}
