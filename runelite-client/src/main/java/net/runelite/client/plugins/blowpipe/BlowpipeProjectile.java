package net.runelite.client.plugins.blowpipe;

public enum BlowpipeProjectile
{
    DRAGON(1122, 11230),
    RUNE(231, 811),
    ADAMANT(230, 810),
    MITHRIL(229, 809),
    STEEL(228, 808),
    IRON(227, 807),
    BRONZE(226, 806);

    private int projectileId;
    private int itemId;

    private BlowpipeProjectile(final int projectileId, final int itemId) {
        this.projectileId = projectileId;
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getProjectileId() {
        return projectileId;
    }
}
