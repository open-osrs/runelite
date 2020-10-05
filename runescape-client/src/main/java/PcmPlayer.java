import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1149689047
	)
	public static int field1447;
	@ObfuscatedName("o")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("w")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		longValue = 2634650448797948467L
	)
	static long field1430;
	@ObfuscatedName("a")
	protected int[] samples;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	PcmStream stream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1444527341
	)
	int field1435;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -2930435928401446917L
	)
	long timeMs;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -149687327
	)
	int capacity;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1461747439
	)
	int field1438;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 813792905
	)
	int field1451;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -2022966020506386053L
	)
	long field1440;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1855020445
	)
	int field1446;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1127622439
	)
	int field1442;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1705628685
	)
	int field1443;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 4977190421454866475L
	)
	long field1444;
	@ObfuscatedName("e")
	boolean field1445;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -83389805
	)
	int field1441;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	PcmStream[] field1448;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	PcmStream[] field1449;

	protected PcmPlayer() {
		this.field1435 = 32; // L: 22
		this.timeMs = PacketWriter.currentTimeMillis(); // L: 23
		this.field1440 = 0L; // L: 27
		this.field1446 = 0; // L: 28
		this.field1442 = 0; // L: 29
		this.field1443 = 0; // L: 30
		this.field1444 = 0L; // L: 31
		this.field1445 = true; // L: 32
		this.field1441 = 0; // L: 38
		this.field1448 = new PcmStream[8]; // L: 39
		this.field1449 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-841767260"
	)
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("t")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "667465439"
	)
	protected void close() {
	} // L: 288

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2027971398"
	)
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ldc;I)V",
		garbageValue = "35825022"
	)
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1677504744"
	)
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = PacketWriter.currentTimeMillis(); // L: 84

			try {
				if (this.field1440 != 0L) { // L: 86
					if (var1 < this.field1440) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field1440 = 0L; // L: 89
					this.field1445 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field1443 - var3 > this.field1446) { // L: 93
					this.field1446 = this.field1443 - var3;
				}

				int var4 = this.field1451 + this.field1438; // L: 94
				if (var4 + 256 > 16384) { // L: 95
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 96
					this.capacity += 1024; // L: 97
					if (this.capacity > 16384) { // L: 98
						this.capacity = 16384;
					}

					this.close(); // L: 99
					this.open(this.capacity); // L: 100
					var3 = 0; // L: 101
					this.field1445 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field1451 = var4 - this.field1438; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field1444) { // L: 113
					if (!this.field1445) { // L: 114
						if (this.field1446 == 0 && this.field1442 == 0) { // L: 115
							this.close(); // L: 116
							this.field1440 = 2000L + var1; // L: 117
							return; // L: 118
						}

						this.field1451 = Math.min(this.field1442, this.field1446); // L: 120
						this.field1442 = this.field1446; // L: 121
					} else {
						this.field1445 = false; // L: 123
					}

					this.field1446 = 0; // L: 124
					this.field1444 = 2000L + var1; // L: 125
				}

				this.field1443 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field1440 = var1 + 2000L; // L: 131
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field1447); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142907235"
	)
	public final void method2517() {
		this.field1445 = true; // L: 146
	} // L: 147

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "30633041"
	)
	public final synchronized void tryDiscard() {
		this.field1445 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field1440 = PacketWriter.currentTimeMillis() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2048322330"
	)
	public final synchronized void shutdown() {
		if (class1.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class1.soundSystem.players[var2]) { // L: 164
					class1.soundSystem.players[var2] = null;
				}

				if (class1.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				class1.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2014217671"
	)
	final void skip(int var1) {
		this.field1441 -= var1; // L: 178
		if (this.field1441 < 0) {
			this.field1441 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("au")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class310.clearIntArray(var1, 0, var3); // L: 187
		this.field1441 -= var2; // L: 188
		if (this.stream != null && this.field1441 <= 0) { // L: 189
			this.field1441 += field1447 >> 4; // L: 190
			PacketBufferNode.PcmStream_disable(this.stream); // L: 191
			this.method2522(this.stream, this.stream.vmethod2837()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 195
				int var7;
				int var8;
				if (var6 < 0) { // L: 198
					var7 = var6 & 3; // L: 199
					var8 = -(var6 >> 2); // L: 200
				} else {
					var7 = var6; // L: 203
					var8 = 0; // L: 204
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 206 208
					if ((var9 & 1) != 0) { // L: 211
						var5 &= ~(1 << var7); // L: 214
						var10 = null; // L: 215
						PcmStream var11 = this.field1448[var7]; // L: 216

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod3987(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field1435) { // L: 229
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field1519; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method2522(var14, var15 * var14.vmethod2837() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field1448[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field1449[var7] = var10;
									}

									var11 = var18; // L: 243
								}
							}
						}
					}

					var7 += 4; // L: 207
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 247
				PcmStream var16 = this.field1448[var6]; // L: 248
				PcmStream[] var17 = this.field1448; // L: 249
				this.field1449[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field1441 < 0) { // L: 260
			this.field1441 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = PacketWriter.currentTimeMillis(); // L: 262
	} // L: 263

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldc;II)V",
		garbageValue = "-1443703786"
	)
	final void method2522(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field1449[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field1448[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field1449[var3] = var1; // L: 276
		var1.field1519 = var2; // L: 277
	} // L: 278
}
