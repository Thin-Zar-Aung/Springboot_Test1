package com.tza.learn_spring_boot.usedspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nitendo1 {
	@Autowired
   private NitendoInterface ninterface;
   	public Nitendo1(NitendoInterface nf) {
		// TODO Auto-generated constructor stub
		this.ninterface =nf;
	}

	public void run() {
		// TODO Auto-generated method stub
		ninterface.play();
		ninterface.paused();
		
	}

}
