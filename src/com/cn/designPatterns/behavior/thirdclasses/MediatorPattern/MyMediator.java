package com.cn.designPatterns.behavior.thirdclasses.MediatorPattern;

public class MyMediator implements Mediator{
	
	private User user1;
	private User user2;
	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
		
	}

	@Override
	public void workAll(User user) {
		if(user instanceof User1){
			System.out.println("User1 get this job! User2 is a loser.");
			user.work();
		}else if(user instanceof User2){
			System.out.println("User2 get this job! User1 is a loser.");
			user.work();
		}
		
	}

}
