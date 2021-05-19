import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -721191879
	)
	int field2859;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -937356665
	)
	int field2839;
	@ObfuscatedName("g")
	int[] field2840;
	@ObfuscatedName("l")
	int[] field2847;
	@ObfuscatedName("z")
	int[] field2842;
	@ObfuscatedName("t")
	int[] field2843;
	@ObfuscatedName("v")
	int[] field2844;
	@ObfuscatedName("b")
	int[] field2845;
	@ObfuscatedName("q")
	int[] field2846;
	@ObfuscatedName("i")
	int[] field2852;
	@ObfuscatedName("x")
	int[] field2848;
	@ObfuscatedName("m")
	int[] field2853;
	@ObfuscatedName("j")
	int[] field2862;
	@ObfuscatedName("f")
	int[] field2861;
	@ObfuscatedName("s")
	int[] field2854;
	@ObfuscatedName("y")
	int[] field2855;
	@ObfuscatedName("w")
	int[] field2841;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[Liz;"
	)
	MusicPatchNode[][] field2857;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Liz;"
	)
	MusicPatchNode[][] field2858;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2860;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 583793183
	)
	@Export("track")
	int track;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1823610323
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -5295398764407046939L
	)
	long field2863;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 8913828661084540373L
	)
	long field2864;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2859 = 256; // L: 14
		this.field2839 = 1000000; // L: 15
		this.field2840 = new int[16]; // L: 16
		this.field2847 = new int[16]; // L: 17
		this.field2842 = new int[16]; // L: 18
		this.field2843 = new int[16]; // L: 19
		this.field2844 = new int[16]; // L: 20
		this.field2845 = new int[16]; // L: 21
		this.field2846 = new int[16]; // L: 22
		this.field2852 = new int[16]; // L: 23
		this.field2848 = new int[16]; // L: 24
		this.field2853 = new int[16]; // L: 28
		this.field2862 = new int[16]; // L: 29
		this.field2861 = new int[16]; // L: 30
		this.field2854 = new int[16]; // L: 31
		this.field2855 = new int[16]; // L: 32
		this.field2841 = new int[16]; // L: 33
		this.field2857 = new MusicPatchNode[16][128]; // L: 34
		this.field2858 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method4443(); // L: 46
	} // L: 47

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1642106109"
	)
	@Export("setPcmStreamVolume")
	synchronized void setPcmStreamVolume(int var1) {
		this.field2859 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-189437667"
	)
	int method4370() {
		return this.field2859; // L: 54
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljp;Lbu;II)Z",
		garbageValue = "-945056189"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4562(); // L: 58
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

			if (!var9.method4533(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1664614714"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("v")
	protected synchronized int vmethod4560() {
		return 0; // L: 477
	}

	@ObfuscatedName("b")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field2839 / PcmPlayer.field401; // L: 482

			do {
				long var5 = (long)var3 * (long)var4 + this.field2863; // L: 484
				if (this.field2864 - var5 >= 0L) { // L: 485
					this.field2863 = var5; // L: 486
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2864 - this.field2863) - 1L) / (long)var4); // L: 489
				this.field2863 += (long)var7 * (long)var4; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method4457(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lit;ZI)V",
		garbageValue = "-1708010896"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field2860 = var2; // L: 99
		this.field2863 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field2864 = this.midiFile.method4498(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("i")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field2839 / PcmPlayer.field401; // L: 503

			do {
				long var3 = this.field2863 + (long)var2 * (long)var1; // L: 505
				if (this.field2864 - var3 >= 0L) { // L: 506
					this.field2863 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2864 - this.field2863) - 1L) / (long)var2); // L: 510
				this.field2863 += (long)var2 * (long)var5; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method4457(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method4443(); // L: 114
	} // L: 115

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "108"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1960430804"
	)
	public synchronized void method4467(int var1, int var2) {
		this.method4378(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1901698457"
	)
	void method4378(int var1, int var2) {
		this.field2843[var1] = var2; // L: 126
		this.field2845[var1] = var2 & -128; // L: 127
		this.method4379(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-9"
	)
	void method4379(int var1, int var2) {
		if (var2 != this.field2844[var1]) { // L: 132
			this.field2844[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field2858[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1677515144"
	)
	void method4380(int var1, int var2, int var3) {
		this.method4382(var1, var2, 64); // L: 139
		if ((this.field2853[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field2908 == var1 && var4.field2898 < 0) { // L: 142
					this.field2857[var1][var4.field2902] = null; // L: 143
					this.field2857[var1][var2] = var4; // L: 144
					int var8 = (var4.field2900 * var4.field2906 >> 12) + var4.field2905; // L: 145
					var4.field2905 += var2 - var4.field2902 << 8; // L: 146
					var4.field2906 = var8 - var4.field2905; // L: 147
					var4.field2900 = 4096; // L: 148
					var4.field2902 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2844[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field2908 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field2915 = var9.field2880[var2]; // L: 162
				var6.field2907 = var9.field2886[var2]; // L: 163
				var6.field2902 = var2; // L: 164
				var6.field2903 = var3 * var3 * var9.field2888[var2] * var9.field2883 + 1024 >> 11; // L: 165
				var6.field2904 = var9.field2884[var2] & 255; // L: 166
				var6.field2905 = (var2 << 8) - (var9.field2881[var2] & 32767); // L: 167
				var6.field2911 = 0; // L: 168
				var6.field2909 = 0; // L: 169
				var6.field2910 = 0; // L: 170
				var6.field2898 = -1; // L: 171
				var6.field2912 = 0; // L: 172
				if (this.field2854[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method885(var5, this.method4402(var6), this.method4395(var6), this.method4480(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method885(var5, this.method4402(var6), 0, this.method4480(var6)); // L: 177
					this.method4430(var6, var9.field2881[var2] < 0); // L: 178
				}

				if (var9.field2881[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2907 >= 0) { // L: 181
					MusicPatchNode var7 = this.field2858[var1][var6.field2907]; // L: 182
					if (var7 != null && var7.field2898 < 0) { // L: 183
						this.field2857[var1][var7.field2902] = null; // L: 184
						var7.field2898 = 0; // L: 185
					}

					this.field2858[var1][var6.field2907] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field2857[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Liz;ZI)V",
		garbageValue = "-1985723327"
	)
	void method4430(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field381) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field2854[var1.field2908] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method959(); // L: 202
			}
		} else {
			var4 = (int)((long)this.field2854[var1.field2908] * (long)var3 >> 6); // L: 206
		}

		var1.stream.method893(var4); // L: 208
	} // L: 209

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "346835095"
	)
	void method4382(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2857[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field2857[var1][var2] = null; // L: 214
			if ((this.field2853[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var5.field2908 == var4.field2908 && var5.field2898 < 0 && var5 != var4) { // L: 217
						var4.field2898 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field2898 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2125411861"
	)
	void method4383(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1228183682"
	)
	void method4384(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "58"
	)
	void method4414(int var1, int var2) {
		this.field2846[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1869660394"
	)
	void method4386(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field2908 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method898(PcmPlayer.field401 / 100); // L: 239
					if (var2.stream.method902()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4575(); // L: 241
				}

				if (var2.field2898 < 0) { // L: 243
					this.field2857[var2.field2908][var2.field2902] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2132119463"
	)
	void method4387(int var1) {
		if (var1 >= 0) { // L: 250
			this.field2840[var1] = 12800; // L: 254
			this.field2847[var1] = 8192; // L: 255
			this.field2842[var1] = 16383; // L: 256
			this.field2846[var1] = 8192; // L: 257
			this.field2852[var1] = 0; // L: 258
			this.field2848[var1] = 8192; // L: 259
			this.method4390(var1); // L: 260
			this.method4391(var1); // L: 261
			this.field2853[var1] = 0; // L: 262
			this.field2862[var1] = 32767; // L: 263
			this.field2861[var1] = 256; // L: 264
			this.field2854[var1] = 0; // L: 265
			this.method4454(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method4387(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "68"
	)
	void method4388(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field2908 == var1) && var2.field2898 < 0) { // L: 271 272
				this.field2857[var2.field2908][var2.field2902] = null; // L: 273
				var2.field2898 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1564118561"
	)
	void method4443() {
		this.method4386(-1); // L: 281
		this.method4387(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field2844[var1] = this.field2843[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field2845[var1] = this.field2843[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	void method4390(int var1) {
		if ((this.field2853[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field2908 == var1 && this.field2857[var1][var2.field2902] == null && var2.field2898 < 0) { // L: 290 291
					var2.field2898 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-588228357"
	)
	void method4391(int var1) {
		if ((this.field2853[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field2908 == var1) { // L: 300
					var2.field2917 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "74597031"
	)
	void method4392(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method4382(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method4380(var3, var4, var5);
			} else {
				this.method4382(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method4383(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field2845[var3] = (var5 << 14) + (this.field2845[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field2845[var3] = (var5 << 7) + (this.field2845[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field2852[var3] = var5 + (this.field2852[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field2848[var3] = (var5 << 7) + (this.field2848[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field2848[var3] = var5 + (this.field2848[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field2840[var3] = (var5 << 7) + (this.field2840[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field2840[var3] = var5 + (this.field2840[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field2847[var3] = (var5 << 7) + (this.field2847[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field2847[var3] = var5 + (this.field2847[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field2842[var3] = (var5 << 7) + (this.field2842[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field2842[var3] = var5 + (this.field2842[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field2853;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2853; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field2853;
					var10000[var3] |= 2;
				} else {
					this.method4390(var3); // L: 352
					var10000 = this.field2853; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field2862[var3] = (var5 << 7) + (this.field2862[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field2862[var3] = (this.field2862[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field2862[var3] = (var5 << 7) + (this.field2862[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field2862[var3] = (this.field2862[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method4386(var3);
			}

			if (var4 == 121) { // L: 361
				this.method4387(var3);
			}

			if (var4 == 123) { // L: 362
				this.method4388(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field2862[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field2861[var3] = (var5 << 7) + (this.field2861[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field2862[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field2861[var3] = var5 + (this.field2861[var3] & -128);
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
					var10000 = this.field2853;
					var10000[var3] |= 4;
				} else {
					this.method4391(var3); // L: 376
					var10000 = this.field2853; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 380
				this.method4454(var3, (var5 << 7) + (this.field2855[var3] & -16257));
			}

			if (var4 == 49) { // L: 381
				this.method4454(var3, var5 + (this.field2855[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method4379(var3, var4 + this.field2845[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method4384(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method4414(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method4443(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "49"
	)
	void method4454(int var1, int var2) {
		this.field2855[var1] = var2; // L: 410
		this.field2841[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-2127783338"
	)
	int method4402(MusicPatchNode var1) {
		int var2 = (var1.field2906 * var1.field2900 >> 12) + var1.field2905; // L: 415
		var2 += (this.field2846[var1.field2908] - 8192) * this.field2861[var1.field2908] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field2915; // L: 417
		int var4;
		if (var3.field2826 > 0 && (var3.field2824 > 0 || this.field2852[var1.field2908] > 0)) { // L: 418
			var4 = var3.field2824 << 2; // L: 419
			int var5 = var3.field2817 << 1; // L: 420
			if (var1.field2913 < var5) { // L: 421
				var4 = var4 * var1.field2913 / var5;
			}

			var4 += this.field2852[var1.field2908] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2901 & 511)); // L: 423
			var2 += (int)(var6 * (double)var4); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field401 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-1764215804"
	)
	int method4395(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2915; // L: 431
		int var3 = this.field2842[var1.field2908] * this.field2840[var1.field2908] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field2903 + 16384 >> 15; // L: 434
		var3 = var3 * this.field2859 + 128 >> 8; // L: 435
		if (var2.field2825 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2911 * (double)var2.field2825) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2819 != null) { // L: 439
			var4 = var1.field2909; // L: 440
			var5 = var2.field2819[var1.field2910 + 1]; // L: 441
			if (var1.field2910 < var2.field2819.length - 2) { // L: 442
				var6 = (var2.field2819[var1.field2910] & 255) << 8; // L: 443
				var7 = (var2.field2819[var1.field2910 + 2] & 255) << 8; // L: 444
				var5 += (var4 - var6) * (var2.field2819[var1.field2910 + 3] - var5) / (var7 - var6); // L: 445
			}

			var3 = var5 * var3 + 32 >> 6; // L: 447
		}

		if (var1.field2898 > 0 && var2.field2818 != null) { // L: 449
			var4 = var1.field2898; // L: 450
			var5 = var2.field2818[var1.field2912 + 1]; // L: 451
			if (var1.field2912 < var2.field2818.length - 2) { // L: 452
				var6 = (var2.field2818[var1.field2912] & 255) << 8; // L: 453
				var7 = (var2.field2818[var1.field2912 + 2] & 255) << 8; // L: 454
				var5 += (var2.field2818[var1.field2912 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var3 * var5 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-1625883404"
	)
	int method4480(MusicPatchNode var1) {
		int var2 = this.field2847[var1.field2908]; // L: 463
		return var2 < 8192 ? var2 * var1.field2904 + 32 >> 6 : 16384 - ((128 - var1.field2904) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1065370929"
	)
	void method4457() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field2864; var2 == this.trackLength; var3 = this.midiFile.method4498(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field2860 || var2 == 0) { // L: 533
							this.method4443(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method4392(var5);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)Z",
		garbageValue = "-1827120522"
	)
	boolean method4403(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field2898 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) { // L: 558
					this.field2858[var1.field2908][var1.field2907] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liz;[IIII)Z",
		garbageValue = "-2104430914"
	)
	boolean method4419(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2916 = PcmPlayer.field401 / 100; // L: 568
		if (var1.field2898 < 0 || var1.stream != null && !var1.stream.method1004()) { // L: 569
			int var5 = var1.field2900; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2848[var1.field2908]) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field2900 = var5; // L: 581
			}

			var1.stream.method899(this.method4402(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field2915; // L: 584
			boolean var7 = false; // L: 585
			++var1.field2913; // L: 586
			var1.field2901 += var6.field2826; // L: 587
			double var8 = (double)((var1.field2902 - 60 << 8) + (var1.field2906 * var1.field2900 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field2825 > 0) { // L: 589
				if (var6.field2822 > 0) { // L: 590
					var1.field2911 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2822 * var8) + 0.5D);
				} else {
					var1.field2911 += 128; // L: 591
				}
			}

			if (var6.field2819 != null) { // L: 593
				if (var6.field2820 > 0) { // L: 594
					var1.field2909 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2820) + 0.5D);
				} else {
					var1.field2909 += 128; // L: 595
				}

				while (var1.field2910 < var6.field2819.length - 2 && var1.field2909 > (var6.field2819[var1.field2910 + 2] & 255) << 8) { // L: 596
					var1.field2910 += 2;
				}

				if (var6.field2819.length - 2 == var1.field2910 && var6.field2819[var1.field2910 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field2898 >= 0 && var6.field2818 != null && (this.field2853[var1.field2908] & 1) == 0 && (var1.field2907 < 0 || var1 != this.field2858[var1.field2908][var1.field2907])) { // L: 599 600
				if (var6.field2821 > 0) { // L: 601
					var1.field2898 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2821 * var8) + 0.5D);
				} else {
					var1.field2898 += 128; // L: 602
				}

				while (var1.field2912 < var6.field2818.length - 2 && var1.field2898 > (var6.field2818[var1.field2912 + 2] & 255) << 8) { // L: 603
					var1.field2912 += 2;
				}

				if (var6.field2818.length - 2 == var1.field2912) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method898(var1.field2916); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method902()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4575(); // L: 612
				if (var1.field2898 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) { // L: 615
						this.field2858[var1.field2908][var1.field2907] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method897(var1.field2916, this.method4395(var1), this.method4480(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method4575(); // L: 570
			var1.remove(); // L: 571
			if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) { // L: 572
				this.field2858[var1.field2908][var1.field2907] = null; // L: 573
			}

			return true; // L: 575
		}
	}
}
