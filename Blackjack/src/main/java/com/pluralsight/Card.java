package com.pluralsight;

public class Card {
    //Private variables
    private String suit;
    private String value;
    private boolean isFaceUp;

    //Constructor to make a card
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    //Getters

    //Returns suit if it is a face  up or else returns a number
    public String getSuit() {
        // only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    //Returns value if face up or else it returns #
    public String getValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return this.value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        // only return the value if the card is face up

        // determine point value and return it
        // A = 11
        // K, Q, J = 10
        // all numeric cards are equal to their face value

        switch (this.value) {
            case "A":
                return 11;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 10;
            case "Q":
                return 10;
            case "K":
                return 10;
        }
        return -1000;
    }

    public boolean isFaceUp() { //get consumer access to if its currently face up
        return isFaceUp;
    }

    public boolean isFaceDown() {
        return !this.isFaceUp;
    }

    //Method
    public boolean flip(){
        this.isFaceUp = !this.isFaceUp; //make it whatever the current state is now
        return this.isFaceUp;
    }

}