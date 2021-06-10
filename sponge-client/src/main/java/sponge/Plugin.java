package sponge;

public class Plugin {
    public void init()
    {
        SpongeOSRS.eventBus.register(this);
    }
}
