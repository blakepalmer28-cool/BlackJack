import java.util.concurrent.Delayed;

public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[]hand;
    public boolean isHit;
    public boolean isBust;

    public Dealer(){
        isOver16= false;
        cardTotal = 0;
        hand = new Card[2];
        isBust = false;
        isHit = false;

    }
    public void calculateTotal(){
        int total = 0;
        for (int i = 0;i<hand.length; i++){
            total = total +hand[i].value;
        }
        cardTotal = total;
    }
    public void printInfo(){
        System.out.println("card totoal:"+cardTotal);
        System.out.println("isBust:"+isBust);
        System.out.println("isHit):"+isHit);
        for (int s =0; s< hand.length; s++){
            hand[s].printInfo();
        }
    }
}
