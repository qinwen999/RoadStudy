package com.my.design.strategy;

public class Client {
	public static void main(String[] args) {
	     Context context;
	     context = new Context(new Strategy1());
	     context.operate();
	     context.setStrategy(new Strategy2 ());
	     context.operate();
	     }

}
