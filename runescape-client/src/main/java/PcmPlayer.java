import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("w")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("h")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 722877979
	)
	int field284;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -5703185867842976777L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2075578253
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 114915137
	)
	int field298;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -690684053
	)
	int field288;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 4521790688810739283L
	)
	long field280;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -702543021
	)
	int field290;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1097572003
	)
	int field291;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1396809547
	)
	int field292;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 3233827279749364883L
	)
	long field293;
	@ObfuscatedName("y")
	boolean field294;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 204749631
	)
	int field295;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lai;"
	)
	PcmStream[] field296;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lai;"
	)
	PcmStream[] field285;

	protected PcmPlayer() {
		this.field284 = 32; // L: 22
		this.timeMs = Ignored.method6459(); // L: 23
		this.field280 = 0L; // L: 27
		this.field290 = 0; // L: 28
		this.field291 = 0; // L: 29
		this.field292 = 0; // L: 30
		this.field293 = 0L; // L: 31
		this.field294 = true; // L: 32
		this.field295 = 0; // L: 38
		this.field296 = new PcmStream[8]; // L: 39
		this.field285 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993652709"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 277

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-865384228"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 278

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2142020678"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 281
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() throws Exception {
	} // L: 284

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	@Export("close")
	protected void close() {
	} // L: 285

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-514018891"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 286

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "-193761027"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 76
	} // L: 77

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "29619557"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 80
			long var1 = Ignored.method6459(); // L: 81

			try {
				if (0L != this.field280) { // L: 83
					if (var1 < this.field280) { // L: 84
						return;
					}

					this.open(this.capacity); // L: 85
					this.field280 = 0L; // L: 86
					this.field294 = true; // L: 87
				}

				int var3 = this.position(); // L: 89
				if (this.field292 - var3 > this.field290) { // L: 90
					this.field290 = this.field292 - var3;
				}

				int var4 = this.field288 + this.field298; // L: 91
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
					this.field294 = true; // L: 99
					if (var4 + 256 > this.capacity) { // L: 100
						var4 = this.capacity - 256; // L: 101
						this.field288 = var4 - this.field298; // L: 102
					}
				}

				while (var3 < var4) { // L: 105
					this.fill(this.samples, 256); // L: 106
					this.write(); // L: 107
					var3 += 256; // L: 108
				}

				if (var1 > this.field293) { // L: 110
					if (!this.field294) { // L: 111
						if (this.field290 == 0 && this.field291 == 0) { // L: 112
							this.close(); // L: 113
							this.field280 = 2000L + var1; // L: 114
							return; // L: 115
						}

						this.field288 = Math.min(this.field291, this.field290); // L: 117
						this.field291 = this.field290; // L: 118
					} else {
						this.field294 = false; // L: 120
					}

					this.field290 = 0; // L: 121
					this.field293 = 2000L + var1; // L: 122
				}

				this.field292 = var3; // L: 124
			} catch (Exception var7) { // L: 126
				this.close(); // L: 127
				this.field280 = 2000L + var1; // L: 128
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 131
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 132
					this.skip(256); // L: 133
					this.timeMs += (long)(256000 / class339.field4058); // L: 134
				}
			} catch (Exception var6) { // L: 137
				this.timeMs = var1; // L: 138
			}

		}
	} // L: 140

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1599335992"
	)
	public final void method747() {
		this.field294 = true; // L: 143
	} // L: 144

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-101835154"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field294 = true; // L: 147

		try {
			this.discard(); // L: 149
		} catch (Exception var2) { // L: 151
			this.close(); // L: 152
			this.field280 = Ignored.method6459() + 2000L; // L: 153
		}

	} // L: 155

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-917395831"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 158
			boolean var1 = true; // L: 159

			for (int var2 = 0; var2 < 2; ++var2) { // L: 160
				if (this == soundSystem.players[var2]) { // L: 161
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 162
					var1 = false;
				}
			}

			if (var1) { // L: 164
				soundSystemExecutor.shutdownNow(); // L: 165
				soundSystemExecutor = null; // L: 166
				soundSystem = null; // L: 167
			}
		}

		this.close(); // L: 170
		this.samples = null; // L: 171
	} // L: 172

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1441903742"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field295 -= var1; // L: 175
		if (this.field295 < 0) {
			this.field295 = 0; // L: 176
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 177
		}

	} // L: 178

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 182
		if (SpriteMask.PcmPlayer_stereo) { // L: 183
			var3 = var2 << 1;
		}

		class333.clearIntArray(var1, 0, var3); // L: 184
		this.field295 -= var2; // L: 185
		if (this.stream != null && this.field295 <= 0) { // L: 186
			this.field295 += class339.field4058 >> 4; // L: 187
			class10.PcmStream_disable(this.stream); // L: 188
			this.method751(this.stream, this.stream.vmethod991()); // L: 189
			int var4 = 0; // L: 190
			int var5 = 255; // L: 191

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field296[var7]; // L: 213

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 214
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 215
								if (var12 != null && var12.position > var8) { // L: 216
									var5 |= 1 << var7; // L: 217
									var10 = var11; // L: 218
									var11 = var11.after; // L: 219
								} else {
									var11.active = true; // L: 222
									int var13 = var11.vmethod5260(); // L: 223
									var4 += var13; // L: 224
									if (var12 != null) {
										var12.position += var13; // L: 225
									}

									if (var4 >= this.field284) { // L: 226
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 227
									if (var14 != null) { // L: 228
										for (int var15 = var11.field346; var14 != null; var14 = var11.nextSubStream()) { // L: 229 230 232
											this.method751(var14, var15 * var14.vmethod991() >> 8); // L: 231
										}
									}

									PcmStream var18 = var11.after; // L: 235
									var11.after = null; // L: 236
									if (var10 == null) { // L: 237
										this.field296[var7] = var18;
									} else {
										var10.after = var18; // L: 238
									}

									if (var18 == null) { // L: 239
										this.field285[var7] = var10;
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
				PcmStream var16 = this.field296[var6]; // L: 245
				PcmStream[] var17 = this.field296; // L: 246
				this.field285[var6] = null; // L: 248

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 249 250 253
					var10 = var16.after; // L: 251
					var16.after = null; // L: 252
				}
			}
		}

		if (this.field295 < 0) { // L: 257
			this.field295 = 0;
		}

		if (this.stream != null) { // L: 258
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Ignored.method6459(); // L: 259
	} // L: 260

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lai;IB)V",
		garbageValue = "-65"
	)
	final void method751(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 269
		PcmStream var4 = this.field285[var3]; // L: 270
		if (var4 == null) { // L: 271
			this.field296[var3] = var1;
		} else {
			var4.after = var1; // L: 272
		}

		this.field285[var3] = var1; // L: 273
		var1.field346 = var2; // L: 274
	} // L: 275
}
