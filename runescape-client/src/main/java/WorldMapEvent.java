import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2124516847
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILhk;Lhk;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1623045574"
	)
	public static boolean method3267(int var0) {
		return (var0 & 1) != 0; // L: 9
	}
}
