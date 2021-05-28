import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ag")
	static String field2885;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lhp;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Liq;[IIIIS)V",
		garbageValue = "25857"
	)
	void method4604(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2846[var1.field2905] & 4) != 0 && var1.field2895 < 0) { // L: 73
			int var6 = this.superStream.field2851[var1.field2905] / PcmPlayer.field428; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2904) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field2904 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field2904 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field428 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field2836[var1.field2905] == 0) { // L: 86
					var1.stream = RawPcmStream.method842(var1.rawSound, var10.method857(), var10.method914(), var10.method971()); // L: 87
				} else {
					var1.stream = RawPcmStream.method842(var1.rawSound, var10.method857(), 0, var10.method971()); // L: 90
					this.superStream.method4421(var1, var1.patch.field2878[var1.field2896] < 0); // L: 91
					var1.stream.method853(var8, var10.method914()); // L: 92
				}

				if (var1.patch.field2878[var1.field2896] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method855(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method859()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Liq;II)V",
		garbageValue = "1404066411"
	)
	void method4605(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2846[var1.field2905] & 4) != 0 && var1.field2895 < 0) { // L: 105
			int var3 = this.superStream.field2851[var1.field2905] / PcmPlayer.field428; // L: 106
			int var4 = (var3 + 1048575 - var1.field2904) / var3; // L: 107
			var1.field2904 = var3 * var2 + var1.field2904 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field2836[var1.field2905] == 0) { // L: 110
					var1.stream = RawPcmStream.method842(var1.rawSound, var1.stream.method857(), var1.stream.method914(), var1.stream.method971()); // L: 111
				} else {
					var1.stream = RawPcmStream.method842(var1.rawSound, var1.stream.method857(), 0, var1.stream.method971()); // L: 114
					this.superStream.method4421(var1, var1.patch.field2878[var1.field2896] < 0); // L: 115
				}

				if (var1.patch.field2878[var1.field2896] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2904 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("b")
	protected int vmethod4610() {
		return 0; // L: 34
	}

	@ObfuscatedName("d")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method4442(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field2891) { // L: 45
						this.method4604(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field2891 -= var5; // L: 52
						break;
					}

					this.method4604(var6, var1, var4, var6.field2891, var5 + var4); // L: 46
					var4 += var6.field2891; // L: 47
					var5 -= var6.field2891; // L: 48
				} while(!this.superStream.method4443(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("u")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method4442(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field2891) { // L: 62
						this.method4605(var3, var2); // L: 67
						var3.field2891 -= var2; // L: 68
						break;
					}

					this.method4605(var3, var3.field2891); // L: 63
					var2 -= var3.field2891; // L: 64
				} while(!this.superStream.method4443(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-53"
	)
	static char method4620(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}
}
