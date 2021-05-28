import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1631160541
	)
	public static int field428;
	@ObfuscatedName("j")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1797165253
	)
	public static int field418;
	@ObfuscatedName("c")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 881118859
	)
	int field435;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 2377200656236085237L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1181152315
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -908602587
	)
	int field425;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1178073075
	)
	int field426;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 7200649757382554285L
	)
	long field427;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -847045713
	)
	int field436;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1580986367
	)
	int field422;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -70989363
	)
	int field430;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -1818884622277911111L
	)
	long field431;
	@ObfuscatedName("i")
	boolean field432;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1875393861
	)
	int field433;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	PcmStream[] field434;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	PcmStream[] field439;

	protected PcmPlayer() {
		this.field435 = 32; // L: 22
		this.timeMs = ObjectComposition.currentTimeMillis(); // L: 23
		this.field427 = 0L; // L: 27
		this.field436 = 0; // L: 28
		this.field422 = 0; // L: 29
		this.field430 = 0; // L: 30
		this.field431 = 0L; // L: 31
		this.field432 = true; // L: 32
		this.field433 = 0; // L: 38
		this.field434 = new PcmStream[8]; // L: 39
		this.field439 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 277

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-6942"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-42"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("y")
	@Export("write")
	protected void write() throws Exception {
	} // L: 284

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4345"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2070498959"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lbm;B)V",
		garbageValue = "46"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 76
	} // L: 77

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 80
			long var1 = ObjectComposition.currentTimeMillis(); // L: 81

			try {
				if (0L != this.field427) { // L: 83
					if (var1 < this.field427) { // L: 84
						return;
					}

					this.open(this.capacity); // L: 85
					this.field427 = 0L; // L: 86
					this.field432 = true; // L: 87
				}

				int var3 = this.position(); // L: 89
				if (this.field430 - var3 > this.field436) { // L: 90
					this.field436 = this.field430 - var3;
				}

				int var4 = this.field426 + this.field425; // L: 91
				if (var4 + 256 > 16384) { // L: 92
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 93
					this.capacity += 1024; // L: 94
					if (this.capacity > 16384) { // L: 95
						this.capacity = 16384;
					}

					this.close(); // L: 96
					this.open(this.capacity); // L: 97
					var3 = 0; // L: 98
					this.field432 = true; // L: 99
					if (var4 + 256 > this.capacity) { // L: 100
						var4 = this.capacity - 256; // L: 101
						this.field426 = var4 - this.field425; // L: 102
					}
				}

				while (var3 < var4) { // L: 105
					this.fill(this.samples, 256); // L: 106
					this.write(); // L: 107
					var3 += 256; // L: 108
				}

				if (var1 > this.field431) { // L: 110
					if (!this.field432) { // L: 111
						if (this.field436 == 0 && this.field422 == 0) { // L: 112
							this.close(); // L: 113
							this.field427 = 2000L + var1; // L: 114
							return; // L: 115
						}

						this.field426 = Math.min(this.field422, this.field436); // L: 117
						this.field422 = this.field436; // L: 118
					} else {
						this.field432 = false; // L: 120
					}

					this.field436 = 0; // L: 121
					this.field431 = 2000L + var1; // L: 122
				}

				this.field430 = var3; // L: 124
			} catch (Exception var7) { // L: 126
				this.close(); // L: 127
				this.field427 = var1 + 2000L; // L: 128
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 131
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 132
					this.skip(256); // L: 133
					this.timeMs += (long)(256000 / field428); // L: 134
				}
			} catch (Exception var6) { // L: 137
				this.timeMs = var1; // L: 138
			}

		}
	} // L: 140

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1062568016"
	)
	public final void method733() {
		this.field432 = true; // L: 143
	} // L: 144

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "955250326"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field432 = true; // L: 147

		try {
			this.discard(); // L: 149
		} catch (Exception var2) { // L: 151
			this.close(); // L: 152
			this.field427 = ObjectComposition.currentTimeMillis() + 2000L; // L: 153
		}

	} // L: 155

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106105090"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Message.soundSystem != null) { // L: 158
			boolean var1 = true; // L: 159

			for (int var2 = 0; var2 < 2; ++var2) { // L: 160
				if (this == Message.soundSystem.players[var2]) { // L: 161
					Message.soundSystem.players[var2] = null;
				}

				if (Message.soundSystem.players[var2] != null) { // L: 162
					var1 = false;
				}
			}

			if (var1) { // L: 164
				Huffman.soundSystemExecutor.shutdownNow(); // L: 165
				Huffman.soundSystemExecutor = null; // L: 166
				Message.soundSystem = null; // L: 167
			}
		}

		this.close(); // L: 170
		this.samples = null; // L: 171
	} // L: 172

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1429485953"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field433 -= var1; // L: 175
		if (this.field433 < 0) {
			this.field433 = 0; // L: 176
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 177
		}

	} // L: 178

	@ObfuscatedName("ai")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 182
		if (PcmPlayer_stereo) { // L: 183
			var3 = var2 << 1;
		}

		class306.clearIntArray(var1, 0, var3); // L: 184
		this.field433 -= var2; // L: 185
		if (this.stream != null && this.field433 <= 0) { // L: 186
			this.field433 += field428 >> 4; // L: 187
			FloorOverlayDefinition.PcmStream_disable(this.stream); // L: 188
			this.method738(this.stream, this.stream.vmethod987()); // L: 189
			int var4 = 0; // L: 190
			int var5 = 255; // L: 191

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) { // L: 192
				int var7;
				int var8;
				if (var6 < 0) { // L: 195
					var7 = var6 & 3; // L: 196
					var8 = -(var6 >> 2); // L: 197
				} else {
					var7 = var6; // L: 200
					var8 = 0; // L: 201
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 203 205
					if ((var9 & 1) != 0) { // L: 208
						var5 &= ~(1 << var7); // L: 211
						var10 = null; // L: 212
						PcmStream var11 = this.field434[var7]; // L: 213

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 214
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 215
								if (var12 != null && var12.position > var8) { // L: 216
									var5 |= 1 << var7; // L: 217
									var10 = var11; // L: 218
									var11 = var11.after; // L: 219
								} else {
									var11.active = true; // L: 222
									int var13 = var11.vmethod4610(); // L: 223
									var4 += var13; // L: 224
									if (var12 != null) { // L: 225
										var12.position += var13;
									}

									if (var4 >= this.field435) { // L: 226
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 227
									if (var14 != null) { // L: 228
										for (int var15 = var11.field494; var14 != null; var14 = var11.nextSubStream()) { // L: 229 230 232
											this.method738(var14, var15 * var14.vmethod987() >> 8); // L: 231
										}
									}

									PcmStream var18 = var11.after; // L: 235
									var11.after = null; // L: 236
									if (var10 == null) { // L: 237
										this.field434[var7] = var18;
									} else {
										var10.after = var18; // L: 238
									}

									if (var18 == null) { // L: 239
										this.field439[var7] = var10;
									}

									var11 = var18; // L: 240
								}
							}
						}
					}

					var7 += 4; // L: 204
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 244
				PcmStream var16 = this.field434[var6]; // L: 245
				PcmStream[] var17 = this.field434; // L: 246
				this.field439[var6] = null; // L: 248

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 249 250
					var10 = var16.after; // L: 251
					var16.after = null;
				}
			}
		}

		if (this.field433 < 0) {
			this.field433 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ObjectComposition.currentTimeMillis();
	} // L: 260

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbm;II)V",
		garbageValue = "-1859037567"
	)
	final void method738(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field439[var3];
		if (var4 == null) {
			this.field434[var3] = var1;
		} else {
			var4.after = var1; // L: 272
		}

		this.field439[var3] = var1; // L: 273
		var1.field494 = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "-1728648073"
	)
	static final void method750(PacketBuffer var0) {
		int var1 = 0; // L: 252
		var0.importIndex(); // L: 253

		byte[] var10000;
		int var2;
		int var4;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 254
			var8 = Players.Players_indices[var2]; // L: 255
			if ((Players.field1370[var8] & 1) == 0) { // L: 256
				if (var1 > 0) { // L: 257
					--var1; // L: 258
					var10000 = Players.field1370; // L: 259
					var10000[var8] = (byte)(var10000[var8] | 2);
				} else {
					var4 = var0.readBits(1); // L: 262
					if (var4 == 0) { // L: 263
						var6 = var0.readBits(2); // L: 266
						if (var6 == 0) { // L: 268
							var7 = 0;
						} else if (var6 == 1) { // L: 269
							var7 = var0.readBits(5);
						} else if (var6 == 2) { // L: 270
							var7 = var0.readBits(8);
						} else {
							var7 = var0.readBits(11); // L: 271
						}

						var1 = var7; // L: 274
						var10000 = Players.field1370; // L: 275
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						ItemComposition.readPlayerUpdate(var0, var8); // L: 278
					}
				}
			}
		}

		var0.exportIndex(); // L: 281
		if (var1 != 0) { // L: 282
			throw new RuntimeException(); // L: 283
		} else {
			var0.importIndex(); // L: 285

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 286
				var8 = Players.Players_indices[var2]; // L: 287
				if ((Players.field1370[var8] & 1) != 0) { // L: 288
					if (var1 > 0) { // L: 289
						--var1; // L: 290
						var10000 = Players.field1370; // L: 291
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						var4 = var0.readBits(1); // L: 294
						if (var4 == 0) { // L: 295
							var6 = var0.readBits(2); // L: 298
							if (var6 == 0) { // L: 300
								var7 = 0;
							} else if (var6 == 1) { // L: 301
								var7 = var0.readBits(5);
							} else if (var6 == 2) { // L: 302
								var7 = var0.readBits(8);
							} else {
								var7 = var0.readBits(11); // L: 303
							}

							var1 = var7; // L: 306
							var10000 = Players.field1370; // L: 307
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							ItemComposition.readPlayerUpdate(var0, var8); // L: 310
						}
					}
				}
			}

			var0.exportIndex(); // L: 313
			if (var1 != 0) { // L: 314
				throw new RuntimeException(); // L: 315
			} else {
				var0.importIndex(); // L: 317

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 318
					var8 = Players.Players_emptyIndices[var2]; // L: 319
					if ((Players.field1370[var8] & 1) != 0) { // L: 320
						if (var1 > 0) { // L: 321
							--var1; // L: 322
							var10000 = Players.field1370; // L: 323
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							var4 = var0.readBits(1); // L: 326
							if (var4 == 0) { // L: 327
								var6 = var0.readBits(2); // L: 330
								if (var6 == 0) { // L: 332
									var7 = 0;
								} else if (var6 == 1) { // L: 333
									var7 = var0.readBits(5);
								} else if (var6 == 2) {
									var7 = var0.readBits(8); // L: 334
								} else {
									var7 = var0.readBits(11); // L: 335
								}

								var1 = var7; // L: 338
								var10000 = Players.field1370; // L: 339
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else if (ParamComposition.updateExternalPlayer(var0, var8)) { // L: 342
								var10000 = Players.field1370;
								var10000[var8] = (byte)(var10000[var8] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 345
				if (var1 != 0) { // L: 346
					throw new RuntimeException(); // L: 347
				} else {
					var0.importIndex(); // L: 349

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 350
						var8 = Players.Players_emptyIndices[var2]; // L: 351
						if ((Players.field1370[var8] & 1) == 0) { // L: 352
							if (var1 > 0) { // L: 353
								--var1; // L: 354
								var10000 = Players.field1370; // L: 355
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else {
								var4 = var0.readBits(1); // L: 358
								if (var4 == 0) { // L: 359
									var6 = var0.readBits(2); // L: 362
									if (var6 == 0) { // L: 364
										var7 = 0;
									} else if (var6 == 1) { // L: 365
										var7 = var0.readBits(5);
									} else if (var6 == 2) { // L: 366
										var7 = var0.readBits(8);
									} else {
										var7 = var0.readBits(11); // L: 367
									}

									var1 = var7; // L: 370
									var10000 = Players.field1370; // L: 371
									var10000[var8] = (byte)(var10000[var8] | 2);
								} else if (ParamComposition.updateExternalPlayer(var0, var8)) { // L: 374
									var10000 = Players.field1370;
									var10000[var8] = (byte)(var10000[var8] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 377
					if (var1 != 0) { // L: 378
						throw new RuntimeException(); // L: 379
					} else {
						Players.Players_count = 0; // L: 381
						Players.Players_emptyIdxCount = 0; // L: 382

						for (var2 = 1; var2 < 2048; ++var2) { // L: 383
							var10000 = Players.field1370; // L: 384
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 385
							if (var3 != null) { // L: 386
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 387
							}
						}

					}
				}
			}
		}
	} // L: 389

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-572457964"
	)
	static final void method786(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7618
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7619
				Client.field780[var4] = true;
			}
		}

	} // L: 7621
}
