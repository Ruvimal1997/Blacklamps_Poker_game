package dto;

/**
 * Created by Ruvimal Senanayake on 04/06/2017.
 */
public class Card {
    private String face;
    private String suit;
    private boolean isFaceUp;
    private String sCardImage;

    //Create Constructor from Card Class
    public Card(String cardFace,String cardSuit){

        face = cardFace;
        suit = cardSuit;
    }

    public String getCardName() {
        return face+suit;

    }
    public String toString(){

        return face+suit;

    }

    public void setFace(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

    public boolean getFace() {
        return this.isFaceUp;
    }

    public void setImageName(String sImage) {
        this.sCardImage = sImage;
    }

    public String getImageName() {
        return this.sCardImage;
    }
}
