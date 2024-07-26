package com.tza.learn_spring_boot.usedspringboot;

import org.springframework.stereotype.Component;


public class SwitchGame1 implements NitendoInterface {

	public void play() {
		System.out.println("Switch Game play");
	}
	public void paused() {
		System.out.println("Switch Game Paused");
	}
	
}
