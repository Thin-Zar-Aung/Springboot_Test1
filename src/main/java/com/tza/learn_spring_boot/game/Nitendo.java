package com.tza.learn_spring_boot.game;

public class Nitendo {
   private SwitchGame swgame;
   //When we want to run Tenis game we need to comment the SwithGame. Tigh coupling has problem.
   //need to update constructor also
	public Nitendo(SwitchGame nt) {
		// TODO Auto-generated constructor stub
		this.swgame =nt;
	}

	public void run() {
		// TODO Auto-generated method stub
		swgame.play();
		swgame.paused();
		
	}

}
