package com.example.huascar.blackjack_java_lab;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by huascar on 07/11/2017.
 */

public class DeckTest {

    @Test
    public void TestSetup() {
        Deck deck = new Deck();
        deck.setup();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void testgetNextCard() {
        Deck deck = new Deck();
        deck.setup();
        Card card = deck.nextCard();

        //Because card does not have any methods
        //to expose rank or suit
        //I could potentially assert that it is not null
        //This may change as my code organically grows.
        assertNotNull(card);
    }
}
