package com.softwareintitute.davis.gareth.minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean menuOut = false;
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
                boolean gameFinished = false;
                do {
                    int xCord;
                    int yCord;
                    System.out.println(myGrid);
                    System.out.println("Please enter X coordinate");
                    xCord = scanner.nextInt();
                    System.out.println("Please enter Y coordinate");
                    yCord = scanner.nextInt();
                    System.out.println(myGrid.revealSquare(xCord,yCord));
                    if (myGrid.isGameDone()){
                        gameFinished = true;
                    }
                } while (gameFinished == false);

            } else if (userInput == 2){
                menuOut = true;
            }
        } while (menuOut == false);

    }
}
