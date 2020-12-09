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
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field142 = var1;
		this.field133 = var2;
		this.field135 = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-7"
	)
	boolean method254(float var1) {
		return var1 >= (float)this.field135;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-3"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
