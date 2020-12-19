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
		intValue = -610604135
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
		this.field2429 = 256; // L: 14
		this.field2437 = 1000000; // L: 15
		this.field2446 = new int[16]; // L: 16
		this.field2432 = new int[16]; // L: 17
		this.field2433 = new int[16]; // L: 18
		this.field2443 = new int[16]; // L: 19
		this.field2435 = new int[16]; // L: 20
		this.field2436 = new int[16]; // L: 21
		this.field2441 = new int[16]; // L: 22
		this.field2438 = new int[16]; // L: 23
		this.field2439 = new int[16]; // L: 24
		this.field2454 = new int[16]; // L: 28
		this.field2440 = new int[16]; // L: 29
		this.field2434 = new int[16]; // L: 30
		this.field2430 = new int[16]; // L: 31
		this.field2444 = new int[16]; // L: 32
		this.field2442 = new int[16]; // L: 33
		this.field2428 = new MusicPatchNode[16][128]; // L: 34
		this.field2447 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method3842(); // L: 46
	} // L: 47

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1513"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2429 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "643767530"
	)
	int method3816() {
		return this.field2429; // L: 54
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lhg;Lib;Lds;IB)Z",
		garbageValue = "3"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method3956(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				byte[] var11 = var2.takeFileFlat(var8); // L: 68
				MusicPatch var10;
				if (var11 == null) { // L: 69
					var10 = null; // L: 70
				} else {
					var10 = new MusicPatch(var11); // L: 73
				}

				var9 = var10; // L: 75
				if (var10 == null) { // L: 76
					var5 = false; // L: 77
					continue;
				}

				this.musicPatches.put(var10, (long)var8); // L: 80
			}

			if (!var9.method3920(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1115530445"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("p")
	protected synchronized int vmethod3927() {
		return 0; // L: 477
	}

	@ObfuscatedName("l")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field2437 / PcmPlayer.field1443; // L: 482

			do {
				long var5 = this.field2452 + (long)var3 * (long)var4; // L: 484
				if (this.field2453 - var5 >= 0L) { // L: 485
					this.field2452 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field2453 - this.field2452 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field2452 += (long)var7 * (long)var4; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method3784(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhg;ZI)V",
		garbageValue = "614971049"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field2449 = var2; // L: 99
		this.field2452 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field2453 = this.midiFile.method3878(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("u")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field2437 / PcmPlayer.field1443; // L: 503

			do {
				long var3 = (long)var1 * (long)var2 + this.field2452; // L: 505
				if (this.field2453 - var3 >= 0L) { // L: 506
					this.field2452 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2453 - this.field2452) - 1L) / (long)var2); // L: 510
				this.field2452 += (long)var2 * (long)var5; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method3784(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15313"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method3842(); // L: 114
	} // L: 115

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-185002283"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "77"
	)
	public synchronized void method3759(int var1, int var2) {
		this.method3752(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-15440"
	)
	void method3752(int var1, int var2) {
		this.field2443[var1] = var2; // L: 126
		this.field2436[var1] = var2 & -128; // L: 127
		this.method3761(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1712020733"
	)
	void method3761(int var1, int var2) {
		if (var2 != this.field2435[var1]) { // L: 132
			this.field2435[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field2447[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method3768(int var1, int var2, int var3) {
		this.method3814(var1, var2, 64); // L: 139
		if ((this.field2454[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field2477 == var1 && var4.field2470 < 0) { // L: 142
					this.field2428[var1][var4.field2461] = null; // L: 143
					this.field2428[var1][var2] = var4; // L: 144
					int var8 = (var4.field2466 * var4.field2464 >> 12) + var4.field2476; // L: 145
					var4.field2476 += var2 - var4.field2461 << 8; // L: 146
					var4.field2464 = var8 - var4.field2476; // L: 147
					var4.field2466 = 4096; // L: 148
					var4.field2461 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2435[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field2477 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field2459 = var9.field2492[var2]; // L: 162
				var6.field2460 = var9.field2498[var2]; // L: 163
				var6.field2461 = var2; // L: 164
				var6.field2462 = var3 * var3 * var9.field2495[var2] * var9.field2499 + 1024 >> 11; // L: 165
				var6.field2463 = var9.field2496[var2] & 255; // L: 166
				var6.field2476 = (var2 << 8) - (var9.field2494[var2] & 32767); // L: 167
				var6.field2467 = 0; // L: 168
				var6.field2465 = 0; // L: 169
				var6.field2472 = 0; // L: 170
				var6.field2470 = -1; // L: 171
				var6.field2471 = 0; // L: 172
				if (this.field2430[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method2630(var5, this.method3776(var6), this.method3849(var6), this.method3854(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method2630(var5, this.method3776(var6), 0, this.method3854(var6)); // L: 177
					this.method3763(var6, var9.field2494[var2] < 0); // L: 178
				}

				if (var9.field2494[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2460 >= 0) { // L: 181
					MusicPatchNode var7 = this.field2447[var1][var6.field2460]; // L: 182
					if (var7 != null && var7.field2470 < 0) { // L: 183
						this.field2428[var1][var7.field2461] = null; // L: 184
						var7.field2470 = 0; // L: 185
					}

					this.field2447[var1][var6.field2460] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field2428[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhn;ZB)V",
		garbageValue = "1"
	)
	void method3763(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field1408) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)this.field2430[var1.field2477] * (long)var5 >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method2616(); // L: 202
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2430[var1.field2477] >> 6); // L: 206
		}

		var1.stream.method2615(var4); // L: 208
	} // L: 209

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "452314933"
	)
	void method3814(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2428[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field2428[var1][var2] = null; // L: 214
			if ((this.field2454[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var4.field2477 == var5.field2477 && var5.field2470 < 0 && var4 != var5) { // L: 217
						var4.field2470 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field2470 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-55"
	)
	void method3765(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "173552395"
	)
	void method3777(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-30"
	)
	void method3767(int var1, int var2) {
		this.field2441[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "649437065"
	)
	void method3750(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field2477 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method2620(PcmPlayer.field1443 / 100); // L: 239
					if (var2.stream.method2624()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3860(); // L: 241
				}

				if (var2.field2470 < 0) { // L: 243
					this.field2428[var2.field2477][var2.field2461] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "178885513"
	)
	void method3769(int var1) {
		if (var1 >= 0) { // L: 250
			this.field2446[var1] = 12800; // L: 254
			this.field2432[var1] = 8192; // L: 255
			this.field2433[var1] = 16383; // L: 256
			this.field2441[var1] = 8192; // L: 257
			this.field2438[var1] = 0; // L: 258
			this.field2439[var1] = 8192; // L: 259
			this.method3779(var1); // L: 260
			this.method3773(var1); // L: 261
			this.field2454[var1] = 0; // L: 262
			this.field2440[var1] = 32767; // L: 263
			this.field2434[var1] = 256; // L: 264
			this.field2430[var1] = 0; // L: 265
			this.method3775(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method3769(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "971113747"
	)
	void method3805(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field2477 == var1) && var2.field2470 < 0) { // L: 271 272
				this.field2428[var2.field2477][var2.field2461] = null; // L: 273
				var2.field2470 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	void method3842() {
		this.method3750(-1); // L: 281
		this.method3769(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field2435[var1] = this.field2443[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field2436[var1] = this.field2443[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-635370566"
	)
	void method3779(int var1) {
		if ((this.field2454[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field2477 == var1 && this.field2428[var1][var2.field2461] == null && var2.field2470 < 0) { // L: 290 291
					var2.field2470 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3773(int var1) {
		if ((this.field2454[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field2477 == var1) { // L: 300
					var2.field2456 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3774(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method3814(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method3768(var3, var4, var5);
			} else {
				this.method3814(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method3765(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field2436[var3] = (var5 << 14) + (this.field2436[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field2436[var3] = (var5 << 7) + (this.field2436[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field2438[var3] = (var5 << 7) + (this.field2438[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field2438[var3] = var5 + (this.field2438[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field2439[var3] = (var5 << 7) + (this.field2439[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field2439[var3] = var5 + (this.field2439[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field2446[var3] = (var5 << 7) + (this.field2446[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field2446[var3] = var5 + (this.field2446[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field2432[var3] = (var5 << 7) + (this.field2432[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field2432[var3] = var5 + (this.field2432[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field2433[var3] = (var5 << 7) + (this.field2433[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field2433[var3] = var5 + (this.field2433[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field2454;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2454; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field2454;
					var10000[var3] |= 2;
				} else {
					this.method3779(var3); // L: 352
					var10000 = this.field2454; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field2440[var3] = (var5 << 7) + (this.field2440[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field2440[var3] = (this.field2440[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field2440[var3] = (var5 << 7) + (this.field2440[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field2440[var3] = (this.field2440[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method3750(var3);
			}

			if (var4 == 121) { // L: 361
				this.method3769(var3);
			}

			if (var4 == 123) { // L: 362
				this.method3805(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field2440[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field2434[var3] = (var5 << 7) + (this.field2434[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field2440[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field2434[var3] = var5 + (this.field2434[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field2430[var3] = (var5 << 7) + (this.field2430[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field2430[var3] = var5 + (this.field2430[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field2454;
					var10000[var3] |= 4;
				} else {
					this.method3773(var3); // L: 376
					var10000 = this.field2454; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3775(var3, (var5 << 7) + (this.field2444[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method3775(var3, var5 + (this.field2444[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method3761(var3, var4 + this.field2436[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method3777(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method3767(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method3842(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "368361036"
	)
	void method3775(int var1, int var2) {
		this.field2444[var1] = var2; // L: 410
		this.field2442[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)I",
		garbageValue = "-1046287806"
	)
	int method3776(MusicPatchNode var1) {
		int var2 = (var1.field2466 * var1.field2464 >> 12) + var1.field2476; // L: 415
		var2 += (this.field2441[var1.field2477] - 8192) * this.field2434[var1.field2477] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field2459; // L: 417
		int var4;
		if (var3.field2416 > 0 && (var3.field2415 > 0 || this.field2438[var1.field2477] > 0)) { // L: 418
			var4 = var3.field2415 << 2; // L: 419
			int var5 = var3.field2409 << 1; // L: 420
			if (var1.field2468 < var5) { // L: 421
				var4 = var4 * var1.field2468 / var5;
			}

			var4 += this.field2438[var1.field2477] >> 7; // L: 422
			double var6 = Math.sin((double)(var1.field2469 & 511) * 0.01227184630308513D); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field1443 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)I",
		garbageValue = "1961596880"
	)
	int method3849(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2459; // L: 431
		int var3 = this.field2433[var1.field2477] * this.field2446[var1.field2477] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field2462 + 16384 >> 15; // L: 434
		var3 = var3 * this.field2429 + 128 >> 8; // L: 435
		if (var2.field2410 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2467 * (double)var2.field2410) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2411 != null) { // L: 439
			var4 = var1.field2465; // L: 440
			var5 = var2.field2411[var1.field2472 + 1]; // L: 441
			if (var1.field2472 < var2.field2411.length - 2) { // L: 442
				var6 = (var2.field2411[var1.field2472] & 255) << 8; // L: 443
				var7 = (var2.field2411[var1.field2472 + 2] & 255) << 8; // L: 444
				var5 += (var2.field2411[var1.field2472 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field2470 > 0 && var2.field2412 != null) { // L: 449
			var4 = var1.field2470; // L: 450
			var5 = var2.field2412[var1.field2471 + 1]; // L: 451
			if (var1.field2471 < var2.field2412.length - 2) { // L: 452
				var6 = (var2.field2412[var1.field2471] & 255) << 8; // L: 453
				var7 = (var2.field2412[var1.field2471 + 2] & 255) << 8; // L: 454
				var5 += (var2.field2412[var1.field2471 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var3 * var5 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lhn;S)I",
		garbageValue = "-9329"
	)
	int method3854(MusicPatchNode var1) {
		int var2 = this.field2432[var1.field2477]; // L: 463
		return var2 < 8192 ? var2 * var1.field2463 + 32 >> 6 : 16384 - ((128 - var1.field2463) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1360483838"
	)
	void method3784() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field2453; var2 == this.trackLength; var3 = this.midiFile.method3878(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field2449 || var2 == 0) { // L: 533
							this.method3842(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method3774(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field2453 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)Z",
		garbageValue = "610995738"
	)
	boolean method3851(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field2470 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) { // L: 558
					this.field2447[var1.field2477][var1.field2460] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lhn;[IIII)Z",
		garbageValue = "-638435532"
	)
	boolean method3786(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2475 = PcmPlayer.field1443 / 100; // L: 568
		if (var1.field2470 < 0 || var1.stream != null && !var1.stream.method2623()) { // L: 569
			int var5 = var1.field2466; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2439[var1.field2477] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field2466 = var5; // L: 581
			}

			var1.stream.method2621(this.method3776(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field2459; // L: 584
			boolean var7 = false; // L: 585
			++var1.field2468; // L: 586
			var1.field2469 += var6.field2416; // L: 587
			double var8 = 5.086263020833333E-6D * (double)((var1.field2461 - 60 << 8) + (var1.field2466 * var1.field2464 >> 12)); // L: 588
			if (var6.field2410 > 0) { // L: 589
				if (var6.field2414 > 0) { // L: 590
					var1.field2467 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2414) + 0.5D);
				} else {
					var1.field2467 += 128; // L: 591
				}
			}

			if (var6.field2411 != null) { // L: 593
				if (var6.field2417 > 0) { // L: 594
					var1.field2465 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2417 * var8) + 0.5D);
				} else {
					var1.field2465 += 128; // L: 595
				}

				while (var1.field2472 < var6.field2411.length - 2 && var1.field2465 > (var6.field2411[var1.field2472 + 2] & 255) << 8) { // L: 596
					var1.field2472 += 2;
				}

				if (var6.field2411.length - 2 == var1.field2472 && var6.field2411[var1.field2472 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field2470 >= 0 && var6.field2412 != null && (this.field2454[var1.field2477] & 1) == 0 && (var1.field2460 < 0 || var1 != this.field2447[var1.field2477][var1.field2460])) { // L: 599 600
				if (var6.field2413 > 0) { // L: 601
					var1.field2470 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2413 * var8) + 0.5D);
				} else {
					var1.field2470 += 128; // L: 602
				}

				while (var1.field2471 < var6.field2412.length - 2 && var1.field2470 > (var6.field2412[var1.field2471 + 2] & 255) << 8) { // L: 603
					var1.field2471 += 2;
				}

				if (var6.field2412.length - 2 == var1.field2471) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method2620(var1.field2475); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method2624()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3860(); // L: 612
				if (var1.field2470 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) { // L: 615
						this.field2447[var1.field2477][var1.field2460] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method2744(var1.field2475, this.method3849(var1), this.method3854(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method3860(); // L: 570
			var1.remove(); // L: 571
			if (var1.field2460 > 0 && var1 == this.field2447[var1.field2477][var1.field2460]) { // L: 572
				this.field2447[var1.field2477][var1.field2460] = null; // L: 573
			}

			return true; // L: 575
		}
	}
}
