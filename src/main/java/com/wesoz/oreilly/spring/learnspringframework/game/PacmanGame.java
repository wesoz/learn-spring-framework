package com.wesoz.oreilly.spring.learnspringframework.game;

public class PacmanGame implements GameConsole {
	@Override
	public void up() {
		System.out.println("PacmanGame up");
	}
	
	@Override
	public void down() {
		System.out.println("PacmanGame down");
	}
	
	@Override
	public void left() {
		System.out.println("PacmanGame left");
	}
	
	@Override
	public void right() {
		System.out.println("PacmanGame right");
	}
}
