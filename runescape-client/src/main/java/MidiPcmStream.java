import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1861349381
	)
	int field2472;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -11314911
	)
	int field2462;
	@ObfuscatedName("j")
	int[] field2450;
	@ObfuscatedName("p")
	int[] field2458;
	@ObfuscatedName("g")
	int[] field2452;
	@ObfuscatedName("n")
	int[] field2453;
	@ObfuscatedName("u")
	int[] field2456;
	@ObfuscatedName("a")
	int[] field2455;
	@ObfuscatedName("z")
	int[] field2448;
	@ObfuscatedName("y")
	int[] field2457;
	@ObfuscatedName("c")
	int[] field2459;
	@ObfuscatedName("e")
	int[] field2460;
	@ObfuscatedName("l")
	int[] field2461;
	@ObfuscatedName("t")
	int[] field2447;
	@ObfuscatedName("x")
	int[] field2463;
	@ObfuscatedName("b")
	int[] field2464;
	@ObfuscatedName("i")
	int[] field2454;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[[Lhm;"
	)
	MusicPatchNode[][] field2466;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lhm;"
	)
	MusicPatchNode[][] field2467;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2469;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -408664983
	)
	@Export("track")
	int track;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1241874657
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 5529909508015764317L
	)
	long field2465;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2344404175579983131L
	)
	long field2473;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2472 = 256;
		this.field2462 = 1000000;
		this.field2450 = new int[16];
		this.field2458 = new int[16];
		this.field2452 = new int[16];
		this.field2453 = new int[16];
		this.field2456 = new int[16];
		this.field2455 = new int[16];
		this.field2448 = new int[16];
		this.field2457 = new int[16];
		this.field2459 = new int[16];
		this.field2460 = new int[16];
		this.field2461 = new int[16];
		this.field2447 = new int[16];
		this.field2463 = new int[16];
		this.field2464 = new int[16];
		this.field2454 = new int[16];
		this.field2466 = new MusicPatchNode[16][128];
		this.field2467 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method3856();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1244273754"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2472 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-988270526"
	)
	public int method3837() {
		return this.field2472;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lic;Ldo;II)Z",
		garbageValue = "-700249158"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4057();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = TileItem.method2255(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4027(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-100699849"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("u")
	protected synchronized int vmethod4037() {
		return 0;
	}

	@ObfuscatedName("a")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2462 / class237.field3113;

			do {
				long var5 = (long)var3 * (long)var4 + this.field2465;
				if (this.field2473 - var5 >= 0L) {
					this.field2465 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2473 - this.field2465) - 1L) / (long)var4);
				this.field2465 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method3872();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhz;ZI)V",
		garbageValue = "746467478"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2469 = var2;
		this.field2465 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2473 = this.midiFile.method3985(this.trackLength);
	}

	@ObfuscatedName("w")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2462 / class237.field3113;

			do {
				long var3 = (long)var2 * (long)var1 + this.field2465;
				if (this.field2473 - var3 >= 0L) {
					this.field2465 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2473 - this.field2465) - 1L) / (long)var2);
				this.field2465 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method3872();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method3856();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1676507703"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public synchronized void method3935(int var1, int var2) {
		this.method3916(var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1377126651"
	)
	void method3916(int var1, int var2) {
		this.field2453[var1] = var2;
		this.field2455[var1] = var2 & -128;
		this.method3846(var1, var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	void method3846(int var1, int var2) {
		if (var2 != this.field2456[var1]) {
			this.field2456[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2467[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "23534"
	)
	void method3847(int var1, int var2, int var3) {
		this.method3849(var1, var2, 64);
		if ((this.field2460[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2479 == var1 && var4.field2490 < 0) {
					this.field2466[var1][var4.field2481] = null;
					this.field2466[var1][var2] = var4;
					int var5 = (var4.field2491 * var4.field2485 >> 12) + var4.field2484;
					var4.field2484 += var2 - var4.field2481 << 8;
					var4.field2485 = var5 - var4.field2484;
					var4.field2491 = 4096;
					var4.field2481 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2456[var1]);
		if (var9 != null) {
			RawSound var8 = var9.rawSounds[var2];
			if (var8 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2479 = var1;
				var6.patch = var9;
				var6.rawSound = var8;
				var6.field2477 = var9.field2519[var2];
				var6.field2480 = var9.field2522[var2];
				var6.field2481 = var2;
				var6.field2499 = var3 * var3 * var9.field2517[var2] * var9.field2520 + 1024 >> 11;
				var6.field2483 = var9.field2518[var2] & 255;
				var6.field2484 = (var2 << 8) - (var9.field2521[var2] & 32767);
				var6.field2496 = 0;
				var6.field2488 = 0;
				var6.field2489 = 0;
				var6.field2490 = -1;
				var6.field2493 = 0;
				if (this.field2463[var1] == 0) {
					var6.stream = RawPcmStream.method2674(var8, this.method3861(var6), this.method3958(var6), this.method3912(var6));
				} else {
					var6.stream = RawPcmStream.method2674(var8, this.method3861(var6), 0, this.method3912(var6));
					this.method3852(var6, var9.field2521[var2] < 0);
				}

				if (var9.field2521[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2480 >= 0) {
					MusicPatchNode var7 = this.field2467[var1][var6.field2480];
					if (var7 != null && var7.field2490 < 0) {
						this.field2466[var1][var7.field2481] = null;
						var7.field2490 = 0;
					}

					this.field2467[var1][var6.field2480] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2466[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhm;ZI)V",
		garbageValue = "2083616471"
	)
	void method3852(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1423) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2463[var1.field2479] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method2683();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2463[var1.field2479] >> 6);
		}

		var1.stream.method2682(var4);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "96"
	)
	void method3849(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2466[var1][var2];
		if (var4 != null) {
			this.field2466[var1][var2] = null;
			if ((this.field2460[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2479 == var5.field2479 && var5.field2490 < 0 && var4 != var5) {
						var4.field2490 = 0;
						break;
					}
				}
			} else {
				var4.field2490 = 0;
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method3850(int var1, int var2, int var3) {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-70"
	)
	void method3851(int var1, int var2) {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "40"
	)
	void method3961(int var1, int var2) {
		this.field2448[var1] = var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1783640245"
	)
	void method3858(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2479 == var1) {
				if (var2.stream != null) {
					var2.stream.method2732(class237.field3113 / 100);
					if (var2.stream.method2691()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3963();
				}

				if (var2.field2490 < 0) {
					this.field2466[var2.field2479][var2.field2481] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "183029579"
	)
	void method3952(int var1) {
		if (var1 >= 0) {
			this.field2450[var1] = 12800;
			this.field2458[var1] = 8192;
			this.field2452[var1] = 16383;
			this.field2448[var1] = 8192;
			this.field2457[var1] = 0;
			this.field2459[var1] = 8192;
			this.method3857(var1);
			this.method3929(var1);
			this.field2460[var1] = 0;
			this.field2461[var1] = 32767;
			this.field2447[var1] = 256;
			this.field2463[var1] = 0;
			this.method3860(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method3952(var1);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "911673263"
	)
	void method3855(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2479 == var1) && var2.field2490 < 0) {
				this.field2466[var2.field2479][var2.field2481] = null;
				var2.field2490 = 0;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	void method3856() {
		this.method3858(-1);
		this.method3952(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2456[var1] = this.field2453[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2455[var1] = this.field2453[var1] & -128;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method3857(int var1) {
		if ((this.field2460[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2479 == var1 && this.field2466[var1][var2.field2481] == null && var2.field2490 < 0) {
					var2.field2490 = 0;
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1839659310"
	)
	void method3929(int var1) {
		if ((this.field2460[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2479 == var1) {
					var2.field2478 = 0;
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1915531597"
	)
	void method3845(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3849(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method3847(var3, var4, var5);
			} else {
				this.method3849(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3850(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2455[var3] = (var5 << 14) + (this.field2455[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2455[var3] = (var5 << 7) + (this.field2455[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2457[var3] = (var5 << 7) + (this.field2457[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2457[var3] = var5 + (this.field2457[var3] & -128);
			}

			if (var4 == 5) {
				this.field2459[var3] = (var5 << 7) + (this.field2459[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2459[var3] = var5 + (this.field2459[var3] & -128);
			}

			if (var4 == 7) {
				this.field2450[var3] = (var5 << 7) + (this.field2450[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2450[var3] = var5 + (this.field2450[var3] & -128);
			}

			if (var4 == 10) {
				this.field2458[var3] = (var5 << 7) + (this.field2458[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2458[var3] = var5 + (this.field2458[var3] & -128);
			}

			if (var4 == 11) {
				this.field2452[var3] = (var5 << 7) + (this.field2452[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2452[var3] = var5 + (this.field2452[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2460;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2460;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2460;
					var10000[var3] |= 2;
				} else {
					this.method3857(var3);
					var10000 = this.field2460;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2461[var3] = (var5 << 7) + (this.field2461[var3] & 127);
			}

			if (var4 == 98) {
				this.field2461[var3] = (this.field2461[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2461[var3] = (var5 << 7) + (this.field2461[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2461[var3] = (this.field2461[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method3858(var3);
			}

			if (var4 == 121) {
				this.method3952(var3);
			}

			if (var4 == 123) {
				this.method3855(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2461[var3];
				if (var6 == 16384) {
					this.field2447[var3] = (var5 << 7) + (this.field2447[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2461[var3];
				if (var6 == 16384) {
					this.field2447[var3] = var5 + (this.field2447[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2463[var3] = (var5 << 7) + (this.field2463[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2463[var3] = var5 + (this.field2463[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2460;
					var10000[var3] |= 4;
				} else {
					this.method3929(var3);
					var10000 = this.field2460;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3860(var3, (var5 << 7) + (this.field2464[var3] & -16257));
			}

			if (var4 == 49) {
				this.method3860(var3, var5 + (this.field2464[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3846(var3, var4 + this.field2455[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3851(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method3961(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method3856();
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1375281235"
	)
	void method3860(int var1, int var2) {
		this.field2464[var1] = var2;
		this.field2454[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)I",
		garbageValue = "2062902962"
	)
	int method3861(MusicPatchNode var1) {
		int var2 = (var1.field2491 * var1.field2485 >> 12) + var1.field2484;
		var2 += (this.field2448[var1.field2479] - 8192) * this.field2447[var1.field2479] >> 12;
		MusicPatchNode2 var3 = var1.field2477;
		int var4;
		if (var3.field2431 > 0 && (var3.field2430 > 0 || this.field2457[var1.field2479] > 0)) {
			var4 = var3.field2430 << 2;
			int var5 = var3.field2425 << 1;
			if (var1.field2492 < var5) {
				var4 = var4 * var1.field2492 / var5;
			}

			var4 += this.field2457[var1.field2479] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2476 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class237.field3113 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)I",
		garbageValue = "-352128958"
	)
	int method3958(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2477;
		int var3 = this.field2450[var1.field2479] * this.field2452[var1.field2479] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2499 + 16384 >> 15;
		var3 = var3 * this.field2472 + 128 >> 8;
		if (var2.field2426 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2426 * 1.953125E-5D * (double)var1.field2496) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2424 != null) {
			var4 = var1.field2488;
			var5 = var2.field2424[var1.field2489 + 1];
			if (var1.field2489 < var2.field2424.length - 2) {
				var6 = (var2.field2424[var1.field2489] & 255) << 8;
				var7 = (var2.field2424[var1.field2489 + 2] & 255) << 8;
				var5 += (var2.field2424[var1.field2489 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2490 > 0 && var2.field2429 != null) {
			var4 = var1.field2490;
			var5 = var2.field2429[var1.field2493 + 1];
			if (var1.field2493 < var2.field2429.length - 2) {
				var6 = (var2.field2429[var1.field2493] & 255) << 8;
				var7 = (var2.field2429[var1.field2493 + 2] & 255) << 8;
				var5 += (var2.field2429[var1.field2493 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhm;B)I",
		garbageValue = "0"
	)
	int method3912(MusicPatchNode var1) {
		int var2 = this.field2458[var1.field2479];
		return var2 < 8192 ? var2 * var1.field2483 + 32 >> 6 : 16384 - ((128 - var1.field2483) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-668815738"
	)
	void method3872() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2473; var2 == this.trackLength; var3 = this.midiFile.method3985(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2469 || var2 == 0) {
							this.method3856();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method3845(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2473 = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)Z",
		garbageValue = "-1517604835"
	)
	boolean method3870(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2490 >= 0) {
				var1.remove();
				if (var1.field2480 > 0 && var1 == this.field2467[var1.field2479][var1.field2480]) {
					this.field2467[var1.field2479][var1.field2480] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhm;[IIII)Z",
		garbageValue = "2001156959"
	)
	boolean method3897(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2495 = class237.field3113 / 100;
		if (var1.field2490 < 0 || var1.stream != null && !var1.stream.method2690()) {
			int var5 = var1.field2491;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2459[var1.field2479] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2491 = var5;
			}

			var1.stream.method2688(this.method3861(var1));
			MusicPatchNode2 var6 = var1.field2477;
			boolean var7 = false;
			++var1.field2492;
			var1.field2476 += var6.field2431;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2481 - 60 << 8) + (var1.field2485 * var1.field2491 >> 12));
			if (var6.field2426 > 0) {
				if (var6.field2435 > 0) {
					var1.field2496 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2435) + 0.5D);
				} else {
					var1.field2496 += 128;
				}
			}

			if (var6.field2424 != null) {
				if (var6.field2427 > 0) {
					var1.field2488 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2427 * var8) + 0.5D);
				} else {
					var1.field2488 += 128;
				}

				while (var1.field2489 < var6.field2424.length - 2 && var1.field2488 > (var6.field2424[var1.field2489 + 2] & 255) << 8) {
					var1.field2489 += 2;
				}

				if (var6.field2424.length - 2 == var1.field2489 && var6.field2424[var1.field2489 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2490 >= 0 && var6.field2429 != null && (this.field2460[var1.field2479] & 1) == 0 && (var1.field2480 < 0 || var1 != this.field2467[var1.field2479][var1.field2480])) {
				if (var6.field2428 > 0) {
					var1.field2490 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2428 * var8) + 0.5D);
				} else {
					var1.field2490 += 128;
				}

				while (var1.field2493 < var6.field2429.length - 2 && var1.field2490 > (var6.field2429[var1.field2493 + 2] & 255) << 8) {
					var1.field2493 += 2;
				}

				if (var6.field2429.length - 2 == var1.field2493) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method2732(var1.field2495);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method2691()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3963();
				if (var1.field2490 >= 0) {
					var1.remove();
					if (var1.field2480 > 0 && var1 == this.field2467[var1.field2479][var1.field2480]) {
						this.field2467[var1.field2479][var1.field2480] = null;
					}
				}

				return true;
			} else {
				var1.stream.method2775(var1.field2495, this.method3958(var1), this.method3912(var1));
				return false;
			}
		} else {
			var1.method3963();
			var1.remove();
			if (var1.field2480 > 0 && var1 == this.field2467[var1.field2479][var1.field2480]) {
				this.field2467[var1.field2479][var1.field2480] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2049415960"
	)
	public static void method3918() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field416 = KeyHandler.field421;
			KeyHandler.field425 = 0;
			int var1;
			if (KeyHandler.field411 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field411 = KeyHandler.field414;
			} else {
				while (KeyHandler.field414 != KeyHandler.field411) {
					var1 = KeyHandler.field409[KeyHandler.field414];
					KeyHandler.field414 = KeyHandler.field414 + 1 & 127;
					if (var1 < 0) {
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field425 < KeyHandler.field429.length - 1) {
							KeyHandler.field429[++KeyHandler.field425 - 1] = var1;
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				}
			}

			if (KeyHandler.field425 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field421 = KeyHandler.field417;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1122474734"
	)
	protected static final void method3905() {
		FriendLoginUpdate.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameShell.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameShell.clientTickTimes[var0] = 0L;
		}

		GameShell.gameCyclesToDo = 0;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1626393180"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		MouseRecorder.logOut();
		switch(var0) {
		case 1:
			Login.loginIndex = 24;
			MusicPatchPcmStream.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			GrandExchangeOfferNameComparator.method213();
		}

	}
}
