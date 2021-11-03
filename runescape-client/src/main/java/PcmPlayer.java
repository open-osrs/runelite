import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("g")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1710206631
	)
	public static int field272;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("t")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1114914311
	)
	int field254;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -139627477628549521L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -964657999
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -169687701
	)
	int field264;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 275810673
	)
	int field258;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 7412881241186270643L
	)
	long field259;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1880549509
	)
	int field251;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 672902205
	)
	int field253;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -390982901
	)
	int field261;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -127582275051913285L
	)
	long field263;
	@ObfuscatedName("v")
	boolean field257;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1176592889
	)
	int field267;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field268;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field269;

	protected PcmPlayer() {
		this.field254 = 32; // L: 22
		this.timeMs = class111.method2516(); // L: 23
		this.field259 = 0L; // L: 27
		this.field251 = 0; // L: 28
		this.field253 = 0; // L: 29
		this.field261 = 0; // L: 30
		this.field263 = 0L; // L: 31
		this.field257 = true; // L: 32
		this.field267 = 0; // L: 38
		this.field268 = new PcmStream[8]; // L: 39
		this.field269 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "122369223"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1689594693"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("a")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1440644043"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)V",
		garbageValue = "242678028"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "971942949"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = class111.method2516(); // L: 77

			try {
				if (this.field259 != 0L) { // L: 79
					if (var1 < this.field259) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field259 = 0L; // L: 82
					this.field257 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field261 - var3 > this.field251) { // L: 86
					this.field251 = this.field261 - var3;
				}

				int var4 = this.field258 + this.field264; // L: 87
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
					this.field257 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field258 = var4 - this.field264; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field263) { // L: 106
					if (!this.field257) { // L: 107
						if (this.field251 == 0 && this.field253 == 0) { // L: 108
							this.close(); // L: 109
							this.field259 = var1 + 2000L; // L: 110
							return; // L: 111
						}

						this.field258 = Math.min(this.field253, this.field251); // L: 113
						this.field253 = this.field251; // L: 114
					} else {
						this.field257 = false; // L: 116
					}

					this.field251 = 0; // L: 117
					this.field263 = var1 + 2000L; // L: 118
				}

				this.field261 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field259 = var1 + 2000L; // L: 124
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / UserComparator2.field4359); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2104373839"
	)
	public final void method750() {
		this.field257 = true; // L: 139
	} // L: 140

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31692"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field257 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field259 = class111.method2516() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1720419183"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class122.soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == class122.soundSystem.players[var2]) { // L: 157
					class122.soundSystem.players[var2] = null;
				}

				if (class122.soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				class381.soundSystemExecutor.shutdownNow(); // L: 161
				class381.soundSystemExecutor = null; // L: 162
				class122.soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1660525629"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field267 -= var1; // L: 171
		if (this.field267 < 0) {
			this.field267 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("ag")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class321.clearIntArray(var1, 0, var3); // L: 180
		this.field267 -= var2; // L: 181
		if (this.stream != null && this.field267 <= 0) { // L: 182
			this.field267 += UserComparator2.field4359 >> 4; // L: 183
			KitDefinition.PcmStream_disable(this.stream); // L: 184
			this.method719(this.stream, this.stream.vmethod974()); // L: 185
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
						PcmStream var11 = this.field268[var7]; // L: 209

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
									int var13 = var11.vmethod4958(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) {
										var12.position += var13; // L: 221
									}

									if (var4 >= this.field254) { // L: 222
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field320; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method719(var14, var15 * var14.vmethod974() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field268[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field269[var7] = var10;
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
				PcmStream var16 = this.field268[var6]; // L: 241
				PcmStream[] var17 = this.field268; // L: 242
				this.field269[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field267 < 0) { // L: 253
			this.field267 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = class111.method2516(); // L: 255
	} // L: 256

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lav;IS)V",
		garbageValue = "2601"
	)
	final void method719(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field269[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field268[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field269[var3] = var1; // L: 269
		var1.field320 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "-1238015178"
	)
	static void method757(GameEngine var0) {
		while (WorldMapElement.isKeyDown()) { // L: 1513
			if (class12.field55 == 13) { // L: 1514
				class10.method104(); // L: 1515
				return; // L: 1516
			}

			if (class12.field55 == 96) { // L: 1518
				if (Login.worldSelectPage > 0 && UserComparator6.worldSelectLeftSprite != null) { // L: 1519
					--Login.worldSelectPage; // L: 1520
				}
			} else if (class12.field55 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && MouseRecorder.worldSelectRightSprite != null) { // L: 1523 1524
				++Login.worldSelectPage; // L: 1525
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1529
			int var1 = Login.xPadding + 280; // L: 1530
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1531
				PlayerType.changeWorldSelectSorting(0, 0); // L: 1532
				return; // L: 1533
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1535
				PlayerType.changeWorldSelectSorting(0, 1); // L: 1536
				return; // L: 1537
			}

			int var2 = Login.xPadding + 390; // L: 1539
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1540
				PlayerType.changeWorldSelectSorting(1, 0); // L: 1541
				return; // L: 1542
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1544
				PlayerType.changeWorldSelectSorting(1, 1); // L: 1545
				return; // L: 1546
			}

			int var3 = Login.xPadding + 500; // L: 1548
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1549
				PlayerType.changeWorldSelectSorting(2, 0); // L: 1550
				return; // L: 1551
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1553
				PlayerType.changeWorldSelectSorting(2, 1); // L: 1554
				return; // L: 1555
			}

			int var4 = Login.xPadding + 610; // L: 1557
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1558
				PlayerType.changeWorldSelectSorting(3, 0); // L: 1559
				return; // L: 1560
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1562
				PlayerType.changeWorldSelectSorting(3, 1); // L: 1563
				return; // L: 1564
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1566
				class10.method104(); // L: 1567
				return; // L: 1568
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1570
				World var5 = WorldMapEvent.World_worlds[Login.hoveredWorldIndex]; // L: 1571
				MidiPcmStream.changeWorld(var5); // L: 1572
				class10.method104(); // L: 1573
				return; // L: 1574
			}

			if (Login.worldSelectPage > 0 && UserComparator6.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= UserComparator6.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= KeyHandler.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= KeyHandler.canvasHeight / 2 + 50) { // L: 1576
				--Login.worldSelectPage; // L: 1577
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && MouseRecorder.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - MouseRecorder.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= KeyHandler.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= KeyHandler.canvasHeight / 2 + 50) { // L: 1579
				++Login.worldSelectPage; // L: 1580
			}
		}

	} // L: 1583
}
