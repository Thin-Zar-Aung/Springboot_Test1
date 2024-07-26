package com.tza.learn_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tza.learn_spring_boot.game.Nitendo;
import com.tza.learn_spring_boot.game.SwitchGame;
import com.tza.learn_spring_boot.Interface.Mario;
import com.tza.learn_spring_boot.usedspringboot.*;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		
		//tight couple start
		//SwitchGame sw = new SwitchGame();
		//Nitendo runner = new Nitendo(sw);
		//runner.run();
		//tight copule end
		//Interface start
		//SwitchGame1 sw = new SwitchGame1();
		//Nitendo1 runner = new Nitendo1(sw);
		//runner.run();
		
		//TenisGame1 tn = new TenisGame1();
		//Nitendo1 runner1 = new Nitendo1(tn);
		//runner1.run();
		
		//Mario marigame = new Mario();
		//Nitendo1 runnermario = new Nitendo1(marigame);
		//runnermario.run();
		//Interface end		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
		Nitendo1 nirunner = context.getBean(Nitendo1.class);
		nirunner.run();
	}
	}
