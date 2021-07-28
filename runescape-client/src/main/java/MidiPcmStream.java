import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field2846;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1177561295
	)
	int field2826;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1293445729
	)
	int field2824;
	@ObfuscatedName("j")
	int[] field2851;
	@ObfuscatedName("l")
	int[] field2825;
	@ObfuscatedName("n")
	int[] field2828;
	@ObfuscatedName("f")
	int[] field2823;
	@ObfuscatedName("o")
	int[] field2829;
	@ObfuscatedName("x")
	int[] field2831;
	@ObfuscatedName("r")
	int[] field2832;
	@ObfuscatedName("p")
	int[] field2833;
	@ObfuscatedName("h")
	int[] field2834;
	@ObfuscatedName("i")
	int[] field2830;
	@ObfuscatedName("m")
	int[] field2837;
	@ObfuscatedName("b")
	int[] field2838;
	@ObfuscatedName("z")
	int[] field2839;
	@ObfuscatedName("d")
	int[] field2840;
	@ObfuscatedName("y")
	int[] field2841;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2842;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2843;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("am")
	boolean field2845;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1508934545
	)
	@Export("track")
	int track;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1835964979
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -3749855752961411885L
	)
	long field2848;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -6294052222087762239L
	)
	long field2850;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2826 = 256;
		this.field2824 = 1000000;
		this.field2851 = new int[16];
		this.field2825 = new int[16];
		this.field2828 = new int[16];
		this.field2823 = new int[16];
		this.field2829 = new int[16];
		this.field2831 = new int[16];
		this.field2832 = new int[16];
		this.field2833 = new int[16];
		this.field2834 = new int[16];
		this.field2830 = new int[16];
		this.field2837 = new int[16];
		this.field2838 = new int[16];
		this.field2839 = new int[16];
		this.field2840 = new int[16];
		this.field2841 = new int[16];
		this.field2842 = new MusicPatchNode[16][128];
		this.field2843 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4493();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1040712049"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2826 = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "752900349"
	)
	public int method4474() {
		return this.field2826;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lil;Ljy;Lan;II)Z",
		garbageValue = "-2103809971"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4672();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = Varcs.method2062(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4635(var3, var7.byteArray, var6)) {
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
		descriptor = "(I)V",
		garbageValue = "673008127"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("f")
	protected synchronized int vmethod4662() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2824 / GrandExchangeOfferAgeComparator.field3633;

			do {
				long var5 = (long)var4 * (long)var3 + this.field2848;
				if (this.field2850 - var5 >= 0L) {
					this.field2848 = var5;
					break;
				}

				int var7 = (int)((this.field2850 - this.field2848 + (long)var4 - 1L) / (long)var4);
				this.field2848 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4506();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lil;ZI)V",
		garbageValue = "1079678406"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2845 = var2;
		this.field2848 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2850 = this.midiFile.method4590(this.trackLength);
	}

	@ObfuscatedName("r")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2824 / GrandExchangeOfferAgeComparator.field3633;

			do {
				long var3 = this.field2848 + (long)var2 * (long)var1;
				if (this.field2850 - var3 >= 0L) {
					this.field2848 = var3;
					break;
				}

				int var5 = (int)((this.field2850 - this.field2848 + (long)var2 - 1L) / (long)var2);
				this.field2848 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4506();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1981150962"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method4493();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-81"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-3598"
	)
	public synchronized void method4481(int var1, int var2) {
		this.method4482(var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "468747458"
	)
	void method4482(int var1, int var2) {
		this.field2823[var1] = var2;
		this.field2831[var1] = var2 & -128;
		this.method4514(var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "50"
	)
	void method4514(int var1, int var2) {
		if (var2 != this.field2829[var1]) {
			this.field2829[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2843[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1749278569"
	)
	void method4535(int var1, int var2, int var3) {
		this.method4486(var1, var2, 64);
		if ((this.field2830[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2902 == var1 && var4.field2896 < 0) {
					this.field2842[var1][var4.field2893] = null;
					this.field2842[var1][var2] = var4;
					int var8 = (var4.field2892 * var4.field2891 >> 12) + var4.field2882;
					var4.field2882 += var2 - var4.field2893 << 8;
					var4.field2891 = var8 - var4.field2882;
					var4.field2892 = 4096;
					var4.field2893 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2829[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2902 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2885 = var9.field2871[var2];
				var6.field2887 = var9.field2872[var2];
				var6.field2893 = var2;
				var6.field2888 = var3 * var3 * var9.field2873[var2] * var9.field2870 + 1024 >> 11;
				var6.field2889 = var9.field2867[var2] & 255;
				var6.field2882 = (var2 << 8) - (var9.field2868[var2] & 32767);
				var6.field2883 = 0;
				var6.field2899 = 0;
				var6.field2895 = 0;
				var6.field2896 = -1;
				var6.field2897 = 0;
				if (this.field2839[var1] == 0) {
					var6.stream = RawPcmStream.method554(var5, this.method4575(var6), this.method4499(var6), this.method4500(var6));
				} else {
					var6.stream = RawPcmStream.method554(var5, this.method4575(var6), 0, this.method4500(var6));
					this.method4472(var6, var9.field2868[var2] < 0);
				}

				if (var9.field2868[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2887 >= 0) {
					MusicPatchNode var7 = this.field2843[var1][var6.field2887];
					if (var7 != null && var7.field2896 < 0) {
						this.field2842[var1][var7.field2893] = null;
						var7.field2896 = 0;
					}

					this.field2843[var1][var6.field2887] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2842[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Liu;ZI)V",
		garbageValue = "-1769668358"
	)
	void method4472(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field167) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2839[var1.field2902] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method563();
			}
		} else {
			var4 = (int)((long)this.field2839[var1.field2902] * (long)var3 >> 6);
		}

		var1.stream.method562(var4);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "13"
	)
	void method4486(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2842[var1][var2];
		if (var4 != null) {
			this.field2842[var1][var2] = null;
			if ((this.field2830[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2902 == var5.field2902 && var5.field2896 < 0 && var5 != var4) {
						var4.field2896 = 0;
						break;
					}
				}
			} else {
				var4.field2896 = 0;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-87"
	)
	void method4487(int var1, int var2, int var3) {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1285167169"
	)
	void method4488(int var1, int var2) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1392681408"
	)
	void method4489(int var1, int var2) {
		this.field2832[var1] = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1024903922"
	)
	void method4490(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2902 == var1) {
				if (var2.stream != null) {
					var2.stream.method567(GrandExchangeOfferAgeComparator.field3633 / 100);
					if (var2.stream.method571()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4686();
				}

				if (var2.field2896 < 0) {
					this.field2842[var2.field2902][var2.field2893] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "672123891"
	)
	void method4491(int var1) {
		if (var1 >= 0) {
			this.field2851[var1] = 12800;
			this.field2825[var1] = 8192;
			this.field2828[var1] = 16383;
			this.field2832[var1] = 8192;
			this.field2833[var1] = 0;
			this.field2834[var1] = 8192;
			this.method4494(var1);
			this.method4565(var1);
			this.field2830[var1] = 0;
			this.field2837[var1] = 32767;
			this.field2838[var1] = 256;
			this.field2839[var1] = 0;
			this.method4497(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4491(var1);
			}

		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-619318857"
	)
	void method4502(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2902 == var1) && var2.field2896 < 0) {
				this.field2842[var2.field2902][var2.field2893] = null;
				var2.field2896 = 0;
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2021520651"
	)
	void method4493() {
		this.method4490(-1);
		this.method4491(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2829[var1] = this.field2823[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2831[var1] = this.field2823[var1] & -128;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "488596486"
	)
	void method4494(int var1) {
		if ((this.field2830[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2902 == var1 && this.field2842[var1][var2.field2893] == null && var2.field2896 < 0) {
					var2.field2896 = 0;
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1578740894"
	)
	void method4565(int var1) {
		if ((this.field2830[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2902 == var1) {
					var2.field2898 = 0;
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	void method4496(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4486(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4535(var3, var4, var5);
			} else {
				this.method4486(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4487(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2831[var3] = (var5 << 14) + (this.field2831[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2831[var3] = (var5 << 7) + (this.field2831[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2833[var3] = (var5 << 7) + (this.field2833[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2833[var3] = var5 + (this.field2833[var3] & -128);
			}

			if (var4 == 5) {
				this.field2834[var3] = (var5 << 7) + (this.field2834[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2834[var3] = var5 + (this.field2834[var3] & -128);
			}

			if (var4 == 7) {
				this.field2851[var3] = (var5 << 7) + (this.field2851[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2851[var3] = var5 + (this.field2851[var3] & -128);
			}

			if (var4 == 10) {
				this.field2825[var3] = (var5 << 7) + (this.field2825[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2825[var3] = var5 + (this.field2825[var3] & -128);
			}

			if (var4 == 11) {
				this.field2828[var3] = (var5 << 7) + (this.field2828[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2828[var3] = var5 + (this.field2828[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2830;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2830;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2830;
					var10000[var3] |= 2;
				} else {
					this.method4494(var3);
					var10000 = this.field2830;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2837[var3] = (var5 << 7) + (this.field2837[var3] & 127);
			}

			if (var4 == 98) {
				this.field2837[var3] = (this.field2837[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2837[var3] = (var5 << 7) + (this.field2837[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2837[var3] = (this.field2837[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4490(var3);
			}

			if (var4 == 121) {
				this.method4491(var3);
			}

			if (var4 == 123) {
				this.method4502(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2837[var3];
				if (var6 == 16384) {
					this.field2838[var3] = (var5 << 7) + (this.field2838[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2837[var3];
				if (var6 == 16384) {
					this.field2838[var3] = var5 + (this.field2838[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2839[var3] = (var5 << 7) + (this.field2839[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2839[var3] = var5 + (this.field2839[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2830;
					var10000[var3] |= 4;
				} else {
					this.method4565(var3);
					var10000 = this.field2830;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4497(var3, (var5 << 7) + (this.field2840[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4497(var3, var5 + (this.field2840[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4514(var3, var4 + this.field2831[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4488(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4489(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4493();
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "512532396"
	)
	void method4497(int var1, int var2) {
		this.field2840[var1] = var2;
		this.field2841[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I",
		garbageValue = "-1916551350"
	)
	int method4575(MusicPatchNode var1) {
		int var2 = (var1.field2892 * var1.field2891 >> 12) + var1.field2882;
		var2 += (this.field2832[var1.field2902] - 8192) * this.field2838[var1.field2902] >> 12;
		MusicPatchNode2 var3 = var1.field2885;
		int var4;
		if (var3.field2810 > 0 && (var3.field2804 > 0 || this.field2833[var1.field2902] > 0)) {
			var4 = var3.field2804 << 2;
			int var5 = var3.field2812 << 1;
			if (var1.field2886 < var5) {
				var4 = var4 * var1.field2886 / var5;
			}

			var4 += this.field2833[var1.field2902] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2894 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)GrandExchangeOfferAgeComparator.field3633 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I",
		garbageValue = "-2062962562"
	)
	int method4499(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2885;
		int var3 = this.field2851[var1.field2902] * this.field2828[var1.field2902] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2888 + 16384 >> 15;
		var3 = var3 * this.field2826 + 128 >> 8;
		if (var2.field2806 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2883 * (double)var2.field2806) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2808 != null) {
			var4 = var1.field2899;
			var5 = var2.field2808[var1.field2895 + 1];
			if (var1.field2895 < var2.field2808.length - 2) {
				var6 = (var2.field2808[var1.field2895] & 255) << 8;
				var7 = (var2.field2808[var1.field2895 + 2] & 255) << 8;
				var5 += (var2.field2808[var1.field2895 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2896 > 0 && var2.field2811 != null) {
			var4 = var1.field2896;
			var5 = var2.field2811[var1.field2897 + 1];
			if (var1.field2897 < var2.field2811.length - 2) {
				var6 = (var2.field2811[var1.field2897] & 255) << 8;
				var7 = (var2.field2811[var1.field2897 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2811[var1.field2897 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I",
		garbageValue = "2093922412"
	)
	int method4500(MusicPatchNode var1) {
		int var2 = this.field2825[var1.field2902];
		return var2 < 8192 ? var2 * var1.field2889 + 32 >> 6 : 16384 - ((128 - var1.field2889) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	void method4506() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2850; var2 == this.trackLength; var3 = this.midiFile.method4590(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2845 || var2 == 0) {
							this.method4493();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4496(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2850 = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Liu;S)Z",
		garbageValue = "4885"
	)
	boolean method4507(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2896 >= 0) {
				var1.remove();
				if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
					this.field2843[var1.field2902][var1.field2887] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Liu;[IIII)Z",
		garbageValue = "-947292548"
	)
	boolean method4508(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2901 = GrandExchangeOfferAgeComparator.field3633 / 100;
		if (var1.field2896 < 0 || var1.stream != null && !var1.stream.method623()) {
			int var5 = var1.field2892;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2834[var1.field2902]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2892 = var5;
			}

			var1.stream.method568(this.method4575(var1));
			MusicPatchNode2 var6 = var1.field2885;
			boolean var7 = false;
			++var1.field2886;
			var1.field2894 += var6.field2810;
			double var8 = (double)((var1.field2893 - 60 << 8) + (var1.field2891 * var1.field2892 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2806 > 0) {
				if (var6.field2809 > 0) {
					var1.field2883 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2809 * var8) + 0.5D);
				} else {
					var1.field2883 += 128;
				}
			}

			if (var6.field2808 != null) {
				if (var6.field2807 > 0) {
					var1.field2899 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2807 * var8) + 0.5D);
				} else {
					var1.field2899 += 128;
				}

				while (var1.field2895 < var6.field2808.length - 2 && var1.field2899 > (var6.field2808[var1.field2895 + 2] & 255) << 8) {
					var1.field2895 += 2;
				}

				if (var6.field2808.length - 2 == var1.field2895 && var6.field2808[var1.field2895 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2896 >= 0 && var6.field2811 != null && (this.field2830[var1.field2902] & 1) == 0 && (var1.field2887 < 0 || var1 != this.field2843[var1.field2902][var1.field2887])) {
				if (var6.field2805 > 0) {
					var1.field2896 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2805 * var8) + 0.5D);
				} else {
					var1.field2896 += 128;
				}

				while (var1.field2897 < var6.field2811.length - 2 && var1.field2896 > (var6.field2811[var1.field2897 + 2] & 255) << 8) {
					var1.field2897 += 2;
				}

				if (var6.field2811.length - 2 == var1.field2897) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method567(var1.field2901);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method571()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4686();
				if (var1.field2896 >= 0) {
					var1.remove();
					if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
						this.field2843[var1.field2902][var1.field2887] = null;
					}
				}

				return true;
			} else {
				var1.stream.method566(var1.field2901, this.method4499(var1), this.method4500(var1));
				return false;
			}
		} else {
			var1.method4686();
			var1.remove();
			if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
				this.field2843[var1.field2902][var1.field2887] = null;
			}

			return true;
		}
	}
}
