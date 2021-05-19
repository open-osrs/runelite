import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 74532615
	)
	public static int field401;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -866267341
	)
	static int field405;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("r")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -490357665
	)
	int field402;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -9009804721100139371L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 878578447
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -733571391
	)
	int field400;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1308000535
	)
	int field406;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6126918723449100817L
	)
	long field407;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -912602509
	)
	int field408;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -843557291
	)
	int field409;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1543102679
	)
	int field396;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 211548958469134193L
	)
	long field411;
	@ObfuscatedName("n")
	boolean field412;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1771576573
	)
	int field403;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field415;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field416;

	protected PcmPlayer() {
		this.field402 = 32; // L: 22
		this.timeMs = Archive.currentTimeMillis(); // L: 23
		this.field407 = 0L; // L: 27
		this.field408 = 0; // L: 28
		this.field409 = 0; // L: 29
		this.field396 = 0; // L: 30
		this.field411 = 0L; // L: 31
		this.field412 = true; // L: 32
		this.field403 = 0; // L: 38
		this.field415 = new PcmStream[8]; // L: 39
		this.field416 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996880040"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1272180581"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-10918"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("g")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1221564732"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbt;B)V",
		garbageValue = "-8"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = Archive.currentTimeMillis(); // L: 88

			try {
				if (0L != this.field407) { // L: 90
					if (var1 < this.field407) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field407 = 0L; // L: 93
					this.field412 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field396 - var3 > this.field408) { // L: 97
					this.field408 = this.field396 - var3;
				}

				int var4 = this.field400 + this.field406; // L: 98
				if (var4 + 256 > 16384) { // L: 99
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 100
					this.capacity += 1024; // L: 101
					if (this.capacity > 16384) { // L: 102
						this.capacity = 16384;
					}

					this.close(); // L: 103
					this.open(this.capacity); // L: 104
					var3 = 0; // L: 105
					this.field412 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field406 = var4 - this.field400; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field411) { // L: 117
					if (!this.field412) { // L: 118
						if (this.field408 == 0 && this.field409 == 0) { // L: 119
							this.close(); // L: 120
							this.field407 = 2000L + var1; // L: 121
							return; // L: 122
						}

						this.field406 = Math.min(this.field409, this.field408); // L: 124
						this.field409 = this.field408; // L: 125
					} else {
						this.field412 = false; // L: 127
					}

					this.field408 = 0; // L: 128
					this.field411 = var1 + 2000L; // L: 129
				}

				this.field396 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field407 = var1 + 2000L; // L: 135
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field401); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-615521568"
	)
	public final void method794() {
		this.field412 = true; // L: 150
	} // L: 151

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field412 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field407 = Archive.currentTimeMillis() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null; // L: 168
				}

				if (soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class337.soundSystemExecutor.shutdownNow(); // L: 172
				class337.soundSystemExecutor = null; // L: 173
				soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2095717179"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field403 -= var1; // L: 182
		if (this.field403 < 0) {
			this.field403 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("n")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (ApproximateRouteStrategy.PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class306.clearIntArray(var1, 0, var3); // L: 191
		this.field403 -= var2; // L: 192
		if (this.stream != null && this.field403 <= 0) { // L: 193
			this.field403 += field401 >> 4; // L: 194
			class386.PcmStream_disable(this.stream); // L: 195
			this.method799(this.stream, this.stream.vmethod1044()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) { // L: 199
				int var7;
				int var8;
				if (var6 < 0) { // L: 202
					var7 = var6 & 3; // L: 203
					var8 = -(var6 >> 2); // L: 204
				} else {
					var7 = var6; // L: 207
					var8 = 0; // L: 208
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 210 212
					if ((var9 & 1) != 0) { // L: 215
						var5 &= ~(1 << var7); // L: 218
						var10 = null; // L: 219
						PcmStream var11 = this.field415[var7]; // L: 220

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod4560(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) { // L: 232
										var12.position += var13;
									}

									if (var4 >= this.field402) { // L: 233
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field469; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method799(var14, var15 * var14.vmethod1044() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field415[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field416[var7] = var10;
									}

									var11 = var18; // L: 247
								}
							}
						}
					}

					var7 += 4; // L: 211
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 251
				PcmStream var16 = this.field415[var6]; // L: 252
				PcmStream[] var17 = this.field415; // L: 253
				this.field416[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field403 < 0) { // L: 264
			this.field403 = 0;
		}

		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Archive.currentTimeMillis(); // L: 266
	} // L: 267

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "0"
	)
	final void method799(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field416[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field415[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field416[var3] = var1; // L: 280
		var1.field469 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "678860256"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5418
			int var3 = SceneTilePaint.getTileHeight(var0, var1, ParamComposition.Client_plane) - var2; // L: 5423
			var0 -= class20.cameraX; // L: 5424
			var3 -= Skeleton.cameraY; // L: 5425
			var1 -= WorldMapDecoration.cameraZ; // L: 5426
			int var4 = Rasterizer3D.Rasterizer3D_sine[class1.cameraPitch]; // L: 5427
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class1.cameraPitch]; // L: 5428
			int var6 = Rasterizer3D.Rasterizer3D_sine[HealthBarDefinition.cameraYaw]; // L: 5429
			int var7 = Rasterizer3D.Rasterizer3D_cosine[HealthBarDefinition.cameraYaw]; // L: 5430
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5431
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5432
			var0 = var8; // L: 5433
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5434
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5435
			if (var1 >= 50) { // L: 5437
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5438
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5439
			} else {
				Client.viewportTempX = -1; // L: 5442
				Client.viewportTempY = -1; // L: 5443
			}

		} else {
			Client.viewportTempX = -1; // L: 5419
			Client.viewportTempY = -1; // L: 5420
		}
	} // L: 5421 5445
}
