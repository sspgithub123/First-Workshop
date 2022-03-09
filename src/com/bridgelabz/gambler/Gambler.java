package com.bridgelabz.gambler;

import java.util.Scanner;

public class Gambler {
    public static final int STAKE = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
        Gambler gambler = new Gambler();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Gambler Game");
        System.out.println("Set Limit till you want to win for 3rd Use Case ");
        int winLimit1 = scanner.nextInt();
        System.out.println("Set Limit till you can afford Lose or 3rd Use Case");
        int loseLimit1 = scanner.nextInt();
        gambler.gamePlay(winLimit1, loseLimit1);

        System.out.println();
        System.out.println("Use Case 3 Finished");
    }

    // Usecase 2 ( Checking If player Win Or Lose )

    public boolean checkWinOrLose() {
        boolean randomlyCheck = (Math.random() < 0.5);

        if (randomlyCheck) {
            System.out.println(" Congrats Player Win ");
        } else {
            System.out.println(" Player Lose ");
        }
        return randomlyCheck;
    }

    //UseCase 3 ( Checking player Win or Lose using Limits )

    public int gamePlay(int winLimit, int loseLimit) {
        int stake = 100;

        while (stake < winLimit && stake > loseLimit) {
            if (checkWinOrLose()) {
                stake = stake + 1;
                System.out.println(stake + " ");
            } else {
                stake = stake - 1;
                System.out.println(stake + " ");
            }
        }
        return stake;
    }
}
