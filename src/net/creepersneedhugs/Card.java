package net.creepersneedhugs;

public class Card {
    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.suit = cardSuit;
        this.rank = cardRank;
        this.pointValue = cardPointValue;
    }

    public String suit() {
        return this.suit;
    }

    public String rank() {
        return this.rank;
    }

    public int pointValue() {
        return this.pointValue;
    }

    public boolean matches(Card otherCard) {
        return this.suit.equals(otherCard.suit) && this.rank.equals(otherCard.rank);
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
    }
}

