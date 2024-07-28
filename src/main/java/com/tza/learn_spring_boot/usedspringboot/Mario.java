package com.tza.learn_spring_boot.usedspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

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
