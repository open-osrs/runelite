import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -1524812773
	)
	static int field302;
	@ObfuscatedName("n")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("j")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1674689975
	)
	int field289;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -146289790672909629L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2098648259
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 901701685
	)
	int field282;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1678649401
	)
	int field286;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -962258044052042289L
	)
	long field287;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 674233675
	)
	int field288;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 327498169
	)
	int field285;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1102402763
	)
	int field294;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -8423144863370094901L
	)
	long field291;
	@ObfuscatedName("i")
	boolean field292;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1149709291
	)
	int field298;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lal;"
	)
	PcmStream[] field295;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lal;"
	)
	PcmStream[] field296;

	protected PcmPlayer() {
		this.field289 = 32; // L: 22
		this.timeMs = WorldMapSprite.method4989(); // L: 23
		this.field287 = 0L; // L: 27
		this.field288 = 0; // L: 28
		this.field285 = 0; // L: 29
		this.field294 = 0; // L: 30
		this.field291 = 0L; // L: 31
		this.field292 = true; // L: 32
		this.field298 = 0; // L: 38
		this.field295 = new PcmStream[8]; // L: 39
		this.field296 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "5561"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
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
		garbageValue = "-1892762612"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-476108420"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lal;I)V",
		garbageValue = "646054771"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1960857341"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = WorldMapSprite.method4989(); // L: 88

			try {
				if (this.field287 != 0L) { // L: 90
					if (var1 < this.field287) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field287 = 0L; // L: 93
					this.field292 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field294 - var3 > this.field288) { // L: 97
					this.field288 = this.field294 - var3;
				}

				int var4 = this.field282 + this.field286; // L: 98
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
					this.field292 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field286 = var4 - this.field282; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field291) { // L: 117
					if (!this.field292) { // L: 118
						if (this.field288 == 0 && this.field285 == 0) { // L: 119
							this.close(); // L: 120
							this.field287 = var1 + 2000L; // L: 121
							return; // L: 122
						}

						this.field286 = Math.min(this.field285, this.field288); // L: 124
						this.field285 = this.field288; // L: 125
					} else {
						this.field292 = false; // L: 127
					}

					this.field288 = 0; // L: 128
					this.field291 = var1 + 2000L; // L: 129
				}

				this.field294 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field287 = 2000L + var1; // L: 135
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / SecureRandomFuture.field949); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2105118710"
	)
	public final void method722() {
		this.field292 = true; // L: 150
	} // L: 151

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "323324362"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field287 = WorldMapSprite.method4989() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (VarpDefinition.soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == VarpDefinition.soundSystem.players[var2]) { // L: 168
					VarpDefinition.soundSystem.players[var2] = null;
				}

				if (VarpDefinition.soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class342.soundSystemExecutor.shutdownNow(); // L: 172
				class342.soundSystemExecutor = null; // L: 173
				VarpDefinition.soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1425453165"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field298 -= var1; // L: 182
		if (this.field298 < 0) {
			this.field298 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class350.clearIntArray(var1, 0, var3); // L: 191
		this.field298 -= var2; // L: 192
		if (this.stream != null && this.field298 <= 0) { // L: 193
			this.field298 += SecureRandomFuture.field949 >> 4; // L: 194
			class341.PcmStream_disable(this.stream); // L: 195
			this.method727(this.stream, this.stream.vmethod968()); // L: 196
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
						PcmStream var11 = this.field295[var7]; // L: 220

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
									int var13 = var11.vmethod5476(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) { // L: 232
										var12.position += var13;
									}

									if (var4 >= this.field289) { // L: 233
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) {
										for (int var15 = var11.field349; var14 != null; var14 = var11.nextSubStream()) { // L: 237 239
											this.method727(var14, var15 * var14.vmethod968() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field295[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field296[var7] = var10;
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
				PcmStream var16 = this.field295[var6]; // L: 252
				PcmStream[] var17 = this.field295; // L: 253
				this.field296[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field298 < 0) { // L: 264
			this.field298 = 0;
		}

		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = WorldMapSprite.method4989(); // L: 266
	} // L: 267

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lal;II)V",
		garbageValue = "98012473"
	)
	final void method727(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field296[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field295[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field296[var3] = var1; // L: 280
		var1.field349 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("n")
	public static int method771(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 69
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-291155965"
	)
	public static boolean method772(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field125[var0] : false; // L: 235 236
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "1622893485"
	)
	static int method770(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4639
			class295.Interpreter_intStackSize -= 5; // L: 4640
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4641
			return 1; // L: 4642
		} else if (var0 == 7204) { // L: 4644
			class295.Interpreter_intStackSize -= 6; // L: 4645
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4646
			return 1; // L: 4647
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4649
			Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = -1; // L: 4650
			return 1; // L: 4651
		} else if (var0 == 7209) { // L: 4653
			class295.Interpreter_intStackSize -= 2; // L: 4654
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4655
			return 1; // L: 4656
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4658
			--class295.Interpreter_intStackSize; // L: 4659
			return 1; // L: 4660
		} else if (var0 == 7214) { // L: 4662
			class295.Interpreter_intStackSize -= 2; // L: 4663
			return 1; // L: 4664
		} else {
			return 2; // L: 4666
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-2138605701"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11149
			if (var0 != null && DevicePcmPlayerProvider.method381(var0) != null) { // L: 11150
				Client.clickedWidget = var0; // L: 11151
				Client.clickedWidgetParent = DevicePcmPlayerProvider.method381(var0); // L: 11152
				Client.widgetClickX = var1; // L: 11153
				Client.widgetClickY = var2; // L: 11154
				class136.widgetDragDuration = 0; // L: 11155
				Client.isDraggingWidget = false; // L: 11156
				int var3 = class168.method3324(); // L: 11157
				if (var3 != -1) { // L: 11158
					PacketWriter.tempMenuAction = new MenuAction(); // L: 11159
					PacketWriter.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 11160
					PacketWriter.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 11161
					PacketWriter.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 11162
					PacketWriter.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 11163
					PacketWriter.tempMenuAction.action = Client.menuActions[var3]; // L: 11164
				}

			}
		}
	} // L: 11166
}
