package com.tza.learn_spring_boot.usedspringboot;

import org.springframework.stereotype.Component;

@Component
public class TenisGame1 implements NitendoInterface{

	public void play() {
		System.out.println("Tenis Game play");
	}
	public void paused() {
		System.out.println("Tenis Game Paused");
	}
	
}
