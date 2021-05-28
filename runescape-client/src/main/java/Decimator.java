import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static IndexedSprite field553;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 1430642749
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1278002573
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -308385855
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("j")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = class386.method6818(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = (double)var4 / (double)var1 + 6.0D; // L: 23
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D)); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = ((double)var8 - var6) * 3.141592653589793D; // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "25186157"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-202023878"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 66
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1; // L: 67
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1042913417"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljv;II)Z",
		garbageValue = "-1461937174"
	)
	static boolean method1075(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 189
		if (var2 == null) { // L: 190
			return false;
		} else {
			ItemLayer.SpriteBuffer_decode(var2); // L: 191
			return true; // L: 192
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1064690457"
	)
	public static void method1073() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 542
	} // L: 543

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IIII)V",
		garbageValue = "-1353639896"
	)
	static void method1074(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3358
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3359
				int var4 = var0.soundEffects[var1]; // L: 3360
				if (var4 != 0) { // L: 3361
					int var5 = var4 >> 8; // L: 3362
					int var6 = var4 >> 4 & 7; // L: 3363
					int var7 = var4 & 15; // L: 3364
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3365
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3366
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3367
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3368
					int var8 = (var2 - 64) / 128; // L: 3369
					int var9 = (var3 - 64) / 128; // L: 3370
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3371
					++Client.soundEffectCount; // L: 3372
				}
			}
		}
	} // L: 3373

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method1068() {
		if (Client.renderSelf) { // L: 4340
			NetSocket.addPlayerToScene(class93.localPlayer, false); // L: 4341
		}

	} // L: 4343

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146015753"
	)
	static final void method1071() {
		Client.field836 = Client.cycleCntr; // L: 11276
	} // L: 11277
}
