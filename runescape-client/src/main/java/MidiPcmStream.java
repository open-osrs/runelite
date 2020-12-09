import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1220950279
	)
	static int field2455;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -849325487
	)
	int field2429;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1519429568
	)
	int field2437;
	@ObfuscatedName("t")
	int[] field2446;
	@ObfuscatedName("j")
	int[] field2432;
	@ObfuscatedName("n")
	int[] field2433;
	@ObfuscatedName("p")
	int[] field2443;
	@ObfuscatedName("l")
	int[] field2435;
	@ObfuscatedName("z")
	int[] field2436;
	@ObfuscatedName("u")
	int[] field2441;
	@ObfuscatedName("e")
	int[] field2438;
	@ObfuscatedName("m")
	int[] field2439;
	@ObfuscatedName("r")
	int[] field2454;
	@ObfuscatedName("q")
	int[] field2440;
	@ObfuscatedName("g")
	int[] field2434;
	@ObfuscatedName("s")
	int[] field2430;
	@ObfuscatedName("o")
	int[] field2444;
	@ObfuscatedName("k")
	int[] field2442;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[[Lhn;"
	)
	MusicPatchNode[][] field2428;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lhn;"
	)
	MusicPatchNode[][] field2447;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ax")
	boolean field2449;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2016646223
	)
	@Export("track")
	int track;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1682462851
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 1796535507771878115L
	)
	long field2452;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -5167402805625029887L
	)
	long field2453;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2429 = 256;
		this.field2437 = -727379968;
		this.field2446 = new int[16];
		this.field2432 = new int[16];
		this.field2433 = new int[16];
		this.field2443 = new int[16];
		this.field2435 = new int[16];
		this.field2436 = new int[16];
		this.field2441 = new int[16];
		this.field2438 = new int[16];
		this.field2439 = new int[16];
		this.field2454 = new int[16];
		this.field2440 = new int[16];
		this.field2434 = new int[16];
		this.field2430 = new int[16];
		this.field2444 = new int[16];
		this.field2442 = new int[16];
		this.field2428 = new MusicPatchNode[16][128];
		this.field2447 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method3842();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1513"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2429 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "643767530"
	)
	int method3816() {
		return this.field2429;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lhg;Lib;Lds;IB)Z",
		garbageValue = "3"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method3956();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				byte[] var11 = var2.takeFileFlat(var8);
				MusicPatch var10;
				if (var11 == null) {
					var10 = null;
				} else {
					var10 = new MusicPatch(var11);
				}

				var9 = var10;
				if (var10 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var10, (long)var8);
			}

			if (!var9.method3920(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1115530445"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("p")
	protected synchronized int vmethod3927() {
		return 0;
	}

	@ObfuscatedName("l")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2437 * 1000000 / PcmPlayer.field1443;

			do {
				long var5 = this.field2452 + (long)var3 * (long)var4;
				if (this.field2453 - var5 >= 0L) {
					this.field2452 = var5;
					break;
				}

				int var7 = (int)((this.field2453 - this.field2452 + (long)var4 - 1L) / (long)var4);
				this.field2452 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method3784();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhg;ZI)V",
		garbageValue = "614971049"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2449 = var2;
		this.field2452 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2453 = this.midiFile.method3878(this.trackLength);
	}

	@ObfuscatedName("u")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2437 * 1000000 / PcmPlayer.field1443;

			do {
				long var3 = (long)var1 * (long)var2 + this.field2452;
				if (this.field2453 - var3 >= 0L) {
					this.field2452 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2453 - this.field2452) - 1L) / (long)var2);
				this.field2452 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method3784();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15313"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear();
		this.method3842();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-185002283"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "77"
	)
	public synchronized void method3759(int var1, int var2) {
		this.method3752(var1, var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-15440"
	)
	void method3752(int var1, int var2) {
		this.field2443[var1] = var2;
		this.field2436[var1] = var2 & -128;
		this.method3761(var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1712020733"
	)
	void method3761(int var1, int var2) {
		if (var2 != this.field2435[var1]) {
			this.field2435[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2447[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method3768(int var1, int var2, int var3) {
		this.method3814(var1, var2, 64);
		if ((this.field2454[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2477 == var1 && var4.field2470 < 0) {
					this.field2428[var1][var4.field2461] = null;
					this.field2428[var1][var2] = var4;
					int var8 = (var4.field2466 * var4.field2464 >> 12) + var4.field2476;
					var4.field2476 += var2 - var4.field2461 << 8;
					var4.field2464 = var8 - var4.field2476;
					var4.field2466 = 4096;
					var4.field2461 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2435[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2477 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2459 = var9.field2492[var2];
				var6.field2460 = var9.field2498[var2];
				var6.field2461 = var2;
				var6.field2462 = var3 * var3 * var9.field2495[var2] * var9.field2499 + 1024 >> 11;
				var6.field2463 = var9.field2496[var2] & 255;
				var6.field2476 = (var2 << 8) - (var9.field2494[var2] & 32767);
				var6.field2467 = 0;
				var6.field2465 = 0;
				var6.field2472 = 0;
				var6.field2470 = -1;
				var6.field2471 = 0;
				if (this.field2430[var1] == 0) {
					var6.stream = RawPcmStream.method2630(var5, this.method3776(var6), this.method3849(var6), this.method3854(var6));
				} else {
					var6.stream = RawPcmStream.method2630(var5, this.method3776(var6), 0, this.method3854(var6));
					this.method3763(var6, var9.field2494[var2] < 0);
				}

				if (var9.field2494[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2460 >= 0) {
					MusicPatchNode var7 = this.field2447[var1][var6.field2460];
					if (var7 != null && var7.field2470 < 0) {
						this.field2428[var1][var7.field2461] = null;
						var7.field2470 = 0;
					}

					this.field2447[var1][var6.field2460] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2428[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhn;ZB)V",
		garbageValue = "1"
	)
	void method3763(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1408) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2430[var1.field2477] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method2616();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2430[var1.field2477] >> 6);
		}

		var1.stream.method2615(var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "452314933"
	)
	void method3814(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2428[var1][var2];
		if (var4 != null) {
			this.field2428[var1][var2] = null;
			if ((this.field2454[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2477 == var5.field2477 && var5.field2470 < 0 && var4 != var5) {
						var4.field2470 = 0;
						break;
					}
				}
			} else {
				var4.field2470 = 0;
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-55"
	)
	void method3765(int var1, int var2, int var3) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "173552395"
	)
	void method3777(int var1, int var2) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-30"
	)
	void method3767(int var1, int var2) {
		this.field2441[var1] = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "649437065"
	)
	void method3750(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2477 == var1) {
				if (var2.stream != null) {
					var2.stream.method2620(PcmPlayer.field1443 / 100);
					if (var2.stream.method2624()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3860();
				}

				if (var2.field2470 < 0) {
					this.field2428[var2.field2477][var2.field2461] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "178885513"
	)
	void method3769(int var1) {
		if (var1 >= 0) {
			this.field2446[var1] = 12800;
			this.field2432[var1] = 8192;
			this.field2433[var1] = 16383;
			this.field2441[var1] = 8192;
			this.field2438[var1] = 0;
			this.field2439[var1] = 8192;
			this.method3779(var1);
			this.method3773(var1);
			this.field2454[var1] = 0;
			this.field2440[var1] = 32767;
			this.field2434[var1] = 256;
			this.field2430[var1] = 0;
			this.method3775(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method3769(var1);
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "971113747"
	)
	void method3805(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2477 == var1) && var2.field2470 < 0) {
				this.field2428[var2.field2477][var2.field2461] = null;
				var2.field2470 = 0;
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	void method3842() {
		this.method3750(-1);
		this.method3769(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2435[var1] = this.field2443[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2436[var1] = this.field2443[var1] & -128;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-635370566"
	)
	void method3779(int var1) {
		if ((this.field2454[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2477 == var1 && this.field2428[var1][var2.field2461] == null && var2.field2470 < 0) {
					var2.field2470 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3773(int var1) {
		if ((this.field2454[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2477 == var1) {
					var2.field2456 = 0;
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3774(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3814(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method3768(var3, var4, var5);
			} else {
				this.method3814(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3765(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2436[var3] = (var5 << 14) + (this.field2436[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2436[var3] = (var5 << 7) + (this.field2436[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2438[var3] = (var5 << 7) + (this.field2438[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2438[var3] = var5 + (this.field2438[var3] & -128);
			}

			if (var4 == 5) {
				this.field2439[var3] = (var5 << 7) + (this.field2439[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2439[var3] = var5 + (this.field2439[var3] & -128);
			}

			if (var4 == 7) {
				this.field2446[var3] = (var5 << 7) + (this.field2446[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2446[var3] = var5 + (this.field2446[var3] & -128);
			}

			if (var4 == 10) {
				this.field2432[var3] = (var5 << 7) + (this.field2432[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2432[var3] = var5 + (this.field2432[var3] & -128);
			}

			if (var4 == 11) {
				this.field2433[var3] = (var5 << 7) + (this.field2433[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2433[var3] = var5 + (this.field2433[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2454;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2454;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2454;
					var10000[var3] |= 2;
				} else {
					this.method3779(var3);
					var10000 = this.field2454;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2440[var3] = (var5 << 7) + (this.field2440[var3] & 127);
			}

			if (var4 == 98) {
				this.field2440[var3] = (this.field2440[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2440[var3] = (var5 << 7) + (this.field2440[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2440[var3] = (this.field2440[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method3750(var3);
			}

			if (var4 == 121) {
				this.method3769(var3);
			}

			if (var4 == 123) {
				this.method3805(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2440[var3];
				if (var6 == 16384) {
					this.field2434[var3] = (var5 << 7) + (this.field2434[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2440[var3];
				if (var6 == 16384) {
					this.field2434[var3] = var5 + (this.field2434[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2430[var3] = (var5 << 7) + (this.field2430[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2430[var3] = var5 + (this.field2430[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2454;
					var10000[var3] |= 4;
				} else {
					this.method3773(var3);
					var10000 = this.field2454;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3775(var3, (var5 << 7) + (this.field2444[var3] & -16257));
			}

			if (var4 == 49) {
				this.method3775(var3, var5 + (this.field2444[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3761(var3, var4 + this.field2436[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3777(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method3767(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method3842();
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "368361036"
	)
	void method3775(int var1, int var2) {
		this.field2444[var1] = var2;
		this.field2442[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)I",
		garbageValue = "-1046287806"
	)
	int method3776(MusicPatchNode var1) {
		int var2 = (var1.field2466 * var1.field2464 >> 12) + var1.field2476;
		var2 += (this.field2441[var1.field2477] - 8192) * this.field2434[var1.field2477] >> 12;
		MusicPatchNode2 var3 = var1.field2459;
		int var4;
		if (var3.field2416 > 0 && (var3.field2415 > 0 || this.field2438[var1.field2477] > 0)) {
			var4 = var3.field2415 << 2;
			int var5 = var3.field2409 << 1;
			if (var1.field2468 < var5) {
				var4 = var4 * var1.field2468 / var5;
			}

			var4 += this.field2438[var1.field2477] >> 7;
			double var6 = Math.sin((double)(var1.field2469 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field1443 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)I",
		garbageValue = "1961596880"
	)
	int method3849(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2459;
		int var3 = this.field2433[var1.field2477] * this.field2446[var1.field2477] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2462 + 16384 >> 15;
		var3 = var3 * this.field2429 + 128 >> 8;
		if (var2.field2410 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2467 * (double)var2.field2410) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2411 != null) {
			var4 = var1.field2465;
			var5 = var2.field2411[var1.field2472 * 2 + 1];
			if (var1.field2472 * 2 < var2.field2411.length - 2) {
				var6 = (var2.field2411[var1.field2472 * 2] & 255) << 8;
				var7 = (var2.field2411[var1.field2472 * 2 + 2] & 255) << 8;
				var5 += (var2.field2411[var1.field2472 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2470 > 0 && var2.field2412 != null) {
			var4 = var1.field2470;
			var5 = var2.field2412[var1.field2471 * 4 + 1];
			if (var1.field2471 * 4 < var2.field2412.length - 2) {
				var6 = (var2.field2412[var1.field2471 * 4] & 255) << 8;
				var7 = (var2.field2412[var1.field2471 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2412[var1.field2471 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lhn;S)I",
		garbageValue = "-9329"
	)
	int method3854(MusicPatchNode var1) {
		int var2 = this.field2432[var1.field2477];
		return var2 < 8192 ? var2 * var1.field2463 + 32 >> 6 : 16384 - ((128 - var1.field2463) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1360483838"
	)
	void method3784() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2453; var2 == this.trackLength; var3 = this.midiFile.method3878(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2449 || var2 == 0) {
							this.method3842();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method3774(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2453 = var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)Z",
		garbageValue = "610995738"
	)
	boolean method3851(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2470 >= 0) {
				var1.remove();
				if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) {
					this.field2447[var1.field2477][var1.field2460] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lhn;[IIII)Z",
		garbageValue = "-638435532"
	)
	boolean method3786(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2475 = PcmPlayer.field1443 / 100;
		if (var1.field2470 < 0 || var1.stream != null && !var1.stream.method2623()) {
			int var5 = var1.field2466;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2439[var1.field2477] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2466 = var5;
			}

			var1.stream.method2621(this.method3776(var1));
			MusicPatchNode2 var6 = var1.field2459;
			boolean var7 = false;
			++var1.field2468;
			var1.field2469 += var6.field2416;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2461 - 60 << 8) + (var1.field2466 * var1.field2464 >> 12));
			if (var6.field2410 > 0) {
				if (var6.field2414 > 0) {
					var1.field2467 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2414) + 0.5D);
				} else {
					var1.field2467 += 128;
				}
			}

			if (var6.field2411 != null) {
				if (var6.field2417 > 0) {
					var1.field2465 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2417 * var8) + 0.5D);
				} else {
					var1.field2465 += 128;
				}

				while (var1.field2472 * 2 < var6.field2411.length - 2 && var1.field2465 > (var6.field2411[var1.field2472 * 2 + 2] & 255) << 8) {
					var1.field2472 = var1.field2472 * 4 + 4;
				}

				if (var1.field2472 * 2 == var6.field2411.length - 2 && var6.field2411[var1.field2472 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2470 >= 0 && var6.field2412 != null && (this.field2454[var1.field2477] & 1) == 0 && (var1.field2460 < 0 || var1 != this.field2447[var1.field2477][var1.field2460])) {
				if (var6.field2413 > 0) {
					var1.field2470 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2413 * var8) + 0.5D);
				} else {
					var1.field2470 += 128;
				}

				while (var1.field2471 * 4 < var6.field2412.length - 2 && var1.field2470 > (var6.field2412[var1.field2471 * 4 + 2] & 255) << 8) {
					var1.field2471 = var1.field2471 * 4 + 2;
				}

				if (var1.field2471 * 4 == var6.field2412.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method2620(var1.field2475);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method2624()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3860();
				if (var1.field2470 >= 0) {
					var1.remove();
					if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) {
						this.field2447[var1.field2477][var1.field2460] = null;
					}
				}

				return true;
			} else {
				var1.stream.method2744(var1.field2475, this.method3849(var1), this.method3854(var1));
				return false;
			}
		} else {
			var1.method3860();
			var1.remove();
			if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) {
				this.field2447[var1.field2477][var1.field2460] = null;
			}

			return true;
		}
	}
}
