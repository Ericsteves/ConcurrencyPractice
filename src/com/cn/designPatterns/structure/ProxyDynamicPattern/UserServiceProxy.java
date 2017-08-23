package com.cn.designPatterns.structure.ProxyDynamicPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.xml.bind.Binder;

public class UserServiceProxy implements InvocationHandler{
	
	private Object target;
	
	public Object bind(Object target,Class[] interfaces){
		
		this.target = target;
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), interfaces, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("before:");
		result = method.invoke(target, args);
		System.out.println("after.");
		return result;
	}

}
