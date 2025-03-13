package net.creepersneedhugs;

public class CardTester {
    public static void main(String[] args) {
        System.out.println("Test 1: " + test1());
        System.out.println("Test 2: " + test2());
        System.out.println("Test 3: " + test3());
    }

    public static boolean test1() {
        Card card = new Card("A", "Spades", 17);
        return card.rank().equals("A") && card.suit().equals("Spades");
    }

    public static boolean test2() {
        Card card1 = new Card("7", "Hearts", 46);
        Card card2 = new Card("7", "Hearts", 46);
        return card1.matches(card2);
    }

    public static boolean test3() {
        Card card1 = new Card("10", "Clubs", 2);
        Card card2 = new Card("7", "Diamonds", 2);
        return !card1.matches(card2);
    }
}
