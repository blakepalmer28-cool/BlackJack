public class Player {
    public int cardTotal;
    public boolean isBust;
    public Card[]hand;
    public boolean isHit;
    public String name;

    public Player(){
        cardTotal = 52;
        isBust = false;
        hand = new Card[2];
        isHit = false;
        name = "Thomas Hyland";
    }
    public void  printInfo(){
        System.out.println("name:"+name);
        System.out.println("card totoal:"+cardTotal);
        System.out.println("isBust:"+isBust);
        System.out.println("isHit:"+isHit);
        for (int s =0; s< hand.length; s++){
            hand[s].printInfo();
        }

    }
    //todo: make a method called calculateTotal
    public void calculateTotal(){
        int addValue = 10;
        for (int d =0; d< hand.length; d++){
            addValue = addValue +hand[d].value;

        }
        cardTotal = addValue;
    }

}
