package sponge.eventbus.events;

public class GameStateChanged {
    public int newValue;
    public GameStateChanged(int gameState)
    {
        newValue = gameState;
    }
}
