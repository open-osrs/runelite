import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("j")
	static int[][][] field2489;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1019449591
	)
	int field2512;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -679798271
	)
	int field2494;
	@ObfuscatedName("p")
	int[] field2500;
	@ObfuscatedName("b")
	int[] field2492;
	@ObfuscatedName("e")
	int[] field2493;
	@ObfuscatedName("k")
	int[] field2491;
	@ObfuscatedName("g")
	int[] field2495;
	@ObfuscatedName("h")
	int[] field2505;
	@ObfuscatedName("n")
	int[] field2497;
	@ObfuscatedName("l")
	int[] field2498;
	@ObfuscatedName("m")
	int[] field2499;
	@ObfuscatedName("x")
	int[] field2516;
	@ObfuscatedName("z")
	int[] field2501;
	@ObfuscatedName("i")
	int[] field2502;
	@ObfuscatedName("a")
	int[] field2503;
	@ObfuscatedName("w")
	int[] field2488;
	@ObfuscatedName("s")
	int[] field2490;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[[Lhj;"
	)
	MusicPatchNode[][] field2506;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[Lhj;"
	)
	MusicPatchNode[][] field2507;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("am")
	boolean field2509;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -177178127
	)
	@Export("track")
	int track;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -97944121
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -7685461656623230769L
	)
	long field2496;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 1216058038878883829L
	)
	long field2513;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2512 = 256; // L: 14
		this.field2494 = 1000000; // L: 15
		this.field2500 = new int[16]; // L: 16
		this.field2492 = new int[16]; // L: 17
		this.field2493 = new int[16];
		this.field2491 = new int[16]; // L: 19
		this.field2495 = new int[16];
		this.field2505 = new int[16];
		this.field2497 = new int[16];
		this.field2498 = new int[16]; // L: 23
		this.field2499 = new int[16];
		this.field2516 = new int[16];
		this.field2501 = new int[16]; // L: 29
		this.field2502 = new int[16]; // L: 30
		this.field2503 = new int[16]; // L: 31
		this.field2488 = new int[16]; // L: 32
		this.field2490 = new int[16]; // L: 33
		this.field2506 = new MusicPatchNode[16][128]; // L: 34
		this.field2507 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method3950(); // L: 46
	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2119488267"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2512 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1779220205"
	)
	public int method4018() {
		return this.field2512; // L: 54
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lho;Lir;Lbi;IB)Z",
		garbageValue = "2"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4154(); // L: 58
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

			if (!var9.method4111(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1548325300"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1457707769"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove(); // L: 93
		}

	} // L: 94

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("g")
	protected synchronized int vmethod4124() {
		return 0; // L: 477
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field2494 / PcmPlayer.field394; // L: 482

			do {
				long var5 = this.field2496 + (long)var3 * (long)var4; // L: 484
				if (this.field2513 - var5 >= 0L) { // L: 485
					this.field2496 = var5; // L: 486
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2513 - this.field2496) - 1L) / (long)var4); // L: 489
				this.field2496 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method3934(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lho;ZI)V",
		garbageValue = "-2104011211"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field2509 = var2; // L: 99
		this.field2496 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field2513 = this.midiFile.method4070(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("l")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field2494 / PcmPlayer.field394; // L: 503

			do {
				long var3 = (long)var1 * (long)var2 + this.field2496; // L: 505
				if (this.field2513 - var3 >= 0L) { // L: 506
					this.field2496 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2513 - this.field2496) - 1L) / (long)var2); // L: 510
				this.field2496 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method3934(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1436028334"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method3950(); // L: 114
	} // L: 115

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1133378291"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1540065246"
	)
	public synchronized void method3938(int var1, int var2) {
		this.method3939(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1211768698"
	)
	void method3939(int var1, int var2) {
		this.field2491[var1] = var2; // L: 126
		this.field2505[var1] = var2 & -128; // L: 127
		this.method3963(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1642628999"
	)
	void method3963(int var1, int var2) {
		if (var2 != this.field2495[var1]) { // L: 132
			this.field2495[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field2507[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1083924196"
	)
	void method3941(int var1, int var2, int var3) {
		this.method4017(var1, var2, 64); // L: 139
		if ((this.field2516[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field2554 == var1 && var4.field2561 < 0) { // L: 142
					this.field2506[var1][var4.field2547] = null; // L: 143
					this.field2506[var1][var2] = var4; // L: 144
					int var8 = (var4.field2552 * var4.field2556 >> 12) + var4.field2555; // L: 145
					var4.field2555 += var2 - var4.field2547 << 8; // L: 146
					var4.field2556 = var8 - var4.field2555; // L: 147
					var4.field2552 = 4096; // L: 148
					var4.field2547 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2495[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field2554 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field2550 = var9.field2536[var2]; // L: 162
				var6.field2551 = var9.field2537[var2]; // L: 163
				var6.field2547 = var2; // L: 164
				var6.field2553 = var3 * var3 * var9.field2534[var2] * var9.field2532 + 1024 >> 11; // L: 165
				var6.field2557 = var9.field2539[var2] & 255; // L: 166
				var6.field2555 = (var2 << 8) - (var9.field2533[var2] & 32767); // L: 167
				var6.field2568 = 0; // L: 168
				var6.field2559 = 0; // L: 169
				var6.field2560 = 0; // L: 170
				var6.field2561 = -1; // L: 171
				var6.field2562 = 0; // L: 172
				if (this.field2503[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method898(var5, this.method3955(var6), this.method3956(var6), this.method4032(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method898(var5, this.method3955(var6), 0, this.method4032(var6)); // L: 177
					this.method3933(var6, var9.field2533[var2] < 0); // L: 178
				}

				if (var9.field2533[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2551 >= 0) { // L: 181
					MusicPatchNode var7 = this.field2507[var1][var6.field2551]; // L: 182
					if (var7 != null && var7.field2561 < 0) { // L: 183
						this.field2506[var1][var7.field2547] = null; // L: 184
						var7.field2561 = 0; // L: 185
					}

					this.field2507[var1][var6.field2551] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field2506[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lhj;ZI)V",
		garbageValue = "-744125730"
	)
	void method3933(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field370) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)this.field2503[var1.field2554] * (long)var5 >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method907(); // L: 202
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2503[var1.field2554] >> 6); // L: 206
		}

		var1.stream.method906(var4); // L: 208
	} // L: 209

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "41"
	)
	void method4017(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2506[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field2506[var1][var2] = null; // L: 214
			if ((this.field2516[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var5.field2554 == var4.field2554 && var5.field2561 < 0 && var4 != var5) { // L: 217
						var4.field2561 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field2561 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-74"
	)
	void method3944(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-886416554"
	)
	void method3945(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1447688346"
	)
	void method4034(int var1, int var2) {
		this.field2497[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1464923908"
	)
	void method3947(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field2554 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method920(PcmPlayer.field394 / 100); // L: 239
					if (var2.stream.method941()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4163(); // L: 241
				}

				if (var2.field2561 < 0) { // L: 243
					this.field2506[var2.field2554][var2.field2547] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "119"
	)
	void method3948(int var1) {
		if (var1 >= 0) { // L: 250
			this.field2500[var1] = 12800; // L: 254
			this.field2492[var1] = 8192; // L: 255
			this.field2493[var1] = 16383; // L: 256
			this.field2497[var1] = 8192; // L: 257
			this.field2498[var1] = 0; // L: 258
			this.field2499[var1] = 8192; // L: 259
			this.method3969(var1); // L: 260
			this.method3999(var1); // L: 261
			this.field2516[var1] = 0; // L: 262
			this.field2501[var1] = 32767; // L: 263
			this.field2502[var1] = 256; // L: 264
			this.field2503[var1] = 0; // L: 265
			this.method3967(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method3948(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1519020600"
	)
	void method3949(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field2554 == var1) && var2.field2561 < 0) { // L: 271 272
				this.field2506[var2.field2554][var2.field2547] = null; // L: 273
				var2.field2561 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1718659694"
	)
	void method3950() {
		this.method3947(-1); // L: 281
		this.method3948(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field2495[var1] = this.field2491[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field2505[var1] = this.field2491[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "882944366"
	)
	void method3969(int var1) {
		if ((this.field2516[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field2554 == var1 && this.field2506[var1][var2.field2547] == null && var2.field2561 < 0) { // L: 290 291
					var2.field2561 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	void method3999(int var1) {
		if ((this.field2516[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field2554 == var1) { // L: 300
					var2.field2567 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method4050(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method4017(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method3941(var3, var4, var5);
			} else {
				this.method4017(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method3944(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field2505[var3] = (var5 << 14) + (this.field2505[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field2505[var3] = (var5 << 7) + (this.field2505[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field2498[var3] = (var5 << 7) + (this.field2498[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field2498[var3] = var5 + (this.field2498[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field2499[var3] = (var5 << 7) + (this.field2499[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field2499[var3] = var5 + (this.field2499[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field2500[var3] = (var5 << 7) + (this.field2500[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field2500[var3] = var5 + (this.field2500[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field2492[var3] = (var5 << 7) + (this.field2492[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field2492[var3] = var5 + (this.field2492[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field2493[var3] = (var5 << 7) + (this.field2493[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field2493[var3] = var5 + (this.field2493[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field2516;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2516; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field2516;
					var10000[var3] |= 2;
				} else {
					this.method3969(var3); // L: 352
					var10000 = this.field2516; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field2501[var3] = (var5 << 7) + (this.field2501[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field2501[var3] = (this.field2501[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field2501[var3] = (var5 << 7) + (this.field2501[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field2501[var3] = (this.field2501[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method3947(var3);
			}

			if (var4 == 121) { // L: 361
				this.method3948(var3);
			}

			if (var4 == 123) { // L: 362
				this.method3949(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field2501[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field2502[var3] = (var5 << 7) + (this.field2502[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field2501[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field2502[var3] = var5 + (this.field2502[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field2503[var3] = (var5 << 7) + (this.field2503[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field2503[var3] = var5 + (this.field2503[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field2516;
					var10000[var3] |= 4;
				} else {
					this.method3999(var3); // L: 376
					var10000 = this.field2516; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3967(var3, (var5 << 7) + (this.field2488[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method3967(var3, var5 + (this.field2488[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method3963(var3, var4 + this.field2505[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method3945(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method4034(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method3950(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "26"
	)
	void method3967(int var1, int var2) {
		this.field2488[var1] = var2; // L: 410
		this.field2490[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)I",
		garbageValue = "519117207"
	)
	int method3955(MusicPatchNode var1) {
		int var2 = (var1.field2552 * var1.field2556 >> 12) + var1.field2555; // L: 415
		var2 += (this.field2497[var1.field2554] - 8192) * this.field2502[var1.field2554] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field2550; // L: 417
		int var4;
		if (var3.field2474 > 0 && (var3.field2473 > 0 || this.field2498[var1.field2554] > 0)) { // L: 418
			var4 = var3.field2473 << 2; // L: 419
			int var5 = var3.field2468 << 1; // L: 420
			if (var1.field2563 < var5) { // L: 421
				var4 = var4 * var1.field2563 / var5;
			}

			var4 += this.field2498[var1.field2554] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2564 & 511)); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field394 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)I",
		garbageValue = "1024887560"
	)
	int method3956(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2550; // L: 431
		int var3 = this.field2500[var1.field2554] * this.field2493[var1.field2554] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field2553 + 16384 >> 15; // L: 434
		var3 = var3 * this.field2512 + 128 >> 8; // L: 435
		if (var2.field2469 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2469 * 1.953125E-5D * (double)var1.field2568) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2470 != null) { // L: 439
			var4 = var1.field2559; // L: 440
			var5 = var2.field2470[var1.field2560 + 1]; // L: 441
			if (var1.field2560 < var2.field2470.length - 2) { // L: 442
				var6 = (var2.field2470[var1.field2560] & 255) << 8; // L: 443
				var7 = (var2.field2470[var1.field2560 + 2] & 255) << 8; // L: 444
				var5 += (var4 - var6) * (var2.field2470[var1.field2560 + 3] - var5) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field2561 > 0 && var2.field2467 != null) { // L: 449
			var4 = var1.field2561; // L: 450
			var5 = var2.field2467[var1.field2562 + 1]; // L: 451
			if (var1.field2562 < var2.field2467.length - 2) { // L: 452
				var6 = (var2.field2467[var1.field2562] & 255) << 8; // L: 453
				var7 = (var2.field2467[var1.field2562 + 2] & 255) << 8; // L: 454
				var5 += (var4 - var6) * (var2.field2467[var1.field2562 + 3] - var5) / (var7 - var6); // L: 455
			}

			var3 = var3 * var5 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)I",
		garbageValue = "1588980488"
	)
	int method4032(MusicPatchNode var1) {
		int var2 = this.field2492[var1.field2554]; // L: 463
		return var2 < 8192 ? var2 * var1.field2557 + 32 >> 6 : 16384 - ((128 - var1.field2557) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1441796047"
	)
	void method3934() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field2513; var2 == this.trackLength; var3 = this.midiFile.method4070(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field2509 || var2 == 0) { // L: 533
							this.method3950(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method4050(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field2513 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)Z",
		garbageValue = "2136157877"
	)
	boolean method3964(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field2561 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) { // L: 558
					this.field2507[var1.field2554][var1.field2551] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhj;[IIIB)Z",
		garbageValue = "75"
	)
	boolean method3965(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2566 = PcmPlayer.field394 / 100; // L: 568
		if (var1.field2561 < 0 || var1.stream != null && !var1.stream.method973()) { // L: 569
			int var5 = var1.field2552; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2499[var1.field2554]) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field2552 = var5; // L: 581
			}

			var1.stream.method912(this.method3955(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field2550; // L: 584
			boolean var7 = false; // L: 585
			++var1.field2563; // L: 586
			var1.field2564 += var6.field2474; // L: 587
			double var8 = (double)((var1.field2547 - 60 << 8) + (var1.field2556 * var1.field2552 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field2469 > 0) { // L: 589
				if (var6.field2472 > 0) { // L: 590
					var1.field2568 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2472) + 0.5D);
				} else {
					var1.field2568 += 128; // L: 591
				}
			}

			if (var6.field2470 != null) { // L: 593
				if (var6.field2475 > 0) { // L: 594
					var1.field2559 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2475) + 0.5D);
				} else {
					var1.field2559 += 128; // L: 595
				}

				while (var1.field2560 < var6.field2470.length - 2 && var1.field2559 > (var6.field2470[var1.field2560 + 2] & 255) << 8) { // L: 596
					var1.field2560 += 2;
				}

				if (var6.field2470.length - 2 == var1.field2560 && var6.field2470[var1.field2560 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field2561 >= 0 && var6.field2467 != null && (this.field2516[var1.field2554] & 1) == 0 && (var1.field2551 < 0 || var1 != this.field2507[var1.field2554][var1.field2551])) { // L: 599 600
				if (var6.field2476 > 0) { // L: 601
					var1.field2561 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2476) + 0.5D);
				} else {
					var1.field2561 += 128; // L: 602
				}

				while (var1.field2562 < var6.field2467.length - 2 && var1.field2561 > (var6.field2467[var1.field2562 + 2] & 255) << 8) { // L: 603
					var1.field2562 += 2;
				}

				if (var6.field2467.length - 2 == var1.field2562) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method920(var1.field2566); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method941()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4163(); // L: 612
				if (var1.field2561 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) { // L: 615
						this.field2507[var1.field2554][var1.field2551] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method910(var1.field2566, this.method3956(var1), this.method4032(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method4163(); // L: 570
			var1.remove(); // L: 571
			if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) { // L: 572
				this.field2507[var1.field2554][var1.field2551] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lln;",
		garbageValue = "45"
	)
	public static PrivateChatMode method3952(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3892, PrivateChatMode.field3893, PrivateChatMode.field3891}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field3890) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}
}
