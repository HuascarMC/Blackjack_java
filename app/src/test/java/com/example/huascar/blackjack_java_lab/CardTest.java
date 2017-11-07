package com.example.huascar.blackjack_java_lab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by huascar on 07/11/2017.
 */

public class CardTest {

    @Test
    public void testCardValue() {
        Card card = new Card(Suit.CLUBS, Rank.EIGHT);

        int actual = card.getValue();

        assertEquals(8, actual);
    }
}
