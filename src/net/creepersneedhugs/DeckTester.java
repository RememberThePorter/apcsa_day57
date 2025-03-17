package net.creepersneedhugs;

import java.util.List;

public class DeckTester {
    public static void main(String[] args) {
        String[] ranks1 = {"A", "2", "3"};
        String[] suits1 = {"Spades", "Hearts", "Diamonds"};
        int[] pointValues1 = {1, 2, 3};
        Deck deck1 = new Deck(ranks1, suits1, pointValues1);

        String[] ranks2 = {"4", "5", "6"};
        String[] suits2 = {"Hearts", "Diamonds", "Clubs"};
        int[] pointValues2 = {4, 5, 6};
        Deck deck2 = new Deck(ranks2, suits2, pointValues2);

        String[] ranks3 = {"7", "8", "9"};
        String[] suits3 = {"Diamonds", "Clubs", "Spades"};
        int[] pointValues3 = {7, 8, 9};
        Deck deck3 = new Deck(ranks3, suits3, pointValues3);
    }
}
