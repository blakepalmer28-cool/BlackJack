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

        for (int i = 0; i < 13;i++){
            deck[i] = new Card(10,i, "Hearts");
            deck[i].printInfo();

        }
        for (int i = 0; i < 13;i++){
            deck[i] = new Card(10,i, "Clubs");
            deck[i].printInfo();

        }
        for (int i = 0; i < 13;i++){
            deck[i] = new Card(10,i, "Diamond");
            deck[i].printInfo();

        }
        for (int i = 0; i < 13;i++){
            deck[i] = new Card(10,i, "Spades");
            deck[i].printInfo();

        }
        printDeck();
    }

    public void printDeck(){
        for (int i =0; i<deck.length;i++ ){
            System.out.println(deck[i]);
        }


    }
}

