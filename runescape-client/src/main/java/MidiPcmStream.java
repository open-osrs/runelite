import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -50885851
	)
	int field2440;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 588111065
	)
	int field2446;
	@ObfuscatedName("m")
	int[] field2438;
	@ObfuscatedName("z")
	int[] field2448;
	@ObfuscatedName("q")
	int[] field2450;
	@ObfuscatedName("k")
	int[] field2462;
	@ObfuscatedName("c")
	int[] field2442;
	@ObfuscatedName("u")
	int[] field2459;
	@ObfuscatedName("t")
	int[] field2435;
	@ObfuscatedName("e")
	int[] field2436;
	@ObfuscatedName("o")
	int[] field2444;
	@ObfuscatedName("w")
	int[] field2449;
	@ObfuscatedName("v")
	int[] field2441;
	@ObfuscatedName("d")
	int[] field2451;
	@ObfuscatedName("a")
	int[] field2452;
	@ObfuscatedName("g")
	int[] field2453;
	@ObfuscatedName("h")
	int[] field2454;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Lhl;"
	)
	MusicPatchNode[][] field2455;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[Lhl;"
	)
	MusicPatchNode[][] field2456;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2458;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 236042269
	)
	@Export("track")
	int track;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -813288527
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 4033442646314588215L
	)
	long field2461;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 5989401490553660197L
	)
	long field2445;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2440 = 256; // L: 14
		this.field2446 = 1000000; // L: 15
		this.field2438 = new int[16]; // L: 16
		this.field2448 = new int[16]; // L: 17
		this.field2450 = new int[16]; // L: 18
		this.field2462 = new int[16]; // L: 19
		this.field2442 = new int[16]; // L: 20
		this.field2459 = new int[16]; // L: 21
		this.field2435 = new int[16]; // L: 22
		this.field2436 = new int[16]; // L: 23
		this.field2444 = new int[16]; // L: 24
		this.field2449 = new int[16]; // L: 28
		this.field2441 = new int[16]; // L: 29
		this.field2451 = new int[16]; // L: 30
		this.field2452 = new int[16]; // L: 31
		this.field2453 = new int[16]; // L: 32
		this.field2454 = new int[16]; // L: 33
		this.field2455 = new MusicPatchNode[16][128]; // L: 34
		this.field2456 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method3875(); // L: 46
	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1236957115"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2440 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1869146108"
	)
	public int method3856() {
		return this.field2440; // L: 54
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Liw;Lds;II)Z",
		garbageValue = "-577987969"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4061(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = UserComparator4.method3497(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method4026(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1712766376"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 80
			var1.clear();
		}

	} // L: 81

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1913865181"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 84
			var1.remove();
		}

	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("c")
	protected synchronized int vmethod4043() {
		return 0; // L: 468
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field2446 / PcmPlayer.field1442; // L: 473

			do {
				long var5 = this.field2461 + (long)var4 * (long)var3; // L: 475
				if (this.field2445 - var5 >= 0L) { // L: 476
					this.field2461 = var5; // L: 477
					break;
				}

				int var7 = (int)((this.field2445 - this.field2461 + (long)var4 - 1L) / (long)var4); // L: 480
				this.field2461 += (long)var7 * (long)var4; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method3888(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lhj;ZI)V",
		garbageValue = "1794864455"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field2458 = var2; // L: 90
		this.field2461 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field2445 = this.midiFile.method4025(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("e")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field2446 / PcmPlayer.field1442; // L: 494

			do {
				long var3 = this.field2461 + (long)var1 * (long)var2; // L: 496
				if (this.field2445 - var3 >= 0L) { // L: 497
					this.field2461 = var3; // L: 498
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2445 - this.field2461) - 1L) / (long)var2); // L: 501
				this.field2461 += (long)var5 * (long)var2; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method3888(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method3875(); // L: 105
	} // L: 106

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1819990348"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	public synchronized void method3863(int var1, int var2) {
		this.method3915(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-20747"
	)
	void method3915(int var1, int var2) {
		this.field2462[var1] = var2; // L: 117
		this.field2459[var1] = var2 & -128; // L: 118
		this.method3929(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-313859079"
	)
	void method3929(int var1, int var2) {
		if (var2 != this.field2442[var1]) { // L: 123
			this.field2442[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field2456[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-384310039"
	)
	void method3866(int var1, int var2, int var3) {
		this.method3913(var1, var2, 64); // L: 130
		if ((this.field2449[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field2479 == var1 && var4.field2473 < 0) { // L: 133
					this.field2455[var1][var4.field2466] = null; // L: 134
					this.field2455[var1][var2] = var4; // L: 135
					int var8 = (var4.field2470 * var4.field2474 >> 12) + var4.field2472; // L: 136
					var4.field2472 += var2 - var4.field2466 << 8; // L: 137
					var4.field2470 = var8 - var4.field2472; // L: 138
					var4.field2474 = 4096; // L: 139
					var4.field2466 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2442[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field2479 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field2464 = var9.field2506[var2]; // L: 153
				var6.field2468 = var9.field2509[var2]; // L: 154
				var6.field2466 = var2; // L: 155
				var6.field2469 = var3 * var3 * var9.field2502[var2] * var9.field2507 + 1024 >> 11; // L: 156
				var6.field2465 = var9.field2505[var2] & 255; // L: 157
				var6.field2472 = (var2 << 8) - (var9.field2504[var2] & 32767); // L: 158
				var6.field2475 = 0; // L: 159
				var6.field2476 = 0; // L: 160
				var6.field2477 = 0; // L: 161
				var6.field2473 = -1; // L: 162
				var6.field2485 = 0; // L: 163
				if (this.field2452[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method2683(var5, this.method3880(var6), this.method3881(var6), this.method3882(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method2683(var5, this.method3880(var6), 0, this.method3882(var6)); // L: 168
					this.method3867(var6, var9.field2504[var2] < 0); // L: 169
				}

				if (var9.field2504[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2468 >= 0) { // L: 172
					MusicPatchNode var7 = this.field2456[var1][var6.field2468]; // L: 173
					if (var7 != null && var7.field2473 < 0) { // L: 174
						this.field2455[var1][var7.field2466] = null; // L: 175
						var7.field2473 = 0; // L: 176
					}

					this.field2456[var1][var6.field2468] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field2455[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ZI)V",
		garbageValue = "1636095944"
	)
	void method3867(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field1416) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)var5 * (long)this.field2452[var1.field2479] >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method2788(); // L: 193
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2452[var1.field2479] >> 6); // L: 197
		}

		var1.stream.method2682(var4); // L: 199
	} // L: 200

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-722165372"
	)
	void method3913(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2455[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field2455[var1][var2] = null; // L: 205
			if ((this.field2449[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var4.field2479 == var5.field2479 && var5.field2473 < 0 && var5 != var4) { // L: 208
						var4.field2473 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field2473 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "121"
	)
	void method3897(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1674175932"
	)
	void method3870(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1933284003"
	)
	void method3854(int var1, int var2) {
		this.field2435[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-406448805"
	)
	void method3909(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field2479 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method2687(PcmPlayer.field1442 / 100); // L: 230
					if (var2.stream.method2786()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3971(); // L: 232
				}

				if (var2.field2473 < 0) { // L: 234
					this.field2455[var2.field2479][var2.field2466] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1555645586"
	)
	void method3873(int var1) {
		if (var1 >= 0) { // L: 241
			this.field2438[var1] = 12800; // L: 245
			this.field2448[var1] = 8192; // L: 246
			this.field2450[var1] = 16383; // L: 247
			this.field2435[var1] = 8192; // L: 248
			this.field2436[var1] = 0; // L: 249
			this.field2444[var1] = 8192; // L: 250
			this.method3876(var1); // L: 251
			this.method3896(var1); // L: 252
			this.field2449[var1] = 0; // L: 253
			this.field2441[var1] = 32767; // L: 254
			this.field2451[var1] = 256; // L: 255
			this.field2452[var1] = 0; // L: 256
			this.method3879(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method3873(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1324388853"
	)
	void method3874(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field2479 == var1) && var2.field2473 < 0) { // L: 262 263
				this.field2455[var2.field2479][var2.field2466] = null; // L: 264
				var2.field2473 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1070781239"
	)
	void method3875() {
		this.method3909(-1); // L: 272
		this.method3873(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field2442[var1] = this.field2462[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field2459[var1] = this.field2462[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-394347948"
	)
	void method3876(int var1) {
		if ((this.field2449[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field2479 == var1 && this.field2455[var1][var2.field2466] == null && var2.field2473 < 0) { // L: 281 282
					var2.field2473 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	void method3896(int var1) {
		if ((this.field2449[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field2479 == var1) { // L: 291
					var2.field2484 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3908(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method3913(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method3866(var3, var4, var5);
			} else {
				this.method3913(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method3897(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field2459[var3] = (var5 << 14) + (this.field2459[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field2459[var3] = (var5 << 7) + (this.field2459[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field2436[var3] = (var5 << 7) + (this.field2436[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field2436[var3] = var5 + (this.field2436[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field2444[var3] = (var5 << 7) + (this.field2444[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field2444[var3] = var5 + (this.field2444[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field2438[var3] = (var5 << 7) + (this.field2438[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field2438[var3] = var5 + (this.field2438[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field2448[var3] = (var5 << 7) + (this.field2448[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field2448[var3] = var5 + (this.field2448[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field2450[var3] = (var5 << 7) + (this.field2450[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field2450[var3] = var5 + (this.field2450[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field2449;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2449; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field2449;
					var10000[var3] |= 2;
				} else {
					this.method3876(var3); // L: 343
					var10000 = this.field2449; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field2441[var3] = (var5 << 7) + (this.field2441[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field2441[var3] = (this.field2441[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field2441[var3] = (var5 << 7) + (this.field2441[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field2441[var3] = (this.field2441[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method3909(var3);
			}

			if (var4 == 121) { // L: 352
				this.method3873(var3);
			}

			if (var4 == 123) { // L: 353
				this.method3874(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field2441[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field2451[var3] = (var5 << 7) + (this.field2451[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field2441[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field2451[var3] = var5 + (this.field2451[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field2452[var3] = (var5 << 7) + (this.field2452[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field2452[var3] = var5 + (this.field2452[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field2449;
					var10000[var3] |= 4;
				} else {
					this.method3896(var3); // L: 367
					var10000 = this.field2449; // L: 368
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3879(var3, (var5 << 7) + (this.field2453[var3] & -16257)); // L: 371
			}

			if (var4 == 49) { // L: 372
				this.method3879(var3, var5 + (this.field2453[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method3929(var3, var4 + this.field2459[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method3870(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method3854(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method3875(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1675086749"
	)
	void method3879(int var1, int var2) {
		this.field2453[var1] = var2; // L: 401
		this.field2454[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lhl;B)I",
		garbageValue = "12"
	)
	int method3880(MusicPatchNode var1) {
		int var2 = (var1.field2474 * var1.field2470 >> 12) + var1.field2472; // L: 406
		var2 += (this.field2435[var1.field2479] - 8192) * this.field2451[var1.field2479] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field2464; // L: 408
		int var4;
		if (var3.field2424 > 0 && (var3.field2418 > 0 || this.field2436[var1.field2479] > 0)) { // L: 409
			var4 = var3.field2418 << 2; // L: 410
			int var5 = var3.field2425 << 1; // L: 411
			if (var1.field2480 < var5) { // L: 412
				var4 = var4 * var1.field2480 / var5;
			}

			var4 += this.field2436[var1.field2479] >> 7; // L: 413
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2467 & 511)); // L: 414
			var2 += (int)(var6 * (double)var4); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field1442 + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhl;I)I",
		garbageValue = "1185861696"
	)
	int method3881(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2464; // L: 422
		int var3 = this.field2438[var1.field2479] * this.field2450[var1.field2479] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field2469 + 16384 >> 15; // L: 425
		var3 = var3 * this.field2440 + 128 >> 8; // L: 426
		if (var2.field2419 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2475 * (double)var2.field2419) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2423 != null) { // L: 430
			var4 = var1.field2476; // L: 431
			var5 = var2.field2423[var1.field2477 + 1]; // L: 432
			if (var1.field2477 < var2.field2423.length - 2) { // L: 433
				var6 = (var2.field2423[var1.field2477] & 255) << 8; // L: 434
				var7 = (var2.field2423[var1.field2477 + 2] & 255) << 8; // L: 435
				var5 += (var2.field2423[var1.field2477 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 436
			}

			var3 = var5 * var3 + 32 >> 6; // L: 438
		}

		if (var1.field2473 > 0 && var2.field2426 != null) { // L: 440
			var4 = var1.field2473; // L: 441
			var5 = var2.field2426[var1.field2485 + 1]; // L: 442
			if (var1.field2485 < var2.field2426.length - 2) { // L: 443
				var6 = (var2.field2426[var1.field2485] & 255) << 8; // L: 444
				var7 = (var2.field2426[var1.field2485 + 2] & 255) << 8; // L: 445
				var5 += (var4 - var6) * (var2.field2426[var1.field2485 + 3] - var5) / (var7 - var6); // L: 446
			}

			var3 = var5 * var3 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhl;B)I",
		garbageValue = "-20"
	)
	int method3882(MusicPatchNode var1) {
		int var2 = this.field2448[var1.field2479]; // L: 454
		return var2 < 8192 ? var2 * var1.field2465 + 32 >> 6 : 16384 - ((128 - var1.field2465) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	void method3888() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field2445; var2 == this.trackLength; var3 = this.midiFile.method4025(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field2458 || var2 == 0) { // L: 524
							this.method3875(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method3908(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field2445 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhl;I)Z",
		garbageValue = "1703844968"
	)
	boolean method3889(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field2473 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) { // L: 549
					this.field2456[var1.field2479][var1.field2468] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhl;[IIIB)Z",
		garbageValue = "-77"
	)
	boolean method3877(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2483 = PcmPlayer.field1442 / 100; // L: 559
		if (var1.field2473 < 0 || var1.stream != null && !var1.stream.method2690()) { // L: 560
			int var5 = var1.field2474; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2444[var1.field2479] * 4.921259842519685E-4D) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field2474 = var5; // L: 572
			}

			var1.stream.method2733(this.method3880(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field2464; // L: 575
			boolean var7 = false; // L: 576
			++var1.field2480; // L: 577
			var1.field2467 += var6.field2424; // L: 578
			double var8 = 5.086263020833333E-6D * (double)((var1.field2466 - 60 << 8) + (var1.field2470 * var1.field2474 >> 12)); // L: 579
			if (var6.field2419 > 0) { // L: 580
				if (var6.field2422 > 0) { // L: 581
					var1.field2475 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2422 * var8) + 0.5D);
				} else {
					var1.field2475 += 128; // L: 582
				}
			}

			if (var6.field2423 != null) { // L: 584
				if (var6.field2420 > 0) { // L: 585
					var1.field2476 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2420) + 0.5D);
				} else {
					var1.field2476 += 128; // L: 586
				}

				while (var1.field2477 < var6.field2423.length - 2 && var1.field2476 > (var6.field2423[var1.field2477 + 2] & 255) << 8) { // L: 587
					var1.field2477 += 2;
				}

				if (var6.field2423.length - 2 == var1.field2477 && var6.field2423[var1.field2477 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field2473 >= 0 && var6.field2426 != null && (this.field2449[var1.field2479] & 1) == 0 && (var1.field2468 < 0 || var1 != this.field2456[var1.field2479][var1.field2468])) { // L: 590 591
				if (var6.field2421 > 0) { // L: 592
					var1.field2473 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2421) + 0.5D);
				} else {
					var1.field2473 += 128; // L: 593
				}

				while (var1.field2485 < var6.field2426.length - 2 && var1.field2473 > (var6.field2426[var1.field2485 + 2] & 255) << 8) { // L: 594
					var1.field2485 += 2;
				}

				if (var6.field2426.length - 2 == var1.field2485) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method2687(var1.field2483); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method2786()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3971(); // L: 603
				if (var1.field2473 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) { // L: 606
						this.field2456[var1.field2479][var1.field2468] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method2686(var1.field2483, this.method3881(var1), this.method3882(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method3971(); // L: 561
			var1.remove(); // L: 562
			if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) { // L: 563
				this.field2456[var1.field2479][var1.field2468] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1417043368"
	)
	public static void method3970() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 86
	} // L: 87
}
