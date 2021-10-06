import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIIII)V",
		garbageValue = "-1501079312"
	)
	void method4890(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2948[var1.field2980] & 4) != 0 && var1.field2978 < 0) {
			int var6 = this.superStream.field2939[var1.field2980] / PcmPlayer.field279;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2998) / var6;
				if (var7 > var4) {
					var1.field2998 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2998 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field279 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2937[var1.field2980] == 0) {
					var1.stream = RawPcmStream.method794(var1.rawSound, var10.method797(), var10.method852(), var10.method801());
				} else {
					var1.stream = RawPcmStream.method794(var1.rawSound, var10.method797(), 0, var10.method801());
					this.superStream.method4802(var1, var1.patch.field2965[var1.field2988] < 0);
					var1.stream.method805(var8, var10.method852());
				}

				if (var1.patch.field2965[var1.field2988] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method807(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method920()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lib;IB)V",
		garbageValue = "32"
	)
	void method4891(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2948[var1.field2980] & 4) != 0 && var1.field2978 < 0) {
			int var3 = this.superStream.field2939[var1.field2980] / PcmPlayer.field279;
			int var4 = (var3 + 1048575 - var1.field2998) / var3;
			var1.field2998 = var3 * var2 + var1.field2998 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2937[var1.field2980] == 0) {
					var1.stream = RawPcmStream.method794(var1.rawSound, var1.stream.method797(), var1.stream.method852(), var1.stream.method801());
				} else {
					var1.stream = RawPcmStream.method794(var1.rawSound, var1.stream.method797(), 0, var1.stream.method801());
					this.superStream.method4802(var1, var1.patch.field2965[var1.field2988] < 0);
				}

				if (var1.patch.field2965[var1.field2988] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2998 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("a")
	protected int vmethod4889() {
		return 0;
	}

	@ObfuscatedName("e")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4797(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2997) {
						this.method4890(var6, var1, var4, var5, var4 + var5);
						var6.field2997 -= var5;
						break;
					}

					this.method4890(var6, var1, var4, var6.field2997, var5 + var4);
					var4 += var6.field2997;
					var5 -= var6.field2997;
				} while(!this.superStream.method4739(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("y")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4797(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2997) {
						this.method4891(var3, var2);
						var3.field2997 -= var2;
						break;
					}

					this.method4891(var3, var3.field2997);
					var2 -= var3.field2997;
				} while(!this.superStream.method4739(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkn;S)I",
		garbageValue = "7731"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = class17.method244(var9);
			var8 = class17.method244(var10);
			var9 = TileItem.standardizeChar(var9, var2);
			var10 = TileItem.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return UserComparator4.lowercaseChar(var9, var2) - UserComparator4.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return UserComparator4.lowercaseChar(var11, var2) - UserComparator4.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return UserComparator4.lowercaseChar(var12, var2) - UserComparator4.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}
}
