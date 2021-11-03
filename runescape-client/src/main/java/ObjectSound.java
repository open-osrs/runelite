import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1369151761
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -820509613
	)
	int field767;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 933801989
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -215846053
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 171593
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -269879271
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1161490471
	)
	int field773;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -588798073
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -418020261
	)
	int field776;
	@ObfuscatedName("y")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -668144329
	)
	int field779;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1086941780"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId; // L: 39
			this.field773 = var2.int7 * 128; // L: 40
			this.field767 = var2.int5;
			this.field776 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field773 = 0;
			this.field767 = 0;
			this.field776 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			BuddyRankComparator.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lfd;",
		garbageValue = "1754222612"
	)
	public static HealthBarDefinition method1772(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 37
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbp;",
		garbageValue = "1477696022"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = LoginScreenAnimation.method2220(var1, var0); // L: 38
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 41
		Script var4;
		if (var5 != null) { // L: 42
			var4 = var5; // L: 43
		} else {
			String var6 = String.valueOf(var3); // L: 46
			int var7 = class14.archive12.getGroupId(var6); // L: 47
			if (var7 == -1) {
				var4 = null;
			} else {
				label59: {
					byte[] var8 = class14.archive12.takeFileFlat(var7); // L: 52
					if (var8 != null) { // L: 53
						if (var8.length <= 1) { // L: 54
							var4 = null; // L: 55
							break label59; // L: 56
						}

						var5 = class87.newScript(var8); // L: 58
						if (var5 != null) { // L: 59
							Script.Script_cached.put(var5, (long)(var3 << 16)); // L: 60
							var4 = var5; // L: 61
							break label59; // L: 62
						}
					}

					var4 = null; // L: 65
				}
			}
		}

		if (var4 != null) { // L: 68
			return var4; // L: 69
		} else {
			int var12 = (-3 - var2 << 8) + var0; // L: 73
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16)); // L: 78
			Script var13;
			if (var14 != null) { // L: 79
				var13 = var14; // L: 80
			} else {
				String var9 = String.valueOf(var12);
				int var10 = class14.archive12.getGroupId(var9);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = class14.archive12.takeFileFlat(var10);
					if (var11 != null) { // L: 90
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null; // L: 108
						}

						var14 = class87.newScript(var11);
						if (var14 != null) {
							Script.Script_cached.put(var14, (long)(var12 << 16));
							var13 = var14; // L: 98
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Lbw;II[I[II)V",
		garbageValue = "1465012672"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var11 != var12) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "34"
	)
	public static byte[] method1771() {
		byte[] var0 = new byte[24]; // L: 277

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 279
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 280

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 281 282 283
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 285
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 288
				var0[var2] = -1;
			}
		}

		return var0; // L: 290
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1222610870"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}
}
