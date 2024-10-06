package com.wesoz.oreilly.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wesoz.oreilly.spring.learnspringframework.game.GameRunner;
import com.wesoz.oreilly.spring.learnspringframework.game.GameConsole;
import com.wesoz.oreilly.spring.learnspringframework.game.MarioGame;
import com.wesoz.oreilly.spring.learnspringframework.game.PacmanGame;
import com.wesoz.oreilly.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
//		GameConsole game = new MarioGame();
//		GameConsole game = new SuperContraGame();
//		GameConsole game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
	}

}
