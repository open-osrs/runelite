import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1803205059
	)
	int field2930;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -567401845
	)
	int field2931;
	@ObfuscatedName("o")
	int[] field2956;
	@ObfuscatedName("g")
	int[] field2933;
	@ObfuscatedName("e")
	int[] field2934;
	@ObfuscatedName("p")
	int[] field2941;
	@ObfuscatedName("j")
	int[] field2936;
	@ObfuscatedName("b")
	int[] field2937;
	@ObfuscatedName("x")
	int[] field2938;
	@ObfuscatedName("y")
	int[] field2939;
	@ObfuscatedName("k")
	int[] field2940;
	@ObfuscatedName("d")
	int[] field2944;
	@ObfuscatedName("r")
	int[] field2942;
	@ObfuscatedName("m")
	int[] field2943;
	@ObfuscatedName("c")
	int[] field2932;
	@ObfuscatedName("f")
	int[] field2945;
	@ObfuscatedName("h")
	int[] field2946;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2952;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2949;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("aq")
	boolean field2950;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -825600901
	)
	@Export("track")
	int track;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1277249171
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -2626160015081860905L
	)
	long field2953;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 8598063187503057895L
	)
	long field2954;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2930 = 256; // L: 14
		this.field2931 = 1000000; // L: 15
		this.field2956 = new int[16]; // L: 16
		this.field2933 = new int[16]; // L: 17
		this.field2934 = new int[16]; // L: 18
		this.field2941 = new int[16]; // L: 19
		this.field2936 = new int[16]; // L: 20
		this.field2937 = new int[16]; // L: 21
		this.field2938 = new int[16]; // L: 22
		this.field2939 = new int[16]; // L: 23
		this.field2940 = new int[16]; // L: 24
		this.field2944 = new int[16]; // L: 28
		this.field2942 = new int[16]; // L: 29
		this.field2943 = new int[16]; // L: 30
		this.field2932 = new int[16]; // L: 31
		this.field2945 = new int[16]; // L: 32
		this.field2946 = new int[16]; // L: 33
		this.field2952 = new MusicPatchNode[16][128]; // L: 34
		this.field2949 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method4773(); // L: 46
	} // L: 47

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "649793377"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2930 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	int method4754() {
		return this.field2930; // L: 54
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Liv;Lko;Lad;IB)Z",
		garbageValue = "84"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4981(); // L: 58
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

			if (!var9.method4945(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove(); // L: 93
		}

	} // L: 94

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("p")
	protected synchronized int vmethod4958() {
		return 0; // L: 477
	}

	@ObfuscatedName("j")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field2931 / UserComparator2.field4359; // L: 482

			do {
				long var5 = this.field2953 + (long)var4 * (long)var3; // L: 484
				if (this.field2954 - var5 >= 0L) { // L: 485
					this.field2953 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field2954 - this.field2953 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field2953 += (long)var7 * (long)var4; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method4758(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Liv;ZI)V",
		garbageValue = "-323229472"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field2950 = var2; // L: 99
		this.field2953 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field2954 = this.midiFile.method4934(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("x")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field2931 / UserComparator2.field4359; // L: 503

			do {
				long var3 = (long)var1 * (long)var2 + this.field2953; // L: 505
				if (this.field2954 - var3 >= 0L) { // L: 506
					this.field2953 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2954 - this.field2953) - 1L) / (long)var2); // L: 510
				this.field2953 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method4758(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method4773(); // L: 114
	} // L: 115

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-131350281"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2025298930"
	)
	public synchronized void method4761(int var1, int var2) {
		this.method4826(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-59"
	)
	void method4826(int var1, int var2) {
		this.field2941[var1] = var2; // L: 126
		this.field2937[var1] = var2 & -128; // L: 127
		this.method4863(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-70"
	)
	void method4863(int var1, int var2) {
		if (var2 != this.field2936[var1]) { // L: 132
			this.field2936[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field2949[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	void method4764(int var1, int var2, int var3) {
		this.method4847(var1, var2, 64); // L: 139
		if ((this.field2944[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field2996 == var1 && var4.field2999 < 0) { // L: 142
					this.field2952[var1][var4.field2990] = null; // L: 143
					this.field2952[var1][var2] = var4; // L: 144
					int var8 = (var4.field2998 * var4.field2997 >> 12) + var4.field2993; // L: 145
					var4.field2993 += var2 - var4.field2990 << 8; // L: 146
					var4.field2997 = var8 - var4.field2993; // L: 147
					var4.field2998 = 4096; // L: 148
					var4.field2990 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2936[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field2996 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field2988 = var9.field2976[var2]; // L: 162
				var6.field2989 = var9.field2977[var2]; // L: 163
				var6.field2990 = var2; // L: 164
				var6.field2991 = var3 * var3 * var9.field2974[var2] * var9.field2973 + 1024 >> 11; // L: 165
				var6.field2992 = var9.field2971[var2] & 255; // L: 166
				var6.field2993 = (var2 << 8) - (var9.field2972[var2] & 32767); // L: 167
				var6.field2986 = 0; // L: 168
				var6.field3004 = 0; // L: 169
				var6.field2994 = 0; // L: 170
				var6.field2999 = -1; // L: 171
				var6.field3000 = 0; // L: 172
				if (this.field2932[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method817(var5, this.method4778(var6), this.method4779(var6), this.method4780(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method817(var5, this.method4778(var6), 0, this.method4780(var6)); // L: 177
					this.method4765(var6, var9.field2972[var2] < 0); // L: 178
				}

				if (var9.field2972[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2989 >= 0) { // L: 181
					MusicPatchNode var7 = this.field2949[var1][var6.field2989]; // L: 182
					if (var7 != null && var7.field2999 < 0) { // L: 183
						this.field2952[var1][var7.field2990] = null; // L: 184
						var7.field2999 = 0; // L: 185
					}

					this.field2949[var1][var6.field2989] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field2952[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liu;ZI)V",
		garbageValue = "1139290365"
	)
	void method4765(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field238) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)this.field2932[var1.field2996] * (long)var5 >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method922(); // L: 202
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2932[var1.field2996] >> 6); // L: 206
		}

		var1.stream.method825(var4); // L: 208
	} // L: 209

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1890191910"
	)
	void method4847(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2952[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field2952[var1][var2] = null; // L: 214
			if ((this.field2944[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var4.field2996 == var5.field2996 && var5.field2999 < 0 && var4 != var5) { // L: 217
						var4.field2999 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field2999 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1181683312"
	)
	void method4853(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "825528878"
	)
	void method4768(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "21"
	)
	void method4769(int var1, int var2) {
		this.field2938[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1217191884"
	)
	void method4770(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field2996 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method830(UserComparator2.field4359 / 100); // L: 239
					if (var2.stream.method834()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4992(); // L: 241
				}

				if (var2.field2999 < 0) { // L: 243
					this.field2952[var2.field2996][var2.field2990] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "87"
	)
	void method4771(int var1) {
		if (var1 >= 0) { // L: 250
			this.field2956[var1] = 12800; // L: 254
			this.field2933[var1] = 8192; // L: 255
			this.field2934[var1] = 16383; // L: 256
			this.field2938[var1] = 8192; // L: 257
			this.field2939[var1] = 0; // L: 258
			this.field2940[var1] = 8192; // L: 259
			this.method4774(var1); // L: 260
			this.method4775(var1); // L: 261
			this.field2944[var1] = 0; // L: 262
			this.field2942[var1] = 32767; // L: 263
			this.field2943[var1] = 256; // L: 264
			this.field2932[var1] = 0; // L: 265
			this.method4777(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method4771(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
	)
	void method4772(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field2996 == var1) && var2.field2999 < 0) { // L: 271 272
				this.field2952[var2.field2996][var2.field2990] = null; // L: 273
				var2.field2999 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "53312168"
	)
	void method4773() {
		this.method4770(-1); // L: 281
		this.method4771(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field2936[var1] = this.field2941[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field2937[var1] = this.field2941[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "453228054"
	)
	void method4774(int var1) {
		if ((this.field2944[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field2996 == var1 && this.field2952[var1][var2.field2990] == null && var2.field2999 < 0) { // L: 290 291
					var2.field2999 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2001136983"
	)
	void method4775(int var1) {
		if ((this.field2944[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field2996 == var1) { // L: 300
					var2.field3003 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method4776(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method4847(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method4764(var3, var4, var5);
			} else {
				this.method4847(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method4853(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field2937[var3] = (var5 << 14) + (this.field2937[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field2937[var3] = (var5 << 7) + (this.field2937[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field2939[var3] = (var5 << 7) + (this.field2939[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field2939[var3] = var5 + (this.field2939[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field2940[var3] = (var5 << 7) + (this.field2940[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field2940[var3] = var5 + (this.field2940[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field2956[var3] = (var5 << 7) + (this.field2956[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field2956[var3] = var5 + (this.field2956[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field2933[var3] = (var5 << 7) + (this.field2933[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field2933[var3] = var5 + (this.field2933[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field2934[var3] = (var5 << 7) + (this.field2934[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field2934[var3] = var5 + (this.field2934[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field2944;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2944; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field2944;
					var10000[var3] |= 2;
				} else {
					this.method4774(var3); // L: 352
					var10000 = this.field2944; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field2942[var3] = (var5 << 7) + (this.field2942[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field2942[var3] = (this.field2942[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field2942[var3] = (var5 << 7) + (this.field2942[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field2942[var3] = (this.field2942[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method4770(var3);
			}

			if (var4 == 121) { // L: 361
				this.method4771(var3);
			}

			if (var4 == 123) { // L: 362
				this.method4772(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field2942[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field2943[var3] = (var5 << 7) + (this.field2943[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field2942[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field2943[var3] = var5 + (this.field2943[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field2932[var3] = (var5 << 7) + (this.field2932[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field2932[var3] = var5 + (this.field2932[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field2944;
					var10000[var3] |= 4;
				} else {
					this.method4775(var3); // L: 376
					var10000 = this.field2944; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4777(var3, (var5 << 7) + (this.field2945[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method4777(var3, var5 + (this.field2945[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method4863(var3, var4 + this.field2937[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method4768(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method4769(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method4773(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1520019758"
	)
	void method4777(int var1, int var2) {
		this.field2945[var1] = var2; // L: 410
		this.field2946[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liu;B)I",
		garbageValue = "0"
	)
	int method4778(MusicPatchNode var1) {
		int var2 = (var1.field2998 * var1.field2997 >> 12) + var1.field2993; // L: 415
		var2 += (this.field2938[var1.field2996] - 8192) * this.field2943[var1.field2996] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field2988; // L: 417
		int var4;
		if (var3.field2911 > 0 && (var3.field2917 > 0 || this.field2939[var1.field2996] > 0)) { // L: 418
			var4 = var3.field2917 << 2; // L: 419
			int var5 = var3.field2919 << 1; // L: 420
			if (var1.field3001 < var5) { // L: 421
				var4 = var4 * var1.field3001 / var5;
			}

			var4 += this.field2939[var1.field2996] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3002 & 511)); // L: 423
			var2 += (int)(var6 * (double)var4); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)UserComparator2.field4359 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Liu;B)I",
		garbageValue = "4"
	)
	int method4779(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2988; // L: 431
		int var3 = this.field2934[var1.field2996] * this.field2956[var1.field2996] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field2991 + 16384 >> 15; // L: 434
		var3 = var3 * this.field2930 + 128 >> 8; // L: 435
		if (var2.field2913 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2913 * (double)var1.field2986 * 1.953125E-5D) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2916 != null) { // L: 439
			var4 = var1.field3004; // L: 440
			var5 = var2.field2916[var1.field2994 + 1]; // L: 441
			if (var1.field2994 < var2.field2916.length - 2) { // L: 442
				var6 = (var2.field2916[var1.field2994] & 255) << 8; // L: 443
				var7 = (var2.field2916[var1.field2994 + 2] & 255) << 8; // L: 444
				var5 += (var4 - var6) * (var2.field2916[var1.field2994 + 3] - var5) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field2999 > 0 && var2.field2914 != null) { // L: 449
			var4 = var1.field2999; // L: 450
			var5 = var2.field2914[var1.field3000 + 1]; // L: 451
			if (var1.field3000 < var2.field2914.length - 2) { // L: 452
				var6 = (var2.field2914[var1.field3000] & 255) << 8; // L: 453
				var7 = (var2.field2914[var1.field3000 + 2] & 255) << 8; // L: 454
				var5 += (var2.field2914[var1.field3000 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var5 * var3 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I",
		garbageValue = "702321980"
	)
	int method4780(MusicPatchNode var1) {
		int var2 = this.field2933[var1.field2996]; // L: 463
		return var2 < 8192 ? var2 * var1.field2992 + 32 >> 6 : 16384 - ((128 - var1.field2992) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	void method4758() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field2954; var2 == this.trackLength; var3 = this.midiFile.method4934(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field2950 || var2 == 0) { // L: 533
							this.method4773(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method4776(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field2954 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)Z",
		garbageValue = "-1636960835"
	)
	boolean method4787(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field2999 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) { // L: 558
					this.field2949[var1.field2996][var1.field2989] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liu;[IIII)Z",
		garbageValue = "-47865740"
	)
	boolean method4788(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2995 = UserComparator2.field4359 / 100; // L: 568
		if (var1.field2999 < 0 || var1.stream != null && !var1.stream.method833()) { // L: 569
			int var5 = var1.field2998; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2940[var1.field2996]) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field2998 = var5; // L: 581
			}

			var1.stream.method912(this.method4778(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field2988; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3001; // L: 586
			var1.field3002 += var6.field2911; // L: 587
			double var8 = 5.086263020833333E-6D * (double)((var1.field2990 - 60 << 8) + (var1.field2997 * var1.field2998 >> 12)); // L: 588
			if (var6.field2913 > 0) { // L: 589
				if (var6.field2912 > 0) { // L: 590
					var1.field2986 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2912 * var8) + 0.5D);
				} else {
					var1.field2986 += 128; // L: 591
				}
			}

			if (var6.field2916 != null) { // L: 593
				if (var6.field2918 > 0) { // L: 594
					var1.field3004 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2918) + 0.5D);
				} else {
					var1.field3004 += 128; // L: 595
				}

				while (var1.field2994 < var6.field2916.length - 2 && var1.field3004 > (var6.field2916[var1.field2994 + 2] & 255) << 8) { // L: 596
					var1.field2994 += 2;
				}

				if (var6.field2916.length - 2 == var1.field2994 && var6.field2916[var1.field2994 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field2999 >= 0 && var6.field2914 != null && (this.field2944[var1.field2996] & 1) == 0 && (var1.field2989 < 0 || var1 != this.field2949[var1.field2996][var1.field2989])) { // L: 599 600
				if (var6.field2915 > 0) { // L: 601
					var1.field2999 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2915) + 0.5D);
				} else {
					var1.field2999 += 128; // L: 602
				}

				while (var1.field3000 < var6.field2914.length - 2 && var1.field2999 > (var6.field2914[var1.field3000 + 2] & 255) << 8) { // L: 603
					var1.field3000 += 2;
				}

				if (var6.field2914.length - 2 == var1.field3000) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method830(var1.field2995); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method834()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4992(); // L: 612
				if (var1.field2999 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) { // L: 615
						this.field2949[var1.field2996][var1.field2989] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method829(var1.field2995, this.method4779(var1), this.method4780(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method4992(); // L: 570
			var1.remove(); // L: 571
			if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) { // L: 572
				this.field2949[var1.field2996][var1.field2989] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "97"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1586
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1587
			FriendSystem.method1755(var0.isMembersOnly()); // L: 1588
		}

		if (var0.properties != Client.worldProperties) { // L: 1590
			Archive var1 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 1591
			int var2 = var0.properties; // L: 1592
			if ((var2 & 536870912) != 0) { // L: 1594
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 1595
			} else if ((var2 & 1073741824) != 0) { // L: 1597
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 1598
			} else {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 1601
			}
		}

		WorldMapIcon_0.worldHost = var0.host; // L: 1605
		Client.worldId = var0.id; // L: 1606
		Client.worldProperties = var0.properties; // L: 1607
		ApproximateRouteStrategy.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1608
		ParamComposition.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1609
		ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort; // L: 1610
	} // L: 1611
}
