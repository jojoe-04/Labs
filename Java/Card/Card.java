package Labs.Java.Card;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.*;

public class Card implements Comparable<Card> {

    // compare two instance of card class by card value
    // private char value;
    // private char suite;

    private Suit suit;
    private CardValue cardValue;

    public Card() {
    }

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return this.cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public Card suit(Suit suit) {
        setSuit(suit);
        return this;
    }

    public Card cardValue(CardValue cardValue) {
        setCardValue(cardValue);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            System.out.println("Match");
            return false;
        }
        if (o instanceof Card) {
            Card other = (Card) o;
            return this.suit.equals(other.suit) && this.cardValue == other.cardValue;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, cardValue);
    }

    @Override
    public String toString() {
        return "{" + " suit='" + getSuit() + "'" + ", cardValue='" + getCardValue() + "'" + "}";
    }

    // public int compareTo(Card other) {
    // if (this.getCardValue().getValue() == other.getCardValue().getValue())
    // return 0;
    // else if (this.getCardValue().getValue() > other.getCardValue().getValue())
    // return 1;
    // else
    // return -1;

    // }

    @Override
    public int compareTo(Card other) {
        // return this.suit.compareTo(other.getSuit());

        // return Comparator.comparing(Card::getSuit).thenComparing(Card::getCardValue)
        // .compare(this, other);

        int i = this.suit.compareTo(other.getSuit());
        if (i != 0)
            return i;

        return this.cardValue.compareTo(other.cardValue);

    }

    // public int compare(Card c1, Card c2) {
    // return c1.getCardValue().compareTo(c2.getCardValue());
    // }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.D, CardValue.FIVE);
        Card card2 = new Card(Suit.D, CardValue.FIVE);
        Card card3 = new Card(Suit.H, CardValue.FIVE);

        // overriding equals to and Hashcode
        System.out.println(card1.equals(card2));
        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());

        // Comparable Interface and Ordering elements
        System.out.println(card1.compareTo(card3)); // Printing 0 indicating they are the same

        // Ordering Elements
        List<Card> cards = new ArrayList<>(Arrays.asList(new Card(Suit.D, CardValue.FIVE),
                new Card(Suit.D, CardValue.TWO), new Card(Suit.D, CardValue.ACE)));

        Collections.sort(cards);
        System.out.println(cards);

        // List<Film> films = new ArrayList<>();
        // films.add(new Film("A", 2000));
        // films.add(new Film("B", 1999));
        // films.add(new Film("C", 2001));
        // films.add(new Film("D", 2000));

        // for (Film e : films) {
        // System.out.println(e);
        // }

        // Comparator<Film> comparator =
        // Comparator.comparing(Film::getReleaseYear).thenComparing(Film::getName);

        // Collections.sort(films, comparator);

        // for (Film e : films) {
        // System.out.println(e);
        // }
    }

}
