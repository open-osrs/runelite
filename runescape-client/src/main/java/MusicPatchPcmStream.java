import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Ljp;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljq;[IIIII)V",
		garbageValue = "-1616122568"
	)
	void method5262(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3081[var1.field3149] & 4) != 0 && var1.field3142 < 0) { // L: 73
			int var6 = this.superStream.field3086[var1.field3149] / class339.field4058; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3135) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3135 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3135 += var7 * var6 - 1048576; // L: 81
				int var8 = class339.field4058 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3084[var1.field3149] == 0) { // L: 86
					var1.stream = RawPcmStream.method943(var1.rawSound, var10.method855(), var10.method862(), var10.method847()); // L: 87
				} else {
					var1.stream = RawPcmStream.method943(var1.rawSound, var10.method855(), 0, var10.method847()); // L: 90
					this.superStream.method5083(var1, var1.patch.field3113[var1.field3133] < 0); // L: 91
					var1.stream.method851(var8, var10.method862()); // L: 92
				}

				if (var1.patch.field3113[var1.field3133] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method954(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method857()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljq;II)V",
		garbageValue = "2103540030"
	)
	void method5263(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3081[var1.field3149] & 4) != 0 && var1.field3142 < 0) { // L: 105
			int var3 = this.superStream.field3086[var1.field3149] / class339.field4058; // L: 106
			int var4 = (var3 + 1048575 - var1.field3135) / var3; // L: 107
			var1.field3135 = var3 * var2 + var1.field3135 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3084[var1.field3149] == 0) { // L: 110
					var1.stream = RawPcmStream.method943(var1.rawSound, var1.stream.method855(), var1.stream.method862(), var1.stream.method847()); // L: 111
				} else {
					var1.stream = RawPcmStream.method943(var1.rawSound, var1.stream.method855(), 0, var1.stream.method847()); // L: 114
					this.superStream.method5083(var1, var1.patch.field3113[var1.field3133] < 0); // L: 115
				}

				if (var1.patch.field3113[var1.field3133] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3135 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
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
	protected int vmethod5260() {
		return 0; // L: 34
	}

	@ObfuscatedName("n")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5105(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3134) {
						this.method5262(var6, var1, var4, var5, var4 + var5);
						var6.field3134 -= var5;
						break;
					}

					this.method5262(var6, var1, var4, var6.field3134, var5 + var4);
					var4 += var6.field3134;
					var5 -= var6.field3134;
				} while(!this.superStream.method5106(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("o")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5105(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3134) { // L: 62
						this.method5263(var3, var2); // L: 67
						var3.field3134 -= var2; // L: 68
						break;
					}

					this.method5263(var3, var3.field3134); // L: 63
					var2 -= var3.field3134; // L: 64
				} while(!this.superStream.method5106(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1843091022"
	)
	public static void method5272(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(Huffman.JagexCache_locationFile, "rw", 10000L); // L: 42
			Buffer var3 = new Buffer(500); // L: 43
			var3.writeByte(3); // L: 44
			var3.writeByte(var1 != null ? 1 : 0); // L: 45
			var3.writeCESU8(var0.getPath()); // L: 46
			if (var1 != null) {
				var3.writeCESU8(""); // L: 47
			}

			var2.write(var3.array, 0, var3.offset); // L: 48
			var2.close(); // L: 49
		} catch (IOException var4) { // L: 51
			var4.printStackTrace(); // L: 52
		}

	} // L: 54
}
