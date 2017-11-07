package com.example.huascar.blackjack_java_lab;

/**
 * Created by huascar on 07/11/2017.
 */

public class Game {

    Player player1;
    Player dealer;
    Deck deck;

    public Game(Player player1, Player dealer, Deck deck) {
        this.player1 = player1;
        this.dealer = dealer;
        this.deck = deck;
    }

    public void dealCards() {
        Card card = deck.nextCard();
        player1.takeCard(card);
        Card card2 = deck.nextCard();
        dealer.takeCard(card2);
    }

}
