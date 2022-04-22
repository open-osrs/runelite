import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 205058023
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILks;Lks;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-1383377565"
	)
	public static void method4506(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-615981815"
	)
	public static boolean method4505(int var0) {
		return var0 == WorldMapDecorationType.field3519.id; // L: 46
	}
}
