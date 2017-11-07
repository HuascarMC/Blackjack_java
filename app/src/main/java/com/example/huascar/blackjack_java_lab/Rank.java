package com.example.huascar.blackjack_java_lab;

/**
 * Created by huascar on 07/11/2017.
 */

public enum Rank {
    ACE(11),
    KING(10),
    QUEEN(10),
    JACK(10),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);


    private int value;

    //Enums wtih values must have constructors
    //that are not public
    //These are loaded when the applicatoin starts.

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
