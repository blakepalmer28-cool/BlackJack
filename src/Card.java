import com.sun.jdi.Value;

public class Card {
    public int value;
    public String name;
    public String suit;

    public Card(int pValue, int pName, String pSuit){
        value = pValue;
        if (pName ==0){
             name = "Ace";
             value = 11;
        }else if (pName ==1){
            name = "two";
            value = 2;
        }
        suit = pSuit;

        printInfo();
    }

    public void printInfo(){
        System.out.println("The"+name + "of" +suit+ "is worth" + value+ "of points");

    }


}
