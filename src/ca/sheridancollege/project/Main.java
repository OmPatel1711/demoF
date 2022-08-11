/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ompat
 */
public class Main {

    public static void main(String[] args) {
        BrainCard pt = new BrainCard();
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Press 1 for play ");
        System.out.println("press 2 for exit ");
        System.out.print("Enter : ");
        num = sc.nextInt();
        double bet = 0;
        double be = 0;

        if (checkValue(num)) {

            while (num != 2) {
                switch (num) {
                    case 1: {
                        boolean isPlayer = true;
                        while (isPlayer) {

                            System.out.print("How Many Player are you ? : ");
                            int players = sc.nextInt();
                            if (CheckPlayer(players)) {
                                isPlayer = false;
                                for (int m = 1; m <= players; m++) {

                                    boolean isMore = true;
                                    while (isMore) {
                                        System.out.print("Enter Player " + m + " Name: ");
                                        String name = sc.next();
                                        if (checkSpecial(name)) {
                                            pt.addPlayers(name);
                                            isMore = false;

                                        } else {
                                            System.out.println("Not enter any special Character");

                                        }
                                    }

                                    boolean isTrue = true;
                                    while (isTrue) {
                                        System.out.print("Enter betting amount :");
                                        bet = sc.nextDouble();

                                        if (checkBet(bet)) {

                                            be += bet;
                                            Betting.betting(be);
                                            isTrue = false;
                                        } else {
                                            System.out.println("Please enter Betting Amount");
                                        }
                                    }
                                    pt.setPlayerCard();
                                }

                            } else {
                                System.out.println("Please enter player between 1-17");
                            }
                        }
                        pt.winner();

                        System.out.println();

                        num = 2;
                    }

                }
            }

        } else {
            System.out.print("Enter a valid Input");
        }
    }

    public static boolean checkValue(int x) {

        if (x == 1 || x == 2) {
            return true;
        }

        return false;
    }

    public static boolean checkSpecial(String x) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(x);
        boolean special = matcher.find();
        if (special) {
            return false;
        }

        return true;
    }

    public static boolean checkBet(double x) {

        if (x == 0 || x < 0) {
            return false;
        }

        return true;
    }

    public static boolean CheckPlayer(int x) {

        if (x >= 1 && x <= 17) {
            return true;
        }

        return false;
    }

}
