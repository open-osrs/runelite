import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 273660235
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILjd;Ljd;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)Lor;",
		garbageValue = "1601480741"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Huffman.worldMap; // L: 659
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)Ljava/lang/String;",
		garbageValue = "935072366"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class135.Widget_unpackTargetMask(Language.getWidgetFlags(var0)) == 0) { // L: 11993
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11994 11995 11997
		}
	}
}
