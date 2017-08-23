package com.cn.designPatterns.structure.ProxyDynamicPattern;

public class UserServiceImp implements UserService{

	@Override
	public void getName() 
	{
		System.out.println("This is Eric");
	}

}
