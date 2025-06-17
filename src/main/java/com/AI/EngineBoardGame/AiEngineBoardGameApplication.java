package com.AI.EngineBoardGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiEngineBoardGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiEngineBoardGameApplication.class, args);
	}

	public Board start(){
		return new TicTacToeBoard();
	}

	public boolean isComplete(Board board){

	}

	public void move(Board borad){

	}

	public class Board{

	}

	public class TicTacToeBoard{

	}

}
