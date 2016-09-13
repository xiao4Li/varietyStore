package com.funi.tools;

import com.funi.support.CRUD;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/13.
 */
public class LogEnhancer implements InvocationHandler {

    Object crudObj;

    public LogEnhancer(CRUD crud){
        this.crudObj = crud;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //do something enhance
        System.out.println("Log enhance start ... ");

        Object result = method.invoke(crudObj,args);

        System.out.println("Log enhance end ... ");

        return result;
    }
}
