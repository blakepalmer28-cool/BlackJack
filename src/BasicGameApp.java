public class BasicGameApp {
    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;

    public BasicGameApp(){
        p1 = new Player();
        d1 = new Dealer();
        gameOn = true;
    }
}

