package Classes;

public class RTSFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new RTS();
    }
}
