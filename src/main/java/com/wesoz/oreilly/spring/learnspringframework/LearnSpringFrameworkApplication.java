package com.wesoz.oreilly.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wesoz.oreilly.spring.learnspringframework.enterprise.exemple.web.MyWebController;
import com.wesoz.oreilly.spring.learnspringframework.game.GameRunner;

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
		
		MyWebController controller = context.getBean(MyWebController.class);
		
		System.out.println(controller.returnValueFromBusinessService());
	}

}
