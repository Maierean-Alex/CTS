package Classes;

public class FPSFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new FPS();
    }
}
