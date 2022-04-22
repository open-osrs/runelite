import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1674990359
	)
	static int field294;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -100861485
	)
	public static int field268;
	@ObfuscatedName("n")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -876322285
	)
	static int field295;
	@ObfuscatedName("ax")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("k")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 219086691
	)
	int field292;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 7132959178591486869L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1707278451
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 918986377
	)
	int field289;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1421867195
	)
	int field279;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 9027155764200073789L
	)
	long field280;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -742253307
	)
	int field281;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -220533853
	)
	int field275;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -220706099
	)
	int field283;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -5317730937569531851L
	)
	long field284;
	@ObfuscatedName("h")
	boolean field285;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -473229249
	)
	int field277;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Laf;"
	)
	PcmStream[] field272;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Laf;"
	)
	PcmStream[] field290;

	protected PcmPlayer() {
		this.field292 = 32; // L: 22
		this.timeMs = class136.method2931(); // L: 23
		this.field280 = 0L; // L: 27
		this.field281 = 0; // L: 28
		this.field275 = 0; // L: 29
		this.field283 = 0; // L: 30
		this.field284 = 0L; // L: 31
		this.field285 = true; // L: 32
		this.field277 = 0; // L: 38
		this.field272 = new PcmStream[8]; // L: 39
		this.field290 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-843995592"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1651380399"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "244839095"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("f")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1662003992"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1137884684"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Laf;I)V",
		garbageValue = "-1433712556"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-941854175"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class136.method2931();

			try {
				if (this.field280 != 0L) {
					if (var1 < this.field280) {
						return;
					}

					this.open(this.capacity);
					this.field280 = 0L;
					this.field285 = true;
				}

				int var3 = this.position();
				if (this.field283 - var3 > this.field281) {
					this.field281 = this.field283 - var3;
				}

				int var4 = this.field279 + this.field289;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field285 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field279 = var4 - this.field289;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field284) {
					if (!this.field285) {
						if (this.field281 == 0 && this.field275 == 0) {
							this.close();
							this.field280 = var1 + 2000L; // L: 117
							return;
						}

						this.field279 = Math.min(this.field275, this.field281); // L: 120
						this.field275 = this.field281; // L: 121
					} else {
						this.field285 = false; // L: 123
					}

					this.field281 = 0; // L: 124
					this.field284 = 2000L + var1; // L: 125
				}

				this.field283 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field280 = 2000L + var1; // L: 131
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field268); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1721057511"
	)
	public final void method690() {
		this.field285 = true; // L: 146
	} // L: 147

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1697875178"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field285 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field280 = class136.method2931() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class6.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class6.soundSystem.players[var2]) {
					class6.soundSystem.players[var2] = null; // L: 164
				}

				if (class6.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				WorldMapSection1.soundSystemExecutor.shutdownNow(); // L: 168
				WorldMapSection1.soundSystemExecutor = null; // L: 169
				class6.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "2048"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field277 -= var1; // L: 178
		if (this.field277 < 0) {
			this.field277 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("am")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class350.clearIntArray(var1, 0, var3); // L: 187
		this.field277 -= var2; // L: 188
		if (this.stream != null && this.field277 <= 0) { // L: 189
			this.field277 += field268 >> 4; // L: 190
			class296.PcmStream_disable(this.stream); // L: 191
			this.method695(this.stream, this.stream.vmethod962()); // L: 192
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
						PcmStream var11 = this.field272[var7]; // L: 216

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
									int var13 = var11.vmethod5441(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) { // L: 228
										var12.position += var13;
									}

									if (var4 >= this.field292) { // L: 229
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field343; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method695(var14, var15 * var14.vmethod962() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field272[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field290[var7] = var10;
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
				PcmStream var16 = this.field272[var6]; // L: 248
				PcmStream[] var17 = this.field272; // L: 249
				this.field290[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field277 < 0) { // L: 260
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = class136.method2931(); // L: 262
	} // L: 263

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Laf;IS)V",
		garbageValue = "195"
	)
	final void method695(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field290[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field272[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field290[var3] = var1; // L: 276
		var1.field343 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbd;",
		garbageValue = "1634234442"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 80
		Buffer var2 = new Buffer(var0); // L: 81
		var2.offset = var2.array.length - 2; // L: 82
		int var3 = var2.readUnsignedShort(); // L: 83
		int var4 = var2.array.length - 2 - var3 - 12; // L: 84
		var2.offset = var4; // L: 85
		int var5 = var2.readInt(); // L: 86
		var1.localIntCount = var2.readUnsignedShort(); // L: 87
		var1.localStringCount = var2.readUnsignedShort(); // L: 88
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 89
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 90
		int var6 = var2.readUnsignedByte(); // L: 91
		int var7;
		int var8;
		if (var6 > 0) { // L: 92
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 93

			for (var7 = 0; var7 < var6; ++var7) { // L: 94
				var8 = var2.readUnsignedShort(); // L: 95
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class67.method1909(var8) : 1); // L: 96
				var1.switches[var7] = var9; // L: 97

				while (var8-- > 0) { // L: 98
					int var10 = var2.readInt(); // L: 99
					int var11 = var2.readInt(); // L: 100
					var9.put(new IntegerNode(var11), (long)var10); // L: 101
				}
			}
		}

		var2.offset = 0; // L: 105
		var1.field954 = var2.readStringCp1252NullTerminatedOrNull(); // L: 106
		var1.opcodes = new int[var5]; // L: 107
		var1.intOperands = new int[var5]; // L: 108
		var1.stringOperands = new String[var5]; // L: 109

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 110 111 116
			var8 = var2.readUnsignedShort(); // L: 112
			if (var8 == 3) { // L: 113
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 114
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 115
			}
		}

		return var1; // L: 118
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "42"
	)
	public static int method746(CharSequence var0, int var1) {
		return class263.method5178(var0, var1, true); // L: 71
	}
}
