package net.runelite.mixins;

import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class ClientInstanceMixin implements RSClient{
    @Shadow("client")
    public static RSClient client;

    @Inject
    @FieldHook("gameState")
    public static void onGameStateChanged(int idx)
    {
        System.out.println(client.api$getRSGameState());
    }
}
