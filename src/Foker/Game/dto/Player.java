package Foker.Game.dto;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;

import java.util.List;

/**
 * Created by Ruvimal Senanayake on 04/06/2017.
 */
public class Player {
    private final static String NAME_PROP_NAME = "name";
    private ReadOnlyStringWrapper name;
    protected PlayerHand playerHand;
    private boolean isDealer;
    private boolean folded;

    private List<Card> winningCards;

    public Player(String name,int order){
        this.name = new ReadOnlyStringWrapper(this,NAME_PROP_NAME, name);
        playerHand = new PlayerHand();
        isDealer = false;
        winningCards = null;
    }

    public ReadOnlyStringProperty nameProperty() {
        return name.getReadOnlyProperty();
    }

    public void changeCard(Card card){
        playerHand.add(card);
    }

    public int getHandSize(){
        return playerHand.size();
    }

    public String getName() {
        return name.get();
    }

    public PlayerHand getPlayerHand() {
        return playerHand;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setWinningCards(List<Card> cards){
        winningCards = cards;
    }

    public List<Card> getWinningCards(){
        return winningCards;
    }
}
