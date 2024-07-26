package com.tza.learn_spring_boot.Interface;

public class Nitendo1 {
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
