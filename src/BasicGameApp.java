import java.awt.*;
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

        //give the player cards at the start
        p1.hand[0]= deck [0];
        p1.hand[1]= deck [1];
        d1.hand[0]= deck[2];
        d1.hand[1]= deck[6];
        //todo hw: give the dealer 2 cards]= Done
        //ask the user a question
            Scanner s = new Scanner(System.in);
            System.out.println("ANSWER ALL QUESTIONS WITH LOWERCASE");
            System.out.println(" ");
            System.out.println("what is your name?");
            String aName = s.nextLine();
            System.out.println(aName);

            p1.name = aName;
            p1.calculateTotal();
            p1.printInfo();


            System.out.println(" ");
            System.out.println("Do you want to hit or stand?");
            String answer = s.nextLine();
            if (answer.equals("hit")){
                p1.isHit=true;
                System.out.println("You chose to hit");
                p1.hand= new Card[3];
                p1.hand[0]= deck [0];
                p1.hand[1]= deck [1];
                p1.hand[2]= deck[4];
                p1.calculateTotal();
                p1.printInfo();

                if (p1.cardTotal>21){
                    System.out.println("You busted!");
                    d1.calculateTotal();
                    d1.printInfo();
                    if (d1.cardTotal > 21){
                        System.out.println("The Dealer busted");
                    }
                    else{
                        System.out.println("Dealer wins");
                    }
                }else{
                    System.out.println(" ");
                    System.out.println("Do You want to hit or stand?");
                    String answer2 = s.nextLine();
                    if (answer2.equals("hit")) {
                        p1.hand = new Card[5];
                        p1.hand[0] = deck[0];
                        p1.hand[1] = deck[1];
                        p1.hand[2] = deck[4];
                        p1.hand[3] = deck[5];
                        p1.hand[4]= deck[9];

                        p1.calculateTotal();
                        p1.printInfo();
                        if (p1.cardTotal > 21) {
                            System.out.println(" ");
                            System.out.println("You busted!");
                            System.out.println(" ");
                            d1.calculateTotal();
                            d1.printInfo();
                            if (d1.isBust==true && p1.isBust == true){
                                System.out.println("Both busted! Its a Tie!!!");
                            }
                            else{
                                System.out.println("Dealer wins!!!");
                            }
                        }

                    }
                    else if(answer2.equals("stand")) {
                        System.out.println(" ");
                        System.out.println("Dealer reveals cards:");
                        System.out.println(" ");
                        d1.printInfo();

                        if(d1.cardTotal <17){
                            System.out.println(" ");
                            System.out.println("The Dealer Hits");
                            System.out.println(" ");
                            d1.hand = new Card[3];
                            d1.hand[0]= deck [2];
                            d1.hand[1]= deck [6];
                            d1.hand[2]=deck[7];
                            d1.calculateTotal();
                            d1.printInfo();
                        }
                        if (d1.cardTotal>21) {
                            System.out.println("Both busted! Its a Tie!!!");
                        }
                        else if(p1.cardTotal>d1.cardTotal){
                            System.out.println(" ");
                            System.out.println("You Win!!!");
                        }
                        else if (d1.cardTotal>p1.cardTotal){
                            System.out.println(" ");
                            System.out.println("You Lose!!!");
                        }
                        else {
                            System.out.println("Its a Tie!!!");
                        }


                    }
                }
            }//logic
             else if(answer.equals("stand")){
                 p1.isHit = false;
                System.out.println(" ");
                System.out.println("You chose to stand");
                System.out.println(" ");


                System.out.println("Dealer reveals cards:");
                System.out.println(" ");
                d1.printInfo();

                if(d1.cardTotal <17){
                    System.out.println(" ");
                    System.out.println("The Dealer Hits");
                    System.out.println(" ");
                    d1.hand= new Card[3];
                    d1.hand[0]= deck [2];
                    d1.hand[1]= deck [6];
                    d1.hand[2]=deck[7];
                    d1.calculateTotal();
                    d1.printInfo();
                }

                if(d1.cardTotal>21){
                    System.out.println("Dealer busted! You Win!!!");
                }

                if(p1.cardTotal>d1.cardTotal){
                    System.out.println(" ");
                    System.out.println("You Win!!!");
                    System.out.println(" ");
                }
                else if(d1.cardTotal>p1.cardTotal){
                    System.out.println(" ");
                    System.out.println("You Lose!!!");
                    System.out.println(" ");
                }
                else {
                    System.out.println(" ");
                    System.out.println("Its a Tie!!!");
                    System.out.println(" ");
                }




            }
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