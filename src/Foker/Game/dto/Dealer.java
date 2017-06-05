package Foker.Game.dto;

/**
 * Created by Ruvimal Senanayake on 05/06/2017.
 */
public class Dealer {

    private Deck deck;
    // private Table table;
    // CardAnalyser cardAnalyser
    private Round currentRound;

    private int roundCount;

    public enum Round {

        Input_Phase, Processing_Phase, Flog
    };

   // private int dealingPlayerOrder;
    public Dealer() {
        deck = new Deck();

      //  dealingPlayerOrder = 1;
        currentRound = Round.Input_Phase;
        roundCount = 0;
        //cardAnalyser = new CardAnalyser();
    }
    public int incrementRoundCount(){
        roundCount++;
        return roundCount;
    }
  // public void setDealingPlayerOrder(int pos){
 //       dealingPlayerOrder = pos;
    //}
    public void setRoundCount(int count){
        roundCount = count;
    }

    public int getRoundCount(){
        return roundCount;
    }
    public Round getRound() {
        return currentRound;
    }

    public void setRound(Round round) {
        this.currentRound = round;
    }

    public void shuffleDeck() {
        deck.shuffle();
    }

   // public int getDealingPlayerOrder() {
     //   return dealingPlayerOrder;
    //}

}
