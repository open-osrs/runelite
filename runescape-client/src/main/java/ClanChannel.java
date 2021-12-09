import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	boolean field1637;
	@ObfuscatedName("b")
	boolean field1642;
	@ObfuscatedName("p")
	@Export("members")
	public List members;
	@ObfuscatedName("m")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -6629358270265648135L
	)
	long field1640;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	public byte field1636;
	@ObfuscatedName("w")
	public byte field1643;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1642 = true; // L: 13
		this.name = null; // L: 17
		this.method2992(var1); // L: 26
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1790223696"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7914(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			class292.method5504(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)V",
		garbageValue = "-47"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1232070979"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method2990() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2014586653"
	)
	public int method2991(String var1) {
		if (!this.field1642) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-517363636"
	)
	void method2992(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1637 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1642 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1640 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1643 = var1.readByte(); // L: 77
		this.field1636 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1637) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1642) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgy;Lgf;B)V",
		garbageValue = "-30"
	)
	static final void method2996(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 183 184 185
			if (var0 < Tiles.Tiles_minPlane) { // L: 188
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class148.getObjectDefinition(var3); // L: 189
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 192
				var9 = var8.sizeX; // L: 197
				var10 = var8.sizeY; // L: 198
			} else {
				var9 = var8.sizeY; // L: 193
				var10 = var8.sizeX; // L: 194
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 204
				var11 = (var9 >> 1) + var1; // L: 205
				var12 = (var9 + 1 >> 1) + var1; // L: 206
			} else {
				var11 = var1; // L: 209
				var12 = var1 + 1; // L: 210
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 212
				var13 = (var10 >> 1) + var2; // L: 213
				var14 = var2 + (var10 + 1 >> 1); // L: 214
			} else {
				var13 = var2; // L: 217
				var14 = var2 + 1; // L: 218
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 220
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 221
			int var17 = (var1 << 7) + (var9 << 6); // L: 222
			int var18 = (var2 << 7) + (var10 << 6); // L: 223
			long var19 = SecureRandomFuture.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 224
			int var21 = var5 + (var4 << 6); // L: 225
			if (var8.int3 == 1) { // L: 226
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 227
				ObjectSound var22 = new ObjectSound(); // L: 228
				var22.plane = var0; // L: 229
				var22.x = var1 * 128; // L: 230
				var22.y = var2 * 128; // L: 231
				var23 = var8.sizeX; // L: 232
				var24 = var8.sizeY; // L: 233
				if (var4 == 1 || var4 == 3) { // L: 234
					var23 = var8.sizeY; // L: 235
					var24 = var8.sizeX; // L: 236
				}

				var22.maxX = (var23 + var1) * 128; // L: 238
				var22.maxY = (var24 + var2) * 128; // L: 239
				var22.soundEffectId = var8.ambientSoundId; // L: 240
				var22.field793 = var8.int7 * 128; // L: 241
				var22.field796 = var8.int5; // L: 242
				var22.field797 = var8.int6; // L: 243
				var22.soundEffectIds = var8.soundEffectIds; // L: 244
				if (var8.transforms != null) { // L: 245
					var22.obj = var8; // L: 246
					var22.set(); // L: 247
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 249
				if (var22.soundEffectIds != null) { // L: 250
					var22.field789 = var22.field796 + (int)(Math.random() * (double)(var22.field797 - var22.field796));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 252
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 253
					if (var8.animationId == -1 && var8.transforms == null) { // L: 255
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 256
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 257
					if (var8.interactType == 1 && var7 != null) { // L: 258
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 261
				int[] var10000;
				if (var5 >= 12) { // L: 282
					if (var8.animationId == -1 && var8.transforms == null) { // L: 284
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 285
					}

					var6.method3960(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 286
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 287
						var10000 = ClanChannelMember.field1504[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 288
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 291
					if (var8.animationId == -1 && var8.transforms == null) { // L: 293
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 294
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field969[var4], 0, var19, var21); // L: 295
					if (var4 == 0) { // L: 296
						if (var8.clipped) { // L: 297
							SoundCache.field321[var0][var1][var2] = 50; // L: 298
							SoundCache.field321[var0][var1][var2 + 1] = 50; // L: 299
						}

						if (var8.modelClipped) { // L: 301
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 303
						if (var8.clipped) { // L: 304
							SoundCache.field321[var0][var1][var2 + 1] = 50; // L: 305
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50; // L: 306
						}

						if (var8.modelClipped) { // L: 308
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 310
						if (var8.clipped) { // L: 311
							SoundCache.field321[var0][var1 + 1][var2] = 50; // L: 312
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50; // L: 313
						}

						if (var8.modelClipped) { // L: 315
							var10000 = ClanChannelMember.field1504[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 317
						if (var8.clipped) { // L: 318
							SoundCache.field321[var0][var1][var2] = 50; // L: 319
							SoundCache.field321[var0][var1 + 1][var2] = 50; // L: 320
						}

						if (var8.modelClipped) { // L: 322
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 324
						var7.method3721(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 325
						var6.method3966(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 328
					if (var8.animationId == -1 && var8.transforms == null) { // L: 330
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 331
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field970[var4], 0, var19, var21); // L: 332
					if (var8.clipped) { // L: 333
						if (var4 == 0) { // L: 334
							SoundCache.field321[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 335
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 336
							SoundCache.field321[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 337
							SoundCache.field321[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 339
						var7.method3721(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 342
						var28 = var4 + 1 & 3; // L: 343
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 346
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 347
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 348
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 351
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 352
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field969[var4], Tiles.field969[var28], var19, var21); // L: 354
						if (var8.modelClipped) { // L: 355
							if (var4 == 0) { // L: 356
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 357
								var10000[var2] |= 585;
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 358
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) { // L: 360
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 361
								var10000[var2 + 1] |= 1170;
								var10000 = ClanChannelMember.field1504[var0][var1 + 1]; // L: 362
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 364
								var10000 = ClanChannelMember.field1504[var0][var1 + 1]; // L: 365
								var10000[var2] |= 585;
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 366
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 368
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 369
								var10000[var2] |= 1170;
								var10000 = ClanChannelMember.field1504[var0][var1]; // L: 370
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 373
							var7.method3721(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 374
							var6.method3966(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 377
						if (var8.animationId == -1 && var8.transforms == null) { // L: 379
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 380
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field970[var4], 0, var19, var21); // L: 381
						if (var8.clipped) { // L: 382
							if (var4 == 0) { // L: 383
								SoundCache.field321[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 384
								SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 385
								SoundCache.field321[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 386
								SoundCache.field321[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 388
							var7.method3721(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 391
						if (var8.animationId == -1 && var8.transforms == null) { // L: 393
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 394
						}

						var6.method3960(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 395
						if (var8.interactType != 0 && var7 != null) { // L: 396
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 397
							var6.method3966(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 400
						if (var8.animationId == -1 && var8.transforms == null) { // L: 402
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 403
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field969[var4], 0, 0, 0, var19, var21); // L: 404
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 407
							var28 = 16; // L: 408
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 409
							if (0L != var29) { // L: 410
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 412
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 413
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field969[var4], 0, var28 * Tiles.field976[var4], var28 * Tiles.field966[var4], var19, var21); // L: 414
						} else if (var5 == 6) { // L: 417
							var28 = 8; // L: 418
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 419
							if (0L != var29) { // L: 420
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 422
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 423
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field973[var4], var28 * Tiles.field974[var4], var19, var21); // L: 424
						} else if (var5 == 7) { // L: 427
							var23 = var4 + 2 & 3; // L: 429
							if (var8.animationId == -1 && var8.transforms == null) { // L: 430
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 431
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 432
						} else if (var5 == 8) { // L: 435
							var28 = 8; // L: 436
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 437
							if (var29 != 0L) { // L: 438
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 441
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 442
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 443
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 444
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 447
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 448
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field973[var4], var28 * Tiles.field974[var4], var19, var21); // L: 450
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 263
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 264
				}

				if (var34 != null && var6.method3960(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 265 266
					var23 = 15; // L: 267
					if (var34 instanceof Model) { // L: 268
						var23 = ((Model)var34).method4222() / 4; // L: 269
						if (var23 > 30) { // L: 270
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 272
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 273
							if (var23 > SoundCache.field321[var0][var24 + var1][var33 + var2]) { // L: 274
								SoundCache.field321[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 279
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 259 280 289 326 340 375 389 398 405 415 425 433 451 453
}
