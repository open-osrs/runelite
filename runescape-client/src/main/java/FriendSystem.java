import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1061950327
	)
	int field1099;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	FriendSystem(LoginType var1) {
		this.field1099 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1895979589"
	)
	boolean method1972() {
		return this.field1099 == 2; // L: 32
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1001513486"
	)
	final void method1919() {
		this.field1099 = 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IS)V",
		garbageValue = "-279"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field1099 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		class89.method2127(); // L: 47
		if (Entity.clanChat != null) { // L: 48
			Entity.clanChat.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1616251932"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field3664 < PacketWriter.currentTimeMillis() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					WorldMapRectangle.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					WorldMapRectangle.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16776960"
	)
	@Export("clear")
	final void clear() {
		this.field1099 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lku;ZB)Z",
		garbageValue = "6"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(WorldMapLabelSize.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lku;B)Z",
		garbageValue = "-12"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "597249959"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					Object var10000 = null; // L: 89
					String var3 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					WorldMapRectangle.addGameMessage(30, "", var3); // L: 91
				} else if (WorldMapLabelSize.localPlayer.username.equals(var2)) { // L: 96
					WorldMapSection1.method649(); // L: 97
				} else if (this.isFriended(var2, false)) { // L: 100
					ModelData0.method3377(var1); // L: 101
				} else if (this.isIgnored(var2)) { // L: 104
					WorldMapRegion.method609(var1); // L: 105
				} else {
					UserComparator9.method3492(var1); // L: 108
				}
			}
		}
	} // L: 94 98 102 106 109

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-12193"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field888 != 1; // L: 141
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1984933223"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 148
			Username var2 = new Username(var1, this.loginType); // L: 149
			if (var2.hasCleanName()) { // L: 150
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) { // L: 151
					var10000 = null; // L: 153
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					WorldMapRectangle.addGameMessage(30, "", var4); // L: 155
				} else if (WorldMapLabelSize.localPlayer.username.equals(var2)) { // L: 160
					var10000 = null; // L: 162
					var4 = "You can't add yourself to your own ignore list";
					WorldMapRectangle.addGameMessage(30, "", var4); // L: 164
				} else {
					Object var10001;
					if (this.isIgnored(var2)) { // L: 169
						var10000 = (new StringBuilder()).append(var1); // L: 171
						var10001 = null;
						var4 = var10000.append(" is already on your ignore list").toString();
						WorldMapRectangle.addGameMessage(30, "", var4); // L: 173
					} else if (this.isFriended(var2, false)) { // L: 178
						var10000 = new StringBuilder();
						var10001 = null; // L: 180
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your friend list first").toString();
						WorldMapRectangle.addGameMessage(30, "", var4); // L: 182
					} else {
						PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher); // L: 189
						var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1)); // L: 190
						var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 191
						Client.packetWriter.addNode(var3); // L: 192
					}
				}
			}
		}
	} // L: 158 167 176 185 194

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field888 != 1; // L: 197
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1937520523"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 204
			Username var2 = new Username(var1, this.loginType); // L: 205
			if (var2.hasCleanName()) { // L: 206
				if (this.friendsList.removeByUsername(var2)) { // L: 207
					Client.field870 = Client.cycleCntr; // L: 209
					PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher); // L: 212
					var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1)); // L: 213
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 214
					Client.packetWriter.addNode(var3); // L: 215
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 218
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 219
					var4.clearIsFriend(); // L: 220
				}

				class89.method2127(); // L: 222
				if (Entity.clanChat != null) { // L: 223
					Entity.clanChat.clearFriends(); // L: 224
				}

			}
		}
	} // L: 227

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1683783285"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 230
			Username var2 = new Username(var1, this.loginType); // L: 231
			if (var2.hasCleanName()) { // L: 232
				if (this.ignoreList.removeByUsername(var2)) { // L: 233
					Client.field870 = Client.cycleCntr; // L: 235
					PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher); // L: 238
					var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1)); // L: 239
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 240
					Client.packetWriter.addNode(var3); // L: 241
				}

				KitDefinition.FriendSystem_invalidateIgnoreds(); // L: 243
			}
		}
	} // L: 244

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "-1919732460"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 256
		return var2 != null && var2.hasWorld(); // L: 257
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "-2171031"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 33
		if (var1 != null) { // L: 34
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 35
			var1 = new KitDefinition(); // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIILgk;Lft;B)Z",
		garbageValue = "6"
	)
	static final boolean method1976(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 308
		int var6 = var1; // L: 309
		byte var7 = 64; // L: 310
		byte var8 = 64; // L: 311
		int var9 = var0 - var7; // L: 312
		int var10 = var1 - var8; // L: 313
		class182.directions[var7][var8] = 99; // L: 314
		class182.distances[var7][var8] = 0; // L: 315
		byte var11 = 0; // L: 316
		int var12 = 0; // L: 317
		class182.bufferX[var11] = var0; // L: 318
		int var20 = var11 + 1;
		class182.bufferY[var11] = var1; // L: 319
		int[][] var13 = var4.flags; // L: 320

		while (true) {
			label311:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label288:
							do {
								if (var20 == var12) { // L: 321
									class182.field2135 = var5; // L: 440
									class182.field2136 = var6; // L: 441
									return false; // L: 442
								}

								var5 = class182.bufferX[var12]; // L: 322
								var6 = class182.bufferY[var12]; // L: 323
								var12 = var12 + 1 & 4095; // L: 324
								var18 = var5 - var9; // L: 325
								var19 = var6 - var10; // L: 326
								var14 = var5 - var4.xInset; // L: 327
								var15 = var6 - var4.yInset; // L: 328
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 329
									class182.field2135 = var5; // L: 330
									class182.field2136 = var6; // L: 331
									return true; // L: 332
								}

								var16 = class182.distances[var18][var19] + 1; // L: 334
								if (var18 > 0 && class182.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 335 336 337 338
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 - 1; // L: 342
											class182.bufferY[var20] = var6; // L: 343
											var20 = var20 + 1 & 4095; // L: 344
											class182.directions[var18 - 1][var19] = 2; // L: 345
											class182.distances[var18 - 1][var19] = var16; // L: 346
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) { // L: 340
											break;
										}

										++var17; // L: 339
									}
								}

								if (var18 < 128 - var2 && class182.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 348 349 350 351
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 + 1; // L: 355
											class182.bufferY[var20] = var6; // L: 356
											var20 = var20 + 1 & 4095; // L: 357
											class182.directions[var18 + 1][var19] = 8; // L: 358
											class182.distances[var18 + 1][var19] = var16; // L: 359
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 353
											break;
										}

										++var17; // L: 352
									}
								}

								if (var19 > 0 && class182.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 361 362 363 364
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5; // L: 368
											class182.bufferY[var20] = var6 - 1; // L: 369
											var20 = var20 + 1 & 4095; // L: 370
											class182.directions[var18][var19 - 1] = 1; // L: 371
											class182.distances[var18][var19 - 1] = var16; // L: 372
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 366
											break;
										}

										++var17; // L: 365
									}
								}

								if (var19 < 128 - var2 && class182.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 374 375 376 377
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5; // L: 381
											class182.bufferY[var20] = var6 + 1; // L: 382
											var20 = var20 + 1 & 4095; // L: 383
											class182.directions[var18][var19 + 1] = 4; // L: 384
											class182.distances[var18][var19 + 1] = var16; // L: 385
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) { // L: 379
											break;
										}

										++var17; // L: 378
									}
								}

								if (var18 > 0 && var19 > 0 && class182.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 387 388 389
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 - 1; // L: 394
											class182.bufferY[var20] = var6 - 1; // L: 395
											var20 = var20 + 1 & 4095; // L: 396
											class182.directions[var18 - 1][var19 - 1] = 3; // L: 397
											class182.distances[var18 - 1][var19 - 1] = var16; // L: 398
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 391 392
											break;
										}

										++var17; // L: 390
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class182.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 400 401 402
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 + 1; // L: 407
											class182.bufferY[var20] = var6 - 1; // L: 408
											var20 = var20 + 1 & 4095; // L: 409
											class182.directions[var18 + 1][var19 - 1] = 9; // L: 410
											class182.distances[var18 + 1][var19 - 1] = var16; // L: 411
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 404 405
											break;
										}

										++var17; // L: 403
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class182.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 413 414 415
									for (var17 = 1; var17 < var2; ++var17) { // L: 416
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 417 418
											continue label288;
										}
									}

									class182.bufferX[var20] = var5 - 1; // L: 420
									class182.bufferY[var20] = var6 + 1; // L: 421
									var20 = var20 + 1 & 4095; // L: 422
									class182.directions[var18 - 1][var19 + 1] = 6; // L: 423
									class182.distances[var18 - 1][var19 + 1] = var16; // L: 424
								}
							} while(var18 >= 128 - var2); // L: 426
						} while(var19 >= 128 - var2);
					} while(class182.directions[var18 + 1][var19 + 1] != 0); // L: 427
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 428

				for (var17 = 1; var17 < var2; ++var17) { // L: 429
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 430 431
						continue label311;
					}
				}

				class182.bufferX[var20] = var5 + 1; // L: 433
				class182.bufferY[var20] = var6 + 1; // L: 434
				var20 = var20 + 1 & 4095; // L: 435
				class182.directions[var18 + 1][var19 + 1] = 12; // L: 436
				class182.distances[var18 + 1][var19 + 1] = var16; // L: 437
			}
		}
	}
}
