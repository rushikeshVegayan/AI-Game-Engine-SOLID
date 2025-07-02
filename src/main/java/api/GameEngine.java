package api;


import game.*;

public class GameEngine {

	public Board start(String type) {
		if(type.equals("TicTacToe")){
			return new TicTacToeBoard();
		}else{
			throw new IllegalArgumentException();
		}
	}

	public void move(Board borad, Player player, Move move) {
		if(borad instanceof TicTacToeBoard){
			((TicTacToeBoard) borad).setCell(player.symbol(), move.getCell());
		}else{
			throw new IllegalArgumentException();
		}
	}
}


