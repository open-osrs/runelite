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
		this.field1425 = 32;
		this.timeMs = class298.currentTimeMillis();
		this.field1433 = 0L;
		this.field1427 = 0;
		this.field1435 = 0;
		this.field1436 = 0;
		this.field1437 = 0L;
		this.field1422 = true;
		this.field1439 = 0;
		this.field1440 = new PcmStream[8];
		this.field1428 = new PcmStream[8];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3677"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("w")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-310479525"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "2012600293"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2081423658"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class298.currentTimeMillis();

			try {
				if (this.field1433 != 0L) {
					if (var1 < this.field1433) {
						return;
					}

					this.open(this.capacity);
					this.field1433 = 0L;
					this.field1422 = true;
				}

				int var3 = this.position();
				if (this.field1436 - var3 > this.field1427) {
					this.field1427 = this.field1436 - var3;
				}

				int var4 = this.field1431 + this.field1432;
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
					this.field1422 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field1432 = var4 - this.field1431;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field1437) {
					if (!this.field1422) {
						if (this.field1427 == 0 && this.field1435 == 0) {
							this.close();
							this.field1433 = var1 + 2000L;
							return;
						}

						this.field1432 = Math.min(this.field1435, this.field1427);
						this.field1435 = this.field1427;
					} else {
						this.field1422 = false;
					}

					this.field1427 = 0;
					this.field1437 = var1 + 2000L;
				}

				this.field1436 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1433 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field1443);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-764201060"
	)
	public final void method2485() {
		this.field1422 = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1507981291"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1422 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1433 = class298.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65535"
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
				InterfaceParent.soundSystemExecutor.shutdownNow();
				InterfaceParent.soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1439 -= var1;
		if (this.field1439 < 0) {
			this.field1439 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("aq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class311.clearIntArray(var1, 0, var3);
		this.field1439 -= var2;
		if (this.stream != null && this.field1439 <= 0) {
			this.field1439 += field1443 >> 4;
			Varcs.PcmStream_disable(this.stream);
			this.method2492(this.stream, this.stream.vmethod2800());
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
						PcmStream var11 = this.field1440[var7];

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
									int var13 = var11.vmethod3927();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1425) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1508; var14 != null; var14 = var11.nextSubStream()) {
											this.method2492(var14, var15 * var14.vmethod2800() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1440[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field1428[var7] = var10;
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
				PcmStream var16 = this.field1440[var6];
				PcmStream[] var17 = this.field1440;
				this.field1428[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field1439 < 0) {
			this.field1439 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class298.currentTimeMillis();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IB)V",
		garbageValue = "-108"
	)
	final void method2492(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1428[var3];
		if (var4 == null) {
			this.field1440[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1428[var3] = var1;
		var1.field1508 = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;Lib;B)V",
		garbageValue = "47"
	)
	public static void method2538(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1085535536"
	)
	static final int method2544(int var0, int var1) {
		int var2 = class4.method56(45365 + var0, var1 + 91923, 4) - 128 + (class4.method56(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class4.method56(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
