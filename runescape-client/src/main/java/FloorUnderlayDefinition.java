import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iw")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1640099513
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 772769107
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1277008429
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1129854273
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2072275111
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848989672"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "731438667"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IIB)V",
		garbageValue = "5"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1248052268"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var8 + var10) / 2.0D; // L: 60
		if (var8 != var10) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 65
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(var14 * 256.0D); // L: 69
		this.lightness = (int)(256.0D * var16); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 78
	} // L: 79

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-170727251"
	)
	static int method4460(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3211
			VarcInt.Interpreter_intStackSize -= 2; // L: 3212
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3213
			int var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3214
			if (!Client.isCameraLocked) { // L: 3215
				Client.camAngleX = var3; // L: 3216
				Client.camAngleY = var4; // L: 3217
			}

			return 1; // L: 3219
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3221
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3222
			return 1; // L: 3223
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3225
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3226
			return 1; // L: 3227
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3229
			var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3230
			if (var3 < 0) { // L: 3231
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3232
			return 1; // L: 3233
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3235
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3236
			return 1; // L: 3237
		} else {
			return 2; // L: 3239
		}
	}
}
