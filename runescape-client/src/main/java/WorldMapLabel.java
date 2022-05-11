import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("o")
	@Export("text")
	String text;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -233966441
	)
	@Export("width")
	int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -606142323
	)
	@Export("height")
	int height;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhw;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14
}
