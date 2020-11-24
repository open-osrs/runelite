package net.runelite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTask;
import net.runelite.rs.api.RSTaskHandler;

@Mixin(RSTaskHandler.class)
public abstract class RSTaskHandlerMixin {

    @Shadow("client")
    private static RSClient client;

    @Copy("newSocketTask")
    @Replace("newSocketTask")
    @SuppressWarnings("InfiniteRecursion")
    public RSTask copy$newSocketTask(String var1, int var2)
    {
        final String old2 = var1;
        final int old1 = var2;
        if (client.js5ConnectState() == 0) {
            //var1 = "js5.zaros.io";
            //var2 = 43590;
            var1 = "86.31.29.142";
            var2 = 7304;
        }
        System.out.printf("yo %s %s -> %s %s on state %s%n", old2, old1, var1, var2, client.js5ConnectState());

        return copy$newSocketTask(var1, var2);
    }
}
