import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -748679043
	)
	int field3179;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1077722431
	)
	int field3180;
	@ObfuscatedName("f")
	int[] field3181;
	@ObfuscatedName("b")
	int[] field3203;
	@ObfuscatedName("n")
	int[] field3183;
	@ObfuscatedName("s")
	int[] field3184;
	@ObfuscatedName("l")
	int[] field3185;
	@ObfuscatedName("q")
	int[] field3178;
	@ObfuscatedName("o")
	int[] field3187;
	@ObfuscatedName("r")
	int[] field3186;
	@ObfuscatedName("p")
	int[] field3182;
	@ObfuscatedName("x")
	int[] field3193;
	@ObfuscatedName("a")
	int[] field3202;
	@ObfuscatedName("y")
	int[] field3192;
	@ObfuscatedName("j")
	int[] field3189;
	@ObfuscatedName("e")
	int[] field3194;
	@ObfuscatedName("z")
	int[] field3195;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Ljn;"
	)
	MusicPatchNode[][] field3196;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Ljn;"
	)
	MusicPatchNode[][] field3197;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("aw")
	boolean field3199;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1021655575
	)
	@Export("track")
	int track;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1014777517
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -4285151308752849057L
	)
	long field3188;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 1303107017095870899L
	)
	long field3205;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3179 = 256; // L: 14
		this.field3180 = 1000000; // L: 15
		this.field3181 = new int[16]; // L: 16
		this.field3203 = new int[16]; // L: 17
		this.field3183 = new int[16]; // L: 18
		this.field3184 = new int[16]; // L: 19
		this.field3185 = new int[16]; // L: 20
		this.field3178 = new int[16]; // L: 21
		this.field3187 = new int[16]; // L: 22
		this.field3186 = new int[16]; // L: 23
		this.field3182 = new int[16]; // L: 24
		this.field3193 = new int[16]; // L: 28
		this.field3202 = new int[16]; // L: 29
		this.field3192 = new int[16]; // L: 30
		this.field3189 = new int[16]; // L: 31
		this.field3194 = new int[16]; // L: 32
		this.field3195 = new int[16]; // L: 33
		this.field3196 = new MusicPatchNode[16][128];
		this.field3197 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5259(); // L: 46
	} // L: 47

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3179 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2127112295"
	)
	public int method5264() {
		return this.field3179; // L: 54
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lju;Lln;Lac;IB)Z",
		garbageValue = "36"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5463(); // L: 58
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

			if (!var9.method5427(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1039741430"
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
		garbageValue = "-1531441938"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laf;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Laf;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("l")
	protected synchronized int vmethod5441() {
		return 0; // L: 477
	}

	@ObfuscatedName("q")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field3180 / PcmPlayer.field268; // L: 482

			do {
				long var5 = this.field3188 + (long)var4 * (long)var3; // L: 484
				if (this.field3205 - var5 >= 0L) { // L: 485
					this.field3188 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field3205 - this.field3188 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field3188 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method5272(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lju;ZB)V",
		garbageValue = "11"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field3199 = var2; // L: 99
		this.field3188 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field3205 = this.midiFile.method5393(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("r")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field3180 / PcmPlayer.field268; // L: 503

			do {
				long var3 = this.field3188 + (long)var2 * (long)var1; // L: 505
				if (this.field3205 - var3 >= 0L) { // L: 506
					this.field3188 = var3; // L: 507
					break;
				}

				int var5 = (int)((this.field3205 - this.field3188 + (long)var2 - 1L) / (long)var2); // L: 510
				this.field3188 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method5272(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "867852143"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method5259(); // L: 114
	} // L: 115

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-25295"
	)
	public synchronized void method5248(int var1, int var2) {
		this.method5249(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2146989537"
	)
	void method5249(int var1, int var2) {
		this.field3184[var1] = var2; // L: 126
		this.field3178[var1] = var2 & -128; // L: 127
		this.method5250(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1072257688"
	)
	void method5250(int var1, int var2) {
		if (var2 != this.field3185[var1]) { // L: 132
			this.field3185[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field3197[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "887672121"
	)
	void method5251(int var1, int var2, int var3) {
		this.method5252(var1, var2, 64); // L: 139
		if ((this.field3193[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field3248 == var1 && var4.field3249 < 0) { // L: 142
					this.field3196[var1][var4.field3251] = null; // L: 143
					this.field3196[var1][var2] = var4; // L: 144
					int var8 = (var4.field3245 * var4.field3244 >> 12) + var4.field3243; // L: 145
					var4.field3243 += var2 - var4.field3251 << 8; // L: 146
					var4.field3244 = var8 - var4.field3243; // L: 147
					var4.field3245 = 4096; // L: 148
					var4.field3251 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3185[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field3248 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field3247 = var9.field3224[var2]; // L: 162
				var6.field3239 = var9.field3220[var2]; // L: 163
				var6.field3251 = var2; // L: 164
				var6.field3241 = var3 * var3 * var9.field3223[var2] * var9.field3228 + 1024 >> 11; // L: 165
				var6.field3242 = var9.field3222[var2] & 255; // L: 166
				var6.field3243 = (var2 << 8) - (var9.field3227[var2] & 32767); // L: 167
				var6.field3246 = 0; // L: 168
				var6.field3235 = 0; // L: 169
				var6.field3252 = 0; // L: 170
				var6.field3249 = -1; // L: 171
				var6.field3250 = 0; // L: 172
				if (this.field3189[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method791(var5, this.method5246(var6), this.method5244(var6), this.method5302(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method791(var5, this.method5246(var6), 0, this.method5302(var6)); // L: 177
					this.method5342(var6, var9.field3227[var2] < 0); // L: 178
				}

				if (var9.field3227[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3239 >= 0) { // L: 181
					MusicPatchNode var7 = this.field3197[var1][var6.field3239]; // L: 182
					if (var7 != null && var7.field3249 < 0) { // L: 183
						this.field3196[var1][var7.field3251] = null; // L: 184
						var7.field3249 = 0; // L: 185
					}

					this.field3197[var1][var6.field3239] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field3196[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ZI)V",
		garbageValue = "2081023106"
	)
	void method5342(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field254) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field3189[var1.field3248] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method800(); // L: 202
			}
		} else {
			var4 = (int)((long)this.field3189[var1.field3248] * (long)var3 >> 6); // L: 206
		}

		var1.stream.method799(var4); // L: 208
	} // L: 209

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-1455"
	)
	void method5252(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3196[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field3196[var1][var2] = null; // L: 214
			if ((this.field3193[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var5.field3248 == var4.field3248 && var5.field3249 < 0 && var5 != var4) { // L: 217
						var4.field3249 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field3249 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "94"
	)
	void method5253(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1226196956"
	)
	void method5254(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-18394"
	)
	void method5255(int var1, int var2) {
		this.field3187[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "74"
	)
	void method5256(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field3248 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method882(PcmPlayer.field268 / 100); // L: 239
					if (var2.stream.method808()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5473(); // L: 241
				}

				if (var2.field3249 < 0) { // L: 243
					this.field3196[var2.field3248][var2.field3251] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1161401652"
	)
	void method5257(int var1) {
		if (var1 >= 0) { // L: 250
			this.field3181[var1] = 12800; // L: 254
			this.field3203[var1] = 8192; // L: 255
			this.field3183[var1] = 16383; // L: 256
			this.field3187[var1] = 8192; // L: 257
			this.field3186[var1] = 0; // L: 258
			this.field3182[var1] = 8192; // L: 259
			this.method5260(var1); // L: 260
			this.method5261(var1); // L: 261
			this.field3193[var1] = 0; // L: 262
			this.field3202[var1] = 32767; // L: 263
			this.field3192[var1] = 256; // L: 264
			this.field3189[var1] = 0; // L: 265
			this.method5303(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method5257(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1206801353"
	)
	void method5258(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field3248 == var1) && var2.field3249 < 0) { // L: 271 272
				this.field3196[var2.field3248][var2.field3251] = null; // L: 273
				var2.field3249 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1660389199"
	)
	void method5259() {
		this.method5256(-1); // L: 281
		this.method5257(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3185[var1] = this.field3184[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field3178[var1] = this.field3184[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method5260(int var1) {
		if ((this.field3193[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field3248 == var1 && this.field3196[var1][var2.field3251] == null && var2.field3249 < 0) { // L: 290 291
					var2.field3249 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "527815614"
	)
	void method5261(int var1) {
		if ((this.field3193[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field3248 == var1) { // L: 300
					var2.field3238 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-455692195"
	)
	void method5262(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method5252(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method5251(var3, var4, var5);
			} else {
				this.method5252(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method5253(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field3178[var3] = (var5 << 14) + (this.field3178[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field3178[var3] = (var5 << 7) + (this.field3178[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field3186[var3] = (var5 << 7) + (this.field3186[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field3186[var3] = var5 + (this.field3186[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field3182[var3] = (var5 << 7) + (this.field3182[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field3182[var3] = var5 + (this.field3182[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field3181[var3] = (var5 << 7) + (this.field3181[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field3181[var3] = var5 + (this.field3181[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field3203[var3] = (var5 << 7) + (this.field3203[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field3203[var3] = var5 + (this.field3203[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field3183[var3] = (var5 << 7) + (this.field3183[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field3183[var3] = var5 + (this.field3183[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field3193;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3193; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field3193;
					var10000[var3] |= 2;
				} else {
					this.method5260(var3); // L: 352
					var10000 = this.field3193; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field3202[var3] = (var5 << 7) + (this.field3202[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field3202[var3] = (this.field3202[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field3202[var3] = (var5 << 7) + (this.field3202[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field3202[var3] = (this.field3202[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method5256(var3);
			}

			if (var4 == 121) { // L: 361
				this.method5257(var3);
			}

			if (var4 == 123) { // L: 362
				this.method5258(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field3202[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field3192[var3] = (var5 << 7) + (this.field3192[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field3202[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field3192[var3] = var5 + (this.field3192[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field3189[var3] = (var5 << 7) + (this.field3189[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field3189[var3] = var5 + (this.field3189[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field3193;
					var10000[var3] |= 4;
				} else {
					this.method5261(var3); // L: 376
					var10000 = this.field3193; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5303(var3, (var5 << 7) + (this.field3194[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method5303(var3, var5 + (this.field3194[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method5250(var3, var4 + this.field3178[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method5254(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method5255(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method5259(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "8396929"
	)
	void method5303(int var1, int var2) {
		this.field3194[var1] = var2; // L: 410
		this.field3195[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)I",
		garbageValue = "2132643149"
	)
	int method5246(MusicPatchNode var1) {
		int var2 = (var1.field3245 * var1.field3244 >> 12) + var1.field3243; // L: 415
		var2 += (this.field3187[var1.field3248] - 8192) * this.field3192[var1.field3248] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field3247; // L: 417
		int var4;
		if (var3.field3166 > 0 && (var3.field3161 > 0 || this.field3186[var1.field3248] > 0)) { // L: 418
			var4 = var3.field3161 << 2; // L: 419
			int var5 = var3.field3167 << 1; // L: 420
			if (var1.field3253 < var5) { // L: 421
				var4 = var4 * var1.field3253 / var5;
			}

			var4 += this.field3186[var1.field3248] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3237 & 511)); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field268 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljn;B)I",
		garbageValue = "22"
	)
	int method5244(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3247; // L: 431
		int var3 = this.field3181[var1.field3248] * this.field3183[var1.field3248] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field3241 + 16384 >> 15; // L: 434
		var3 = var3 * this.field3179 + 128 >> 8; // L: 435
		if (var2.field3162 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3246 * (double)var2.field3162) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3160 != null) { // L: 439
			var4 = var1.field3235; // L: 440
			var5 = var2.field3160[var1.field3252 + 1]; // L: 441
			if (var1.field3252 < var2.field3160.length - 2) { // L: 442
				var6 = (var2.field3160[var1.field3252] & 255) << 8; // L: 443
				var7 = (var2.field3160[var1.field3252 + 2] & 255) << 8; // L: 444
				var5 += (var2.field3160[var1.field3252 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field3249 > 0 && var2.field3165 != null) { // L: 449
			var4 = var1.field3249; // L: 450
			var5 = var2.field3165[var1.field3250 + 1]; // L: 451
			if (var1.field3250 < var2.field3165.length - 2) { // L: 452
				var6 = (var2.field3165[var1.field3250] & 255) << 8; // L: 453
				var7 = (var2.field3165[var1.field3250 + 2] & 255) << 8; // L: 454
				var5 += (var4 - var6) * (var2.field3165[var1.field3250 + 3] - var5) / (var7 - var6); // L: 455
			}

			var3 = var3 * var5 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)I",
		garbageValue = "17665426"
	)
	int method5302(MusicPatchNode var1) {
		int var2 = this.field3203[var1.field3248]; // L: 463
		return var2 < 8192 ? var2 * var1.field3242 + 32 >> 6 : 16384 - ((128 - var1.field3242) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142415416"
	)
	void method5272() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field3205; var2 == this.trackLength; var3 = this.midiFile.method5393(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field3199 || var2 == 0) { // L: 533
							this.method5259(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method5262(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field3205 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)Z",
		garbageValue = "1597341922"
	)
	boolean method5273(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field3249 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field3239 > 0 && var1 == this.field3197[var1.field3248][var1.field3239]) { // L: 558
					this.field3197[var1.field3248][var1.field3239] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljn;[IIII)Z",
		garbageValue = "-1282463450"
	)
	boolean method5311(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3255 = PcmPlayer.field268 / 100; // L: 568
		if (var1.field3249 < 0 || var1.stream != null && !var1.stream.method830()) { // L: 569
			int var5 = var1.field3245; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3182[var1.field3248] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field3245 = var5; // L: 581
			}

			var1.stream.method896(this.method5246(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field3247; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3253; // L: 586
			var1.field3237 += var6.field3166; // L: 587
			double var8 = (double)((var1.field3251 - 60 << 8) + (var1.field3245 * var1.field3244 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field3162 > 0) { // L: 589
				if (var6.field3164 > 0) { // L: 590
					var1.field3246 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3164 * var8) + 0.5D);
				} else {
					var1.field3246 += 128; // L: 591
				}
			}

			if (var6.field3160 != null) { // L: 593
				if (var6.field3159 > 0) { // L: 594
					var1.field3235 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3159 * var8) + 0.5D);
				} else {
					var1.field3235 += 128; // L: 595
				}

				while (var1.field3252 < var6.field3160.length - 2 && var1.field3235 > (var6.field3160[var1.field3252 + 2] & 255) << 8) { // L: 596
					var1.field3252 += 2;
				}

				if (var6.field3160.length - 2 == var1.field3252 && var6.field3160[var1.field3252 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field3249 >= 0 && var6.field3165 != null && (this.field3193[var1.field3248] & 1) == 0 && (var1.field3239 < 0 || var1 != this.field3197[var1.field3248][var1.field3239])) { // L: 599 600
				if (var6.field3163 > 0) { // L: 601
					var1.field3249 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3163) + 0.5D);
				} else {
					var1.field3249 += 128; // L: 602
				}

				while (var1.field3250 < var6.field3165.length - 2 && var1.field3249 > (var6.field3165[var1.field3250 + 2] & 255) << 8) { // L: 603
					var1.field3250 += 2;
				}

				if (var6.field3165.length - 2 == var1.field3250) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method882(var1.field3255); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method808()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5473(); // L: 612
				if (var1.field3249 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field3239 > 0 && var1 == this.field3197[var1.field3248][var1.field3239]) { // L: 615
						this.field3197[var1.field3248][var1.field3239] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method880(var1.field3255, this.method5244(var1), this.method5302(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method5473(); // L: 570
			var1.remove(); // L: 571
			if (var1.field3239 > 0 && var1 == this.field3197[var1.field3248][var1.field3239]) { // L: 572
				this.field3197[var1.field3248][var1.field3239] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "1823520808"
	)
	public static void method5368(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1); // L: 34
		int var6 = var0.getFileId(var5, var2); // L: 35
		class18.method266(var0, var5, var6, var3, var4); // L: 36
	} // L: 37

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-126"
	)
	static void method5366(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9607
		int[] var3 = Players.Players_indices; // L: 9608
		boolean var4 = false; // L: 9609
		Username var5 = new Username(var1, class122.loginType); // L: 9610

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9611
			Player var7 = Client.players[var3[var6]]; // L: 9612
			if (var7 != null && var7 != GrandExchangeEvents.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9613
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9614
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher); // L: 9616
					var8.packetBuffer.method7710(var3[var6]); // L: 9617
					var8.packetBuffer.method7701(0); // L: 9618
					Client.packetWriter.addNode(var8); // L: 9619
				} else if (var0 == 4) { // L: 9621
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 9623
					var8.packetBuffer.method7804(0); // L: 9624
					var8.packetBuffer.writeShort(var3[var6]); // L: 9625
					Client.packetWriter.addNode(var8); // L: 9626
				} else if (var0 == 6) { // L: 9628
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 9630
					var8.packetBuffer.method7712(var3[var6]); // L: 9631
					var8.packetBuffer.writeByte(0); // L: 9632
					Client.packetWriter.addNode(var8); // L: 9633
				} else if (var0 == 7) { // L: 9635
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher); // L: 9637
					var8.packetBuffer.writeShort(var3[var6]); // L: 9638
					var8.packetBuffer.method7701(0); // L: 9639
					Client.packetWriter.addNode(var8); // L: 9640
				}

				var4 = true; // L: 9642
				break;
			}
		}

		if (!var4) { // L: 9646
			Actor.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9647

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2065627422"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ClientPacket.friendsChat != null) { // L: 12385
			PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher); // L: 12386
			var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0)); // L: 12387
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12388
			Client.packetWriter.addNode(var1); // L: 12389
		}
	} // L: 12390
}
