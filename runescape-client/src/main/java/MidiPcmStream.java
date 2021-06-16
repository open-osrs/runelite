import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1826648467
	)
	int field2840;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2141093893
	)
	int field2841;
	@ObfuscatedName("y")
	int[] field2842;
	@ObfuscatedName("j")
	int[] field2846;
	@ObfuscatedName("o")
	int[] field2861;
	@ObfuscatedName("m")
	int[] field2847;
	@ObfuscatedName("r")
	int[] field2845;
	@ObfuscatedName("h")
	int[] field2844;
	@ObfuscatedName("d")
	int[] field2848;
	@ObfuscatedName("z")
	int[] field2849;
	@ObfuscatedName("b")
	int[] field2853;
	@ObfuscatedName("s")
	int[] field2851;
	@ObfuscatedName("p")
	int[] field2852;
	@ObfuscatedName("c")
	int[] field2850;
	@ObfuscatedName("n")
	int[] field2854;
	@ObfuscatedName("l")
	int[] field2855;
	@ObfuscatedName("w")
	int[] field2856;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2857;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2858;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ad")
	boolean field2839;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1423807839
	)
	@Export("track")
	int track;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 414893157
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8042341810818492123L
	)
	long field2863;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 7751692967903643467L
	)
	long field2864;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2840 = 256; // L: 14
		this.field2841 = 1000000; // L: 15
		this.field2842 = new int[16]; // L: 16
		this.field2846 = new int[16]; // L: 17
		this.field2861 = new int[16]; // L: 18
		this.field2847 = new int[16]; // L: 19
		this.field2845 = new int[16]; // L: 20
		this.field2844 = new int[16]; // L: 21
		this.field2848 = new int[16]; // L: 22
		this.field2849 = new int[16]; // L: 23
		this.field2853 = new int[16]; // L: 24
		this.field2851 = new int[16]; // L: 28
		this.field2852 = new int[16]; // L: 29
		this.field2850 = new int[16]; // L: 30
		this.field2854 = new int[16]; // L: 31
		this.field2855 = new int[16]; // L: 32
		this.field2856 = new int[16]; // L: 33
		this.field2857 = new MusicPatchNode[16][128]; // L: 34
		this.field2858 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method4575(); // L: 46
	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2840 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method4660() {
		return this.field2840; // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lio;Ljp;Lbz;II)Z",
		garbageValue = "-673775951"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4771(); // L: 58
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

			if (!var9.method4731(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1280921587"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "787769784"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("r")
	protected synchronized int vmethod4740() {
		return 0; // L: 477
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field2841 / class341.field3921; // L: 482

			do {
				long var5 = (long)var3 * (long)var4 + this.field2863; // L: 484
				if (this.field2864 - var5 >= 0L) { // L: 485
					this.field2863 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field2864 - this.field2863 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field2863 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method4588(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lio;ZI)V",
		garbageValue = "-2021811263"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field2839 = var2; // L: 99
		this.field2863 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field2864 = this.midiFile.method4710(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("z")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field2841 / class341.field3921; // L: 503

			do {
				long var3 = (long)var1 * (long)var2 + this.field2863; // L: 505
				if (this.field2864 - var3 >= 0L) { // L: 506
					this.field2863 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2864 - this.field2863) - 1L) / (long)var2); // L: 510
				this.field2863 += (long)var2 * (long)var5; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method4588(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method4575(); // L: 114
	} // L: 115

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1843453272"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "42"
	)
	public synchronized void method4563(int var1, int var2) {
		this.method4564(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-70"
	)
	void method4564(int var1, int var2) {
		this.field2847[var1] = var2; // L: 126
		this.field2844[var1] = var2 & -128; // L: 127
		this.method4574(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1581669707"
	)
	void method4574(int var1, int var2) {
		if (var2 != this.field2845[var1]) { // L: 132
			this.field2845[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field2858[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1801299833"
	)
	void method4566(int var1, int var2, int var3) {
		this.method4666(var1, var2, 64); // L: 139
		if ((this.field2851[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field2898 == var1 && var4.field2903 < 0) { // L: 142
					this.field2857[var1][var4.field2910] = null; // L: 143
					this.field2857[var1][var2] = var4; // L: 144
					int var8 = (var4.field2914 * var4.field2901 >> 12) + var4.field2907; // L: 145
					var4.field2907 += var2 - var4.field2910 << 8; // L: 146
					var4.field2901 = var8 - var4.field2907; // L: 147
					var4.field2914 = 4096; // L: 148
					var4.field2910 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2845[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field2898 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field2904 = var9.field2884[var2]; // L: 162
				var6.field2897 = var9.field2886[var2]; // L: 163
				var6.field2910 = var2; // L: 164
				var6.field2900 = var3 * var3 * var9.field2883[var2] * var9.field2885 + 1024 >> 11; // L: 165
				var6.field2902 = var9.field2880[var2] & 255; // L: 166
				var6.field2907 = (var2 << 8) - (var9.field2882[var2] & 32767); // L: 167
				var6.field2894 = 0; // L: 168
				var6.field2906 = 0; // L: 169
				var6.field2905 = 0; // L: 170
				var6.field2903 = -1; // L: 171
				var6.field2909 = 0; // L: 172
				if (this.field2854[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method937(var5, this.method4632(var6), this.method4581(var6), this.method4650(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method937(var5, this.method4632(var6), 0, this.method4650(var6)); // L: 177
					this.method4567(var6, var9.field2882[var2] < 0); // L: 178
				}

				if (var9.field2882[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2897 >= 0) { // L: 181
					MusicPatchNode var7 = this.field2858[var1][var6.field2897]; // L: 182
					if (var7 != null && var7.field2903 < 0) { // L: 183
						this.field2857[var1][var7.field2910] = null; // L: 184
						var7.field2903 = 0; // L: 185
					}

					this.field2858[var1][var6.field2897] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field2857[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;ZI)V",
		garbageValue = "1606151244"
	)
	void method4567(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field380) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field2854[var1.field2898] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method941(); // L: 202
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2854[var1.field2898] >> 6); // L: 206
		}

		var1.stream.method950(var4); // L: 208
	} // L: 209

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1927529539"
	)
	void method4666(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2857[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field2857[var1][var2] = null; // L: 214
			if ((this.field2851[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var4.field2898 == var5.field2898 && var5.field2903 < 0 && var5 != var4) { // L: 217
						var4.field2903 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field2903 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2002263313"
	)
	void method4569(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-459034632"
	)
	void method4568(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1249872896"
	)
	void method4571(int var1, int var2) {
		this.field2848[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-353606321"
	)
	void method4572(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field2898 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method955(class341.field3921 / 100); // L: 239
					if (var2.stream.method959()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4772(); // L: 241
				}

				if (var2.field2903 < 0) { // L: 243
					this.field2857[var2.field2898][var2.field2910] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "905785527"
	)
	void method4573(int var1) {
		if (var1 >= 0) { // L: 250
			this.field2842[var1] = 12800; // L: 254
			this.field2846[var1] = 8192; // L: 255
			this.field2861[var1] = 16383; // L: 256
			this.field2848[var1] = 8192; // L: 257
			this.field2849[var1] = 0; // L: 258
			this.field2853[var1] = 8192; // L: 259
			this.method4649(var1); // L: 260
			this.method4617(var1); // L: 261
			this.field2851[var1] = 0; // L: 262
			this.field2852[var1] = 32767; // L: 263
			this.field2850[var1] = 256; // L: 264
			this.field2854[var1] = 0; // L: 265
			this.method4579(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method4573(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "133609518"
	)
	void method4644(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field2898 == var1) && var2.field2903 < 0) { // L: 271 272
				this.field2857[var2.field2898][var2.field2910] = null; // L: 273
				var2.field2903 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2004654152"
	)
	void method4575() {
		this.method4572(-1); // L: 281
		this.method4573(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field2845[var1] = this.field2847[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field2844[var1] = this.field2847[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2122126750"
	)
	void method4649(int var1) {
		if ((this.field2851[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field2898 == var1 && this.field2857[var1][var2.field2910] == null && var2.field2903 < 0) { // L: 290 291
					var2.field2903 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1304197009"
	)
	void method4617(int var1) {
		if ((this.field2851[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field2898 == var1) { // L: 300
					var2.field2899 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1402753770"
	)
	void method4578(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method4666(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method4566(var3, var4, var5);
			} else {
				this.method4666(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method4569(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field2844[var3] = (var5 << 14) + (this.field2844[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field2849[var3] = (var5 << 7) + (this.field2849[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field2849[var3] = var5 + (this.field2849[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field2853[var3] = (var5 << 7) + (this.field2853[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field2853[var3] = var5 + (this.field2853[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field2842[var3] = (var5 << 7) + (this.field2842[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field2842[var3] = var5 + (this.field2842[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field2846[var3] = (var5 << 7) + (this.field2846[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field2846[var3] = var5 + (this.field2846[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field2861[var3] = (var5 << 7) + (this.field2861[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field2861[var3] = var5 + (this.field2861[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field2851;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2851; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field2851;
					var10000[var3] |= 2;
				} else {
					this.method4649(var3); // L: 352
					var10000 = this.field2851; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field2852[var3] = (this.field2852[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field2852[var3] = (this.field2852[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method4572(var3);
			}

			if (var4 == 121) { // L: 361
				this.method4573(var3);
			}

			if (var4 == 123) { // L: 362
				this.method4644(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field2852[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field2850[var3] = (var5 << 7) + (this.field2850[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field2852[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field2850[var3] = var5 + (this.field2850[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field2854[var3] = (var5 << 7) + (this.field2854[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field2854[var3] = var5 + (this.field2854[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field2851;
					var10000[var3] |= 4;
				} else {
					this.method4617(var3); // L: 376
					var10000 = this.field2851; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4579(var3, (var5 << 7) + (this.field2855[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method4579(var3, var5 + (this.field2855[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method4574(var3, var4 + this.field2844[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method4568(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method4571(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method4575(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-264828177"
	)
	void method4579(int var1, int var2) {
		this.field2855[var1] = var2; // L: 410
		this.field2856[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "627320861"
	)
	int method4632(MusicPatchNode var1) {
		int var2 = (var1.field2914 * var1.field2901 >> 12) + var1.field2907; // L: 415
		var2 += (this.field2848[var1.field2898] - 8192) * this.field2850[var1.field2898] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field2904; // L: 417
		int var4;
		if (var3.field2827 > 0 && (var3.field2826 > 0 || this.field2849[var1.field2898] > 0)) { // L: 418
			var4 = var3.field2826 << 2; // L: 419
			int var5 = var3.field2829 << 1; // L: 420
			if (var1.field2908 < var5) { // L: 421
				var4 = var4 * var1.field2908 / var5;
			}

			var4 += this.field2849[var1.field2898] >> 7; // L: 422
			double var6 = Math.sin((double)(var1.field2911 & 511) * 0.01227184630308513D); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)class341.field3921 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "-1286368221"
	)
	int method4581(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2904; // L: 431
		int var3 = this.field2842[var1.field2898] * this.field2861[var1.field2898] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field2900 + 16384 >> 15; // L: 434
		var3 = var3 * this.field2840 + 128 >> 8; // L: 435
		if (var2.field2823 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2823 * 1.953125E-5D * (double)var1.field2894) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2821 != null) { // L: 439
			var4 = var1.field2906; // L: 440
			var5 = var2.field2821[var1.field2905 + 1]; // L: 441
			if (var1.field2905 < var2.field2821.length - 2) { // L: 442
				var6 = (var2.field2821[var1.field2905] & 255) << 8; // L: 443
				var7 = (var2.field2821[var1.field2905 + 2] & 255) << 8; // L: 444
				var5 += (var2.field2821[var1.field2905 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 445
			}

			var3 = var5 * var3 + 32 >> 6; // L: 447
		}

		if (var1.field2903 > 0 && var2.field2828 != null) { // L: 449
			var4 = var1.field2903; // L: 450
			var5 = var2.field2828[var1.field2909 + 1]; // L: 451
			if (var1.field2909 < var2.field2828.length - 2) { // L: 452
				var6 = (var2.field2828[var1.field2909] & 255) << 8; // L: 453
				var7 = (var2.field2828[var1.field2909 + 2] & 255) << 8; // L: 454
				var5 += (var4 - var6) * (var2.field2828[var1.field2909 + 3] - var5) / (var7 - var6); // L: 455
			}

			var3 = var5 * var3 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "2045479165"
	)
	int method4650(MusicPatchNode var1) {
		int var2 = this.field2846[var1.field2898]; // L: 463
		return var2 < 8192 ? var2 * var1.field2902 + 32 >> 6 : 16384 - ((128 - var1.field2902) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	void method4588() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field2864; var2 == this.trackLength; var3 = this.midiFile.method4710(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field2839 || var2 == 0) { // L: 533
							this.method4575(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method4578(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field2864 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)Z",
		garbageValue = "896454021"
	)
	boolean method4589(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field2903 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) { // L: 558
					this.field2858[var1.field2898][var1.field2897] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIII)Z",
		garbageValue = "-1780917654"
	)
	boolean method4590(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2913 = class341.field3921 / 100; // L: 568
		if (var1.field2903 < 0 || var1.stream != null && !var1.stream.method1065()) { // L: 569
			int var5 = var1.field2914; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2853[var1.field2898] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field2914 = var5; // L: 581
			}

			var1.stream.method1052(this.method4632(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field2904; // L: 584
			boolean var7 = false; // L: 585
			++var1.field2908; // L: 586
			var1.field2911 += var6.field2827; // L: 587
			double var8 = (double)((var1.field2910 - 60 << 8) + (var1.field2914 * var1.field2901 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field2823 > 0) { // L: 589
				if (var6.field2822 > 0) { // L: 590
					var1.field2894 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2822) + 0.5D);
				} else {
					var1.field2894 += 128; // L: 591
				}
			}

			if (var6.field2821 != null) { // L: 593
				if (var6.field2824 > 0) { // L: 594
					var1.field2906 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2824 * var8) + 0.5D);
				} else {
					var1.field2906 += 128; // L: 595
				}

				while (var1.field2905 < var6.field2821.length - 2 && var1.field2906 > (var6.field2821[var1.field2905 + 2] & 255) << 8) { // L: 596
					var1.field2905 += 2;
				}

				if (var6.field2821.length - 2 == var1.field2905 && var6.field2821[var1.field2905 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field2903 >= 0 && var6.field2828 != null && (this.field2851[var1.field2898] & 1) == 0 && (var1.field2897 < 0 || var1 != this.field2858[var1.field2898][var1.field2897])) { // L: 599 600
				if (var6.field2825 > 0) { // L: 601
					var1.field2903 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2825 * var8) + 0.5D);
				} else {
					var1.field2903 += 128; // L: 602
				}

				while (var1.field2909 < var6.field2828.length - 2 && var1.field2903 > (var6.field2828[var1.field2909 + 2] & 255) << 8) { // L: 603
					var1.field2909 += 2;
				}

				if (var6.field2828.length - 2 == var1.field2909) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method955(var1.field2913); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method959()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4772(); // L: 612
				if (var1.field2903 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) { // L: 615
						this.field2858[var1.field2898][var1.field2897] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method954(var1.field2913, this.method4581(var1), this.method4650(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method4772(); // L: 570
			var1.remove(); // L: 571
			if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) { // L: 572
				this.field2858[var1.field2898][var1.field2897] = null; // L: 573
			}

			return true; // L: 575
		}
	}
}
