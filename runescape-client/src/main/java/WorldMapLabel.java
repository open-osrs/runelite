import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 1487211049
	)
	static int field258;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("h")
	@Export("text")
	String text;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1156578913
	)
	@Export("width")
	int width;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2007608325
	)
	@Export("height")
	int height;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILan;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	static final void method469() {
		Client.field842 = Client.cycleCntr;
		WorldMapIcon_1.ClanChat_inClanChat = true;
	}
}
