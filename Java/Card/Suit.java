package Labs.Java.Card;

public enum Suit {

    S(-2), D(1), C(-1), H(0);

    private int value;

    private Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
