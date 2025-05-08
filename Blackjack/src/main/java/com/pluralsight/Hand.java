package com.pluralsight;

import java.util.ArrayList;

public class  Hand {
    private ArrayList<Card> cards;

    //no values needed but will equal a new array list
    public Hand(){
        cards = new ArrayList<Card>();
    }
    // A Card is dealt to the Hand and the Hand is responsible to store the card
    //Adds card to hand
    public void deal(Card card){
        cards.add(card);
    }

    //returns the number of cards in hand
    public int getSize(){
        return this.cards.size();
    }
    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    public int getValue(){
        int total = 0;
        for(Card c:this.cards){
            total += c.getPointValue();
        }
        return total; //total value of the cards in your hand
    }

    //prints all card in hand
    public void showHand() {
        for (Card card : cards) {
            if (card.isFaceDown()) {
                card.flip(); // make sure the card is face-up before showing
            }
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }

}