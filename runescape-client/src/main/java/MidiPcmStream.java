import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2118775999
	)
	int field2922;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 622600987
	)
	int field2908;
	@ObfuscatedName("k")
	int[] field2909;
	@ObfuscatedName("o")
	int[] field2926;
	@ObfuscatedName("g")
	int[] field2911;
	@ObfuscatedName("z")
	int[] field2912;
	@ObfuscatedName("a")
	int[] field2913;
	@ObfuscatedName("u")
	int[] field2914;
	@ObfuscatedName("e")
	int[] field2906;
	@ObfuscatedName("l")
	int[] field2916;
	@ObfuscatedName("y")
	int[] field2917;
	@ObfuscatedName("x")
	int[] field2929;
	@ObfuscatedName("b")
	int[] field2930;
	@ObfuscatedName("t")
	int[] field2921;
	@ObfuscatedName("r")
	int[] field2925;
	@ObfuscatedName("p")
	int[] field2923;
	@ObfuscatedName("w")
	int[] field2924;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Lid;"
	)
	MusicPatchNode[][] field2927;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[[Lid;"
	)
	MusicPatchNode[][] field2920;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("al")
	boolean field2928;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 742866357
	)
	@Export("track")
	int track;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1955489195
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8197516407400164613L
	)
	long field2931;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -7506137618568880587L
	)
	long field2932;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2922 = 256;
		this.field2908 = 1000000;
		this.field2909 = new int[16];
		this.field2926 = new int[16];
		this.field2911 = new int[16];
		this.field2912 = new int[16];
		this.field2913 = new int[16];
		this.field2914 = new int[16];
		this.field2906 = new int[16];
		this.field2916 = new int[16];
		this.field2917 = new int[16];
		this.field2929 = new int[16];
		this.field2930 = new int[16];
		this.field2921 = new int[16];
		this.field2925 = new int[16];
		this.field2923 = new int[16];
		this.field2924 = new int[16];
		this.field2927 = new MusicPatchNode[16][128];
		this.field2920 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4679();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1688056299"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2922 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1145779147"
	)
	int method4621() {
		return this.field2922;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lkk;Lao;II)Z",
		garbageValue = "-329525945"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4840();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = WorldMapIcon_1.method3403(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4801(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-994227183"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("a")
	protected synchronized int vmethod4836() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2908 / class276.field3287;

			do {
				long var5 = (long)var4 * (long)var3 + this.field2931;
				if (this.field2932 - var5 >= 0L) {
					this.field2931 = var5;
					break;
				}

				int var7 = (int)((this.field2932 - this.field2931 + (long)var4 - 1L) / (long)var4);
				this.field2931 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4652();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lic;ZB)V",
		garbageValue = "87"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2928 = var2;
		this.field2931 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2932 = this.midiFile.method4769(this.trackLength);
	}

	@ObfuscatedName("l")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2908 / class276.field3287;

			do {
				long var3 = this.field2931 + (long)var1 * (long)var2;
				if (this.field2932 - var3 >= 0L) {
					this.field2931 = var3;
					break;
				}

				int var5 = (int)((this.field2932 - this.field2931 + (long)var2 - 1L) / (long)var2);
				this.field2931 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4652();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106383017"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear();
		this.method4679();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1805637929"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public synchronized void method4628(int var1, int var2) {
		this.method4629(var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	void method4629(int var1, int var2) {
		this.field2912[var1] = var2;
		this.field2914[var1] = var2 & -128;
		this.method4630(var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1484106318"
	)
	void method4630(int var1, int var2) {
		if (var2 != this.field2913[var1]) {
			this.field2913[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2920[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2077675735"
	)
	void method4637(int var1, int var2, int var3) {
		this.method4633(var1, var2, 64);
		if ((this.field2929[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2970 == var1 && var4.field2985 < 0) {
					this.field2927[var1][var4.field2986] = null;
					this.field2927[var1][var2] = var4;
					int var8 = (var4.field2976 * var4.field2977 >> 12) + var4.field2975;
					var4.field2975 += var2 - var4.field2986 << 8;
					var4.field2976 = var8 - var4.field2975;
					var4.field2977 = 4096;
					var4.field2986 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2913[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2970 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2972 = var9.field2954[var2];
				var6.field2971 = var9.field2955[var2];
				var6.field2986 = var2;
				var6.field2973 = var3 * var3 * var9.field2952[var2] * var9.field2957 + 1024 >> 11;
				var6.field2979 = var9.field2953[var2] & 255;
				var6.field2975 = (var2 << 8) - (var9.field2949[var2] & 32767);
				var6.field2978 = 0;
				var6.field2987 = 0;
				var6.field2980 = 0;
				var6.field2985 = -1;
				var6.field2981 = 0;
				if (this.field2925[var1] == 0) {
					var6.stream = RawPcmStream.method798(var5, this.method4671(var6), this.method4690(var6), this.method4646(var6));
				} else {
					var6.stream = RawPcmStream.method798(var5, this.method4671(var6), 0, this.method4646(var6));
					this.method4632(var6, var9.field2949[var2] < 0);
				}

				if (var9.field2949[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2971 >= 0) {
					MusicPatchNode var7 = this.field2920[var1][var6.field2971];
					if (var7 != null && var7.field2985 < 0) {
						this.field2927[var1][var7.field2986] = null;
						var7.field2985 = 0;
					}

					this.field2920[var1][var6.field2971] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2927[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lid;ZI)V",
		garbageValue = "-2124799901"
	)
	void method4632(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field250) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2925[var1.field2970] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method927();
			}
		} else {
			var4 = (int)((long)this.field2925[var1.field2970] * (long)var3 >> 6);
		}

		var1.stream.method806(var4);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1791556978"
	)
	void method4633(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2927[var1][var2];
		if (var4 != null) {
			this.field2927[var1][var2] = null;
			if ((this.field2929[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2970 == var5.field2970 && var5.field2985 < 0 && var4 != var5) {
						var4.field2985 = 0;
						break;
					}
				}
			} else {
				var4.field2985 = 0;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-948201213"
	)
	void method4634(int var1, int var2, int var3) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-45"
	)
	void method4635(int var1, int var2) {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2086526119"
	)
	void method4717(int var1, int var2) {
		this.field2906[var1] = var2;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	void method4636(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2970 == var1) {
				if (var2.stream != null) {
					var2.stream.method811(class276.field3287 / 100);
					if (var2.stream.method815()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4850();
				}

				if (var2.field2985 < 0) {
					this.field2927[var2.field2970][var2.field2986] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1910217526"
	)
	void method4734(int var1) {
		if (var1 >= 0) {
			this.field2909[var1] = 12800;
			this.field2926[var1] = 8192;
			this.field2911[var1] = 16383;
			this.field2906[var1] = 8192;
			this.field2916[var1] = 0;
			this.field2917[var1] = 8192;
			this.method4704(var1);
			this.method4682(var1);
			this.field2929[var1] = 0;
			this.field2930[var1] = 32767;
			this.field2921[var1] = 256;
			this.field2925[var1] = 0;
			this.method4701(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4734(var1);
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	void method4743(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2970 == var1) && var2.field2985 < 0) {
				this.field2927[var2.field2970][var2.field2986] = null;
				var2.field2985 = 0;
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1946418256"
	)
	void method4679() {
		this.method4636(-1);
		this.method4734(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2913[var1] = this.field2912[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2914[var1] = this.field2912[var1] & -128;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "117"
	)
	void method4704(int var1) {
		if ((this.field2929[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2970 == var1 && this.field2927[var1][var2.field2986] == null && var2.field2985 < 0) {
					var2.field2985 = 0;
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method4682(int var1) {
		if ((this.field2929[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2970 == var1) {
					var2.field2988 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	void method4653(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4633(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4637(var3, var4, var5);
			} else {
				this.method4633(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4634(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2914[var3] = (var5 << 14) + (this.field2914[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2914[var3] = (var5 << 7) + (this.field2914[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2916[var3] = (var5 << 7) + (this.field2916[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2916[var3] = var5 + (this.field2916[var3] & -128);
			}

			if (var4 == 5) {
				this.field2917[var3] = (var5 << 7) + (this.field2917[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2917[var3] = var5 + (this.field2917[var3] & -128);
			}

			if (var4 == 7) {
				this.field2909[var3] = (var5 << 7) + (this.field2909[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2909[var3] = var5 + (this.field2909[var3] & -128);
			}

			if (var4 == 10) {
				this.field2926[var3] = (var5 << 7) + (this.field2926[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2926[var3] = var5 + (this.field2926[var3] & -128);
			}

			if (var4 == 11) {
				this.field2911[var3] = (var5 << 7) + (this.field2911[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2911[var3] = var5 + (this.field2911[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2929;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2929;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2929;
					var10000[var3] |= 2;
				} else {
					this.method4704(var3);
					var10000 = this.field2929;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2930[var3] = (var5 << 7) + (this.field2930[var3] & 127);
			}

			if (var4 == 98) {
				this.field2930[var3] = (this.field2930[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2930[var3] = (var5 << 7) + (this.field2930[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2930[var3] = (this.field2930[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4636(var3);
			}

			if (var4 == 121) {
				this.method4734(var3);
			}

			if (var4 == 123) {
				this.method4743(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2930[var3];
				if (var6 == 16384) {
					this.field2921[var3] = (var5 << 7) + (this.field2921[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2930[var3];
				if (var6 == 16384) {
					this.field2921[var3] = var5 + (this.field2921[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2925[var3] = (var5 << 7) + (this.field2925[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2925[var3] = var5 + (this.field2925[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2929;
					var10000[var3] |= 4;
				} else {
					this.method4682(var3);
					var10000 = this.field2929;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4701(var3, (var5 << 7) + (this.field2923[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4701(var3, var5 + (this.field2923[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4630(var3, var4 + this.field2914[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4635(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4717(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4679();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1296601791"
	)
	void method4701(int var1, int var2) {
		this.field2923[var1] = var2;
		this.field2924[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)I",
		garbageValue = "-860885754"
	)
	int method4671(MusicPatchNode var1) {
		int var2 = (var1.field2977 * var1.field2976 >> 12) + var1.field2975;
		var2 += (this.field2906[var1.field2970] - 8192) * this.field2921[var1.field2970] >> 12;
		MusicPatchNode2 var3 = var1.field2972;
		int var4;
		if (var3.field2890 > 0 && (var3.field2893 > 0 || this.field2916[var1.field2970] > 0)) {
			var4 = var3.field2893 << 2;
			int var5 = var3.field2887 << 1;
			if (var1.field2983 < var5) {
				var4 = var4 * var1.field2983 / var5;
			}

			var4 += this.field2916[var1.field2970] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2984 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class276.field3287 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)I",
		garbageValue = "1727050510"
	)
	int method4690(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2972;
		int var3 = this.field2909[var1.field2970] * this.field2911[var1.field2970] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2973 + 16384 >> 15;
		var3 = var3 * this.field2922 + 128 >> 8;
		if (var2.field2889 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2978 * (double)var2.field2889) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2896 != null) {
			var4 = var1.field2987;
			var5 = var2.field2896[var1.field2980 + 1];
			if (var1.field2980 < var2.field2896.length - 2) {
				var6 = (var2.field2896[var1.field2980] & 255) << 8;
				var7 = (var2.field2896[var1.field2980 + 2] & 255) << 8;
				var5 += (var2.field2896[var1.field2980 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2985 > 0 && var2.field2888 != null) {
			var4 = var1.field2985;
			var5 = var2.field2888[var1.field2981 + 1];
			if (var1.field2981 < var2.field2888.length - 2) {
				var6 = (var2.field2888[var1.field2981] & 255) << 8;
				var7 = (var2.field2888[var1.field2981 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2888[var1.field2981 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lid;B)I",
		garbageValue = "27"
	)
	int method4646(MusicPatchNode var1) {
		int var2 = this.field2926[var1.field2970];
		return var2 < 8192 ? var2 * var1.field2979 + 32 >> 6 : 16384 - ((128 - var1.field2979) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-639757320"
	)
	void method4652() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2932; var2 == this.trackLength; var3 = this.midiFile.method4769(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2928 || var2 == 0) {
							this.method4679();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4653(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2932 = var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)Z",
		garbageValue = "-774691318"
	)
	boolean method4651(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2985 >= 0) {
				var1.remove();
				if (var1.field2971 > 0 && var1 == this.field2920[var1.field2970][var1.field2971]) {
					this.field2920[var1.field2970][var1.field2971] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lid;[IIII)Z",
		garbageValue = "-702133888"
	)
	boolean method4668(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2982 = class276.field3287 / 100;
		if (var1.field2985 < 0 || var1.stream != null && !var1.stream.method860()) {
			int var5 = var1.field2977;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2917[var1.field2970] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2977 = var5;
			}

			var1.stream.method833(this.method4671(var1));
			MusicPatchNode2 var6 = var1.field2972;
			boolean var7 = false;
			++var1.field2983;
			var1.field2984 += var6.field2890;
			double var8 = (double)((var1.field2986 - 60 << 8) + (var1.field2977 * var1.field2976 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2889 > 0) {
				if (var6.field2892 > 0) {
					var1.field2978 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2892 * var8) + 0.5D);
				} else {
					var1.field2978 += 128;
				}
			}

			if (var6.field2896 != null) {
				if (var6.field2895 > 0) {
					var1.field2987 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2895) + 0.5D);
				} else {
					var1.field2987 += 128;
				}

				while (var1.field2980 < var6.field2896.length - 2 && var1.field2987 > (var6.field2896[var1.field2980 + 2] & 255) << 8) {
					var1.field2980 += 2;
				}

				if (var6.field2896.length - 2 == var1.field2980 && var6.field2896[var1.field2980 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2985 >= 0 && var6.field2888 != null && (this.field2929[var1.field2970] & 1) == 0 && (var1.field2971 < 0 || var1 != this.field2920[var1.field2970][var1.field2971])) {
				if (var6.field2891 > 0) {
					var1.field2985 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2891) + 0.5D);
				} else {
					var1.field2985 += 128;
				}

				while (var1.field2981 < var6.field2888.length - 2 && var1.field2985 > (var6.field2888[var1.field2981 + 2] & 255) << 8) {
					var1.field2981 += 2;
				}

				if (var6.field2888.length - 2 == var1.field2981) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method811(var1.field2982);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method815()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4850();
				if (var1.field2985 >= 0) {
					var1.remove();
					if (var1.field2971 > 0 && var1 == this.field2920[var1.field2970][var1.field2971]) {
						this.field2920[var1.field2970][var1.field2971] = null;
					}
				}

				return true;
			} else {
				var1.stream.method810(var1.field2982, this.method4690(var1), this.method4646(var1));
				return false;
			}
		} else {
			var1.method4850();
			var1.remove();
			if (var1.field2971 > 0 && var1 == this.field2920[var1.field2970][var1.field2971]) {
				this.field2920[var1.field2970][var1.field2971] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1442277074"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = FriendSystem.getPacketBufferNode(ClientPacket.field2727, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
