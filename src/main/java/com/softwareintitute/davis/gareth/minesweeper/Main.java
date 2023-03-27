package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean gameFinished = false;
        int userInput;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPlease choose an option: " +
                    "\n1 - Play Game " +
                    "\n2 - Quit " +
                    "\nChoose your option (1-3):");
            userInput = scanner.nextInt();
            if (userInput == 1){
                MinesweeperGrid myGrid = new MinesweeperGrid(5,5,10);
                int xCord;
                int yCord;
                System.out.println(myGrid);
                System.out.println("Please enter X coordinate");
                xCord = scanner.nextInt();
                System.out.println("Please enter Y coordinate");
                yCord = scanner.nextInt();
                System.out.println(myGrid.revealSquare(xCord,yCord));
            } else if (userInput == 2){
                gameFinished = true;
            }
        } while (gameFinished = false);

    }
}
