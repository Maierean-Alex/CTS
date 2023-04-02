import Classes.FPSFactory;
import Classes.GameFactory;
import Classes.RPGFactory;
import Classes.RTSFactory;

public class Main {
    public static void main(String[] args) {

        GameFactory gf1, gf2;

        gf1 = new FPSFactory();
        gf1.createGame();

        gf2 = new RTSFactory();
        gf2.createGame();

        GameFactory gf3;
        gf3 = new RPGFactory();
        gf3.createGame();

    }
}