import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	static Bounds field1107;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -335258197
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1002371349
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1337909425
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1976431629
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1710957787
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1005968135
	)
	@Export("y")
	int y;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1176341893
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1918179577
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgl;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = LoginScreenAnimation.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field1891 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 39
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 40
			}
		}

	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) { // L: 46
			int var1 = Client.cycle - this.cycleStart; // L: 47
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 48
				var1 = 100;
			}

			label56: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 49
							break label56;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame; // L: 51
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 52

					this.frame -= this.sequenceDefinition.frameCount; // L: 53
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null; // L: 55
			}

			this.cycleStart = Client.cycle - var1; // L: 60
		}

		ObjectComposition var12 = class23.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "1"
	)
	public static byte[] method2004(CharSequence var0) {
		int var1 = var0.length(); // L: 66
		byte[] var2 = new byte[var1]; // L: 67

		for (int var3 = 0; var3 < var1; ++var3) { // L: 68
			char var4 = var0.charAt(var3); // L: 69
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 70
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 71
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 72
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 73
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 74
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 75
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 76
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 77
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 78
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 79
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 80
			} else if (var4 == 8249) { // L: 81
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 82
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 83
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 84
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 85
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 86
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 87
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 88
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 89
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 90
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 91
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 92
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 93
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 94
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 95
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 96
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 97
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 98
			}
		}

		return var2; // L: 100
	}
}
