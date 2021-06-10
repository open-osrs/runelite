package sponge.eventbus.events;

public class GameMessageReceived {
    public String text;
    public GameMessageReceived(String text)
    {
        this.text = text;
    }
}
