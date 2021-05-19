import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@Export("owner")
	public String owner;
	@ObfuscatedName("z")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 504381773
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1476924317
	)
	int field3835;

	@ObfuscatedSignature(
		descriptor = "(Lnj;Llt;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3835 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1768347101"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Llm;",
		garbageValue = "836907267"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1078557001"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L; // L: 36
		int var7 = var1.length(); // L: 37

		for (int var8 = 0; var8 < var7; ++var8) { // L: 38
			var5 *= 37L; // L: 39
			char var9 = var1.charAt(var8); // L: 40
			if (var9 >= 'A' && var9 <= 'Z') { // L: 41
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 42
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 43
			}

			if (var5 >= 177917621779460413L) { // L: 44
				break;
			}
		}

		while (var5 % 37L == 0L && var5 != 0L) { // L: 46
			var5 /= 37L;
		}

		String var10 = MilliClock.base37DecodeLong(var5); // L: 49
		if (var10 == null) { // L: 50
			var10 = "";
		}

		this.name = var10; // L: 53
	} // L: 54

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-786554920"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L; // L: 61
		int var7 = var1.length(); // L: 62

		for (int var8 = 0; var8 < var7; ++var8) { // L: 63
			var5 *= 37L; // L: 64
			char var9 = var1.charAt(var8); // L: 65
			if (var9 >= 'A' && var9 <= 'Z') { // L: 66
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 67
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 68
			}

			if (var5 >= 177917621779460413L) { // L: 69
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) { // L: 71
			var5 /= 37L;
		}

		String var10 = MilliClock.base37DecodeLong(var5); // L: 74
		if (var10 == null) { // L: 75
			var10 = "";
		}

		this.owner = var10; // L: 78
	} // L: 79

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1366673555"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 82
		long var2 = var1.readLong(); // L: 83
		long var5 = var2; // L: 85
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 87
			if (0L == var2 % 37L) { // L: 91
				var4 = null; // L: 92
			} else {
				var7 = 0; // L: 95

				for (long var8 = var2; var8 != 0L; var8 /= 37L) { // L: 96 97 99
					++var7; // L: 98
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 101

				while (0L != var5) { // L: 102
					long var11 = var5; // L: 103
					var5 /= 37L; // L: 104
					var10.append(class305.base37Table[(int)(var11 - 37L * var5)]); // L: 105
				}

				var4 = var10.reverse().toString(); // L: 107
			}
		} else {
			var4 = null; // L: 88
		}

		this.readName(var4); // L: 109
		this.minKick = var1.readByte(); // L: 110
		var7 = var1.readUnsignedByte(); // L: 111
		if (var7 != 255) { // L: 112
			this.clear(); // L: 113

			for (int var13 = 0; var13 < var7; ++var13) { // L: 114
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 115
				int var14 = var1.readUnsignedShort(); // L: 116
				var9.set(var14, ++this.field3835 - 1); // L: 117
				var9.rank = var1.readByte(); // L: 118
				var1.readStringCp1252NullTerminated(); // L: 119
				this.isLocalPlayer(var9); // L: 120
			}

		}
	} // L: 122

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-759910337"
	)
	public final void method5519(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 125
		int var3 = var1.readUnsignedShort(); // L: 126
		byte var4 = var1.readByte(); // L: 127
		boolean var5 = false; // L: 128
		if (var4 == -128) { // L: 129
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 130
			if (this.getSize() == 0) { // L: 131
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 132
			if (var6 != null && var6.getWorld() == var3) { // L: 133
				this.remove(var6); // L: 134
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 138
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 139
			if (var6 == null) { // L: 140
				if (this.getSize() > super.capacity) { // L: 141
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 142
			}

			var6.set(var3, ++this.field3835 - 1); // L: 144
			var6.rank = var4; // L: 145
			this.isLocalPlayer(var6); // L: 146
		}

	} // L: 148

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1356197970"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 151
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 152
		}

	} // L: 154

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-404793839"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 157
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 158
		}

	} // L: 160

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-1814056265"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 163
			this.rank = var1.rank;
		}

	} // L: 164

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgz;Lfa;B)V",
		garbageValue = "-119"
	)
	static final void method5541(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 176 177 178
			if (var0 < Tiles.Tiles_minPlane) { // L: 181
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = AttackOption.getObjectDefinition(var3); // L: 182
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 185
				var9 = var8.sizeX; // L: 190
				var10 = var8.sizeY; // L: 191
			} else {
				var9 = var8.sizeY; // L: 186
				var10 = var8.sizeX; // L: 187
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 197
				var11 = (var9 >> 1) + var1; // L: 198
				var12 = (var9 + 1 >> 1) + var1; // L: 199
			} else {
				var11 = var1; // L: 202
				var12 = var1 + 1; // L: 203
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 205
				var13 = (var10 >> 1) + var2; // L: 206
				var14 = var2 + (var10 + 1 >> 1); // L: 207
			} else {
				var13 = var2; // L: 210
				var14 = var2 + 1; // L: 211
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 213
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 214
			int var17 = (var1 << 7) + (var9 << 6); // L: 215
			int var18 = (var2 << 7) + (var10 << 6); // L: 216
			long var19 = class17.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 217
			int var21 = var5 + (var4 << 6); // L: 218
			if (var8.int3 == 1) { // L: 219
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 220
				ObjectSound var22 = new ObjectSound(); // L: 221
				var22.plane = var0; // L: 222
				var22.x = var1 * 128; // L: 223
				var22.y = var2 * 128; // L: 224
				var23 = var8.sizeX; // L: 225
				var24 = var8.sizeY; // L: 226
				if (var4 == 1 || var4 == 3) { // L: 227
					var23 = var8.sizeY; // L: 228
					var24 = var8.sizeX; // L: 229
				}

				var22.field926 = (var23 + var1) * 128; // L: 231
				var22.field927 = (var24 + var2) * 128; // L: 232
				var22.soundEffectId = var8.ambientSoundId; // L: 233
				var22.field929 = var8.int4 * 128; // L: 234
				var22.field934 = var8.int5; // L: 235
				var22.field932 = var8.int6; // L: 236
				var22.soundEffectIds = var8.soundEffectIds; // L: 237
				if (var8.transforms != null) { // L: 238
					var22.obj = var8; // L: 239
					var22.set(); // L: 240
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 242
				if (var22.soundEffectIds != null) { // L: 243
					var22.field923 = var22.field934 + (int)(Math.random() * (double)(var22.field932 - var22.field934));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 245
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 246
					if (var8.animationId == -1 && var8.transforms == null) { // L: 248
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 249
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 250
					if (var8.interactType == 1 && var7 != null) { // L: 251
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 254
				int[] var10000;
				if (var5 >= 12) { // L: 275
					if (var8.animationId == -1 && var8.transforms == null) { // L: 277
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 278
					}

					var6.method4008(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 279
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 280
						var10000 = Tiles.field1105[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 281
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 284
					if (var8.animationId == -1 && var8.transforms == null) { // L: 286
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 287
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1085[var4], 0, var19, var21); // L: 288
					if (var4 == 0) { // L: 289
						if (var8.clipped) { // L: 290
							Tiles.field1090[var0][var1][var2] = 50; // L: 291
							Tiles.field1090[var0][var1][var2 + 1] = 50; // L: 292
						}

						if (var8.modelClipped) { // L: 294
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 296
						if (var8.clipped) { // L: 297
							Tiles.field1090[var0][var1][var2 + 1] = 50; // L: 298
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50; // L: 299
						}

						if (var8.modelClipped) { // L: 301
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) { // L: 303
						if (var8.clipped) { // L: 304
							Tiles.field1090[var0][var1 + 1][var2] = 50; // L: 305
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50; // L: 306
						}

						if (var8.modelClipped) { // L: 308
							var10000 = Tiles.field1105[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 310
						if (var8.clipped) { // L: 311
							Tiles.field1090[var0][var1][var2] = 50; // L: 312
							Tiles.field1090[var0][var1 + 1][var2] = 50; // L: 313
						}

						if (var8.modelClipped) { // L: 315
							var10000 = Tiles.field1105[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 317
						var7.method3094(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 318
						var6.method3917(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 321
					if (var8.animationId == -1 && var8.transforms == null) { // L: 323
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 324
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1095[var4], 0, var19, var21); // L: 325
					if (var8.clipped) { // L: 326
						if (var4 == 0) { // L: 327
							Tiles.field1090[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 328
							Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 329
							Tiles.field1090[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 330
							Tiles.field1090[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 332
						var7.method3094(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 335
						var28 = var4 + 1 & 3; // L: 336
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 339
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 340
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 341
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 344
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 345
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1085[var4], Tiles.field1085[var28], var19, var21); // L: 347
						if (var8.modelClipped) { // L: 348
							if (var4 == 0) { // L: 349
								var10000 = Tiles.field1105[var0][var1]; // L: 350
								var10000[var2] |= 585;
								var10000 = Tiles.field1105[var0][var1]; // L: 351
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) { // L: 353
								var10000 = Tiles.field1105[var0][var1]; // L: 354
								var10000[var2 + 1] |= 1170;
								var10000 = Tiles.field1105[var0][var1 + 1]; // L: 355
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 357
								var10000 = Tiles.field1105[var0][var1 + 1]; // L: 358
								var10000[var2] |= 585;
								var10000 = Tiles.field1105[var0][var1]; // L: 359
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 361
								var10000 = Tiles.field1105[var0][var1]; // L: 362
								var10000[var2] |= 1170;
								var10000 = Tiles.field1105[var0][var1]; // L: 363
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 366
							var7.method3094(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 367
							var6.method3917(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 370
						if (var8.animationId == -1 && var8.transforms == null) { // L: 372
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 373
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1095[var4], 0, var19, var21); // L: 374
						if (var8.clipped) { // L: 375
							if (var4 == 0) { // L: 376
								Tiles.field1090[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 377
								Tiles.field1090[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 378
								Tiles.field1090[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 379
								Tiles.field1090[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 381
							var7.method3094(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 384
						if (var8.animationId == -1 && var8.transforms == null) { // L: 386
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 387
						}

						var6.method4008(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 388
						if (var8.interactType != 0 && var7 != null) { // L: 389
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 390
							var6.method3917(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 393
						if (var8.animationId == -1 && var8.transforms == null) { // L: 395
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 396
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1085[var4], 0, 0, 0, var19, var21); // L: 397
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 400
							var28 = 16; // L: 401
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 402
							if (var29 != 0L) { // L: 403
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 405
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 406
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1085[var4], 0, var28 * Tiles.field1096[var4], var28 * Tiles.field1100[var4], var19, var21); // L: 407
						} else if (var5 == 6) { // L: 410
							var28 = 8; // L: 411
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 412
							if (var29 != 0L) { // L: 413
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 415
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 416
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1098[var4], var28 * Tiles.field1094[var4], var19, var21); // L: 417
						} else if (var5 == 7) { // L: 420
							var23 = var4 + 2 & 3; // L: 422
							if (var8.animationId == -1 && var8.transforms == null) { // L: 423
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 424
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 425
						} else if (var5 == 8) { // L: 428
							var28 = 8; // L: 429
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 430
							if (0L != var29) { // L: 431
								var28 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 434
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 435
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 436
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 437
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 440
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 441
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1098[var4], var28 * Tiles.field1094[var4], var19, var21); // L: 443
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 256
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1761, (Renderable)null); // L: 257
				}

				if (var34 != null && var6.method4008(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 258 259
					var23 = 15; // L: 260
					if (var34 instanceof Model) { // L: 261
						var23 = ((Model)var34).method4125() / 4; // L: 262
						if (var23 > 30) { // L: 263
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 265
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 266
							if (var23 > Tiles.field1090[var0][var24 + var1][var33 + var2]) { // L: 267
								Tiles.field1090[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 272
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 252 273 282 319 333 368 382 391 398 408 418 426 444 446
}
