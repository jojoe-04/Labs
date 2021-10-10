package Labs.Java.Card;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardTest {

    private Card card1 = new Card(Suit.H, CardValue.FIVE);

    @Test
    void getters() {
        assertEquals(5, card1.getCardValue().getValue());
    }

}
