import java.util.concurrent.Delayed;

public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[]hand;
    public boolean isBust;

    public Dealer(){
        isOver16= true;
        cardTotal = 52;
        // hand = idk
        isBust = true;

    }
}
