import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("g")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("a")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -629714143
	)
	public static int field268;
	@ObfuscatedName("am")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static Bounds field287;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "[Ljd;"
	)
	static Widget[] field280;
	@ObfuscatedName("f")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1999204821
	)
	int field271;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 5714523010373363809L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 549678595
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1096848183
	)
	int field274;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -155644099
	)
	int field275;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -8899173845831765053L
	)
	long field276;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -445294945
	)
	int field277;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1228293169
	)
	int field278;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -126021099
	)
	int field266;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 4456126482109034013L
	)
	long field267;
	@ObfuscatedName("i")
	boolean field281;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1656264467
	)
	int field286;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lap;"
	)
	PcmStream[] field283;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lap;"
	)
	PcmStream[] field284;

	protected PcmPlayer() {
		this.field271 = 32;
		this.timeMs = Occluder.method4335();
		this.field276 = 0L;
		this.field277 = 0;
		this.field278 = 0;
		this.field266 = 0;
		this.field267 = 0L;
		this.field281 = true;
		this.field286 = 0;
		this.field283 = new PcmStream[8];
		this.field284 = new PcmStream[8];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-111"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("k")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1022493238"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lap;B)V",
		garbageValue = "-59"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505126667"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = Occluder.method4335();

			try {
				if (0L != this.field276) {
					if (var1 < this.field276) {
						return;
					}

					this.open(this.capacity);
					this.field276 = 0L;
					this.field281 = true;
				}

				int var3 = this.position();
				if (this.field266 - var3 > this.field277) {
					this.field277 = this.field266 - var3;
				}

				int var4 = this.field275 + this.field274;
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
					this.field281 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field275 = var4 - this.field274;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field267) {
					if (!this.field281) {
						if (this.field277 == 0 && this.field278 == 0) {
							this.close();
							this.field276 = var1 + 2000L;
							return;
						}

						this.field275 = Math.min(this.field278, this.field277);
						this.field278 = this.field277;
					} else {
						this.field281 = false;
					}

					this.field277 = 0;
					this.field267 = var1 + 2000L;
				}

				this.field266 = var3;
			} catch (Exception var7) {
				this.close();
				this.field276 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / class276.field3287);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "17185845"
	)
	public final void method710() {
		this.field281 = true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1056182586"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field281 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field276 = Occluder.method4335() + 2000L;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "592744996"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class258.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class258.soundSystem.players[var2]) {
					class258.soundSystem.players[var2] = null;
				}

				if (class258.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class258.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1949816461"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field286 -= var1;
		if (this.field286 < 0) {
			this.field286 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("al")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class321.clearIntArray(var1, 0, var3);
		this.field286 -= var2;
		if (this.stream != null && this.field286 <= 0) {
			this.field286 += class276.field3287 >> 4;
			class157.PcmStream_disable(this.stream);
			this.method715(this.stream, this.stream.vmethod972());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field283[var7];

						label103:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label103;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4836();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field271) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field335; var14 != null; var14 = var11.nextSubStream()) {
											this.method715(var14, var15 * var14.vmethod972() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field283[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field284[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field283[var6];
				PcmStream[] var17 = this.field283;
				this.field284[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field286 < 0) {
			this.field286 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Occluder.method4335();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lap;IB)V",
		garbageValue = "-38"
	)
	final void method715(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field284[var3];
		if (var4 == null) {
			this.field283[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field284[var3] = var1;
		var1.field335 = var2;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1047991262"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (VarbitComposition.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ljd;B)Z",
		garbageValue = "1"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
