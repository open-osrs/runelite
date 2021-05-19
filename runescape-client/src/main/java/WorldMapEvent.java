import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1769091939
	)
	static int field2141;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2110399815
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILia;Lia;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("z")
	public static boolean method3714(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 74
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Occluder.method4090(); // L: 7827
		Client.menuActions[0] = "Cancel"; // L: 7828
		Client.menuTargets[0] = ""; // L: 7829
		Client.menuOpcodes[0] = 1006; // L: 7830
		Client.menuShiftClick[0] = false; // L: 7831
		Client.menuOptionsCount = 1; // L: 7832
	} // L: 7833
}
