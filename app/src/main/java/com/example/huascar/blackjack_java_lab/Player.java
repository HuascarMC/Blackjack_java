package com.example.huascar.blackjack_java_lab;

import java.util.ArrayList;

/**
 * Created by huascar on 07/11/2017.
 */

public class Player {

    String name;
    ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public void calculateHandValue(){

    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }
}
