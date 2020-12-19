import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -36540981
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 277822877
	)
	final int field142;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 655374697
	)
	final int field133;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1182850847
	)
	final int field135;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field142 = var1; // L: 15
		this.field133 = var2; // L: 16
		this.field135 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-7"
	)
	boolean method254(float var1) {
		return var1 >= (float)this.field135; // L: 21
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-3"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 883
			var1 /= 2;
		}

		if (var2 > 192) { // L: 884
			var1 /= 2;
		}

		if (var2 > 217) { // L: 885
			var1 /= 2;
		}

		if (var2 > 243) { // L: 886
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 887
		return var3; // L: 888
	}
}
