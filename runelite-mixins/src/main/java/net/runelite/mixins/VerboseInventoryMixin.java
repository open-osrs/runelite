package net.runelite.mixins;

import java.awt.Container;
import java.awt.Dimension;
import net.runelite.api.Constants;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class VerboseInventoryMixin implements RSClient
{
    @Inject
    private static boolean verbose;

    @Inject
    public void setVerbose(boolean state)
    {
        verbose = state;
    }

    @Copy("inventoryQuantityFormat")
    @Replace("inventoryQuantityFormat")
    public static String getInventoryQuantityFormat(int n) {
        if (verbose) {
            return String.valueOf(n);
        }

        long decimal = n;

        return getInventoryQuantityFormat(n);
    }
}