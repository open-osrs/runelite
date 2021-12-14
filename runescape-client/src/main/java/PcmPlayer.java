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
		this.field284 = 32;
		this.timeMs = Ignored.method6459();
		this.field280 = 0L;
		this.field290 = 0;
		this.field291 = 0;
		this.field292 = 0;
		this.field293 = 0L;
		this.field294 = true;
		this.field295 = 0;
		this.field296 = new PcmStream[8];
		this.field285 = new PcmStream[8];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993652709"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-865384228"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2142020678"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-514018891"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "-193761027"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "29619557"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = Ignored.method6459();

			try {
				if (0L != this.field280) {
					if (var1 < this.field280) {
						return;
					}

					this.open(this.capacity);
					this.field280 = 0L;
					this.field294 = true;
				}

				int var3 = this.position();
				if (this.field292 - var3 > this.field290) {
					this.field290 = this.field292 - var3;
				}

				int var4 = this.field288 + this.field298;
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
					this.field294 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field288 = var4 - this.field298;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field293) {
					if (!this.field294) {
						if (this.field290 == 0 && this.field291 == 0) {
							this.close();
							this.field280 = 2000L + var1;
							return;
						}

						this.field288 = Math.min(this.field291, this.field290);
						this.field291 = this.field290;
					} else {
						this.field294 = false;
					}

					this.field290 = 0;
					this.field293 = 2000L + var1;
				}

				this.field292 = var3;
			} catch (Exception var7) {
				this.close();
				this.field280 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / class339.field4058);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1599335992"
	)
	public final void method747() {
		this.field294 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-101835154"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field294 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field280 = Ignored.method6459() + 2000L;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-917395831"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1441903742"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field295 -= var1;
		if (this.field295 < 0) {
			this.field295 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (SpriteMask.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class333.clearIntArray(var1, 0, var3);
		this.field295 -= var2;
		if (this.stream != null && this.field295 <= 0) {
			this.field295 += class339.field4058 >> 4;
			class10.PcmStream_disable(this.stream);
			this.method751(this.stream, this.stream.vmethod991());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field296[var7];

						label102:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5260();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field284) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field346; var14 != null; var14 = var11.nextSubStream()) {
											this.method751(var14, var15 * var14.vmethod991() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field296[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field285[var7] = var10;
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
				PcmStream var16 = this.field296[var6];
				PcmStream[] var17 = this.field296;
				this.field285[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field295 < 0) {
			this.field295 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Ignored.method6459();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lai;IB)V",
		garbageValue = "-65"
	)
	final void method751(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field285[var3];
		if (var4 == null) {
			this.field296[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field285[var3] = var1;
		var1.field346 = var2;
	}
}
