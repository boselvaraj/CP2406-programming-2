package com.boopathi.trump;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;


/**
 * 
 * @author Boopathi Selvaraj
 * @since 26/10/2016
 * 
 * This is the Main class for that game. This is the one which gets executed and calls all the other class at the required time. 
 * This initializes the Game class and controls game play
 *
 */
public class MineralSupertrumpsMain {

    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.createMainMenu();
        frame.setVisible(true);
        startGame(5);
    }

    private static void startGame(int numOfPlayers) {
        int dealerIndex;

        System.out.println("Starting new game...");
        ArrayList deck = Game.buildDeck();
        System.out.println("Finished building...");
        System.out.println("Selecting dealer...");
        dealerIndex = Game.selectDealer(numOfPlayers);
        System.out.println("The Dealer is: Player" + dealerIndex);
        Game game = new Game(numOfPlayers);
        System.out.println("Players initialised...");
        System.out.println("Starting Game...");
        System.out.println("#######################################################");

    }



}