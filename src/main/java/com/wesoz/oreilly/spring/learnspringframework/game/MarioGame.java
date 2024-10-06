package com.wesoz.oreilly.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole {
	@Override
	public void up() {
		System.out.println("jump");
	}
	
	@Override
	public void down() {
		System.out.println("down into a hole");
	}
	
	@Override
	public void left() {
		System.out.println("stop");
	}
	
	@Override
	public void right() {
		System.out.println("accelerate");
	}
}
