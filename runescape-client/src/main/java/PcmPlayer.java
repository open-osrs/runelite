import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1282105105
	)
	public static int field305;
	@ObfuscatedName("o")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("w")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("q")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 505283827
	)
	int field293;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 2942857516536814513L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2146341369
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 617020007
	)
	int field296;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -134597597
	)
	int field297;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 3988394758568685751L
	)
	long field298;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 454965771
	)
	int field299;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -435698239
	)
	int field288;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1647257589
	)
	int field301;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -3633081744103915623L
	)
	long field302;
	@ObfuscatedName("z")
	boolean field294;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1386517767
	)
	int field304;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	PcmStream[] field303;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	PcmStream[] field306;

	protected PcmPlayer() {
		this.field293 = 32; // L: 22
		this.timeMs = DirectByteArrayCopier.method5318();
		this.field298 = 0L;
		this.field299 = 0;
		this.field288 = 0;
		this.field301 = 0;
		this.field302 = 0L;
		this.field294 = true;
		this.field304 = 0;
		this.field303 = new PcmStream[8]; // L: 39
		this.field306 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1020940076"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("e")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-375742034"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lan;I)V",
		garbageValue = "1934557281"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1902527420"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = DirectByteArrayCopier.method5318(); // L: 84

			try {
				if (0L != this.field298) { // L: 86
					if (var1 < this.field298) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field298 = 0L; // L: 89
					this.field294 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field301 - var3 > this.field299) { // L: 93
					this.field299 = this.field301 - var3;
				}

				int var4 = this.field296 + this.field297; // L: 94
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
					this.field294 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field297 = var4 - this.field296; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field302) { // L: 113
					if (!this.field294) { // L: 114
						if (this.field299 == 0 && this.field288 == 0) { // L: 115
							this.close(); // L: 116
							this.field298 = 2000L + var1; // L: 117
							return; // L: 118
						}

						this.field297 = Math.min(this.field288, this.field299); // L: 120
						this.field288 = this.field299; // L: 121
					} else {
						this.field294 = false; // L: 123
					}

					this.field299 = 0; // L: 124
					this.field302 = 2000L + var1; // L: 125
				}

				this.field301 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field298 = var1 + 2000L; // L: 131
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field305); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-670373790"
	)
	public final void method710() {
		this.field294 = true; // L: 146
	} // L: 147

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field294 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field298 = DirectByteArrayCopier.method5318() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "117161958"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class415.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class415.soundSystem.players[var2]) {
					class415.soundSystem.players[var2] = null; // L: 164
				}

				if (class415.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				class415.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "65280"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field304 -= var1; // L: 178
		if (this.field304 < 0) {
			this.field304 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("av")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class338.clearIntArray(var1, 0, var3); // L: 187
		this.field304 -= var2; // L: 188
		if (this.stream != null && this.field304 <= 0) { // L: 189
			this.field304 += field305 >> 4; // L: 190
			class7.PcmStream_disable(this.stream); // L: 191
			this.method715(this.stream, this.stream.vmethod956()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label109:
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
						PcmStream var11 = this.field303[var7]; // L: 216

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod5241(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) { // L: 228
										var12.position += var13;
									}

									if (var4 >= this.field293) { // L: 229
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field359; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method715(var14, var15 * var14.vmethod956() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field303[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field306[var7] = var10;
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
				PcmStream var16 = this.field303[var6]; // L: 248
				PcmStream[] var17 = this.field303; // L: 249
				this.field306[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field304 < 0) { // L: 260
			this.field304 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = DirectByteArrayCopier.method5318(); // L: 262
	} // L: 263

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lan;II)V",
		garbageValue = "-273686229"
	)
	final void method715(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field306[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field303[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field306[var3] = var1; // L: 276
		var1.field359 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILpi;S)Lff;",
		garbageValue = "27127"
	)
	public static class160 method744(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class160 var5 = new class160(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1745 != null && var7.length == var5.field1745.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) { // L: 37
						var5.field1745[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1746 != null && var7.length == var5.field1746.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1746[var7[var9]] = var10;
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lfp;",
		garbageValue = "-1755865139"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	public static void method764(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lbd;",
		garbageValue = "-1527078723"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "([Ljz;Ljz;ZI)V",
		garbageValue = "-953702217"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1839447183 * -112860561 : var1.width * 308678411 * -528431965; // L: 10300
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -857694431 * 54764769 : var1.height * 1501533581 * -1285507771; // L: 10301
		class21.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10302
		if (var1.children != null) { // L: 10303
			class21.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10304
		if (var5 != null) { // L: 10305
			int var6 = var5.group; // L: 10306
			if (class13.loadInterface(var6)) { // L: 10308
				class21.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10309
			}
		}

		if (var1.contentType == 1337) { // L: 10312
		}

	} // L: 10313
}
