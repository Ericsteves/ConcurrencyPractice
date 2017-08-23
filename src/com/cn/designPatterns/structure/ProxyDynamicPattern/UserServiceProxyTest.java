package com.cn.designPatterns.structure.ProxyDynamicPattern;

public class UserServiceProxyTest {

	public static void main(String[] args) {
		UserServiceProxy usProxy = new UserServiceProxy();
		UserService us = new UserServiceImp();
		us = (UserService)usProxy.bind(us, new Class[]{UserService.class});
		us.getName();
	}

}
