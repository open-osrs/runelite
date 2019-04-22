package net.runelite.client.plugins.easyscape;

public enum EssenceMode {
    RUNECRAFTING("Runecrafting"),
    ESSENCE_MINING("Essence Mining");

    private final String name;

    EssenceMode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
