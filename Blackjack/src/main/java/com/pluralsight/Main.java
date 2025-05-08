package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck(); //create new deck
        deck.shuffle();  //shuffle the deck

        System.out.print("Enter number of players: ");
        int numPlayers = Integer.parseInt(scanner.nextLine());    //save number of players

        ArrayList<Player> players = new ArrayList<>();

        // Get player names
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for Player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        // Deal 2 cards to each player
        for (Player player : players) {
            player.getHand().deal(deck.deal());
            player.getHand().deal(deck.deal());
        }

        // Show hands and values
        Player winner = null;
        int highest = 0;

        System.out.println("\n-- Player Hands --");
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand:");
            player.getHand().showHand();
            int value = player.getHand().getValue();

            if (value <= 21 && value > highest) {
                highest = value;
                winner = player;
            }

            System.out.println();
        }

        if (winner != null) {
            System.out.println(winner.getName() + " wins and has " + highest + " points!");


        } else {
            System.out.println("No winner!");
        }

        scanner.close();
    }
}
