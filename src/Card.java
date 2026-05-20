import com.sun.jdi.Value;

public class Card {
    public int value;
    public String name;
    public String suit;

    public Card(int pValue, int pName, int pSuit){
        value = pValue;
        if (pName ==0){
             name = "Ace";
             value = 11;
        }else if (pName ==1){
            name = "two";
            value = 2;
        }
        else if(pName ==2){
            name = "three";
            value = 3;
        }
        else if(pName ==3){
            name = "four";
            value = 4;
        }
        else if(pName ==4){
            name = "five";
            value = 5;
        }
        else if(pName ==5){
            name = "six";
            value = 6;
        }
        else if(pName ==6){
            name = "seven";
            value = 7;
        }
        else if(pName ==7){
            name = "eight";
            value = 8;
        }
        else if(pName ==8){
            name = "nine";
            value = 9;
        }
        else if(pName ==9){
            name = "Ten";
            value = 10;
        }
        else if(pName ==10){
            name = "Jack";
            value = 10;
        }
        else if(pName ==11){
            name = "Queen";
            value = 10;
        }
        else if(pName ==12){
            name = "King";
            value = 10;
        }
        if (pSuit ==0){
            suit = "Hearts";
        } else if (pSuit==1){
            suit = "Clubs";
        } else if (pSuit==2){
        suit = "Diamonds";
        }else if (pSuit==3){
            suit = "Spades";
        }


    }

    public void printInfo(){
        System.out.println("The"+name + "of" +suit+ "is worth" + value+ "of points");

    }


}
