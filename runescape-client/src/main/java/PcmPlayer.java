import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Ldg;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("h")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ldf;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -964785055
	)
	int field1440;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -5225168782139234627L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1568507089
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1378765481
	)
	int field1443;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 338521005
	)
	int field1444;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 6294144091277528537L
	)
	long field1439;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 83737029
	)
	int field1446;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1549144685
	)
	int field1447;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -34422633
	)
	int field1436;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 710865060485688699L
	)
	long field1452;
	@ObfuscatedName("f")
	boolean field1450;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2018665007
	)
	int field1448;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "[Ldf;"
	)
	PcmStream[] field1449;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "[Ldf;"
	)
	PcmStream[] field1453;

	protected PcmPlayer() {
		this.field1440 = 32;
		this.timeMs = MilliClock.currentTimeMillis();
		this.field1439 = 0L;
		this.field1446 = 0;
		this.field1447 = 0;
		this.field1436 = 0;
		this.field1452 = 0L;
		this.field1450 = true;
		this.field1448 = 0;
		this.field1449 = new PcmStream[8];
		this.field1453 = new PcmStream[8];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2128910021"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-14"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1868944096"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("j")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1900446281"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "630637593"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Ldf;I)V",
		garbageValue = "204760061"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "277207832"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = MilliClock.currentTimeMillis();

			try {
				if (0L != this.field1439) {
					if (var1 < this.field1439) {
						return;
					}

					this.open(this.capacity);
					this.field1439 = 0L;
					this.field1450 = true;
				}

				int var3 = this.position();
				if (this.field1436 - var3 > this.field1446) {
					this.field1446 = this.field1436 - var3;
				}

				int var4 = this.field1443 + this.field1444;
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
					this.field1450 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field1444 = var4 - this.field1443;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field1452) {
					if (!this.field1450) {
						if (this.field1446 == 0 && this.field1447 == 0) {
							this.close();
							this.field1439 = 2000L + var1;
							return;
						}

						this.field1444 = Math.min(this.field1447, this.field1446);
						this.field1447 = this.field1446;
					} else {
						this.field1450 = false;
					}

					this.field1446 = 0;
					this.field1452 = var1 + 2000L;
				}

				this.field1436 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1439 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / class237.field3113);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-537221049"
	)
	public final void method2560() {
		this.field1450 = true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-209566182"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1450 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1439 = MilliClock.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "733916097"
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
				class227.soundSystemExecutor.shutdownNow();
				class227.soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1841493566"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1448 -= var1;
		if (this.field1448 < 0) {
			this.field1448 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("as")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (Messages.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class310.clearIntArray(var1, 0, var3);
		this.field1448 -= var2;
		if (this.stream != null && this.field1448 <= 0) {
			this.field1448 += class237.field3113 >> 4;
			VarcInt.PcmStream_disable(this.stream);
			this.method2565(this.stream, this.stream.vmethod2840());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label104:
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
						PcmStream var11 = this.field1449[var7];

						label98:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label98;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4037();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1440) {
										break label104;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1520; var14 != null; var14 = var11.nextSubStream()) {
											this.method2565(var14, var15 * var14.vmethod2840() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1449[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field1453[var7] = var10;
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
				PcmStream var16 = this.field1449[var6];
				PcmStream[] var17 = this.field1449;
				this.field1453[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field1448 < 0) {
			this.field1448 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = MilliClock.currentTimeMillis();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(Ldf;IB)V",
		garbageValue = "45"
	)
	final void method2565(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1453[var3];
		if (var4 == null) {
			this.field1449[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1453[var3] = var1;
		var1.field1520 = var2;
	}
}
