package com.massa.dp.strategy;

public class Client {

	private Strategy myStragey;

	public Strategy getMyStragey() {
		return myStragey;
	}

	public void setMyStragey(Strategy myStragey) {
		this.myStragey = myStragey;
	}
	
	public void someMethodeUsingAlgorithm(){
		myStragey.algorithm();
	}
	
}
