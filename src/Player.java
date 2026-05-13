public class Player {
    public int cardTotal;
    public boolean isBust;
    public Card[]hand;
    public boolean isHit;
    public String name;

    public Player(){
        cardTotal = 52;
        isBust = true;
        hand = new Card[2];
        isHit = true;
        name = "Thomas Hyland";
    }

}
