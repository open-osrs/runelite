import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -804003183
	)
	public static int field1443;
	@ObfuscatedName("j")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1343221865
	)
	static int field1424;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("c")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1633759265
	)
	int field1425;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -8429726973010117483L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1292607887
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1569726481
	)
	int field1431;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -246859759
	)
	int field1432;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 3904158006998688263L
	)
	long field1433;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1780329359
	)
	int field1427;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1504765301
	)
	int field1435;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -727818553
	)
	int field1436;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -674058996011130719L
	)
	long field1437;
	@ObfuscatedName("d")
	boolean field1422;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 977089873
	)
	int field1439;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	PcmStream[] field1440;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	PcmStream[] field1428;

	protected PcmPlayer() {
		this.field1425 = 32; // L: 22
		this.timeMs = class298.currentTimeMillis(); // L: 23
		this.field1433 = 0L; // L: 27
		this.field1427 = 0; // L: 28
		this.field1435 = 0; // L: 29
		this.field1436 = 0; // L: 30
		this.field1437 = 0L; // L: 31
		this.field1422 = true; // L: 32
		this.field1439 = 0;
		this.field1440 = new PcmStream[8]; // L: 39
		this.field1428 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3677"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("w")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-310479525"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "2012600293"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2081423658"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = class298.currentTimeMillis(); // L: 88

			try {
				if (this.field1433 != 0L) { // L: 90
					if (var1 < this.field1433) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field1433 = 0L; // L: 93
					this.field1422 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field1436 - var3 > this.field1427) { // L: 97
					this.field1427 = this.field1436 - var3;
				}

				int var4 = this.field1431 + this.field1432; // L: 98
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
					this.field1422 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field1432 = var4 - this.field1431; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field1437) { // L: 117
					if (!this.field1422) { // L: 118
						if (this.field1427 == 0 && this.field1435 == 0) { // L: 119
							this.close(); // L: 120
							this.field1433 = var1 + 2000L; // L: 121
							return; // L: 122
						}

						this.field1432 = Math.min(this.field1435, this.field1427); // L: 124
						this.field1435 = this.field1427; // L: 125
					} else {
						this.field1422 = false; // L: 127
					}

					this.field1427 = 0; // L: 128
					this.field1437 = var1 + 2000L; // L: 129
				}

				this.field1436 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field1433 = var1 + 2000L; // L: 135
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field1443); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-764201060"
	)
	public final void method2485() {
		this.field1422 = true; // L: 150
	} // L: 151

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1507981291"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1422 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field1433 = class298.currentTimeMillis() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65535"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == soundSystem.players[var2]) { // L: 168
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				InterfaceParent.soundSystemExecutor.shutdownNow(); // L: 172
				InterfaceParent.soundSystemExecutor = null; // L: 173
				soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1439 -= var1; // L: 182
		if (this.field1439 < 0) {
			this.field1439 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("aq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class311.clearIntArray(var1, 0, var3); // L: 191
		this.field1439 -= var2; // L: 192
		if (this.stream != null && this.field1439 <= 0) { // L: 193
			this.field1439 += field1443 >> 4; // L: 194
			Varcs.PcmStream_disable(this.stream); // L: 195
			this.method2492(this.stream, this.stream.vmethod2800()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field1440[var7]; // L: 220

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod3927(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) { // L: 232
										var12.position += var13;
									}

									if (var4 >= this.field1425) { // L: 233
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field1508; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method2492(var14, var15 * var14.vmethod2800() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field1440[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field1428[var7] = var10;
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
				PcmStream var16 = this.field1440[var6]; // L: 252
				PcmStream[] var17 = this.field1440; // L: 253
				this.field1428[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field1439 < 0) { // L: 264
			this.field1439 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 265
		}

		this.timeMs = class298.currentTimeMillis(); // L: 266
	} // L: 267

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IB)V",
		garbageValue = "-108"
	)
	final void method2492(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field1428[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field1440[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field1428[var3] = var1; // L: 280
		var1.field1508 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;Lib;B)V",
		garbageValue = "47"
	)
	public static void method2538(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 35
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 36
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 37
	} // L: 38

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1085535536"
	)
	static final int method2544(int var0, int var1) {
		int var2 = class4.method56(45365 + var0, var1 + 91923, 4) - 128 + (class4.method56(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class4.method56(var0, var1, 1) - 128 >> 2); // L: 811
		var2 = (int)(0.3D * (double)var2) + 35; // L: 812
		if (var2 < 10) { // L: 813
			var2 = 10;
		} else if (var2 > 60) { // L: 814
			var2 = 60;
		}

		return var2; // L: 815
	}
}
