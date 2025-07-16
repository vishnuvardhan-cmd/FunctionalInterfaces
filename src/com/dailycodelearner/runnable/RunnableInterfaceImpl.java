package com.dailycodelearner.runnable;

public class RunnableInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
		Runnable runnable=()->System.out.println("running inside thread");
		Thread t=new Thread(runnable);
		t.start();

	}

}
