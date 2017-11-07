package com.example.huascar.blackjack_java_lab;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by huascar on 07/11/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public void setup() {
        this.cards = new ArrayList<>();

        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();

        for(Suit suit : allSuits) {
            for(Rank rank : allRanks) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void shuffle() {
        //There is a collections class which has a static method
        //Remember: self.all(
        //Which is called shuffle which accepts an arraylist or array
        //This shuffles the array in place
        //Remember the operator ! operator for methods in Ruby (array.map!)
        Collections.shuffle(this.cards);
    }

    public Card nextCard() {
        //The remove method takes in an index and removes that
        //index from the array and returns it.
        return this.cards.remove(0);
    }

    public int getNumberOfCards() {
        return cards.size();
    }
}
