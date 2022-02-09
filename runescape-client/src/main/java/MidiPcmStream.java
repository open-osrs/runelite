import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 552526635
	)
	int field3127;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -75989283
	)
	int field3113;
	@ObfuscatedName("e")
	int[] field3114;
	@ObfuscatedName("r")
	int[] field3115;
	@ObfuscatedName("o")
	int[] field3116;
	@ObfuscatedName("i")
	int[] field3117;
	@ObfuscatedName("v")
	int[] field3118;
	@ObfuscatedName("a")
	int[] field3119;
	@ObfuscatedName("y")
	int[] field3134;
	@ObfuscatedName("u")
	int[] field3121;
	@ObfuscatedName("h")
	int[] field3137;
	@ObfuscatedName("j")
	int[] field3124;
	@ObfuscatedName("f")
	int[] field3125;
	@ObfuscatedName("g")
	int[] field3122;
	@ObfuscatedName("t")
	int[] field3126;
	@ObfuscatedName("k")
	int[] field3132;
	@ObfuscatedName("b")
	int[] field3129;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[[Ljm;"
	)
	MusicPatchNode[][] field3130;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Ljm;"
	)
	MusicPatchNode[][] field3131;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ak")
	boolean field3136;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1531479747
	)
	@Export("track")
	int track;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1393888569
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 828631867034328585L
	)
	long field3112;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -3571997110879224945L
	)
	long field3133;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3127 = 256; // L: 14
		this.field3113 = 1000000; // L: 15
		this.field3114 = new int[16]; // L: 16
		this.field3115 = new int[16]; // L: 17
		this.field3116 = new int[16]; // L: 18
		this.field3117 = new int[16]; // L: 19
		this.field3118 = new int[16]; // L: 20
		this.field3119 = new int[16]; // L: 21
		this.field3134 = new int[16];
		this.field3121 = new int[16]; // L: 23
		this.field3137 = new int[16]; // L: 24
		this.field3124 = new int[16]; // L: 28
		this.field3125 = new int[16]; // L: 29
		this.field3122 = new int[16]; // L: 30
		this.field3126 = new int[16]; // L: 31
		this.field3132 = new int[16]; // L: 32
		this.field3129 = new int[16]; // L: 33
		this.field3130 = new MusicPatchNode[16][128]; // L: 34
		this.field3131 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5073(); // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-868657001"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3127 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "39"
	)
	int method5096() {
		return this.field3127; // L: 54
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Lkq;Lau;II)Z",
		garbageValue = "-655263365"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5267(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = class21.method302(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method5223(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "62133201"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 80
			var1.clear();
		}

	} // L: 81

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "39401660"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove(); // L: 84
		}

	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("w")
	protected synchronized int vmethod5241() {
		return 0; // L: 468
	}

	@ObfuscatedName("v")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field3113 / PcmPlayer.field305; // L: 473

			do {
				long var5 = (long)var4 * (long)var3 + this.field3112; // L: 475
				if (this.field3133 - var5 >= 0L) { // L: 476
					this.field3112 = var5; // L: 477
					break;
				}

				int var7 = (int)((this.field3133 - this.field3112 + (long)var4 - 1L) / (long)var4); // L: 480
				this.field3112 += (long)var4 * (long)var7; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method5066(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljp;ZB)V",
		garbageValue = "0"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field3136 = var2; // L: 90
		this.field3112 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field3133 = this.midiFile.method5188(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("y")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field3113 / PcmPlayer.field305; // L: 494

			do {
				long var3 = (long)var1 * (long)var2 + this.field3112; // L: 496
				if (this.field3133 - var3 >= 0L) { // L: 497
					this.field3112 = var3; // L: 498
					break;
				}

				int var5 = (int)((this.field3133 - this.field3112 + (long)var2 - 1L) / (long)var2); // L: 501
				this.field3112 += (long)var2 * (long)var5; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method5066(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "937177462"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method5073(); // L: 105
	} // L: 106

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1764945806"
	)
	public synchronized void method5043(int var1, int var2) {
		this.method5042(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-4"
	)
	void method5042(int var1, int var2) {
		this.field3117[var1] = var2; // L: 117
		this.field3119[var1] = var2 & -128; // L: 118
		this.method5113(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1617270070"
	)
	void method5113(int var1, int var2) {
		if (var2 != this.field3118[var1]) { // L: 123
			this.field3118[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field3131[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1493113473"
	)
	void method5095(int var1, int var2, int var3) {
		this.method5046(var1, var2, 64); // L: 130
		if ((this.field3124[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field3181 == var1 && var4.field3186 < 0) { // L: 133
					this.field3130[var1][var4.field3189] = null; // L: 134
					this.field3130[var1][var2] = var4; // L: 135
					int var8 = (var4.field3187 * var4.field3177 >> 12) + var4.field3179; // L: 136
					var4.field3179 += var2 - var4.field3189 << 8; // L: 137
					var4.field3177 = var8 - var4.field3179; // L: 138
					var4.field3187 = 4096; // L: 139
					var4.field3189 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3118[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field3181 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field3174 = var9.field3155[var2]; // L: 153
				var6.field3171 = var9.field3159[var2]; // L: 154
				var6.field3189 = var2; // L: 155
				var6.field3180 = var3 * var3 * var9.field3156[var2] * var9.field3160 + 1024 >> 11; // L: 156
				var6.field3178 = var9.field3161[var2] & 255; // L: 157
				var6.field3179 = (var2 << 8) - (var9.field3157[var2] & 32767); // L: 158
				var6.field3182 = 0; // L: 159
				var6.field3183 = 0; // L: 160
				var6.field3176 = 0; // L: 161
				var6.field3186 = -1; // L: 162
				var6.field3175 = 0; // L: 163
				if (this.field3126[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method873(var5, this.method5058(var6), this.method5152(var6), this.method5060(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method873(var5, this.method5058(var6), 0, this.method5060(var6)); // L: 168
					this.method5164(var6, var9.field3157[var2] < 0); // L: 169
				}

				if (var9.field3157[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3171 >= 0) { // L: 172
					MusicPatchNode var7 = this.field3131[var1][var6.field3171]; // L: 173
					if (var7 != null && var7.field3186 < 0) { // L: 174
						this.field3130[var1][var7.field3189] = null; // L: 175
						var7.field3186 = 0; // L: 176
					}

					this.field3131[var1][var6.field3171] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field3130[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ZB)V",
		garbageValue = "63"
	)
	void method5164(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field270) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)var5 * (long)this.field3126[var1.field3181] >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method936(); // L: 193
			}
		} else {
			var4 = (int)((long)this.field3126[var1.field3181] * (long)var3 >> 6); // L: 197
		}

		var1.stream.method818(var4); // L: 199
	} // L: 200

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-13"
	)
	void method5046(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3130[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field3130[var1][var2] = null; // L: 205
			if ((this.field3124[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var5.field3181 == var4.field3181 && var5.field3186 < 0 && var5 != var4) { // L: 208
						var4.field3186 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field3186 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-57"
	)
	void method5047(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-651144515"
	)
	void method5048(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "98"
	)
	void method5049(int var1, int var2) {
		this.field3134[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "750290801"
	)
	void method5050(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field3181 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method822(PcmPlayer.field305 / 100); // L: 230
					if (var2.stream.method827()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5275(); // L: 232
				}

				if (var2.field3186 < 0) { // L: 234
					this.field3130[var2.field3181][var2.field3189] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1528042402"
	)
	void method5051(int var1) {
		if (var1 >= 0) { // L: 241
			this.field3114[var1] = 12800; // L: 245
			this.field3115[var1] = 8192; // L: 246
			this.field3116[var1] = 16383; // L: 247
			this.field3134[var1] = 8192; // L: 248
			this.field3121[var1] = 0; // L: 249
			this.field3137[var1] = 8192; // L: 250
			this.method5062(var1); // L: 251
			this.method5055(var1); // L: 252
			this.field3124[var1] = 0; // L: 253
			this.field3125[var1] = 32767; // L: 254
			this.field3122[var1] = 256; // L: 255
			this.field3126[var1] = 0; // L: 256
			this.method5045(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method5051(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-23275431"
	)
	void method5063(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field3181 == var1) && var2.field3186 < 0) { // L: 262 263
				this.field3130[var2.field3181][var2.field3189] = null; // L: 264
				var2.field3186 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	void method5073() {
		this.method5050(-1); // L: 272
		this.method5051(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field3118[var1] = this.field3117[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field3119[var1] = this.field3117[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-324027323"
	)
	void method5062(int var1) {
		if ((this.field3124[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field3181 == var1 && this.field3130[var1][var2.field3189] == null && var2.field3186 < 0) { // L: 281 282
					var2.field3186 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1583663824"
	)
	void method5055(int var1) {
		if ((this.field3124[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field3181 == var1) { // L: 291
					var2.field3191 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2106838445"
	)
	void method5056(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method5046(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method5095(var3, var4, var5);
			} else {
				this.method5046(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method5047(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field3119[var3] = (var5 << 14) + (this.field3119[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field3119[var3] = (var5 << 7) + (this.field3119[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field3121[var3] = (var5 << 7) + (this.field3121[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field3121[var3] = var5 + (this.field3121[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field3137[var3] = (var5 << 7) + (this.field3137[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field3137[var3] = var5 + (this.field3137[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field3114[var3] = (var5 << 7) + (this.field3114[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field3114[var3] = var5 + (this.field3114[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field3115[var3] = (var5 << 7) + (this.field3115[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field3115[var3] = var5 + (this.field3115[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field3116[var3] = (var5 << 7) + (this.field3116[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field3116[var3] = var5 + (this.field3116[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field3124;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3124; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field3124;
					var10000[var3] |= 2;
				} else {
					this.method5062(var3); // L: 343
					var10000 = this.field3124; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field3125[var3] = (var5 << 7) + (this.field3125[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field3125[var3] = (this.field3125[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field3125[var3] = (var5 << 7) + (this.field3125[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field3125[var3] = (this.field3125[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method5050(var3);
			}

			if (var4 == 121) { // L: 352
				this.method5051(var3);
			}

			if (var4 == 123) { // L: 353
				this.method5063(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field3125[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field3122[var3] = (var5 << 7) + (this.field3122[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field3125[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field3122[var3] = var5 + (this.field3122[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field3126[var3] = (var5 << 7) + (this.field3126[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field3126[var3] = var5 + (this.field3126[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field3124;
					var10000[var3] |= 4;
				} else {
					this.method5055(var3); // L: 367
					var10000 = this.field3124; // L: 368
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 371
				this.method5045(var3, (var5 << 7) + (this.field3132[var3] & -16257));
			}

			if (var4 == 49) { // L: 372
				this.method5045(var3, var5 + (this.field3132[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method5113(var3, var4 + this.field3119[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method5048(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method5049(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method5073(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "557460831"
	)
	void method5045(int var1, int var2) {
		this.field3132[var1] = var2; // L: 401
		this.field3129[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)I",
		garbageValue = "41"
	)
	int method5058(MusicPatchNode var1) {
		int var2 = (var1.field3187 * var1.field3177 >> 12) + var1.field3179; // L: 406
		var2 += (this.field3134[var1.field3181] - 8192) * this.field3122[var1.field3181] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field3174; // L: 408
		int var4;
		if (var3.field3100 > 0 && (var3.field3102 > 0 || this.field3121[var1.field3181] > 0)) { // L: 409
			var4 = var3.field3102 << 2; // L: 410
			int var5 = var3.field3101 << 1; // L: 411
			if (var1.field3184 < var5) { // L: 412
				var4 = var4 * var1.field3184 / var5;
			}

			var4 += this.field3121[var1.field3181] >> 7; // L: 413
			double var6 = Math.sin((double)(var1.field3188 & 511) * 0.01227184630308513D); // L: 414
			var2 += (int)((double)var4 * var6); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field305 + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)I",
		garbageValue = "738949981"
	)
	int method5152(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3174; // L: 422
		int var3 = this.field3116[var1.field3181] * this.field3114[var1.field3181] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field3180 + 16384 >> 15; // L: 425
		var3 = var3 * this.field3127 + 128 >> 8; // L: 426
		if (var2.field3095 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3095 * 1.953125E-5D * (double)var1.field3182) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3094 != null) { // L: 430
			var4 = var1.field3183; // L: 431
			var5 = var2.field3094[var1.field3176 + 1]; // L: 432
			if (var1.field3176 < var2.field3094.length - 2) { // L: 433
				var6 = (var2.field3094[var1.field3176] & 255) << 8; // L: 434
				var7 = (var2.field3094[var1.field3176 + 2] & 255) << 8; // L: 435
				var5 += (var4 - var6) * (var2.field3094[var1.field3176 + 3] - var5) / (var7 - var6); // L: 436
			}

			var3 = var3 * var5 + 32 >> 6; // L: 438
		}

		if (var1.field3186 > 0 && var2.field3099 != null) { // L: 440
			var4 = var1.field3186; // L: 441
			var5 = var2.field3099[var1.field3175 + 1]; // L: 442
			if (var1.field3175 < var2.field3099.length - 2) { // L: 443
				var6 = (var2.field3099[var1.field3175] & 255) << 8; // L: 444
				var7 = (var2.field3099[var1.field3175 + 2] & 255) << 8; // L: 445
				var5 += (var4 - var6) * (var2.field3099[var1.field3175 + 3] - var5) / (var7 - var6); // L: 446
			}

			var3 = var5 * var3 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)I",
		garbageValue = "1814455019"
	)
	int method5060(MusicPatchNode var1) {
		int var2 = this.field3115[var1.field3181]; // L: 454
		return var2 < 8192 ? var2 * var1.field3178 + 32 >> 6 : 16384 - ((128 - var1.field3178) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "461876582"
	)
	void method5066() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field3133; var2 == this.trackLength; var3 = this.midiFile.method5188(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field3136 || var2 == 0) { // L: 524
							this.method5073(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method5056(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field3133 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)Z",
		garbageValue = "88"
	)
	boolean method5067(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field3186 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field3171 > 0 && var1 == this.field3131[var1.field3181][var1.field3171]) { // L: 549
					this.field3131[var1.field3181][var1.field3171] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljm;[IIII)Z",
		garbageValue = "-1351322760"
	)
	boolean method5068(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3190 = PcmPlayer.field305 / 100; // L: 559
		if (var1.field3186 < 0 || var1.stream != null && !var1.stream.method826()) { // L: 560
			int var5 = var1.field3187; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3137[var1.field3181]) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field3187 = var5; // L: 572
			}

			var1.stream.method824(this.method5058(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field3174; // L: 575
			boolean var7 = false; // L: 576
			++var1.field3184; // L: 577
			var1.field3188 += var6.field3100; // L: 578
			double var8 = (double)((var1.field3189 - 60 << 8) + (var1.field3177 * var1.field3187 >> 12)) * 5.086263020833333E-6D; // L: 579
			if (var6.field3095 > 0) { // L: 580
				if (var6.field3098 > 0) { // L: 581
					var1.field3182 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3098 * var8) + 0.5D);
				} else {
					var1.field3182 += 128; // L: 582
				}
			}

			if (var6.field3094 != null) { // L: 584
				if (var6.field3096 > 0) { // L: 585
					var1.field3183 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3096) + 0.5D);
				} else {
					var1.field3183 += 128; // L: 586
				}

				while (var1.field3176 < var6.field3094.length - 2 && var1.field3183 > (var6.field3094[var1.field3176 + 2] & 255) << 8) { // L: 587
					var1.field3176 += 2;
				}

				if (var6.field3094.length - 2 == var1.field3176 && var6.field3094[var1.field3176 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field3186 >= 0 && var6.field3099 != null && (this.field3124[var1.field3181] & 1) == 0 && (var1.field3171 < 0 || var1 != this.field3131[var1.field3181][var1.field3171])) { // L: 590 591
				if (var6.field3097 > 0) { // L: 592
					var1.field3186 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3097 * var8) + 0.5D);
				} else {
					var1.field3186 += 128; // L: 593
				}

				while (var1.field3175 < var6.field3099.length - 2 && var1.field3186 > (var6.field3099[var1.field3175 + 2] & 255) << 8) { // L: 594
					var1.field3175 += 2;
				}

				if (var6.field3099.length - 2 == var1.field3175) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method822(var1.field3190); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method827()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5275(); // L: 603
				if (var1.field3186 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field3171 > 0 && var1 == this.field3131[var1.field3181][var1.field3171]) { // L: 606
						this.field3131[var1.field3181][var1.field3171] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method911(var1.field3190, this.method5152(var1), this.method5060(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method5275(); // L: 561
			var1.remove(); // L: 562
			if (var1.field3171 > 0 && var1 == this.field3131[var1.field3181][var1.field3171]) { // L: 563
				this.field3131[var1.field3181][var1.field3171] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkm;",
		garbageValue = "12"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.field3857, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.field3856, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field3858}; // L: 22
	}
}
