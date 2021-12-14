import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("c")
	@Export("text")
	String text;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -353724483
	)
	@Export("width")
	int width;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1345453381
	)
	@Export("height")
	int height;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhh;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
