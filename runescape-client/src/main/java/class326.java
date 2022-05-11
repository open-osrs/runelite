import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lh")
public class class326 {
	@ObfuscatedName("o")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("l")
	int[] field4099;
	@ObfuscatedName("k")
	int[] field4102;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 259027383
	)
	int field4103;

	public class326() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4099 = new int[2048]; // L: 12
		this.field4102 = new int[2048]; // L: 13
		this.field4103 = 0; // L: 14
		ScriptEvent.method2074(); // L: 21
	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1955100783"
	)
	void method5849(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = WorldMapID.method4811((double)(var8 - 0) / var4) / var4; // L: 57
			var7[var9] = var20; // L: 59
			++var8; // L: 52
		}

		double[] var14 = var7; // L: 63
		double var15 = var7[var1] * var7[var1]; // L: 64
		int[] var17 = new int[var2 * var2]; // L: 65
		boolean var10 = false; // L: 66

		for (int var11 = 0; var11 < var2; ++var11) { // L: 67
			for (int var12 = 0; var12 < var2; ++var12) { // L: 68
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var12] * var14[var11] / var15)); // L: 69
				if (!var10 && var13 > 0) { // L: 70
					var10 = true; // L: 71
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 75
		this.spriteMap.put(var1, var18); // L: 76
	} // L: 77

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqr;",
		garbageValue = "125"
	)
	SpritePixels method5866(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 80
			this.method5849(var1); // L: 81
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 83
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2103923209"
	)
	public final void method5848(int var1, int var2) {
		if (this.field4103 < this.field4099.length) { // L: 87
			this.field4099[this.field4103] = var1; // L: 88
			this.field4102[this.field4103] = var2; // L: 89
			++this.field4103; // L: 90
		}
	} // L: 91

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1637877740"
	)
	public final void method5851() {
		this.field4103 = 0; // L: 94
	} // L: 95

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILqr;FB)V",
		garbageValue = "5"
	)
	public final void method5852(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 98
		SpritePixels var6 = this.method5866(var5); // L: 99
		int var7 = var5 * 2 + 1; // L: 100
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 101
		Bounds var9 = new Bounds(0, 0); // L: 102
		this.bounds.setHigh(var7, var7); // L: 103
		System.nanoTime(); // L: 104

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4103; ++var10) { // L: 105
			var11 = this.field4099[var10]; // L: 106
			var12 = this.field4102[var10]; // L: 107
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 108
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 109
			this.bounds.setLow(var13, var14); // L: 110
			this.bounds.method6758(var8, var9); // L: 111
			this.method5853(var6, var3, var9); // L: 112
		}

		System.nanoTime(); // L: 114
		System.nanoTime(); // L: 115

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 116
			if (var3.pixels[var10] == 0) { // L: 117
				var3.pixels[var10] = -16777216; // L: 118
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 121
				if (var11 <= 0) { // L: 122
					var3.pixels[var10] = -16777216; // L: 123
				} else {
					if (var11 > class82.field1072.length) { // L: 126
						var11 = class82.field1072.length;
					}

					var12 = class82.field1072[var11 - 1]; // L: 127
					var3.pixels[var10] = -16777216 | var12; // L: 128
				}
			}
		}

		System.nanoTime(); // L: 130
	} // L: 131

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lqr;Lne;B)V",
		garbageValue = "-99"
	)
	void method5853(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 134
			int var4 = 0; // L: 135
			int var5 = 0; // L: 136
			if (var3.lowX == 0) { // L: 137
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 138
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 139
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 140

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 141
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 142
					int[] var10000 = var2.pixels; // L: 143
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 145
				var7 += var2.subWidth - var3.highX; // L: 146
			}

		}
	} // L: 148

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-63"
	)
	static int method5868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4118
			var3 = class128.Client_plane; // L: 4119
			int var15 = (ModelData0.localPlayer.x >> 7) + SecureRandomCallable.baseX; // L: 4120
			int var8 = (ModelData0.localPlayer.y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY; // L: 4121
			MilliClock.getWorldMap().method7033(var3, var15, var8, true); // L: 4122
			return 1; // L: 4123
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4125
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4126
				String var16 = ""; // L: 4127
				var9 = MilliClock.getWorldMap().getMapArea(var3); // L: 4128
				if (var9 != null) { // L: 4129
					var16 = var9.getExternalName(); // L: 4130
				}

				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var16; // L: 4132
				return 1; // L: 4133
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4135
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4136
				MilliClock.getWorldMap().setCurrentMapAreaId(var3); // L: 4137
				return 1; // L: 4138
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4140
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getZoomLevel(); // L: 4141
				return 1; // L: 4142
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4144
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4145
				MilliClock.getWorldMap().setZoomPercentage(var3); // L: 4146
				return 1; // L: 4147
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4149
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4150
				return 1; // L: 4151
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4153
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4154
					MilliClock.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4155
					return 1; // L: 4156
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4158
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4159
					MilliClock.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4160
					return 1; // L: 4161
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4163
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4164
					MilliClock.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4165
					return 1; // L: 4166
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4168
					var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4169
					MilliClock.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4170
					return 1; // L: 4171
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4173
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayX(); // L: 4174
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayY(); // L: 4175
					return 1; // L: 4176
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4178
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4179
						var11 = MilliClock.getWorldMap().getMapArea(var3); // L: 4180
						if (var11 == null) { // L: 4181
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4182
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4185
						}

						return 1; // L: 4187
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4189
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4190
						var11 = MilliClock.getWorldMap().getMapArea(var3); // L: 4191
						if (var11 == null) { // L: 4192
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4193
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4194
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4197
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4198
						}

						return 1; // L: 4200
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4202
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4203
						var11 = MilliClock.getWorldMap().getMapArea(var3); // L: 4204
						if (var11 == null) { // L: 4205
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4206
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4207
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4208
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4209
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4212
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4213
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4214
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4215
						}

						return 1; // L: 4217
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4219
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4220
						var11 = MilliClock.getWorldMap().getMapArea(var3); // L: 4221
						if (var11 == null) { // L: 4222
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4223
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4226
						}

						return 1; // L: 4228
					} else if (var0 == 6615) { // L: 4230
						var14 = MilliClock.getWorldMap().getDisplayCoord(); // L: 4231
						if (var14 == null) { // L: 4232
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4233
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4234
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var14.x; // L: 4237
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var14.y; // L: 4238
						}

						return 1; // L: 4240
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4242
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().currentMapAreaId(); // L: 4243
						return 1; // L: 4244
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4246
						var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4247
						var11 = MilliClock.getWorldMap().getCurrentMapArea(); // L: 4248
						if (var11 == null) { // L: 4249
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4250
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4251
							return 1; // L: 4252
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4254
							if (var12 == null) { // L: 4255
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4256
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4257
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12[0]; // L: 4260
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12[1]; // L: 4261
							}

							return 1; // L: 4263
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4265
							var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4266
							var11 = MilliClock.getWorldMap().getCurrentMapArea(); // L: 4267
							if (var11 == null) { // L: 4268
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4269
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4270
								return 1; // L: 4271
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4273
								if (var5 == null) { // L: 4274
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4275
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.packed(); // L: 4278
								}

								return 1; // L: 4280
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4282
								class12.Interpreter_intStackSize -= 2; // L: 4283
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4284
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 4285
								FriendsList.method6449(var3, var10, false); // L: 4286
								return 1; // L: 4287
							} else if (var0 == 6620) { // L: 4289
								class12.Interpreter_intStackSize -= 2; // L: 4290
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4291
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 4292
								FriendsList.method6449(var3, var10, true); // L: 4293
								return 1; // L: 4294
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4296
								class12.Interpreter_intStackSize -= 2; // L: 4297
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4298
								var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 4299
								var9 = MilliClock.getWorldMap().getMapArea(var3); // L: 4300
								if (var9 == null) { // L: 4301
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4302
									return 1; // L: 4303
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4305
									return 1; // L: 4306
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4308
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayWith(); // L: 4309
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getDisplayHeight(); // L: 4310
								return 1; // L: 4311
							} else if (var0 == 6623) { // L: 4313
								var14 = new Coord(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4314
								var11 = MilliClock.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4315
								if (var11 == null) { // L: 4316
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4317
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var11.getId(); // L: 4320
								}

								return 1; // L: 4322
							} else if (var0 == 6624) { // L: 4324
								MilliClock.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4325
								return 1; // L: 4326
							} else if (var0 == 6625) { // L: 4328
								MilliClock.getWorldMap().resetMaxFlashCount(); // L: 4329
								return 1; // L: 4330
							} else if (var0 == 6626) { // L: 4332
								MilliClock.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 4333
								return 1; // L: 4334
							} else if (var0 == 6627) { // L: 4336
								MilliClock.getWorldMap().resetCyclesPerFlash(); // L: 4337
								return 1; // L: 4338
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4340
									var13 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 4341
									MilliClock.getWorldMap().setPerpetualFlash(var13); // L: 4342
									return 1; // L: 4343
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4345
									var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4346
									MilliClock.getWorldMap().flashElement(var3); // L: 4347
									return 1; // L: 4348
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4350
									var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4351
									MilliClock.getWorldMap().flashCategory(var3); // L: 4352
									return 1; // L: 4353
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4355
									MilliClock.getWorldMap().stopCurrentFlashes(); // L: 4356
									return 1; // L: 4357
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4359
									var13 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 4360
									MilliClock.getWorldMap().setElementsDisabled(var13); // L: 4361
									return 1; // L: 4362
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4364
										class12.Interpreter_intStackSize -= 2; // L: 4365
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4366
										var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1; // L: 4367
										MilliClock.getWorldMap().disableElement(var3, var7); // L: 4368
										return 1; // L: 4369
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4371
										class12.Interpreter_intStackSize -= 2; // L: 4372
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4373
										var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1; // L: 4374
										MilliClock.getWorldMap().setCategoryDisabled(var3, var7); // L: 4375
										return 1; // L: 4376
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4378
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4379
										return 1; // L: 4380
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4382
										var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4383
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4384
										return 1; // L: 4385
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4387
										var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4388
										Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = MilliClock.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4389
										return 1; // L: 4390
									} else if (var0 == 6638) { // L: 4392
										class12.Interpreter_intStackSize -= 2; // L: 4393
										var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 4394
										var10 = new Coord(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 4395
										var5 = MilliClock.getWorldMap().method7076(var3, var10); // L: 4396
										if (var5 == null) { // L: 4397
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4398
										} else {
											Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.packed(); // L: 4401
										}

										return 1; // L: 4403
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4405
											var6 = MilliClock.getWorldMap().iconStart(); // L: 4406
											if (var6 == null) { // L: 4407
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4408
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4409
											} else {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4412
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4413
											}

											return 1; // L: 4415
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4417
											var6 = MilliClock.getWorldMap().iconNext(); // L: 4418
											if (var6 == null) { // L: 4419
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4420
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4421
											} else {
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4424
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4425
											}

											return 1; // L: 4427
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4429
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4430
												var4 = class120.WorldMapElement_get(var3); // L: 4431
												if (var4.name == null) { // L: 4432
													Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4433
												} else {
													Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.name; // L: 4436
												}

												return 1; // L: 4438
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4440
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4441
												var4 = class120.WorldMapElement_get(var3); // L: 4442
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.textSize; // L: 4443
												return 1; // L: 4444
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4446
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4447
												var4 = class120.WorldMapElement_get(var3); // L: 4448
												if (var4 == null) { // L: 4449
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4450
												} else {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.category; // L: 4453
												}

												return 1; // L: 4455
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4457
												var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4458
												var4 = class120.WorldMapElement_get(var3); // L: 4459
												if (var4 == null) { // L: 4460
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4461
												} else {
													Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4464
												}

												return 1; // L: 4466
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4468
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.mapElement; // L: 4469
												return 1; // L: 4470
											} else if (var0 == 6698) { // L: 4472
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.coord1.packed(); // L: 4473
												return 1; // L: 4474
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4476
												Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class9.worldMapEvent.coord2.packed(); // L: 4477
												return 1; // L: 4478
											} else {
												return 2; // L: 4480
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
