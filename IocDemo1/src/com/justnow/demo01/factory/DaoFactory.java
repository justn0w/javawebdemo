package com.justnow.demo01.factory;

import static java.lang.Class.forName;

public class DaoFactory {
    public static Object getUserDao(){
        Object obj = null;
        try {
            obj = Class.forName("com.justnow.demo01.dao.UserDao").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
