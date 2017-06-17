package Foker.Game.dto;

/**
 * Created by Ruvimal Senanayake on 04/06/2017.
 */
public class CardValue {

    private int cardValue;

    public CardValue(int value)
    {
        this.setCardValue(value);
    }

    public static CardValue getValue(int value){
        return new CardValue(value);
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

        public static final short FIVE = 5;
        public static final short SIX = 6;
        public static final short SEVEN = 7;
        public static final short EIGHT = 8;
        public static final short NINE = 9;
        public static final short TEN = 10;
        public class FCardValue{
            public static final short TWO = 2;
            public static final short THREE = 3;
            public static final short FOUR = 4;
        public static final short JACK = 11;
        public static final short QUEEN = 12;
        public static final short KING = 13;
        public static final short ACE = 14;

    }
}
