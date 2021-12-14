import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1972992415
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1989200593
	)
	int field3069;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1925725407
	)
	int field3075;
	@ObfuscatedName("m")
	int[] field3071;
	@ObfuscatedName("t")
	int[] field3089;
	@ObfuscatedName("s")
	int[] field3076;
	@ObfuscatedName("j")
	int[] field3092;
	@ObfuscatedName("n")
	int[] field3095;
	@ObfuscatedName("r")
	int[] field3096;
	@ObfuscatedName("o")
	int[] field3077;
	@ObfuscatedName("v")
	int[] field3078;
	@ObfuscatedName("d")
	int[] field3079;
	@ObfuscatedName("f")
	int[] field3081;
	@ObfuscatedName("l")
	int[] field3082;
	@ObfuscatedName("q")
	int[] field3091;
	@ObfuscatedName("x")
	int[] field3084;
	@ObfuscatedName("z")
	int[] field3085;
	@ObfuscatedName("i")
	int[] field3086;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[[Ljq;"
	)
	MusicPatchNode[][] field3087;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Ljq;"
	)
	MusicPatchNode[][] field3088;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ab")
	boolean field3072;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -18186103
	)
	@Export("track")
	int track;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1268165937
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 6776460792524866117L
	)
	long field3093;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 7641976143722110143L
	)
	long field3094;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3069 = 256;
		this.field3075 = 1000000;
		this.field3071 = new int[16];
		this.field3089 = new int[16];
		this.field3076 = new int[16];
		this.field3092 = new int[16];
		this.field3095 = new int[16];
		this.field3096 = new int[16];
		this.field3077 = new int[16];
		this.field3078 = new int[16];
		this.field3079 = new int[16];
		this.field3081 = new int[16];
		this.field3082 = new int[16];
		this.field3091 = new int[16];
		this.field3084 = new int[16];
		this.field3085 = new int[16];
		this.field3086 = new int[16];
		this.field3087 = new MusicPatchNode[16][128];
		this.field3088 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method5091();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-906124112"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3069 = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "600611451"
	)
	int method5073() {
		return this.field3069;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Lku;Laa;II)Z",
		garbageValue = "-256912575"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5280();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				byte[] var11 = var2.takeFileFlat(var8);
				MusicPatch var10;
				if (var11 == null) {
					var10 = null;
				} else {
					var10 = new MusicPatch(var11);
				}

				var9 = var10;
				if (var10 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var10, (long)var8);
			}

			if (!var9.method5253(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865600049"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1487279179"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected synchronized int vmethod5260() {
		return 0;
	}

	@ObfuscatedName("n")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3075 / class339.field4058;

			do {
				long var5 = this.field3093 + (long)var4 * (long)var3;
				if (this.field3094 - var5 >= 0L) {
					this.field3093 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3094 - this.field3093) - 1L) / (long)var4);
				this.field3093 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method5104();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljk;ZI)V",
		garbageValue = "328855214"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3072 = var2;
		this.field3093 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field3094 = this.midiFile.method5202(this.trackLength);
	}

	@ObfuscatedName("o")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3075 / class339.field4058;

			do {
				long var3 = this.field3093 + (long)var1 * (long)var2;
				if (this.field3094 - var3 >= 0L) {
					this.field3093 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3094 - this.field3093) - 1L) / (long)var2);
				this.field3093 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method5104();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5091();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "154735720"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1583384688"
	)
	public synchronized void method5079(int var1, int var2) {
		this.method5080(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	void method5080(int var1, int var2) {
		this.field3092[var1] = var2;
		this.field3096[var1] = var2 & -128;
		this.method5081(var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1761005899"
	)
	void method5081(int var1, int var2) {
		if (var2 != this.field3095[var1]) {
			this.field3095[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3088[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1972733350"
	)
	void method5163(int var1, int var2, int var3) {
		this.method5084(var1, var2, 64);
		if ((this.field3081[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3149 == var1 && var4.field3142 < 0) {
					this.field3087[var1][var4.field3133] = null;
					this.field3087[var1][var2] = var4;
					int var8 = (var4.field3137 * var4.field3138 >> 12) + var4.field3136;
					var4.field3136 += var2 - var4.field3133 << 8;
					var4.field3137 = var8 - var4.field3136;
					var4.field3138 = 4096;
					var4.field3133 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3095[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field3149 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field3131 = var9.field3117[var2];
				var6.field3128 = var9.field3119[var2];
				var6.field3133 = var2;
				var6.field3132 = var3 * var3 * var9.field3111[var2] * var9.field3114 + 1024 >> 11;
				var6.field3147 = var9.field3115[var2] & 255;
				var6.field3136 = (var2 << 8) - (var9.field3113[var2] & 32767);
				var6.field3139 = 0;
				var6.field3140 = 0;
				var6.field3141 = 0;
				var6.field3142 = -1;
				var6.field3143 = 0;
				if (this.field3084[var1] == 0) {
					var6.stream = RawPcmStream.method943(var5, this.method5170(var6), this.method5097(var6), this.method5098(var6));
				} else {
					var6.stream = RawPcmStream.method943(var5, this.method5170(var6), 0, this.method5098(var6));
					this.method5083(var6, var9.field3113[var2] < 0);
				}

				if (var9.field3113[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3128 >= 0) {
					MusicPatchNode var7 = this.field3088[var1][var6.field3128];
					if (var7 != null && var7.field3142 < 0) {
						this.field3087[var1][var7.field3133] = null;
						var7.field3142 = 0;
					}

					this.field3088[var1][var6.field3128] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field3087[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljq;ZI)V",
		garbageValue = "1432160102"
	)
	void method5083(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field265) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3084[var1.field3149] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method925();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3084[var1.field3149] >> 6);
		}

		var1.stream.method848(var4);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "97"
	)
	void method5084(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3087[var1][var2];
		if (var4 != null) {
			this.field3087[var1][var2] = null;
			if ((this.field3081[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3149 == var4.field3149 && var5.field3142 < 0 && var5 != var4) {
						var4.field3142 = 0;
						break;
					}
				}
			} else {
				var4.field3142 = 0;
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1104599593"
	)
	void method5085(int var1, int var2, int var3) {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-875274554"
	)
	void method5086(int var1, int var2) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method5087(int var1, int var2) {
		this.field3077[var1] = var2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1499512267"
	)
	void method5088(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3149 == var1) {
				if (var2.stream != null) {
					var2.stream.method954(class339.field4058 / 100);
					if (var2.stream.method857()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5292();
				}

				if (var2.field3142 < 0) {
					this.field3087[var2.field3149][var2.field3133] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "171384389"
	)
	void method5089(int var1) {
		if (var1 >= 0) {
			this.field3071[var1] = 12800;
			this.field3089[var1] = 8192;
			this.field3076[var1] = 16383;
			this.field3077[var1] = 8192;
			this.field3078[var1] = 0;
			this.field3079[var1] = 8192;
			this.method5092(var1);
			this.method5093(var1);
			this.field3081[var1] = 0;
			this.field3082[var1] = 32767;
			this.field3091[var1] = 256;
			this.field3084[var1] = 0;
			this.method5095(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method5089(var1);
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "38"
	)
	void method5129(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3149 == var1) && var2.field3142 < 0) {
				this.field3087[var2.field3149][var2.field3133] = null;
				var2.field3142 = 0;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	void method5091() {
		this.method5088(-1);
		this.method5089(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3095[var1] = this.field3092[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3096[var1] = this.field3092[var1] & -128;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-21"
	)
	void method5092(int var1) {
		if ((this.field3081[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3149 == var1 && this.field3087[var1][var2.field3133] == null && var2.field3142 < 0) {
					var2.field3142 = 0;
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "16256"
	)
	void method5093(int var1) {
		if ((this.field3081[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3149 == var1) {
					var2.field3135 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2130755368"
	)
	void method5094(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5084(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method5163(var3, var4, var5);
			} else {
				this.method5084(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method5085(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3096[var3] = (var5 << 14) + (this.field3096[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3096[var3] = (var5 << 7) + (this.field3096[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3078[var3] = (var5 << 7) + (this.field3078[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3078[var3] = var5 + (this.field3078[var3] & -128);
			}

			if (var4 == 5) {
				this.field3079[var3] = (var5 << 7) + (this.field3079[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3079[var3] = var5 + (this.field3079[var3] & -128);
			}

			if (var4 == 7) {
				this.field3071[var3] = (var5 << 7) + (this.field3071[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3071[var3] = var5 + (this.field3071[var3] & -128);
			}

			if (var4 == 10) {
				this.field3089[var3] = (var5 << 7) + (this.field3089[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3089[var3] = var5 + (this.field3089[var3] & -128);
			}

			if (var4 == 11) {
				this.field3076[var3] = (var5 << 7) + (this.field3076[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3076[var3] = var5 + (this.field3076[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3081;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3081;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3081;
					var10000[var3] |= 2;
				} else {
					this.method5092(var3);
					var10000 = this.field3081;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3082[var3] = (var5 << 7) + (this.field3082[var3] & 127);
			}

			if (var4 == 98) {
				this.field3082[var3] = (this.field3082[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3082[var3] = (var5 << 7) + (this.field3082[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3082[var3] = (this.field3082[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method5088(var3);
			}

			if (var4 == 121) {
				this.method5089(var3);
			}

			if (var4 == 123) {
				this.method5129(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3082[var3];
				if (var6 == 16384) {
					this.field3091[var3] = (var5 << 7) + (this.field3091[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3082[var3];
				if (var6 == 16384) {
					this.field3091[var3] = var5 + (this.field3091[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3084[var3] = (var5 << 7) + (this.field3084[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3084[var3] = var5 + (this.field3084[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3081;
					var10000[var3] |= 4;
				} else {
					this.method5093(var3);
					var10000 = this.field3081;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5095(var3, (var5 << 7) + (this.field3085[var3] & -16257));
			}

			if (var4 == 49) {
				this.method5095(var3, var5 + (this.field3085[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5081(var3, var4 + this.field3096[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method5086(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method5087(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method5091();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	void method5095(int var1, int var2) {
		this.field3085[var1] = var2;
		this.field3086[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljq;B)I",
		garbageValue = "-119"
	)
	int method5170(MusicPatchNode var1) {
		int var2 = (var1.field3138 * var1.field3137 >> 12) + var1.field3136;
		var2 += (this.field3077[var1.field3149] - 8192) * this.field3091[var1.field3149] >> 12;
		MusicPatchNode2 var3 = var1.field3131;
		int var4;
		if (var3.field3059 > 0 && (var3.field3058 > 0 || this.field3078[var1.field3149] > 0)) {
			var4 = var3.field3058 << 2;
			int var5 = var3.field3060 << 1;
			if (var1.field3144 < var5) {
				var4 = var4 * var1.field3144 / var5;
			}

			var4 += this.field3078[var1.field3149] >> 7;
			double var6 = Math.sin((double)(var1.field3145 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class339.field4058 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)I",
		garbageValue = "1173638767"
	)
	int method5097(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3131;
		int var3 = this.field3071[var1.field3149] * this.field3076[var1.field3149] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3132 + 16384 >> 15;
		var3 = var3 * this.field3069 + 128 >> 8;
		if (var2.field3052 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3052 * 1.953125E-5D * (double)var1.field3139) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3056 != null) {
			var4 = var1.field3140;
			var5 = var2.field3056[var1.field3141 + 1];
			if (var1.field3141 < var2.field3056.length - 2) {
				var6 = (var2.field3056[var1.field3141] & 255) << 8;
				var7 = (var2.field3056[var1.field3141 + 2] & 255) << 8;
				var5 += (var2.field3056[var1.field3141 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3142 > 0 && var2.field3054 != null) {
			var4 = var1.field3142;
			var5 = var2.field3054[var1.field3143 + 1];
			if (var1.field3143 < var2.field3054.length - 2) {
				var6 = (var2.field3054[var1.field3143] & 255) << 8;
				var7 = (var2.field3054[var1.field3143 + 2] & 255) << 8;
				var5 += (var2.field3054[var1.field3143 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)I",
		garbageValue = "1815861721"
	)
	int method5098(MusicPatchNode var1) {
		int var2 = this.field3089[var1.field3149];
		return var2 < 8192 ? var2 * var1.field3147 + 32 >> 6 : 16384 - ((128 - var1.field3147) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	void method5104() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3094; var2 == this.trackLength; var3 = this.midiFile.method5202(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3072 || var2 == 0) {
							this.method5091();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method5094(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3094 = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljq;I)Z",
		garbageValue = "-1286504674"
	)
	boolean method5105(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3142 >= 0) {
				var1.remove();
				if (var1.field3128 > 0 && var1 == this.field3088[var1.field3149][var1.field3128]) {
					this.field3088[var1.field3149][var1.field3128] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljq;[IIIB)Z",
		garbageValue = "-28"
	)
	boolean method5106(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3134 = class339.field4058 / 100;
		if (var1.field3142 < 0 || var1.stream != null && !var1.stream.method854()) {
			int var5 = var1.field3138;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3079[var1.field3149] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3138 = var5;
			}

			var1.stream.method963(this.method5170(var1));
			MusicPatchNode2 var6 = var1.field3131;
			boolean var7 = false;
			++var1.field3144;
			var1.field3145 += var6.field3059;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3133 - 60 << 8) + (var1.field3137 * var1.field3138 >> 12));
			if (var6.field3052 > 0) {
				if (var6.field3057 > 0) {
					var1.field3139 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3057) + 0.5D);
				} else {
					var1.field3139 += 128;
				}
			}

			if (var6.field3056 != null) {
				if (var6.field3055 > 0) {
					var1.field3140 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3055) + 0.5D);
				} else {
					var1.field3140 += 128;
				}

				while (var1.field3141 < var6.field3056.length - 2 && var1.field3140 > (var6.field3056[var1.field3141 + 2] & 255) << 8) {
					var1.field3141 += 2;
				}

				if (var6.field3056.length - 2 == var1.field3141 && var6.field3056[var1.field3141 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3142 >= 0 && var6.field3054 != null && (this.field3081[var1.field3149] & 1) == 0 && (var1.field3128 < 0 || var1 != this.field3088[var1.field3149][var1.field3128])) {
				if (var6.field3053 > 0) {
					var1.field3142 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3053) + 0.5D);
				} else {
					var1.field3142 += 128;
				}

				while (var1.field3143 < var6.field3054.length - 2 && var1.field3142 > (var6.field3054[var1.field3143 + 2] & 255) << 8) {
					var1.field3143 += 2;
				}

				if (var6.field3054.length - 2 == var1.field3143) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method954(var1.field3134);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method857()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5292();
				if (var1.field3142 >= 0) {
					var1.remove();
					if (var1.field3128 > 0 && var1 == this.field3088[var1.field3149][var1.field3128]) {
						this.field3088[var1.field3149][var1.field3128] = null;
					}
				}

				return true;
			} else {
				var1.stream.method932(var1.field3134, this.method5097(var1), this.method5098(var1));
				return false;
			}
		} else {
			var1.method5292();
			var1.remove();
			if (var1.field3128 > 0 && var1 == this.field3088[var1.field3149][var1.field3128]) {
				this.field3088[var1.field3149][var1.field3128] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-941170538"
	)
	static float method5196(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}
}
