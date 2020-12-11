import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 468748381
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhn;[IIIII)V",
		garbageValue = "882339994"
	)
	void method3930(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2454[var1.field2477] & 4) != 0 && var1.field2470 < 0) { // L: 73
			int var6 = this.superStream.field2442[var1.field2477] / PcmPlayer.field1443; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2456) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field2456 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field2456 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field1443 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field2430[var1.field2477] == 0) { // L: 86
					var1.stream = RawPcmStream.method2630(var1.rawSound, var10.method2622(), var10.method2613(), var10.method2614()); // L: 87
				} else {
					var1.stream = RawPcmStream.method2630(var1.rawSound, var10.method2622(), 0, var10.method2614()); // L: 90
					this.superStream.method3763(var1, var1.patch.field2494[var1.field2461] < 0); // L: 91
					var1.stream.method2707(var8, var10.method2613()); // L: 92
				}

				if (var1.patch.field2494[var1.field2461] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method2620(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method2624()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhn;II)V",
		garbageValue = "1389060283"
	)
	void method3931(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2454[var1.field2477] & 4) != 0 && var1.field2470 < 0) { // L: 105
			int var3 = this.superStream.field2442[var1.field2477] / PcmPlayer.field1443; // L: 106
			int var4 = (var3 + 1048575 - var1.field2456) / var3; // L: 107
			var1.field2456 = var3 * var2 + var1.field2456 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field2430[var1.field2477] == 0) { // L: 110
					var1.stream = RawPcmStream.method2630(var1.rawSound, var1.stream.method2622(), var1.stream.method2613(), var1.stream.method2614()); // L: 111
				} else {
					var1.stream = RawPcmStream.method2630(var1.rawSound, var1.stream.method2622(), 0, var1.stream.method2614()); // L: 114
					this.superStream.method3763(var1, var1.patch.field2494[var1.field2461] < 0); // L: 115
				}

				if (var1.patch.field2494[var1.field2461] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2456 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) { // L: 20
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Ldi;"
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

	@ObfuscatedName("p")
	protected int vmethod3927() {
		return 0; // L: 34
	}

	@ObfuscatedName("l")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method3851(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field2475) { // L: 45
						this.method3930(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field2475 -= var5; // L: 52
						break;
					}

					this.method3930(var6, var1, var4, var6.field2475, var4 + var5); // L: 46
					var4 += var6.field2475; // L: 47
					var5 -= var6.field2475; // L: 48
				} while(!this.superStream.method3786(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("u")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method3851(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field2475) { // L: 62
						this.method3931(var3, var2); // L: 67
						var3.field2475 -= var2; // L: 68
						break;
					}

					this.method3931(var3, var3.field2475); // L: 63
					var2 -= var3.field2475; // L: 64
				} while(!this.superStream.method3786(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-2"
	)
	public static int method3954(int var0, int var1) {
		return (var0 + 40000 << 8) + var1; // L: 13
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "10083789"
	)
	public static void method3953() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 82
	} // L: 83
}
