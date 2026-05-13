public class BasicGameApp {
    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;

    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();

    }

    public BasicGameApp(){
        System.out.println("welcome to blackjack!");
        deck = new Card[52];

        int cardIndex = 0;
        for(int x = 0;x<4; x++){
            for(int i = 0; i < 13;i++){
                deck[cardIndex] = new Card(10,i, x);
                cardIndex++;
               //deck[i].printInfo();
        }


        }
        printDeck();
        shufflie();
    }

    public void shufflie(){
        for (int i =0; i< deck.length;i++){
            int randy= (int)(Math.random()*52);
            Card helper = deck[randy];
            deck[randy]=deck[i];
            deck[i]=helper;
        }
    }

    public void printDeck(){
        for (int i =0; i<deck.length;i++ ){
            System.out.println(deck[i]);
        }


    }
}

