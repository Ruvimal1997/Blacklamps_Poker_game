package Foker.Game.Util;

/**
 * Created by Ruvimal Senanayake on 04/06/2017.
 */
public class ImageHandling {

    //All Faces  of the Suit Heart
    private final static String HA = "/Images/Hearts/hearts_ace.png";
    private final static String H2 = "/Images/Hearts/hearts_2.png";
    private final static String H3 = "/Images/Hearts/hearts_3.png";
    private final static String H4 = "/Images/Hearts/hearts_4.png";
    private final static String H5 = "/Images/Hearts/hearts_5.png";
    private final static String H6 = "/Images/Hearts/hearts_6.png";
    private final static String H7 = "/Images/Hearts/hearts_7.png";
    private final static String H8 = "/Images/Hearts/hearts_8.png";
    private final static String H9 = "/Images/Hearts/hearts_9.png";
    private final static String H10 = "/Images/Hearts/hearts_10.png";
    private final static String Hj = "/Images/Hearts/hearts_jack.png";
    private final static String Hq = "/Images/Hearts/hearts_queen.png";
    private final static String Hk = "/Images/Hearts/hearts_king.png";

    //All Faces  of the Suit Diamond
    private final static String DA = "/Images/Diamonds/diamonds_ace.png";
    private final static String D2 = "/Images/Diamonds/diamonds_2.png";
    private final static String D3 = "/Images/Diamonds/diamonds_3.png";
    private final static String D4 = "/Images/Diamonds/diamonds_4.png";
    private final static String D5 = "/Images/Diamonds/diamonds_5.png";
    private final static String D6 = "/Images/Diamonds/diamonds_6.png";
    private final static String D7 = "/Images/Diamonds/diamonds_7.png";
    private final static String D8 = "/Images/Diamonds/diamonds_8.png";
    private final static String D9 = "/Images/Diamonds/diamonds_9.png";
    private final static String D10 = "/Images/Diamonds/diamonds_10.png";
    private final static String Dj = "/Images/Diamonds/diamonds_jack.png";
    private final static String Dq = "/Images/Diamonds/diamonds_queen.png";
    private final static String Dk = "/Images/Diamonds/diamonds_king.png";

    //All Faces  of the Suit Club
    private final static String CA = "/Images/Clubs/clubs_ace.png";
    private final static String C2 = "/Images/Clubs/clubs_2.png";
    private final static String C3 = "/Images/Clubs/clubs_3.png";
    private final static String C4 = "/Images/Clubs/clubs_4.png";
    private final static String C5 = "/Images/Clubs/clubs_5.png";
    private final static String C6 = "/Images/Clubs/clubs_6.png";
    private final static String C7 = "/Images/Clubs/clubs_7.png";
    private final static String C8 = "/Images/Clubs/clubs_8.png";
    private final static String C9 = "/Images/Clubs/clubs_9.png";
    private final static String C10 = "/Images/Clubs/clubs_10.png";
    private final static String Cj = "/Images/Clubs/clubs_jack.png";
    private final static String Cq = "/Images/Clubs/clubs_queen.png";
    private final static String Ck = "/Images/Clubs/clubs_king.png";

    //All Faces  of the Suit Spades
    private final static String SA = "/Images/Spades/spades_ace.pngg";
    private final static String S2 = "/Images/Spades/spades_2.png";
    private final static String S3 = "/Images/Spades/spades_3.png";
    private final static String S4 = "/Images/Spades/spades_4.png";
    private final static String S5 = "/Images/Spades/spades_5.png";
    private final static String S6 = "/Images/Spades/spades_6.png";
    private final static String S7 = "/Images/Spades/spades_7.png";
    private final static String S8 = "/Images/Spades/spades_8.png";
    private final static String S9 = "/Images/Spades/spades_9.png";
    private final static String S10 = "/Images/Spades/spades_10.png";
    private final static String Sj = "/Images/Spades/spades_jack.png";
    private final static String Sq = "/Images/Spades/spades_queen.png";
    private final static String Sk = "/Images/Spades/spades_king.png";

    public static final String getImage(String sCard ) {

        // "Hide image" default
        String sImageName="/Images/CardHide.png";

        switch(sCard) {

            case "AH" :sImageName = HA;break;
            case "2H" :sImageName = H2;break;
            case "3H" :sImageName = H3;break;
            case "4H" :sImageName = H4;break;
            case "5H" :sImageName = H5;break;
            case "6H" :sImageName = H6;break;
            case "7H" :sImageName = H7;break;
            case "8H" :sImageName = H8;break;
            case "9H" :sImageName = H9;break;
            case "10H" :sImageName = H10;break;
            case "JH" :sImageName = Hj;break;
            case "QH" :sImageName = Hq;break;
            case "KH" :sImageName = Hk;break;//end

            case "AD" :sImageName = DA;break;
            case "2D" :sImageName = D2;break;
            case "3D" :sImageName = D3;break;
            case "4D" :sImageName = D4;break;
            case "5D" :sImageName = D5;break;
            case "6D" :sImageName = D6;break;
            case "7D" :sImageName = D7;break;
            case "8D" :sImageName = D8;break;
            case "9D" :sImageName = D9;break;
            case "10D":sImageName = D10;break;
            case "JD" :sImageName = Dj;break;
            case "QD" :sImageName = Dq;break;
            case "KD" :sImageName = Dk;break;//end

            case "AC" :sImageName = CA;break;
            case "2C" :sImageName = C2;break;
            case "3C" :sImageName = C3;break;
            case "4C" :sImageName = C4;break;
            case "5C" :sImageName = C5;break;
            case "6C" :sImageName = C6;break;
            case "7C" :sImageName = C7;break;
            case "8C" :sImageName = C8;break;
            case "9C" :sImageName = C9;break;
            case "10C" :sImageName = C10;break;
            case "JC" :sImageName = Cj;break;
            case "QC" :sImageName = Cq;break;
            case "KC" :sImageName = Ck;break;//end

            case "AS" :sImageName = SA;break;
            case "2S" :sImageName = S2;break;
            case "3S" :sImageName = S3;break;
            case "4S" :sImageName = S4;break;
            case "5S" :sImageName = S5;break;
            case "6S" :sImageName = S6;break;
            case "7S" :sImageName = S7;break;
            case "8S" :sImageName = S8;break;
            case "9S" :sImageName = S9;break;
            case "10S" :sImageName = S10;break;
            case "JS" :sImageName = Sj;break;
            case "QS" :sImageName = Sq;break;
            case "KS" :sImageName = Sk;break;

            default:
                sImageName ="/Images/CardHide.png";break;
        }
        return sImageName;
    }
}
