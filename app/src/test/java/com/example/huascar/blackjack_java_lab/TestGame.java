package com.example.huascar.blackjack_java_lab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by huascar on 07/11/2017.
 */

public class TestGame {

    Player player1 = new Player("John");
    Player dealer = new Player("Jeff");
    Deck deck = new Deck();

    @Test
    public void testSetUp() {
        Game game = new Game(player1, dealer, deck);
    }

    @Test
    public void TestDealCardsToPlayer() {
        Game game = new Game(player1, dealer, deck);
        game.deck.setup();
        game.dealCards();
        assert(1 >= player1.hand.size());
        assert(1 >= dealer.hand.size());
    }

}
