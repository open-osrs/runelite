import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1564837313
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILju;Lju;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "438167000"
	)
	public static int method4942(int var0) {
		return class258.field3049[var0]; // L: 38
	}
}
