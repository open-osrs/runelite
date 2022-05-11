import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("y")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1611890735
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1317140331
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1313814185
	)
	@Export("z")
	int z;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -140777267
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhq;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIILgm;[Lgh;I)V",
		garbageValue = "1258473282"
	)
	static final void method4376(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 251
		int var6 = -1; // L: 252

		while (true) {
			int var7 = var5.method7531(); // L: 254
			if (var7 == 0) { // L: 255
				return; // L: 279
			}

			var6 += var7; // L: 256
			int var8 = 0; // L: 257

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 259
				if (var9 == 0) { // L: 260
					break;
				}

				var8 += var9 - 1; // L: 261
				int var10 = var8 & 63; // L: 262
				int var11 = var8 >> 6 & 63; // L: 263
				int var12 = var8 >> 12; // L: 264
				int var13 = var5.readUnsignedByte(); // L: 265
				int var14 = var13 >> 2; // L: 266
				int var15 = var13 & 3; // L: 267
				int var16 = var11 + var1; // L: 268
				int var17 = var10 + var2; // L: 269
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 270
					int var18 = var12; // L: 271
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 272
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 273
					if (var18 >= 0) { // L: 274
						var19 = var4[var18];
					}

					class19.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 275
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "85"
	)
	static int method4377(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3744
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ClanChannelMember.getWindowedMode(); // L: 3745
			return 1; // L: 3746
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3748
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3749
				if (var3 == 1 || var3 == 2) { // L: 3750
					Widget.setWindowedMode(var3);
				}

				return 1; // L: 3751
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3753
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class12.clientPreferences.method2274(); // L: 3754
				return 1; // L: 3755
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3757
				if (var0 == 5310) { // L: 3764
					--class12.Interpreter_intStackSize; // L: 3765
					return 1; // L: 3766
				} else if (var0 == 5311) { // L: 3768
					class12.Interpreter_intStackSize -= 2; // L: 3769
					return 1; // L: 3770
				} else if (var0 == 5312) { // L: 3772
					--class12.Interpreter_intStackSize; // L: 3773
					return 1; // L: 3774
				} else if (var0 == 5350) { // L: 3776
					class9.Interpreter_stringStackSize -= 2; // L: 3777
					--class12.Interpreter_intStackSize; // L: 3778
					return 1; // L: 3779
				} else if (var0 == 5351) { // L: 3781
					--class9.Interpreter_stringStackSize; // L: 3782
					return 1; // L: 3783
				} else {
					return 2; // L: 3785
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3758
				if (var3 == 1 || var3 == 2) { // L: 3759
					class12.clientPreferences.method2245(var3); // L: 3760
				}

				return 1; // L: 3762
			}
		}
	}
}
