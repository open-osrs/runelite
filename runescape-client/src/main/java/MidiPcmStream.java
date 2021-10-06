import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ig")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2022470643
	)
	int field2922;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 458083617
	)
	int field2947;
	@ObfuscatedName("j")
	int[] field2934;
	@ObfuscatedName("m")
	int[] field2925;
	@ObfuscatedName("k")
	int[] field2930;
	@ObfuscatedName("t")
	int[] field2927;
	@ObfuscatedName("a")
	int[] field2938;
	@ObfuscatedName("e")
	int[] field2929;
	@ObfuscatedName("i")
	int[] field2945;
	@ObfuscatedName("y")
	int[] field2931;
	@ObfuscatedName("g")
	int[] field2932;
	@ObfuscatedName("z")
	int[] field2948;
	@ObfuscatedName("h")
	int[] field2935;
	@ObfuscatedName("o")
	int[] field2928;
	@ObfuscatedName("r")
	int[] field2937;
	@ObfuscatedName("n")
	int[] field2926;
	@ObfuscatedName("u")
	int[] field2939;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2940;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2924;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("as")
	boolean field2943;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1699428343
	)
	@Export("track")
	int track;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2119963639
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 4917334441475948519L
	)
	long field2946;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 8692867824420416607L
	)
	long field2936;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2922 = 256;
		this.field2947 = 1000000;
		this.field2934 = new int[16];
		this.field2925 = new int[16];
		this.field2930 = new int[16];
		this.field2927 = new int[16];
		this.field2938 = new int[16];
		this.field2929 = new int[16];
		this.field2945 = new int[16];
		this.field2931 = new int[16];
		this.field2932 = new int[16];
		this.field2948 = new int[16];
		this.field2935 = new int[16];
		this.field2928 = new int[16];
		this.field2937 = new int[16];
		this.field2926 = new int[16];
		this.field2939 = new int[16];
		this.field2940 = new MusicPatchNode[16][128];
		this.field2924 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4724();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1789077761"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2922 = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1238348421"
	)
	public int method4705() {
		return this.field2922;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lim;Lkl;Lat;IB)Z",
		garbageValue = "49"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4904();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = VarbitComposition.method3103(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4875(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("a")
	protected synchronized int vmethod4889() {
		return 0;
	}

	@ObfuscatedName("e")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2947 / PcmPlayer.field279;

			do {
				long var5 = (long)var3 * (long)var4 + this.field2946;
				if (this.field2936 - var5 >= 0L) {
					this.field2946 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2936 - this.field2946) - 1L) / (long)var4);
				this.field2946 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4737();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lim;ZI)V",
		garbageValue = "664654337"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2943 = var2;
		this.field2946 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2936 = this.midiFile.method4838(this.trackLength);
	}

	@ObfuscatedName("y")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2947 / PcmPlayer.field279;

			do {
				long var3 = this.field2946 + (long)var2 * (long)var1;
				if (this.field2936 - var3 >= 0L) {
					this.field2946 = var3;
					break;
				}

				int var5 = (int)((this.field2936 - this.field2946 + (long)var2 - 1L) / (long)var2);
				this.field2946 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4737();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method4724();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "5"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "200806688"
	)
	public synchronized void method4736(int var1, int var2) {
		this.method4791(var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1047068773"
	)
	void method4791(int var1, int var2) {
		this.field2927[var1] = var2;
		this.field2929[var1] = var2 & -128;
		this.method4721(var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "104"
	)
	void method4721(int var1, int var2) {
		if (var2 != this.field2938[var1]) {
			this.field2938[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2924[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "92"
	)
	void method4750(int var1, int var2, int var3) {
		this.method4717(var1, var2, 64);
		if ((this.field2948[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2980 == var1 && var4.field2978 < 0) {
					this.field2940[var1][var4.field2988] = null;
					this.field2940[var1][var2] = var4;
					int var8 = (var4.field2983 * var4.field2987 >> 12) + var4.field2986;
					var4.field2986 += var2 - var4.field2988 << 8;
					var4.field2987 = var8 - var4.field2986;
					var4.field2983 = 4096;
					var4.field2988 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2938[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2980 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2981 = var9.field2968[var2];
				var6.field2985 = var9.field2964[var2];
				var6.field2988 = var2;
				var6.field2984 = var3 * var3 * var9.field2966[var2] * var9.field2969 + 1024 >> 11;
				var6.field2982 = var9.field2970[var2] & 255;
				var6.field2986 = (var2 << 8) - (var9.field2965[var2] & 32767);
				var6.field2989 = 0;
				var6.field2990 = 0;
				var6.field2991 = 0;
				var6.field2978 = -1;
				var6.field2993 = 0;
				if (this.field2937[var1] == 0) {
					var6.stream = RawPcmStream.method794(var5, this.method4729(var6), this.method4782(var6), this.method4731(var6));
				} else {
					var6.stream = RawPcmStream.method794(var5, this.method4729(var6), 0, this.method4731(var6));
					this.method4802(var6, var9.field2965[var2] < 0);
				}

				if (var9.field2965[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2985 >= 0) {
					MusicPatchNode var7 = this.field2924[var1][var6.field2985];
					if (var7 != null && var7.field2978 < 0) {
						this.field2940[var1][var7.field2988] = null;
						var7.field2978 = 0;
					}

					this.field2924[var1][var6.field2985] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2940[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lib;ZI)V",
		garbageValue = "2049564626"
	)
	void method4802(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field249) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2937[var1.field2980] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method803();
			}
		} else {
			var4 = (int)((long)this.field2937[var1.field2980] * (long)var3 >> 6);
		}

		var1.stream.method839(var4);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2145702834"
	)
	void method4717(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2940[var1][var2];
		if (var4 != null) {
			this.field2940[var1][var2] = null;
			if ((this.field2948[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2980 == var5.field2980 && var5.field2978 < 0 && var4 != var5) {
						var4.field2978 = 0;
						break;
					}
				}
			} else {
				var4.field2978 = 0;
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "3615"
	)
	void method4748(int var1, int var2, int var3) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-29"
	)
	void method4719(int var1, int var2) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "23625"
	)
	void method4720(int var1, int var2) {
		this.field2945[var1] = var2;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "849653299"
	)
	void method4723(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2980 == var1) {
				if (var2.stream != null) {
					var2.stream.method807(PcmPlayer.field279 / 100);
					if (var2.stream.method920()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4913();
				}

				if (var2.field2978 < 0) {
					this.field2940[var2.field2980][var2.field2988] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	void method4722(int var1) {
		if (var1 >= 0) {
			this.field2934[var1] = 12800;
			this.field2925[var1] = 8192;
			this.field2930[var1] = 16383;
			this.field2945[var1] = 8192;
			this.field2931[var1] = 0;
			this.field2932[var1] = 8192;
			this.method4725(var1);
			this.method4726(var1);
			this.field2948[var1] = 0;
			this.field2935[var1] = 32767;
			this.field2928[var1] = 256;
			this.field2937[var1] = 0;
			this.method4709(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4722(var1);
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "298420171"
	)
	void method4787(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2980 == var1) && var2.field2978 < 0) {
				this.field2940[var2.field2980][var2.field2988] = null;
				var2.field2978 = 0;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	void method4724() {
		this.method4723(-1);
		this.method4722(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2938[var1] = this.field2927[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2929[var1] = this.field2927[var1] & -128;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	void method4725(int var1) {
		if ((this.field2948[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2980 == var1 && this.field2940[var1][var2.field2988] == null && var2.field2978 < 0) {
					var2.field2978 = 0;
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "791445586"
	)
	void method4726(int var1) {
		if ((this.field2948[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2980 == var1) {
					var2.field2998 = 0;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1057431192"
	)
	void method4727(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4717(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4750(var3, var4, var5);
			} else {
				this.method4717(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4748(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2929[var3] = (var5 << 14) + (this.field2929[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2929[var3] = (var5 << 7) + (this.field2929[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2931[var3] = (var5 << 7) + (this.field2931[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2931[var3] = var5 + (this.field2931[var3] & -128);
			}

			if (var4 == 5) {
				this.field2932[var3] = (var5 << 7) + (this.field2932[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2932[var3] = var5 + (this.field2932[var3] & -128);
			}

			if (var4 == 7) {
				this.field2934[var3] = (var5 << 7) + (this.field2934[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2934[var3] = var5 + (this.field2934[var3] & -128);
			}

			if (var4 == 10) {
				this.field2925[var3] = (var5 << 7) + (this.field2925[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2925[var3] = var5 + (this.field2925[var3] & -128);
			}

			if (var4 == 11) {
				this.field2930[var3] = (var5 << 7) + (this.field2930[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2930[var3] = var5 + (this.field2930[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2948;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2948;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2948;
					var10000[var3] |= 2;
				} else {
					this.method4725(var3);
					var10000 = this.field2948;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2935[var3] = (var5 << 7) + (this.field2935[var3] & 127);
			}

			if (var4 == 98) {
				this.field2935[var3] = (this.field2935[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2935[var3] = (var5 << 7) + (this.field2935[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2935[var3] = (this.field2935[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4723(var3);
			}

			if (var4 == 121) {
				this.method4722(var3);
			}

			if (var4 == 123) {
				this.method4787(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2935[var3];
				if (var6 == 16384) {
					this.field2928[var3] = (var5 << 7) + (this.field2928[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2935[var3];
				if (var6 == 16384) {
					this.field2928[var3] = var5 + (this.field2928[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2937[var3] = (var5 << 7) + (this.field2937[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2937[var3] = var5 + (this.field2937[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2948;
					var10000[var3] |= 4;
				} else {
					this.method4726(var3);
					var10000 = this.field2948;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4709(var3, (var5 << 7) + (this.field2926[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4709(var3, var5 + (this.field2926[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4721(var3, var4 + this.field2929[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4719(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4720(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4724();
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2135389317"
	)
	void method4709(int var1, int var2) {
		this.field2926[var1] = var2;
		this.field2939[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "-1323579923"
	)
	int method4729(MusicPatchNode var1) {
		int var2 = (var1.field2983 * var1.field2987 >> 12) + var1.field2986;
		var2 += (this.field2945[var1.field2980] - 8192) * this.field2928[var1.field2980] >> 12;
		MusicPatchNode2 var3 = var1.field2981;
		int var4;
		if (var3.field2907 > 0 && (var3.field2906 > 0 || this.field2931[var1.field2980] > 0)) {
			var4 = var3.field2906 << 2;
			int var5 = var3.field2908 << 1;
			if (var1.field2994 < var5) {
				var4 = var4 * var1.field2994 / var5;
			}

			var4 += this.field2931[var1.field2980] >> 7;
			double var6 = Math.sin((double)(var1.field2995 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field279 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)I",
		garbageValue = "-1"
	)
	int method4782(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2981;
		int var3 = this.field2930[var1.field2980] * this.field2934[var1.field2980] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2984 + 16384 >> 15;
		var3 = var3 * this.field2922 + 128 >> 8;
		if (var2.field2902 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2902 * (double)var1.field2989 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2903 != null) {
			var4 = var1.field2990;
			var5 = var2.field2903[var1.field2991 + 1];
			if (var1.field2991 < var2.field2903.length - 2) {
				var6 = (var2.field2903[var1.field2991] & 255) << 8;
				var7 = (var2.field2903[var1.field2991 + 2] & 255) << 8;
				var5 += (var2.field2903[var1.field2991 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2978 > 0 && var2.field2901 != null) {
			var4 = var1.field2978;
			var5 = var2.field2901[var1.field2993 + 1];
			if (var1.field2993 < var2.field2901.length - 2) {
				var6 = (var2.field2901[var1.field2993] & 255) << 8;
				var7 = (var2.field2901[var1.field2993 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2901[var1.field2993 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "1020464759"
	)
	int method4731(MusicPatchNode var1) {
		int var2 = this.field2925[var1.field2980];
		return var2 < 8192 ? var2 * var1.field2982 + 32 >> 6 : 16384 - ((128 - var1.field2982) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1646259213"
	)
	void method4737() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2936; var2 == this.trackLength; var3 = this.midiFile.method4838(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2943 || var2 == 0) {
							this.method4724();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4727(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2936 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)Z",
		garbageValue = "-114"
	)
	boolean method4797(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2978 >= 0) {
				var1.remove();
				if (var1.field2985 > 0 && var1 == this.field2924[var1.field2980][var1.field2985]) {
					this.field2924[var1.field2980][var1.field2985] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIII)Z",
		garbageValue = "1929584471"
	)
	boolean method4739(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2997 = PcmPlayer.field279 / 100;
		if (var1.field2978 < 0 || var1.stream != null && !var1.stream.method810()) {
			int var5 = var1.field2983;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2932[var1.field2980] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2983 = var5;
			}

			var1.stream.method808(this.method4729(var1));
			MusicPatchNode2 var6 = var1.field2981;
			boolean var7 = false;
			++var1.field2994;
			var1.field2995 += var6.field2907;
			double var8 = (double)((var1.field2988 - 60 << 8) + (var1.field2987 * var1.field2983 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2902 > 0) {
				if (var6.field2905 > 0) {
					var1.field2989 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2905 * var8) + 0.5D);
				} else {
					var1.field2989 += 128;
				}
			}

			if (var6.field2903 != null) {
				if (var6.field2900 > 0) {
					var1.field2990 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2900 * var8) + 0.5D);
				} else {
					var1.field2990 += 128;
				}

				while (var1.field2991 < var6.field2903.length - 2 && var1.field2990 > (var6.field2903[var1.field2991 + 2] & 255) << 8) {
					var1.field2991 += 2;
				}

				if (var6.field2903.length - 2 == var1.field2991 && var6.field2903[var1.field2991 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2978 >= 0 && var6.field2901 != null && (this.field2948[var1.field2980] & 1) == 0 && (var1.field2985 < 0 || var1 != this.field2924[var1.field2980][var1.field2985])) {
				if (var6.field2904 > 0) {
					var1.field2978 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2904) + 0.5D);
				} else {
					var1.field2978 += 128;
				}

				while (var1.field2993 < var6.field2901.length - 2 && var1.field2978 > (var6.field2901[var1.field2993 + 2] & 255) << 8) {
					var1.field2993 += 2;
				}

				if (var6.field2901.length - 2 == var1.field2993) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method807(var1.field2997);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method920()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4913();
				if (var1.field2978 >= 0) {
					var1.remove();
					if (var1.field2985 > 0 && var1 == this.field2924[var1.field2980][var1.field2985]) {
						this.field2924[var1.field2980][var1.field2985] = null;
					}
				}

				return true;
			} else {
				var1.stream.method806(var1.field2997, this.method4782(var1), this.method4731(var1));
				return false;
			}
		} else {
			var1.method4913();
			var1.remove();
			if (var1.field2985 > 0 && var1 == this.field2924[var1.field2980][var1.field2985]) {
				this.field2924[var1.field2980][var1.field2985] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "-990431040"
	)
	static int method4814(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-733050611"
	)
	public static int method4815(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1988064953"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(ZLoy;S)V",
		garbageValue = "16035"
	)
	static final void method4806(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var7;
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					int var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field535[++Client.field713 - 1] = var2;
					}

					int var6;
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					int var9 = Client.defaultRotations[var1.readBits(3)];
					if (var3) {
						var4.orientation = var4.rotation = var9;
					}

					var4.definition = class112.getNpcDefinition(var1.readBits(14));
					boolean var10 = var1.readBits(1) == 1;
					if (var10) {
						var1.readBits(32);
					}

					int var5 = var1.readBits(1);
					var4.field1109 = var4.definition.size;
					var4.field1146 = var4.definition.rotation;
					if (var4.field1146 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.idleSequence = var4.definition.idleSequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2234(class67.localPlayer.pathX[0] + var6, class67.localPlayer.pathY[0] + var7, var5 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
