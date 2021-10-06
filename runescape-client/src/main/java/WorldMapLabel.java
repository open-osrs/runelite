import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("w")
	public static short[][] field2180;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1364409407
	)
	static int field2176;
	@ObfuscatedName("l")
	@Export("text")
	String text;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -445350199
	)
	@Export("width")
	int width;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 22712869
	)
	@Export("height")
	int height;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfc;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
