import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 410930349
	)
	static int field1449;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 445943663
	)
	public static int field1442;
	@ObfuscatedName("q")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("be")
	@Export("worldListURL")
	static String worldListURL;
	@ObfuscatedName("x")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -420218683
	)
	int field1438;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -2584674083897744543L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2101974297
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1733688779
	)
	int field1441;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1246439087
	)
	int field1454;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -2737488179381108627L
	)
	long field1432;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 704933067
	)
	int field1444;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1488004649
	)
	int field1445;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2114790969
	)
	int field1435;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -7835668176490123993L
	)
	long field1456;
	@ObfuscatedName("i")
	boolean field1448;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1431776873
	)
	int field1450;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	PcmStream[] field1451;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	PcmStream[] field1452;

	protected PcmPlayer() {
		this.field1438 = 32; // L: 22
		this.timeMs = User.currentTimeMillis(); // L: 23
		this.field1432 = 0L; // L: 27
		this.field1444 = 0; // L: 28
		this.field1445 = 0; // L: 29
		this.field1435 = 0; // L: 30
		this.field1456 = 0L; // L: 31
		this.field1448 = true; // L: 32
		this.field1450 = 0; // L: 38
		this.field1451 = new PcmStream[8]; // L: 39
		this.field1452 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-906788639"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612241013"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1393012391"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "-239504049"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = User.currentTimeMillis(); // L: 77

			try {
				if (0L != this.field1432) { // L: 79
					if (var1 < this.field1432) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field1432 = 0L; // L: 82
					this.field1448 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field1435 - var3 > this.field1444) { // L: 86
					this.field1444 = this.field1435 - var3;
				}

				int var4 = this.field1441 + this.field1454; // L: 87
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
					this.field1448 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field1454 = var4 - this.field1441; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field1456) { // L: 106
					if (!this.field1448) { // L: 107
						if (this.field1444 == 0 && this.field1445 == 0) { // L: 108
							this.close(); // L: 109
							this.field1432 = 2000L + var1; // L: 110
							return; // L: 111
						}

						this.field1454 = Math.min(this.field1445, this.field1444); // L: 113
						this.field1445 = this.field1444; // L: 114
					} else {
						this.field1448 = false; // L: 116
					}

					this.field1444 = 0; // L: 117
					this.field1456 = 2000L + var1; // L: 118
				}

				this.field1435 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field1432 = var1 + 2000L; // L: 124
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / field1442); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-170851511"
	)
	public final void method2562() {
		this.field1448 = true; // L: 139
	} // L: 140

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2091297211"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1448 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field1432 = User.currentTimeMillis() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (WorldMapDecoration.soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == WorldMapDecoration.soundSystem.players[var2]) { // L: 157
					WorldMapDecoration.soundSystem.players[var2] = null;
				}

				if (WorldMapDecoration.soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				RunException.soundSystemExecutor.shutdownNow(); // L: 161
				RunException.soundSystemExecutor = null; // L: 162
				WorldMapDecoration.soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "79"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1450 -= var1; // L: 171
		if (this.field1450 < 0) {
			this.field1450 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("ab")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class311.clearIntArray(var1, 0, var3); // L: 180
		this.field1450 -= var2; // L: 181
		if (this.stream != null && this.field1450 <= 0) { // L: 182
			this.field1450 += field1442 >> 4; // L: 183
			Client.PcmStream_disable(this.stream);
			this.method2606(this.stream, this.stream.vmethod2850());
			int var4 = 0;
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
						PcmStream var11 = this.field1451[var7]; // L: 209

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
									int var13 = var11.vmethod4043(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) {
										var12.position += var13; // L: 221
									}

									if (var4 >= this.field1438) { // L: 222
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field1520; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method2606(var14, var15 * var14.vmethod2850() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field1451[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field1452[var7] = var10;
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
				PcmStream var16 = this.field1451[var6]; // L: 241
				PcmStream[] var17 = this.field1451; // L: 242
				this.field1452[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field1450 < 0) { // L: 253
			this.field1450 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = User.currentTimeMillis(); // L: 255
	} // L: 256

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lde;II)V",
		garbageValue = "750775441"
	)
	final void method2606(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field1452[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field1451[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field1452[var3] = var1; // L: 269
		var1.field1520 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1294994184"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 184
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 185
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 186
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lje;I)Z",
		garbageValue = "-1268197096"
	)
	static boolean method2598(ObjectDefinition var0) {
		if (var0.transforms != null) { // L: 633
			int[] var1 = var0.transforms; // L: 635

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 636
				int var3 = var1[var2]; // L: 637
				ObjectDefinition var4 = ScriptEvent.getObjectDefinition(var3); // L: 639
				if (var4.mapIconId != -1) { // L: 640
					return true; // L: 641
				}
			}
		} else if (var0.mapIconId != -1) { // L: 647
			return true; // L: 648
		}

		return false; // L: 650
	}
}
