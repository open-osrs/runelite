import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Ljb;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljm;[IIIII)V",
		garbageValue = "-1585342605"
	)
	void method5244(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3124[var1.field3181] & 4) != 0 && var1.field3186 < 0) { // L: 73
			int var6 = this.superStream.field3129[var1.field3181] / PcmPlayer.field305; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3191) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3191 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3191 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field305 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3126[var1.field3181] == 0) { // L: 86
					var1.stream = RawPcmStream.method873(var1.rawSound, var10.method825(), var10.method954(), var10.method817()); // L: 87
				} else {
					var1.stream = RawPcmStream.method873(var1.rawSound, var10.method825(), 0, var10.method817()); // L: 90
					this.superStream.method5164(var1, var1.patch.field3157[var1.field3189] < 0); // L: 91
					var1.stream.method821(var8, var10.method954()); // L: 92
				}

				if (var1.patch.field3157[var1.field3189] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method822(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method827()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)V",
		garbageValue = "-1845108086"
	)
	void method5245(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3124[var1.field3181] & 4) != 0 && var1.field3186 < 0) { // L: 105
			int var3 = this.superStream.field3129[var1.field3181] / PcmPlayer.field305; // L: 106
			int var4 = (var3 + 1048575 - var1.field3191) / var3; // L: 107
			var1.field3191 = var3 * var2 + var1.field3191 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3126[var1.field3181] == 0) { // L: 110
					var1.stream = RawPcmStream.method873(var1.rawSound, var1.stream.method825(), var1.stream.method954(), var1.stream.method817()); // L: 111
				} else {
					var1.stream = RawPcmStream.method873(var1.rawSound, var1.stream.method825(), 0, var1.stream.method817()); // L: 114
					this.superStream.method5164(var1, var1.patch.field3157[var1.field3189] < 0); // L: 115
				}

				if (var1.patch.field3157[var1.field3189] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3191 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
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

	@ObfuscatedName("w")
	protected int vmethod5241() {
		return 0; // L: 34
	}

	@ObfuscatedName("v")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5067(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3190) { // L: 45
						this.method5244(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3190 -= var5; // L: 52
						break;
					}

					this.method5244(var6, var1, var4, var6.field3190, var5 + var4); // L: 46
					var4 += var6.field3190; // L: 47
					var5 -= var6.field3190; // L: 48
				} while(!this.superStream.method5068(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("y")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5067(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3190) { // L: 62
						this.method5245(var3, var2); // L: 67
						var3.field3190 -= var2; // L: 68
						break;
					}

					this.method5245(var3, var3.field3190); // L: 63
					var2 -= var3.field3190; // L: 64
				} while(!this.superStream.method5068(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70
}
