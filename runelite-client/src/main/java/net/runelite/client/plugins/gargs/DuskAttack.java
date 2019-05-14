package net.runelite.client.plugins.gargs;

import net.runelite.api.Prayer;

public enum DuskAttack
{
    MELEE(7800, Prayer.PROTECT_FROM_MELEE),  RANGE(7801, Prayer.PROTECT_FROM_MISSILES);

    private final int animation;
    private final Prayer prayer;

    private DuskAttack(int animation, Prayer prayer)
    {
        this.animation = animation;
        this.prayer = prayer;
    }

    public int getAnimation()
    {
        return animation;
    }

    public Prayer getPrayer()
    {
        return prayer;
    }
}
