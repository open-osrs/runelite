import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("k")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("a")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("d")
	@Export("operatingSystemName")
	static String operatingSystemName;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpt;I)Lpt;",
		garbageValue = "-1071419975"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = FontName.method7228(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;B)V",
		garbageValue = "35"
	)
	public static void method3154(AbstractArchive var0, AbstractArchive var1) {
		class18.KitDefinition_archive = var0; // L: 27
		class361.KitDefinition_modelsArchive = var1; // L: 28
		class147.KitDefinition_fileCount = class18.KitDefinition_archive.getGroupFileCount(3); // L: 29
	} // L: 30

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldz;FZB)F",
		garbageValue = "-1"
	)
	static float method3159(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 209
		if (var0 != null && var0.method2695() != 0) { // L: 210
			float var4 = (float)var0.field1476[0].field1430; // L: 213
			float var5 = (float)var0.field1476[var0.method2695() - 1].field1430; // L: 214
			float var6 = var5 - var4; // L: 215
			if ((double)var6 == 0.0D) { // L: 216
				return var0.field1476[0].field1428; // L: 217
			} else {
				float var7 = 0.0F; // L: 219
				if (var1 > var5) { // L: 220
					var7 = (var1 - var5) / var6; // L: 221
				} else {
					var7 = (var1 - var4) / var6; // L: 224
				}

				double var8 = (double)((int)var7); // L: 226
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 227
				float var11 = var10 * var6; // L: 228
				var8 = Math.abs(var8 + 1.0D); // L: 229
				double var12 = var8 / 2.0D; // L: 230
				double var14 = (double)((int)var12); // L: 231
				var10 = (float)(var12 - var14); // L: 232
				float var16;
				float var17;
				if (var2) { // L: 235
					if (var0.field1472 == class116.field1468) { // L: 236
						if ((double)var10 != 0.0D) { // L: 237
							var11 += var4; // L: 238
						} else {
							var11 = var5 - var11; // L: 241
						}
					} else if (var0.field1472 != class116.field1464 && var0.field1472 != class116.field1466) { // L: 244
						if (var0.field1472 == class116.field1465) { // L: 247
							var11 = var4 - var1; // L: 248
							var16 = var0.field1476[0].field1423; // L: 249
							var17 = var0.field1476[0].field1424; // L: 250
							var3 = var0.field1476[0].field1428; // L: 251
							if (0.0D != (double)var16) { // L: 252
								var3 -= var17 * var11 / var16; // L: 253
							}

							return var3; // L: 255
						}
					} else {
						var11 = var5 - var11; // L: 245
					}
				} else if (var0.field1475 == class116.field1468) { // L: 259
					if ((double)var10 != 0.0D) { // L: 260
						var11 = var5 - var11; // L: 261
					} else {
						var11 += var4; // L: 264
					}
				} else if (var0.field1475 != class116.field1464 && var0.field1475 != class116.field1466) { // L: 267
					if (var0.field1475 == class116.field1465) { // L: 270
						var11 = var1 - var5; // L: 271
						var16 = var0.field1476[var0.method2695() - 1].field1425; // L: 272
						var17 = var0.field1476[var0.method2695() - 1].field1426; // L: 273
						var3 = var0.field1476[var0.method2695() - 1].field1428; // L: 274
						if (0.0D != (double)var16) { // L: 275
							var3 += var17 * var11 / var16; // L: 276
						}

						return var3; // L: 278
					}
				} else {
					var11 += var4; // L: 268
				}

				var3 = MusicPatchNode.method5315(var0, var11); // L: 281
				float var18;
				if (var2 && var0.field1472 == class116.field1466) { // L: 283
					var18 = var0.field1476[var0.method2695() - 1].field1428 - var0.field1476[0].field1428; // L: 284
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 285
				} else if (!var2 && var0.field1475 == class116.field1466) { // L: 287
					var18 = var0.field1476[var0.method2695() - 1].field1428 - var0.field1476[0].field1428; // L: 288
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 289
				}

				return var3; // L: 291
			}
		} else {
			return var3; // L: 211
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llp;Ljava/lang/String;Ljava/lang/String;B)Lqd;",
		garbageValue = "-119"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 85
		int var4 = var0.getFileId(var3, var2); // L: 86
		return ViewportMouse.method4372(var0, var3, var4); // L: 87
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1667871503"
	)
	static final void method3155() {
		Scene.Scene_isLowDetail = false; // L: 817
		Client.isLowDetail = false; // L: 818
	} // L: 819

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lca;III)V",
		garbageValue = "-1086335003"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4318
			int var3 = class114.SequenceDefinition_get(var1).field2208; // L: 4319
			if (var3 == 1) { // L: 4320
				var0.sequenceFrame = 0; // L: 4321
				var0.sequenceFrameCycle = 0; // L: 4322
				var0.sequenceDelay = var2; // L: 4323
				var0.field1186 = 0; // L: 4324
			}

			if (var3 == 2) { // L: 4326
				var0.field1186 = 0; // L: 4327
			}
		} else if (var1 == -1 || var0.sequence == -1 || class114.SequenceDefinition_get(var1).field2220 >= class114.SequenceDefinition_get(var0.sequence).field2220) { // L: 4330
			var0.sequence = var1; // L: 4331
			var0.sequenceFrame = 0; // L: 4332
			var0.sequenceFrameCycle = 0; // L: 4333
			var0.sequenceDelay = var2; // L: 4334
			var0.field1186 = 0; // L: 4335
			var0.field1200 = var0.pathLength; // L: 4336
		}

	} // L: 4338

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)V",
		garbageValue = "-1313288236"
	)
	static final void method3158(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field565; ++var1) { // L: 8174
			int var2 = Client.field601[var1]; // L: 8175
			NPC var3 = Client.npcs[var2]; // L: 8176
			int var4 = var0.readUnsignedByte(); // L: 8177
			int var5;
			if (class393.field4428 && (var4 & 8) != 0) { // L: 8178
				var5 = var0.readUnsignedByte(); // L: 8179
				var4 += var5 << 8; // L: 8180
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 16) != 0) { // L: 8182
				var5 = var0.readUnsignedShort(); // L: 8183
				var6 = var0.method7716(); // L: 8184
				if (class393.field4428) { // L: 8185
					var3.field1173 = var0.method7546() == 1; // L: 8186
				}

				var7 = var3.x - (var5 - SecureRandomCallable.baseX - SecureRandomCallable.baseX) * 64; // L: 8188
				var8 = var3.y - (var6 - GrandExchangeOfferOwnWorldComparator.baseY - GrandExchangeOfferOwnWorldComparator.baseY) * 64; // L: 8189
				if (var7 != 0 || var8 != 0) { // L: 8190
					var3.field1172 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 1024) != 0) { // L: 8192
				var3.field1210 = var0.method7568(); // L: 8193
			}

			if ((var4 & 2) != 0) { // L: 8195
				var3.targetIndex = var0.method7554(); // L: 8196
				if (var3.targetIndex == 65535) { // L: 8197
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 32) != 0) { // L: 8199
				var5 = var0.method7716(); // L: 8200
				if (var5 == 65535) { // L: 8201
					var5 = -1; // L: 8202
				}

				var6 = var0.readUnsignedByte(); // L: 8204
				if (var5 == var3.sequence && var5 != -1) { // L: 8205
					var7 = class114.SequenceDefinition_get(var5).field2208; // L: 8206
					if (var7 == 1) { // L: 8207
						var3.sequenceFrame = 0; // L: 8208
						var3.sequenceFrameCycle = 0; // L: 8209
						var3.sequenceDelay = var6; // L: 8210
						var3.field1186 = 0; // L: 8211
					}

					if (var7 == 2) { // L: 8213
						var3.field1186 = 0; // L: 8214
					}
				} else if (var5 == -1 || var3.sequence == -1 || class114.SequenceDefinition_get(var5).field2220 >= class114.SequenceDefinition_get(var3.sequence).field2220) { // L: 8217
					var3.sequence = var5; // L: 8218
					var3.sequenceFrame = 0; // L: 8219
					var3.sequenceFrameCycle = 0; // L: 8220
					var3.sequenceDelay = var6; // L: 8221
					var3.field1186 = 0; // L: 8222
					var3.field1200 = var3.pathLength; // L: 8223
				}
			}

			if ((var4 & 512) != 0) { // L: 8227
				var3.field1196 = Client.cycle + var0.method7576(); // L: 8228
				var3.field1197 = Client.cycle + var0.method7576(); // L: 8229
				var3.field1143 = var0.readByte(); // L: 8230
				var3.field1199 = var0.method7548(); // L: 8231
				var3.field1153 = var0.method7548(); // L: 8232
				var3.field1140 = (byte)var0.readUnsignedByte(); // L: 8233
			}

			if (class393.field4428 && (var4 & 256) != 0 || !class393.field4428 && (var4 & 8) != 0) { // L: 8235
				var3.field1187 = var0.method7548(); // L: 8236
				var3.field1189 = var0.method7549(); // L: 8237
				var3.field1188 = var0.method7548(); // L: 8238
				var3.field1190 = var0.method7547(); // L: 8239
				var3.field1191 = var0.method7716() + Client.cycle; // L: 8240
				var3.field1192 = var0.method7716() + Client.cycle; // L: 8241
				var3.field1139 = var0.readUnsignedShort(); // L: 8242
				var3.pathLength = 1; // L: 8243
				var3.field1200 = 0; // L: 8244
				var3.field1187 += var3.pathX[0]; // L: 8245
				var3.field1189 += var3.pathY[0]; // L: 8246
				var3.field1188 += var3.pathX[0]; // L: 8247
				var3.field1190 += var3.pathY[0]; // L: 8248
			}

			if ((var4 & 64) != 0) { // L: 8250
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8251
				var3.overheadTextCyclesRemaining = 100; // L: 8252
			}

			if ((var4 & 1) != 0) { // L: 8254
				var3.spotAnimation = var0.method7576(); // L: 8255
				var5 = var0.method7701(); // L: 8256
				var3.spotAnimationHeight = var5 >> 16; // L: 8257
				var3.field1185 = (var5 & 65535) + Client.cycle; // L: 8258
				var3.spotAnimationFrame = 0; // L: 8259
				var3.spotAnimationFrameCycle = 0; // L: 8260
				if (var3.field1185 > Client.cycle) { // L: 8261
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8262
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 4) != 0) { // L: 8264
				var5 = var0.readUnsignedByte(); // L: 8265
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 8266
					for (var6 = 0; var6 < var5; ++var6) { // L: 8267
						var8 = -1; // L: 8269
						var9 = -1; // L: 8270
						var10 = -1; // L: 8271
						var7 = var0.readUShortSmart(); // L: 8272
						if (var7 == 32767) { // L: 8273
							var7 = var0.readUShortSmart(); // L: 8274
							var9 = var0.readUShortSmart(); // L: 8275
							var8 = var0.readUShortSmart(); // L: 8276
							var10 = var0.readUShortSmart(); // L: 8277
						} else if (var7 != 32766) { // L: 8279
							var9 = var0.readUShortSmart(); // L: 8280
						} else {
							var7 = -1; // L: 8282
						}

						var11 = var0.readUShortSmart(); // L: 8283
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8284
					}
				}

				var6 = var0.method7546(); // L: 8287
				if (var6 > 0) { // L: 8288
					for (var7 = 0; var7 < var6; ++var7) { // L: 8289
						var8 = var0.readUShortSmart(); // L: 8290
						var9 = var0.readUShortSmart(); // L: 8291
						if (var9 != 32767) { // L: 8292
							var10 = var0.readUShortSmart(); // L: 8293
							var11 = var0.readUnsignedByte(); // L: 8294
							int var12 = var9 > 0 ? var0.method7546() : var11; // L: 8295
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8296
						} else {
							var3.removeHealthBar(var8); // L: 8298
						}
					}
				}
			}

			if ((var4 & 2048) != 0) { // L: 8302
				var3.method2338(var0.readStringCp1252NullTerminated()); // L: 8303
			}

			if ((var4 & 128) != 0) { // L: 8305
				var3.definition = WorldMapSectionType.getNpcDefinition(var0.method7554()); // L: 8306
				var3.field1167 = var3.definition.size; // L: 8307
				var3.field1204 = var3.definition.rotation; // L: 8308
				var3.walkSequence = var3.definition.walkSequence; // L: 8309
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 8310
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 8311
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 8312
				var3.idleSequence = var3.definition.idleSequence; // L: 8313
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 8314
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 8315
			}
		}

	} // L: 8318

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1222597684"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class127.scrollBarSprites[0].drawAt(var0, var1); // L: 10863
		class127.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10864
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field555); // L: 10865
		int var5 = var3 * (var3 - 32) / var4; // L: 10866
		if (var5 < 8) { // L: 10867
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10868
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field556); // L: 10869
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field483); // L: 10870
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field483); // L: 10871
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field483); // L: 10872
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field483); // L: 10873
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field640); // L: 10874
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field640); // L: 10875
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field640); // L: 10876
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field640); // L: 10877
	} // L: 10878
}
