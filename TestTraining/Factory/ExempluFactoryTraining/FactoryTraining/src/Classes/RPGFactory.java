package Classes;

public class RPGFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new RPG();
    }
}
