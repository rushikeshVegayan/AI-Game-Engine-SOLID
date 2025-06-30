package com.AI.EngineBoardGame;

import api.GameEngine;
import game.Board;
import game.Cell;
import game.Move;
import game.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GameEngine gameEngine = new GameEngine();
        Board board = gameEngine.start("TicTacToe");
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        while (!gameEngine.isComplete(board).isOver()) {
            row = scanner.nextInt();
            col = scanner.nextInt();
            Player opponent = new Player("X"), computer = new Player("O");
            Move opponentMove = new Move(new Cell(row, col));
            Move sugeestMove = gameEngine.suggestMove(board, computer);
            gameEngine.move(board, computer, sugeestMove);
            gameEngine.move(board, opponent, opponentMove);
        }
        System.out.println("Board result is " + gameEngine.isComplete(board).isOver() + " Winner is " + gameEngine.isComplete(board).getWinner());
    }
}
