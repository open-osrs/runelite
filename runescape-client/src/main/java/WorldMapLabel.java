import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("v")
	@Export("text")
	String text;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2139007223
	)
	@Export("width")
	int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2127405993
	)
	@Export("height")
	int height;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhh;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-39"
	)
	public static long method4997(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 52
	}
}
