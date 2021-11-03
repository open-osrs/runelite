import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dz")
public class class123 extends class116 {
	@ObfuscatedName("i")
	boolean field1424;
	@ObfuscatedName("w")
	byte field1422;
	@ObfuscatedName("s")
	byte field1423;
	@ObfuscatedName("a")
	byte field1421;
	@ObfuscatedName("o")
	byte field1425;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class123(class119 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1424 = var1.readUnsignedByte() == 1; // L: 251
		this.field1422 = var1.readByte(); // L: 252
		this.field1423 = var1.readByte(); // L: 253
		this.field1421 = var1.readByte(); // L: 254
		this.field1425 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.allowGuests = this.field1424; // L: 259
		var1.field1444 = this.field1422; // L: 260
		var1.field1439 = this.field1423; // L: 261
		var1.field1446 = this.field1421; // L: 262
		var1.field1447 = this.field1425; // L: 263
	} // L: 264

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-776812615"
	)
	public static boolean method2614(int var0) {
		return var0 == WorldMapDecorationType.field3244.id; // L: 42
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1761833612"
	)
	public static void method2616(int var0, int var1) {
		VarbitComposition var2 = class150.method2965(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit;
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "988322952"
	)
	public static int method2619(int var0) {
		return class245.field2908[var0]; // L: 35
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "2087887808"
	)
	static int method2618(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1825
			class14.Interpreter_intStackSize -= 3; // L: 1826
			class128.queueSoundEffect(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]); // L: 1827
			return 1; // L: 1828
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1830
			ModeWhere.playSong(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1831
			return 1; // L: 1832
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1834
			class14.Interpreter_intStackSize -= 2; // L: 1835
			Friend.method6057(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 1836
			return 1; // L: 1837
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1839
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 1875
					return var0 == 3211 ? 1 : 2; // L: 1909 1910 1912
				} else {
					var3 = 0; // L: 1876
					var4 = 0; // L: 1877
					if (var0 == 3210) { // L: 1878
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1879
					} else if (var0 == 3182) { // L: 1881
						var3 = 6; // L: 1882
					} else if (var0 == 3204) { // L: 1884
						var3 = 7; // L: 1885
					} else if (var0 == 3206) { // L: 1887
						var3 = 8; // L: 1888
					} else if (var0 == 3208) { // L: 1890
						var3 = 9; // L: 1891
					}

					if (var3 == 6) { // L: 1893
						float var5 = 200.0F * ((float)class408.clientPreferences.brightness - 0.5F); // L: 1894
						var4 = 100 - Math.round(var5); // L: 1895
					} else if (var3 == 7) { // L: 1897
						var4 = Math.round((float)class408.clientPreferences.musicVolume / 2.55F); // L: 1898
					} else if (var3 == 8) { // L: 1900
						var4 = Math.round((float)class408.clientPreferences.soundEffectsVolume / 1.27F); // L: 1901
					} else if (var3 == 9) { // L: 1903
						var4 = Math.round((float)class408.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1904
					}

					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4; // L: 1906
					return 1; // L: 1907
				}
			} else {
				var3 = 0; // L: 1840
				var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1841
				if (var0 == 3209) { // L: 1842
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1843
				} else if (var0 == 3181) { // L: 1845
					var3 = 6; // L: 1846
				} else if (var0 == 3203) { // L: 1848
					var3 = 7; // L: 1849
				} else if (var0 == 3205) { // L: 1851
					var3 = 8; // L: 1852
				} else if (var0 == 3207) { // L: 1854
					var3 = 9; // L: 1855
				}

				if (var3 == 6) { // L: 1857
					var4 = 100 - Math.min(Math.max(var4, 0), 100); // L: 1858
					class354.method6396((double)(0.5F + (float)var4 / 200.0F)); // L: 1859
				} else if (var3 == 7) { // L: 1861
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1862
					class14.method178(Math.round(2.55F * (float)var4)); // L: 1863
				} else if (var3 == 8) { // L: 1865
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1866
					WorldMapSection1.updateSoundEffectVolume(Math.round((float)var4 * 1.27F)); // L: 1867
				} else if (var3 == 9) { // L: 1869
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1870
					ClanChannel.method2825(Math.round((float)var4 * 1.27F)); // L: 1871
				}

				return 1; // L: 1873
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1954387020"
	)
	static int method2608(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4277
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4282
				if (var0 == 6750) { // L: 4286
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 4287
					return 1; // L: 4288
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4290
					if (var0 == 6754) { // L: 4294
						int var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4295
						NPCComposition var4 = ScriptFrame.getNpcDefinition(var3); // L: 4296
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4297
						return 1; // L: 4298
					} else {
						return 2; // L: 4300
					}
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4291
					return 1; // L: 4292
				}
			} else {
				--class14.Interpreter_intStackSize; // L: 4283
				return 1; // L: 4284
			}
		} else {
			class14.Interpreter_intStackSize -= 2; // L: 4278
			--class295.Interpreter_stringStackSize; // L: 4279
			return 1; // L: 4280
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-980124614"
	)
	static final void method2621() {
		int var0 = SpotAnimationDefinition.field1761 * 128 + 64; // L: 4180
		int var1 = BuddyRankComparator.field1333 * 128 + 64; // L: 4181
		int var2 = class392.getTileHeight(var0, var1, GrandExchangeOfferTotalQuantityComparator.Client_plane) - Renderable.field2442; // L: 4182
		if (WorldMapSectionType.cameraX < var0) { // L: 4183
			WorldMapSectionType.cameraX = (var0 - WorldMapSectionType.cameraX) * Login.field888 / 1000 + WorldMapSectionType.cameraX + UserComparator8.field1305; // L: 4184
			if (WorldMapSectionType.cameraX > var0) { // L: 4185
				WorldMapSectionType.cameraX = var0;
			}
		}

		if (WorldMapSectionType.cameraX > var0) { // L: 4187
			WorldMapSectionType.cameraX -= Login.field888 * (WorldMapSectionType.cameraX - var0) / 1000 + UserComparator8.field1305; // L: 4188
			if (WorldMapSectionType.cameraX < var0) { // L: 4189
				WorldMapSectionType.cameraX = var0;
			}
		}

		if (class174.cameraY < var2) { // L: 4191
			class174.cameraY = (var2 - class174.cameraY) * Login.field888 / 1000 + class174.cameraY + UserComparator8.field1305; // L: 4192
			if (class174.cameraY > var2) { // L: 4193
				class174.cameraY = var2;
			}
		}

		if (class174.cameraY > var2) { // L: 4195
			class174.cameraY -= Login.field888 * (class174.cameraY - var2) / 1000 + UserComparator8.field1305; // L: 4196
			if (class174.cameraY < var2) { // L: 4197
				class174.cameraY = var2;
			}
		}

		if (class65.cameraZ < var1) { // L: 4199
			class65.cameraZ = (var1 - class65.cameraZ) * Login.field888 / 1000 + class65.cameraZ + UserComparator8.field1305; // L: 4200
			if (class65.cameraZ > var1) { // L: 4201
				class65.cameraZ = var1;
			}
		}

		if (class65.cameraZ > var1) { // L: 4203
			class65.cameraZ -= Login.field888 * (class65.cameraZ - var1) / 1000 + UserComparator8.field1305; // L: 4204
			if (class65.cameraZ < var1) { // L: 4205
				class65.cameraZ = var1;
			}
		}

		var0 = UrlRequest.field1298 * 128 + 64; // L: 4207
		var1 = SoundSystem.field288 * 128 + 64; // L: 4208
		var2 = class392.getTileHeight(var0, var1, GrandExchangeOfferTotalQuantityComparator.Client_plane) - ArchiveLoader.field985; // L: 4209
		int var3 = var0 - WorldMapSectionType.cameraX; // L: 4210
		int var4 = var2 - class174.cameraY; // L: 4211
		int var5 = var1 - class65.cameraZ; // L: 4212
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 4213
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047; // L: 4214
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047; // L: 4215
		if (var7 < 128) { // L: 4216
			var7 = 128;
		}

		if (var7 > 383) { // L: 4217
			var7 = 383;
		}

		if (class121.cameraPitch < var7) { // L: 4218
			class121.cameraPitch = (var7 - class121.cameraPitch) * TextureProvider.field2484 / 1000 + class121.cameraPitch + class269.field3221; // L: 4219
			if (class121.cameraPitch > var7) { // L: 4220
				class121.cameraPitch = var7;
			}
		}

		if (class121.cameraPitch > var7) { // L: 4222
			class121.cameraPitch -= TextureProvider.field2484 * (class121.cameraPitch - var7) / 1000 + class269.field3221; // L: 4223
			if (class121.cameraPitch < var7) { // L: 4224
				class121.cameraPitch = var7;
			}
		}

		int var9 = var8 - WorldMapRegion.cameraYaw; // L: 4226
		if (var9 > 1024) { // L: 4227
			var9 -= 2048;
		}

		if (var9 < -1024) { // L: 4228
			var9 += 2048;
		}

		if (var9 > 0) { // L: 4229
			WorldMapRegion.cameraYaw = var9 * TextureProvider.field2484 / 1000 + WorldMapRegion.cameraYaw + class269.field3221; // L: 4230
			WorldMapRegion.cameraYaw &= 2047; // L: 4231
		}

		if (var9 < 0) { // L: 4233
			WorldMapRegion.cameraYaw -= -var9 * TextureProvider.field2484 / 1000 + class269.field3221; // L: 4234
			WorldMapRegion.cameraYaw &= 2047; // L: 4235
		}

		int var10 = var8 - WorldMapRegion.cameraYaw; // L: 4237
		if (var10 > 1024) { // L: 4238
			var10 -= 2048;
		}

		if (var10 < -1024) { // L: 4239
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) { // L: 4240
			WorldMapRegion.cameraYaw = var8;
		}

	} // L: 4241
}
