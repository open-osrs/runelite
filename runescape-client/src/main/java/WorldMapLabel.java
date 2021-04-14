import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("f")
	@Export("text")
	String text;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -586926431
	)
	@Export("width")
	int width;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1846653715
	)
	@Export("height")
	int height;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILey;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14
}
