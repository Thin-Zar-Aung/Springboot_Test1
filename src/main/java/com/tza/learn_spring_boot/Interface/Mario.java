package com.tza.learn_spring_boot.Interface;

public class Mario implements NitendoInterface {

	@Override
	public void play() {
		System.out.println("Mario Play");
		
	}

	@Override
	public void paused() {
		System.out.println("Mario Paused");		
	}

}
