import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2104703857
	)
	public static int field394;
	@ObfuscatedName("e")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("c")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1516229081
	)
	int field386;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -4287014230983004767L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2087539793
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 846758933
	)
	int field395;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -970388059
	)
	int field396;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -2154226267889325457L
	)
	long field397;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2102380923
	)
	int field402;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -395356405
	)
	int field399;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 97839813
	)
	int field400;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 7909474248429099415L
	)
	long field398;
	@ObfuscatedName("y")
	boolean field390;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 214387207
	)
	int field403;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field401;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field393;

	protected PcmPlayer() {
		this.field386 = 32; // L: 22
		this.timeMs = ObjectSound.currentTimeMillis(); // L: 23
		this.field397 = 0L; // L: 27
		this.field402 = 0; // L: 28
		this.field399 = 0; // L: 29
		this.field400 = 0; // L: 30
		this.field398 = 0L; // L: 31
		this.field390 = true; // L: 32
		this.field403 = 0; // L: 38
		this.field401 = new PcmStream[8]; // L: 39
		this.field393 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "757289607"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1868594255"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1317116866"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("p")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)V",
		garbageValue = "-192979862"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1348614677"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = ObjectSound.currentTimeMillis(); // L: 77

			try {
				if (0L != this.field397) { // L: 79
					if (var1 < this.field397) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field397 = 0L; // L: 82
					this.field390 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field400 - var3 > this.field402) { // L: 86
					this.field402 = this.field400 - var3;
				}

				int var4 = this.field396 + this.field395; // L: 87
				if (var4 + 256 > 16384) { // L: 88
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 89
					this.capacity += 1024; // L: 90
					if (this.capacity > 16384) { // L: 91
						this.capacity = 16384;
					}

					this.close(); // L: 92
					this.open(this.capacity); // L: 93
					var3 = 0; // L: 94
					this.field390 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field396 = var4 - this.field395; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field398) { // L: 106
					if (!this.field390) { // L: 107
						if (this.field402 == 0 && this.field399 == 0) { // L: 108
							this.close(); // L: 109
							this.field397 = 2000L + var1; // L: 110
							return; // L: 111
						}

						this.field396 = Math.min(this.field399, this.field402); // L: 113
						this.field399 = this.field402; // L: 114
					} else {
						this.field390 = false; // L: 116
					}

					this.field402 = 0; // L: 117
					this.field398 = 2000L + var1; // L: 118
				}

				this.field400 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field397 = var1 + 2000L; // L: 124
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / field394); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "650769052"
	)
	public final void method807() {
		this.field390 = true; // L: 139
	} // L: 140

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field390 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field397 = ObjectSound.currentTimeMillis() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796301171"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class0.soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == class0.soundSystem.players[var2]) { // L: 157
					class0.soundSystem.players[var2] = null;
				}

				if (class0.soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				class34.soundSystemExecutor.shutdownNow(); // L: 161
				class34.soundSystemExecutor = null; // L: 162
				class0.soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1654322502"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field403 -= var1; // L: 171
		if (this.field403 < 0) {
			this.field403 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("am")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class305.clearIntArray(var1, 0, var3); // L: 180
		this.field403 -= var2; // L: 181
		if (this.stream != null && this.field403 <= 0) { // L: 182
			this.field403 += field394 >> 4; // L: 183
			class238.PcmStream_disable(this.stream); // L: 184
			this.method812(this.stream, this.stream.vmethod1039()); // L: 185
			int var4 = 0; // L: 186
			int var5 = 255; // L: 187

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 188
				int var7;
				int var8;
				if (var6 < 0) { // L: 191
					var7 = var6 & 3; // L: 192
					var8 = -(var6 >> 2); // L: 193
				} else {
					var7 = var6; // L: 196
					var8 = 0; // L: 197
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 199 201
					if ((var9 & 1) != 0) { // L: 204
						var5 &= ~(1 << var7); // L: 207
						var10 = null; // L: 208
						PcmStream var11 = this.field401[var7]; // L: 209

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 210
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 211
								if (var12 != null && var12.position > var8) { // L: 212
									var5 |= 1 << var7; // L: 213
									var10 = var11; // L: 214
									var11 = var11.after; // L: 215
								} else {
									var11.active = true; // L: 218
									int var13 = var11.vmethod4124(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) {
										var12.position += var13; // L: 221
									}

									if (var4 >= this.field386) { // L: 222
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field454; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method812(var14, var15 * var14.vmethod1039() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field401[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field393[var7] = var10;
									}

									var11 = var18; // L: 236
								}
							}
						}
					}

					var7 += 4; // L: 200
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 240
				PcmStream var16 = this.field401[var6]; // L: 241
				PcmStream[] var17 = this.field401; // L: 242
				this.field393[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field403 < 0) { // L: 253
			this.field403 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = ObjectSound.currentTimeMillis(); // L: 255
	} // L: 256

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "-48"
	)
	final void method812(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field393[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field401[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field393[var3] = var1; // L: 269
		var1.field454 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-618234199"
	)
	static final void method857(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 443
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 444
			Player var3 = Client.players[var2]; // L: 445
			int var4 = var0.readUnsignedByte(); // L: 446
			if ((var4 & 4) != 0) { // L: 447
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = -1; // L: 449
			int var6;
			int var7;
			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) { // L: 450
				var6 = var0.method6610(); // L: 451
				int var8;
				int var11;
				int var16;
				if (var6 > 0) { // L: 452
					for (var7 = 0; var7 < var6; ++var7) { // L: 453
						var9 = -1; // L: 455
						var10 = -1; // L: 456
						var11 = -1; // L: 457
						var8 = var0.readUShortSmart(); // L: 458
						if (var8 == 32767) { // L: 459
							var8 = var0.readUShortSmart(); // L: 460
							var10 = var0.readUShortSmart(); // L: 461
							var9 = var0.readUShortSmart(); // L: 462
							var11 = var0.readUShortSmart(); // L: 463
						} else if (var8 != 32766) { // L: 465
							var10 = var0.readUShortSmart(); // L: 466
						} else {
							var8 = -1; // L: 468
						}

						var16 = var0.readUShortSmart(); // L: 469
						var3.addHitSplat(var8, var10, var9, var11, Client.cycle, var16); // L: 470
					}
				}

				var7 = var0.method6610(); // L: 473
				if (var7 > 0) { // L: 474
					for (var8 = 0; var8 < var7; ++var8) { // L: 475
						var9 = var0.readUShortSmart(); // L: 476
						var10 = var0.readUShortSmart(); // L: 477
						if (var10 != 32767) { // L: 478
							var11 = var0.readUShortSmart(); // L: 479
							var16 = var0.method6610(); // L: 480
							var13 = var10 > 0 ? var0.method6609() : var16; // L: 481
							var3.addHealthBar(var9, Client.cycle, var10, var11, var16, var13); // L: 482
						} else {
							var3.removeHealthBar(var9); // L: 484
						}
					}
				}
			}

			if ((var4 & 2) != 0) { // L: 488
				var3.targetIndex = var0.method6617(); // L: 489
				if (var3.targetIndex == 65535) { // L: 490
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 8192) != 0) { // L: 492
				for (var6 = 0; var6 < 3; ++var6) { // L: 493
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 8) != 0) { // L: 495
				var6 = var0.method6610(); // L: 496
				byte[] var14 = new byte[var6]; // L: 497
				Buffer var15 = new Buffer(var14); // L: 498
				var0.readBytes(var14, 0, var6); // L: 499
				Players.field1352[var2] = var15; // L: 500
				var3.read(var15); // L: 501
			}

			if ((var4 & 512) != 0) { // L: 503
				Players.field1351[var2] = var0.method6584(); // L: 504
			}

			if ((var4 & 64) != 0) { // L: 506
				var3.field1237 = var0.method6766(); // L: 507
				if (var3.pathLength == 0) { // L: 508
					var3.orientation = var3.field1237; // L: 509
					var3.field1237 = -1; // L: 510
				}
			}

			if ((var4 & 256) != 0) { // L: 513
				var3.field1240 = var0.method6678(); // L: 514
				var3.field1253 = var0.method6612(); // L: 515
				var3.field1252 = var0.readByte(); // L: 516
				var3.field1239 = var0.method6612(); // L: 517
				var3.field1255 = var0.method6617() + Client.cycle; // L: 518
				var3.field1268 = var0.method6766() + Client.cycle; // L: 519
				var3.field1213 = var0.method6617(); // L: 520
				if (var3.field1189) { // L: 521
					var3.field1240 += var3.tileX; // L: 522
					var3.field1253 += var3.tileY; // L: 523
					var3.field1252 += var3.tileX; // L: 524
					var3.field1239 += var3.tileY; // L: 525
					var3.pathLength = 0; // L: 526
				} else {
					var3.field1240 += var3.pathX[0]; // L: 529
					var3.field1253 += var3.pathY[0]; // L: 530
					var3.field1252 += var3.pathX[0]; // L: 531
					var3.field1239 += var3.pathY[0]; // L: 532
					var3.pathLength = 1; // L: 533
				}

				var3.field1224 = 0; // L: 535
			}

			if ((var4 & 128) != 0) { // L: 537
				var6 = var0.readUnsignedShort(); // L: 538
				PlayerType var20 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var0.readUnsignedByte()); // L: 539
				boolean var18 = var0.method6610() == 1; // L: 540
				var9 = var0.method6609(); // L: 541
				var10 = var0.offset; // L: 542
				if (var3.username != null && var3.appearance != null) { // L: 543
					boolean var19 = false; // L: 544
					if (var20.isUser && class13.friendSystem.isIgnored(var3.username)) { // L: 545 546
						var19 = true;
					}

					if (!var19 && Client.field716 == 0 && !var3.isHidden) { // L: 548
						Players.field1362.offset = 0; // L: 549
						var0.method6630(Players.field1362.array, 0, var9); // L: 550
						Players.field1362.offset = 0; // L: 551
						String var12 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(Players.field1362))); // L: 552
						var3.overheadText = var12.trim(); // L: 553
						var3.overheadTextColor = var6 >> 8; // L: 554
						var3.overheadTextEffect = var6 & 255; // L: 555
						var3.overheadTextCyclesRemaining = 150; // L: 556
						var3.isAutoChatting = var18; // L: 557
						var3.field1208 = var3 != Varcs.localPlayer && var20.isUser && "" != Client.field824 && var12.toLowerCase().indexOf(Client.field824) == -1; // L: 558
						if (var20.isPrivileged) { // L: 560
							var13 = var18 ? 91 : 1;
						} else {
							var13 = var18 ? 90 : 2; // L: 561
						}

						if (var20.modIcon != -1) { // L: 562
							class69.addGameMessage(var13, class337.method5986(var20.modIcon) + var3.username.getName(), var12);
						} else {
							class69.addGameMessage(var13, var3.username.getName(), var12); // L: 563
						}
					}
				}

				var0.offset = var10 + var9; // L: 566
			}

			if ((var4 & 2048) != 0) { // L: 568
				var5 = var0.method6678(); // L: 569
			}

			if ((var4 & 1024) != 0) { // L: 571
				var3.spotAnimation = var0.method6617(); // L: 572
				var6 = var0.method6627(); // L: 573
				var3.field1238 = var6 >> 16; // L: 574
				var3.field1249 = (var6 & 65535) + Client.cycle; // L: 575
				var3.spotAnimationFrame = 0; // L: 576
				var3.spotAnimationFrameCycle = 0; // L: 577
				if (var3.field1249 > Client.cycle) { // L: 578
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 579
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 32) != 0) { // L: 581
				var6 = var0.method6617(); // L: 582
				if (var6 == 65535) { // L: 583
					var6 = -1;
				}

				var7 = var0.method6623(); // L: 584
				class32.performPlayerAnimation(var3, var6, var7); // L: 585
			}

			if ((var4 & 1) != 0) { // L: 587
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 588
				if (var3.overheadText.charAt(0) == '~') { // L: 589
					var3.overheadText = var3.overheadText.substring(1); // L: 590
					class69.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 591
				} else if (var3 == Varcs.localPlayer) { // L: 593
					class69.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 594
				}

				var3.isAutoChatting = false; // L: 596
				var3.overheadTextColor = 0; // L: 597
				var3.overheadTextEffect = 0; // L: 598
				var3.overheadTextCyclesRemaining = 150; // L: 599
			}

			if (var3.field1189) { // L: 601
				if (var5 == 127) { // L: 602
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					byte var17;
					if (var5 != -1) { // L: 605
						var17 = var5;
					} else {
						var17 = Players.field1351[var2]; // L: 606
					}

					var3.method2120(var3.tileX, var3.tileY, var17); // L: 607
				}
			}
		}

	} // L: 613

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "276170039"
	)
	static int method837(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3469
			class16.Interpreter_intStackSize -= 2; // L: 3470
			Client.field855 = (short)TileItem.method2266(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]); // L: 3471
			if (Client.field855 <= 0) { // L: 3472
				Client.field855 = 256;
			}

			Client.field856 = (short)TileItem.method2266(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 3473
			if (Client.field856 <= 0) { // L: 3474
				Client.field856 = 256;
			}

			return 1; // L: 3475
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3477
			class16.Interpreter_intStackSize -= 2; // L: 3478
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3479
			if (Client.zoomHeight <= 0) { // L: 3480
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3481
			if (Client.zoomWidth <= 0) { // L: 3482
				Client.zoomWidth = 320;
			}

			return 1; // L: 3483
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3485
			class16.Interpreter_intStackSize -= 4; // L: 3486
			Client.field859 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3487
			if (Client.field859 <= 0) { // L: 3488
				Client.field859 = 1;
			}

			Client.field742 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3489
			if (Client.field742 <= 0) { // L: 3490
				Client.field742 = 32767;
			} else if (Client.field742 < Client.field859) { // L: 3491
				Client.field742 = Client.field859;
			}

			Client.field707 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 3492
			if (Client.field707 <= 0) { // L: 3493
				Client.field707 = 1;
			}

			Client.field862 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3]; // L: 3494
			if (Client.field862 <= 0) { // L: 3495
				Client.field862 = 32767;
			} else if (Client.field862 < Client.field707) { // L: 3496
				Client.field862 = Client.field707;
			}

			return 1; // L: 3497
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3499
			if (Client.viewportWidget != null) { // L: 3500
				Bounds.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3501
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3502
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3503
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3506
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3507
			}

			return 1; // L: 3509
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3511
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3512
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3513
			return 1; // L: 3514
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3516
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ClientPreferences.method2221(Client.field855); // L: 3517
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ClientPreferences.method2221(Client.field856); // L: 3518
			return 1; // L: 3519
		} else if (var0 == 6220) { // L: 3521
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3522
			return 1; // L: 3523
		} else if (var0 == 6221) { // L: 3525
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3526
			return 1; // L: 3527
		} else if (var0 == 6222) { // L: 3529
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.canvasWidth; // L: 3530
			return 1; // L: 3531
		} else if (var0 == 6223) { // L: 3533
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameEngine.canvasHeight; // L: 3534
			return 1; // L: 3535
		} else {
			return 2; // L: 3537
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "434222247"
	)
	static boolean method855() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4062
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lhu;III)V",
		garbageValue = "-2082124704"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10914
			if (var0 != null && class13.method220(var0) != null) { // L: 10915
				Client.clickedWidget = var0; // L: 10916
				Client.clickedWidgetParent = class13.method220(var0); // L: 10917
				Client.widgetClickX = var1; // L: 10918
				Client.widgetClickY = var2; // L: 10919
				class34.widgetDragDuration = 0; // L: 10920
				Client.isDraggingWidget = false; // L: 10921
				int var3 = Client.menuOptionsCount - 1; // L: 10924
				if (var3 != -1) { // L: 10927
					class25.tempMenuAction = new MenuAction(); // L: 10928
					class25.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 10929
					class25.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 10930
					class25.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 10931
					class25.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 10932
					class25.tempMenuAction.action = Client.menuActions[var3]; // L: 10933
				}

			}
		}
	} // L: 10935
}
