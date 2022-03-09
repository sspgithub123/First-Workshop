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

        System.out.println("Set Limit till you want to win for 4th Use Case ");
        int winLimit2 = scanner.nextInt();
        System.out.println("Set Limit till you can afford Lose for 4th Use Case ");
        int loseLimit2 = scanner.nextInt();
        gambler.totalAmountCalFor20Days(winLimit2, loseLimit2);
        System.out.println("Use Case 4 Finished");
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

    //UseCase 4 ( Calculating 20 Days Result by checking Player Win Or Lose )

    public void totalAmountCalFor20Days(int winLimit, int loseLimit) {
        int checkWin = winLimit;
        int checkLose = loseLimit;
        int days = 20;
        int countWin = 0;
        int countLose = 0;
        for (int index = 0; index < days; index++) {

            int resultOfDay = gamePlay(winLimit, loseLimit);
            if (resultOfDay == checkWin) {
                countWin++;
            } else if (resultOfDay == checkLose) {
                countLose++;
            }
        }
        System.out.println("Total 20 Days Result");
        System.out.println("In 20 Days Total Wins" + countWin);
        System.out.println("In 20 Days Total Loses" + countLose);
    }
}
