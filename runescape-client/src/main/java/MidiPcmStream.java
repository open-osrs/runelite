import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -386188103
	)
	int field2834;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 759378439
	)
	int field2853;
	@ObfuscatedName("y")
	int[] field2854;
	@ObfuscatedName("p")
	int[] field2837;
	@ObfuscatedName("j")
	int[] field2835;
	@ObfuscatedName("r")
	int[] field2839;
	@ObfuscatedName("b")
	int[] field2861;
	@ObfuscatedName("d")
	int[] field2841;
	@ObfuscatedName("s")
	int[] field2842;
	@ObfuscatedName("u")
	int[] field2843;
	@ObfuscatedName("l")
	int[] field2852;
	@ObfuscatedName("x")
	int[] field2846;
	@ObfuscatedName("z")
	int[] field2844;
	@ObfuscatedName("w")
	int[] field2848;
	@ObfuscatedName("t")
	int[] field2836;
	@ObfuscatedName("h")
	int[] field2850;
	@ObfuscatedName("q")
	int[] field2851;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Liq;"
	)
	MusicPatchNode[][] field2847;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Liq;"
	)
	MusicPatchNode[][] field2849;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ab")
	boolean field2855;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -398624825
	)
	@Export("track")
	int track;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 495959299
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 8283552259153278903L
	)
	long field2858;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5710666307152973315L
	)
	long field2859;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2834 = 256; // L: 14
		this.field2853 = 1000000; // L: 15
		this.field2854 = new int[16]; // L: 16
		this.field2837 = new int[16]; // L: 17
		this.field2835 = new int[16]; // L: 18
		this.field2839 = new int[16]; // L: 19
		this.field2861 = new int[16]; // L: 20
		this.field2841 = new int[16]; // L: 21
		this.field2842 = new int[16]; // L: 22
		this.field2843 = new int[16]; // L: 23
		this.field2852 = new int[16]; // L: 24
		this.field2846 = new int[16]; // L: 28
		this.field2844 = new int[16]; // L: 29
		this.field2848 = new int[16]; // L: 30
		this.field2836 = new int[16]; // L: 31
		this.field2850 = new int[16]; // L: 32
		this.field2851 = new int[16]; // L: 33
		this.field2847 = new MusicPatchNode[16][128]; // L: 34
		this.field2849 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method4429(); // L: 46
	} // L: 47

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-315791633"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2834 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1796230784"
	)
	int method4410() {
		return this.field2834; // L: 54
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lie;Ljv;Lbu;II)Z",
		garbageValue = "-1829332053"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4622(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = InvDefinition.method2609(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method4588(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 80
			var1.clear();
		}

	} // L: 81

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244074850"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 84
			var1.remove();
		}

	} // L: 85

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("b")
	protected synchronized int vmethod4610() {
		return 0; // L: 468
	}

	@ObfuscatedName("d")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field2853 / PcmPlayer.field428; // L: 473

			do {
				long var5 = this.field2858 + (long)var3 * (long)var4; // L: 475
				if (this.field2859 - var5 >= 0L) { // L: 476
					this.field2858 = var5; // L: 477
					break;
				}

				int var7 = (int)((this.field2859 - this.field2858 + (long)var4 - 1L) / (long)var4); // L: 480
				this.field2858 += (long)var4 * (long)var7; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method4441(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lie;ZI)V",
		garbageValue = "1330192797"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field2855 = var2; // L: 90
		this.field2858 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field2859 = this.midiFile.method4552(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("u")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field2853 / PcmPlayer.field428; // L: 494

			do {
				long var3 = this.field2858 + (long)var2 * (long)var1; // L: 496
				if (this.field2859 - var3 >= 0L) { // L: 497
					this.field2858 = var3; // L: 498
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2859 - this.field2858) - 1L) / (long)var2); // L: 501
				this.field2858 += (long)var5 * (long)var2; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method4441(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1985172216"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method4429(); // L: 105
	} // L: 106

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1892448379"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1570912029"
	)
	public synchronized void method4502(int var1, int var2) {
		this.method4512(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-75"
	)
	void method4512(int var1, int var2) {
		this.field2839[var1] = var2; // L: 117
		this.field2841[var1] = var2 & -128; // L: 118
		this.method4419(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-81134935"
	)
	void method4419(int var1, int var2) {
		if (var2 != this.field2861[var1]) { // L: 123
			this.field2861[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field2849[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1345766655"
	)
	void method4420(int var1, int var2, int var3) {
		this.method4418(var1, var2, 64); // L: 130
		if ((this.field2846[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field2905 == var1 && var4.field2895 < 0) { // L: 133
					this.field2847[var1][var4.field2896] = null; // L: 134
					this.field2847[var1][var2] = var4; // L: 135
					int var8 = (var4.field2901 * var4.field2899 >> 12) + var4.field2900; // L: 136
					var4.field2900 += var2 - var4.field2896 << 8; // L: 137
					var4.field2899 = var8 - var4.field2900; // L: 138
					var4.field2901 = 4096; // L: 139
					var4.field2896 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2861[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field2905 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field2894 = var9.field2876[var2]; // L: 153
				var6.field2893 = var9.field2882[var2]; // L: 154
				var6.field2896 = var2; // L: 155
				var6.field2897 = var3 * var3 * var9.field2879[var2] * var9.field2881 + 1024 >> 11; // L: 156
				var6.field2898 = var9.field2880[var2] & 255; // L: 157
				var6.field2900 = (var2 << 8) - (var9.field2878[var2] & 32767); // L: 158
				var6.field2902 = 0; // L: 159
				var6.field2903 = 0; // L: 160
				var6.field2911 = 0; // L: 161
				var6.field2895 = -1; // L: 162
				var6.field2906 = 0; // L: 163
				if (this.field2836[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method842(var5, this.method4415(var6), this.method4434(var6), this.method4435(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method842(var5, this.method4415(var6), 0, this.method4435(var6)); // L: 168
					this.method4421(var6, var9.field2878[var2] < 0); // L: 169
				}

				if (var9.field2878[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2893 >= 0) { // L: 172
					MusicPatchNode var7 = this.field2849[var1][var6.field2893]; // L: 173
					if (var7 != null && var7.field2895 < 0) { // L: 174
						this.field2847[var1][var7.field2896] = null; // L: 175
						var7.field2895 = 0; // L: 176
					}

					this.field2849[var1][var6.field2893] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field2847[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Liq;ZB)V",
		garbageValue = "-23"
	)
	void method4421(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field399) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)this.field2836[var1.field2905] * (long)var5 >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method888(); // L: 193
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2836[var1.field2905] >> 6); // L: 197
		}

		var1.stream.method900(var4); // L: 199
	} // L: 200

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "58"
	)
	void method4418(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2847[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field2847[var1][var2] = null; // L: 205
			if ((this.field2846[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var5.field2905 == var4.field2905 && var5.field2895 < 0 && var4 != var5) { // L: 208
						var4.field2895 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field2895 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-366047626"
	)
	void method4423(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "852353128"
	)
	void method4501(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-5"
	)
	void method4425(int var1, int var2) {
		this.field2842[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2477568"
	)
	void method4426(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field2905 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method855(PcmPlayer.field428 / 100); // L: 230
					if (var2.stream.method859()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4634(); // L: 232
				}

				if (var2.field2895 < 0) { // L: 234
					this.field2847[var2.field2905][var2.field2896] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1043884473"
	)
	void method4433(int var1) {
		if (var1 >= 0) { // L: 241
			this.field2854[var1] = 12800; // L: 245
			this.field2837[var1] = 8192; // L: 246
			this.field2835[var1] = 16383; // L: 247
			this.field2842[var1] = 8192; // L: 248
			this.field2843[var1] = 0; // L: 249
			this.field2852[var1] = 8192; // L: 250
			this.method4438(var1); // L: 251
			this.method4431(var1); // L: 252
			this.field2846[var1] = 0; // L: 253
			this.field2844[var1] = 32767; // L: 254
			this.field2848[var1] = 256; // L: 255
			this.field2836[var1] = 0; // L: 256
			this.method4474(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method4433(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1363851317"
	)
	void method4436(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field2905 == var1) && var2.field2895 < 0) { // L: 262 263
				this.field2847[var2.field2905][var2.field2896] = null; // L: 264
				var2.field2895 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1017241688"
	)
	void method4429() {
		this.method4426(-1); // L: 272
		this.method4433(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field2861[var1] = this.field2839[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field2841[var1] = this.field2839[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1658989122"
	)
	void method4438(int var1) {
		if ((this.field2846[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field2905 == var1 && this.field2847[var1][var2.field2896] == null && var2.field2895 < 0) { // L: 281 282
					var2.field2895 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "119"
	)
	void method4431(int var1) {
		if ((this.field2846[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field2905 == var1) { // L: 291
					var2.field2904 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method4452(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method4418(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method4420(var3, var4, var5);
			} else {
				this.method4418(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method4423(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field2841[var3] = (var5 << 14) + (this.field2841[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field2841[var3] = (var5 << 7) + (this.field2841[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field2843[var3] = (var5 << 7) + (this.field2843[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field2843[var3] = var5 + (this.field2843[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field2852[var3] = var5 + (this.field2852[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field2854[var3] = (var5 << 7) + (this.field2854[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field2854[var3] = var5 + (this.field2854[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field2837[var3] = (var5 << 7) + (this.field2837[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field2837[var3] = var5 + (this.field2837[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field2835[var3] = (var5 << 7) + (this.field2835[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field2835[var3] = var5 + (this.field2835[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field2846;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2846; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field2846;
					var10000[var3] |= 2;
				} else {
					this.method4438(var3); // L: 343
					var10000 = this.field2846; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field2844[var3] = (this.field2844[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field2844[var3] = (this.field2844[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method4426(var3);
			}

			if (var4 == 121) { // L: 352
				this.method4433(var3);
			}

			if (var4 == 123) { // L: 353
				this.method4436(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field2844[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field2848[var3] = (var5 << 7) + (this.field2848[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field2844[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field2848[var3] = var5 + (this.field2848[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field2836[var3] = (var5 << 7) + (this.field2836[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field2836[var3] = var5 + (this.field2836[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field2846;
					var10000[var3] |= 4;
				} else {
					this.method4431(var3); // L: 367
					var10000 = this.field2846; // L: 368
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4474(var3, (var5 << 7) + (this.field2850[var3] & -16257)); // L: 371
			}

			if (var4 == 49) { // L: 372
				this.method4474(var3, var5 + (this.field2850[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method4419(var3, var4 + this.field2841[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method4501(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method4425(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method4429(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "498737337"
	)
	void method4474(int var1, int var2) {
		this.field2850[var1] = var2; // L: 401
		this.field2851[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Liq;B)I",
		garbageValue = "1"
	)
	int method4415(MusicPatchNode var1) {
		int var2 = (var1.field2901 * var1.field2899 >> 12) + var1.field2900; // L: 406
		var2 += (this.field2842[var1.field2905] - 8192) * this.field2848[var1.field2905] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field2894; // L: 408
		int var4;
		if (var3.field2817 > 0 && (var3.field2822 > 0 || this.field2843[var1.field2905] > 0)) { // L: 409
			var4 = var3.field2822 << 2; // L: 410
			int var5 = var3.field2823 << 1; // L: 411
			if (var1.field2907 < var5) { // L: 412
				var4 = var4 * var1.field2907 / var5;
			}

			var4 += this.field2843[var1.field2905] >> 7; // L: 413
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2908 & 511)); // L: 414
			var2 += (int)((double)var4 * var6); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field428 + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liq;I)I",
		garbageValue = "-2121980978"
	)
	int method4434(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2894; // L: 422
		int var3 = this.field2854[var1.field2905] * this.field2835[var1.field2905] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field2897 + 16384 >> 15; // L: 425
		var3 = var3 * this.field2834 + 128 >> 8; // L: 426
		if (var2.field2815 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2815 * (double)var1.field2902 * 1.953125E-5D) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2825 != null) { // L: 430
			var4 = var1.field2903; // L: 431
			var5 = var2.field2825[var1.field2911 + 1]; // L: 432
			if (var1.field2911 < var2.field2825.length - 2) { // L: 433
				var6 = (var2.field2825[var1.field2911] & 255) << 8; // L: 434
				var7 = (var2.field2825[var1.field2911 + 2] & 255) << 8; // L: 435
				var5 += (var4 - var6) * (var2.field2825[var1.field2911 + 3] - var5) / (var7 - var6); // L: 436
			}

			var3 = var5 * var3 + 32 >> 6; // L: 438
		}

		if (var1.field2895 > 0 && var2.field2816 != null) { // L: 440
			var4 = var1.field2895; // L: 441
			var5 = var2.field2816[var1.field2906 + 1]; // L: 442
			if (var1.field2906 < var2.field2816.length - 2) { // L: 443
				var6 = (var2.field2816[var1.field2906] & 255) << 8; // L: 444
				var7 = (var2.field2816[var1.field2906 + 2] & 255) << 8; // L: 445
				var5 += (var2.field2816[var1.field2906 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 446
			}

			var3 = var5 * var3 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liq;I)I",
		garbageValue = "-1483701319"
	)
	int method4435(MusicPatchNode var1) {
		int var2 = this.field2837[var1.field2905]; // L: 454
		return var2 < 8192 ? var2 * var1.field2898 + 32 >> 6 : 16384 - ((128 - var1.field2898) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981767255"
	)
	void method4441() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field2859; var2 == this.trackLength; var3 = this.midiFile.method4552(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field2855 || var2 == 0) { // L: 524
							this.method4429(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method4452(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field2859 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Liq;B)Z",
		garbageValue = "-21"
	)
	boolean method4442(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field2895 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) { // L: 549
					this.field2849[var1.field2905][var1.field2893] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liq;[IIII)Z",
		garbageValue = "-1838256621"
	)
	boolean method4443(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2891 = PcmPlayer.field428 / 100; // L: 559
		if (var1.field2895 < 0 || var1.stream != null && !var1.stream.method848()) { // L: 560
			int var5 = var1.field2901; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2852[var1.field2905] * 4.921259842519685E-4D) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field2901 = var5; // L: 572
			}

			var1.stream.method959(this.method4415(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field2894; // L: 575
			boolean var7 = false; // L: 576
			++var1.field2907; // L: 577
			var1.field2908 += var6.field2817; // L: 578
			double var8 = 5.086263020833333E-6D * (double)((var1.field2896 - 60 << 8) + (var1.field2901 * var1.field2899 >> 12)); // L: 579
			if (var6.field2815 > 0) { // L: 580
				if (var6.field2820 > 0) { // L: 581
					var1.field2902 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2820) + 0.5D);
				} else {
					var1.field2902 += 128; // L: 582
				}
			}

			if (var6.field2825 != null) { // L: 584
				if (var6.field2821 > 0) { // L: 585
					var1.field2903 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2821 * var8) + 0.5D);
				} else {
					var1.field2903 += 128; // L: 586
				}

				while (var1.field2911 < var6.field2825.length - 2 && var1.field2903 > (var6.field2825[var1.field2911 + 2] & 255) << 8) { // L: 587
					var1.field2911 += 2;
				}

				if (var6.field2825.length - 2 == var1.field2911 && var6.field2825[var1.field2911 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field2895 >= 0 && var6.field2816 != null && (this.field2846[var1.field2905] & 1) == 0 && (var1.field2893 < 0 || var1 != this.field2849[var1.field2905][var1.field2893])) { // L: 590 591
				if (var6.field2819 > 0) { // L: 592
					var1.field2895 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2819 * var8) + 0.5D);
				} else {
					var1.field2895 += 128; // L: 593
				}

				while (var1.field2906 < var6.field2816.length - 2 && var1.field2895 > (var6.field2816[var1.field2906 + 2] & 255) << 8) { // L: 594
					var1.field2906 += 2;
				}

				if (var6.field2816.length - 2 == var1.field2906) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method855(var1.field2891); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method859()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4634(); // L: 603
				if (var1.field2895 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) { // L: 606
						this.field2849[var1.field2905][var1.field2893] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method983(var1.field2891, this.method4434(var1), this.method4435(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method4634(); // L: 561
			var1.remove(); // L: 562
			if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) { // L: 563
				this.field2849[var1.field2905][var1.field2893] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-792504046"
	)
	static boolean method4445() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4430
	}
}
