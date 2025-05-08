package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    //Holds all 52 cards
    private ArrayList<Card> cards;

    //builds all cards for each suit and value
    public Deck() {
        this.cards = new ArrayList<Card>();

        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};
        // these loops create all the cards in the deck
        // and add them to the ArrayList
        for (String suit : suits) {
            for (String value : values) {
                Card c = new Card(suit, value); //create a card
                cards.add(c); //add it to the deck
            }
        }
    }

    //randomizes order of the cards
    public void shuffle() {
        Collections.shuffle(cards); //give us a random number
    }

    //removes and returns the top card
    public Card deal() {
        // deal the top card (if there are any cards left
        if (cards.size() > 0) {
            Card c = cards.remove(0); //remove the first card
            return c;
        } else {
            return null; //no more cards to take
        }
    }

    //how many cards are left
    public int getSize() {
        return cards.size();
    }
}