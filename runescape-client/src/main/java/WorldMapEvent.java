import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("m")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1133978819
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILij;Lij;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}
}
