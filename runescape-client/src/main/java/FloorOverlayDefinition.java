import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 789415847
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1583015683
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("a")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 84531747
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 416276119
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 334853597
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1974079687
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 247371203
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1197955665
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 845891437
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "462057937"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 39
			this.setHsl(this.secondaryRgb); // L: 40
			this.secondaryHue = this.hue; // L: 41
			this.secondarySaturation = this.saturation; // L: 42
			this.secondaryLightness = this.lightness; // L: 43
		}

		this.setHsl(this.primaryRgb); // L: 45
	} // L: 46

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "125"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 50
			if (var3 == 0) { // L: 51
				return; // L: 54
			}

			this.decodeNext(var1, var3, var2); // L: 52
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIB)V",
		garbageValue = "104"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 57
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 58
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 59
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 60
		} else if (var2 == 8) { // L: 61
		}

	} // L: 63

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-451287005"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 66
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 67
		double var6 = (double)(var1 & 255) / 256.0D; // L: 68
		double var8 = var2; // L: 69
		if (var4 < var2) { // L: 70
			var8 = var4;
		}

		if (var6 < var8) { // L: 71
			var8 = var6;
		}

		double var10 = var2; // L: 72
		if (var4 > var2) { // L: 73
			var10 = var4;
		}

		if (var6 > var10) { // L: 74
			var10 = var6;
		}

		double var12 = 0.0D; // L: 75
		double var14 = 0.0D; // L: 76
		double var16 = (var10 + var8) / 2.0D; // L: 77
		if (var8 != var10) { // L: 78
			if (var16 < 0.5D) { // L: 79
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 80
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 81
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 82
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 83
			}
		}

		var12 /= 6.0D; // L: 85
		this.hue = (int)(var12 * 256.0D); // L: 86
		this.saturation = (int)(256.0D * var14); // L: 87
		this.lightness = (int)(256.0D * var16); // L: 88
		if (this.saturation < 0) { // L: 89
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 90
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 91
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 92
			this.lightness = 255;
		}

	} // L: 93

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "2018260435"
	)
	static PacketBufferNode method3700() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIZB)V",
		garbageValue = "60"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10796
		int var5 = var0.height; // L: 10797
		if (var0.widthAlignment == 0) { // L: 10798
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10799
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10800
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10801
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10802
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 10803
		}

		if (var0.widthAlignment == 4) { // L: 10804
			var0.width = var0.height * var0.field3411 / var0.field3494;
		}

		if (var0.heightAlignment == 4) { // L: 10805
			var0.height = var0.field3494 * var0.width / var0.field3411;
		}

		if (var0.contentType == 1337) { // L: 10806
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10807
			ScriptEvent var6 = new ScriptEvent(); // L: 10808
			var6.widget = var0; // L: 10809
			var6.args = var0.onResize; // L: 10810
			Client.scriptEvents.addFirst(var6); // L: 10811
		}

	} // L: 10813
}
