import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("h")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("e")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 967437073
	)
	public static int field1419;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("w")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -464372219
	)
	int field1424;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 2749366115172109131L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 167448973
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 237802631
	)
	int field1427;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1086019069
	)
	int field1430;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 5727430496503551515L
	)
	long field1429;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 319512497
	)
	int field1428;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1292152149
	)
	int field1439;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -264782125
	)
	int field1432;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 4709147703826691947L
	)
	long field1425;
	@ObfuscatedName("j")
	boolean field1433;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1127821299
	)
	int field1417;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ldw;"
	)
	PcmStream[] field1437;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Ldw;"
	)
	PcmStream[] field1438;

	protected PcmPlayer() {
		this.field1424 = 32; // L: 22
		this.timeMs = Tiles.currentTimeMillis(); // L: 23
		this.field1429 = 0L; // L: 27
		this.field1428 = 0; // L: 28
		this.field1439 = 0; // L: 29
		this.field1432 = 0; // L: 30
		this.field1425 = 0L; // L: 31
		this.field1433 = true; // L: 32
		this.field1417 = 0; // L: 38
		this.field1437 = new PcmStream[8]; // L: 39
		this.field1438 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1929759603"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6543"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("c")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-674709942"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-1612898797"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-310510465"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = Tiles.currentTimeMillis(); // L: 77

			try {
				if (this.field1429 != 0L) { // L: 79
					if (var1 < this.field1429) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field1429 = 0L; // L: 82
					this.field1433 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field1432 - var3 > this.field1428) { // L: 86
					this.field1428 = this.field1432 - var3;
				}

				int var4 = this.field1427 + this.field1430; // L: 87
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
					this.field1433 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field1430 = var4 - this.field1427; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field1425) { // L: 106
					if (!this.field1433) { // L: 107
						if (this.field1428 == 0 && this.field1439 == 0) { // L: 108
							this.close(); // L: 109
							this.field1429 = 2000L + var1; // L: 110
							return; // L: 111
						}

						this.field1430 = Math.min(this.field1439, this.field1428); // L: 113
						this.field1439 = this.field1428; // L: 114
					} else {
						this.field1433 = false; // L: 116
					}

					this.field1428 = 0; // L: 117
					this.field1425 = 2000L + var1; // L: 118
				}

				this.field1432 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field1429 = 2000L + var1; // L: 124
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / StructComposition.field3338); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public final void method2612() {
		this.field1433 = true; // L: 139
	} // L: 140

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1433 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field1429 = Tiles.currentTimeMillis() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10262"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null; // L: 157
				}

				if (soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				soundSystemExecutor.shutdownNow(); // L: 161
				soundSystemExecutor = null; // L: 162
				soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-108727695"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1417 -= var1; // L: 171
		if (this.field1417 < 0) {
			this.field1417 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("ak")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class311.clearIntArray(var1, 0, var3); // L: 180
		this.field1417 -= var2; // L: 181
		if (this.stream != null && this.field1417 <= 0) { // L: 182
			this.field1417 += StructComposition.field3338 >> 4; // L: 183
			ReflectionCheck.PcmStream_disable(this.stream); // L: 184
			this.method2658(this.stream, this.stream.vmethod2880()); // L: 185
			int var4 = 0; // L: 186
			int var5 = 255; // L: 187

			int var6;
			PcmStream var10;
			label109:
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
						PcmStream var11 = this.field1437[var7]; // L: 209

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 210
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 211
								if (var12 != null && var12.position > var8) { // L: 212
									var5 |= 1 << var7; // L: 213
									var10 = var11; // L: 214
									var11 = var11.after; // L: 215
								} else {
									var11.active = true; // L: 218
									int var13 = var11.vmethod4099(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) { // L: 221
										var12.position += var13;
									}

									if (var4 >= this.field1424) { // L: 222
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field1511; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method2658(var14, var15 * var14.vmethod2880() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field1437[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field1438[var7] = var10;
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
				PcmStream var16 = this.field1437[var6]; // L: 241
				PcmStream[] var17 = this.field1437; // L: 242
				this.field1438[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field1417 < 0) { // L: 253
			this.field1417 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = Tiles.currentTimeMillis(); // L: 255
	} // L: 256

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IB)V",
		garbageValue = "-16"
	)
	final void method2658(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field1438[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field1437[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field1438[var3] = var1; // L: 269
		var1.field1511 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-392680019"
	)
	static final void method2661(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class3.field24 || class39.field284 != var1) { // L: 5067
			class3.field24 = var0; // L: 5070
			class39.field284 = var1; // L: 5071
			ItemContainer.updateGameState(25); // L: 5072
			WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", true); // L: 5073
			int var3 = GrandExchangeOfferNameComparator.baseX; // L: 5074
			int var4 = NetCache.baseY; // L: 5075
			GrandExchangeOfferNameComparator.baseX = (var0 - 6) * 8; // L: 5076
			NetCache.baseY = (var1 - 6) * 8; // L: 5077
			int var5 = GrandExchangeOfferNameComparator.baseX - var3; // L: 5078
			int var6 = NetCache.baseY - var4; // L: 5079
			var3 = GrandExchangeOfferNameComparator.baseX; // L: 5080
			var4 = NetCache.baseY; // L: 5081

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5082
				NPC var19 = Client.npcs[var7]; // L: 5083
				if (var19 != null) { // L: 5084
					for (var9 = 0; var9 < 10; ++var9) { // L: 5085
						var10000 = var19.pathX; // L: 5086
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5087
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5089
					var19.y -= var6 * 128; // L: 5090
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5093
				Player var22 = Client.players[var7]; // L: 5094
				if (var22 != null) { // L: 5095
					for (var9 = 0; var9 < 10; ++var9) { // L: 5096
						var10000 = var22.pathX; // L: 5097
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5098
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5100
					var22.y -= var6 * 128; // L: 5101
				}
			}

			byte var20 = 0; // L: 5104
			byte var8 = 104; // L: 5105
			byte var21 = 1; // L: 5106
			if (var5 < 0) { // L: 5107
				var20 = 103; // L: 5108
				var8 = -1; // L: 5109
				var21 = -1; // L: 5110
			}

			byte var10 = 0; // L: 5112
			byte var11 = 104; // L: 5113
			byte var12 = 1; // L: 5114
			if (var6 < 0) { // L: 5115
				var10 = 103; // L: 5116
				var11 = -1; // L: 5117
				var12 = -1; // L: 5118
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5120
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5121
					int var15 = var5 + var13; // L: 5122
					int var16 = var6 + var14; // L: 5123

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5124
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5125
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5126
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5130 5131 5135
				var18.x -= var5; // L: 5132
				var18.y -= var6; // L: 5133
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5134
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5137
				Client.destinationX -= var5; // L: 5138
				Client.destinationY -= var6; // L: 5139
			}

			Client.soundEffectCount = 0; // L: 5141
			Client.isCameraLocked = false; // L: 5142
			SecureRandomFuture.cameraX -= var5 << 7; // L: 5143
			ObjectSound.cameraZ -= var6 << 7; // L: 5144
			HealthBarUpdate.oculusOrbFocalPointX -= var5 << 7; // L: 5145
			ApproximateRouteStrategy.oculusOrbFocalPointY -= var6 << 7; // L: 5146
			Client.field889 = -1; // L: 5147
			Client.graphicsObjects.clear(); // L: 5148
			Client.projectiles.clear(); // L: 5149

			for (var14 = 0; var14 < 4; ++var14) { // L: 5150
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5068 5151
}
