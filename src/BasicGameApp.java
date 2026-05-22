import java.util.Scanner;

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
        p1 = new Player();
        d1 = new Dealer();

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

        //give the player crds
        p1.hand[0]= deck [0];
        p1.hand[1]= deck [1];
        d1.hand[0]= deck[2];
        d1.hand[1]= deck[3];
        d1.calculateTotal();
        d1.printInfo();
        //todo hw: give the dealer 2 cards]= Done
        //ask the user a question
            Scanner s = new Scanner(System.in);
            System.out.println("ANSWER ALL QUESTIONS WITH LOWERCASE");
            System.out.println("what is your name?");
            String aName = s.nextLine();
            System.out.println(aName);

            p1.name = aName;
            p1.calculateTotal();
            p1.printInfo();

            System.out.println("Do you want to hit or stand?");
            if (s.nextLine().equals("hit")){
                p1.isHit=true;
                System.out.println("You chose to hit");
                p1.hand= new Card[3];
                p1.hand[0]= deck [0];
                p1.hand[1]= deck [1];
                p1.hand[2]= deck[4];
                p1.calculateTotal();
                p1.printInfo();
            }



            p1.printInfo();
            p1.calculateTotal();

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
            deck[i].printInfo();
        }

    }
}

//plan what i need to do