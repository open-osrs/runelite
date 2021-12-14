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
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljq;[IIIII)V",
		garbageValue = "-1616122568"
	)
	void method5262(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3081[var1.field3149] & 4) != 0 && var1.field3142 < 0) {
			int var6 = this.superStream.field3086[var1.field3149] / class339.field4058;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3135) / var6;
				if (var7 > var4) {
					var1.field3135 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3135 += var7 * var6 - 1048576;
				int var8 = class339.field4058 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3084[var1.field3149] == 0) {
					var1.stream = RawPcmStream.method943(var1.rawSound, var10.method855(), var10.method862(), var10.method847());
				} else {
					var1.stream = RawPcmStream.method943(var1.rawSound, var10.method855(), 0, var10.method847());
					this.superStream.method5083(var1, var1.patch.field3113[var1.field3133] < 0);
					var1.stream.method851(var8, var10.method862());
				}

				if (var1.patch.field3113[var1.field3133] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method954(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method857()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljq;II)V",
		garbageValue = "2103540030"
	)
	void method5263(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3081[var1.field3149] & 4) != 0 && var1.field3142 < 0) {
			int var3 = this.superStream.field3086[var1.field3149] / class339.field4058;
			int var4 = (var3 + 1048575 - var1.field3135) / var3;
			var1.field3135 = var3 * var2 + var1.field3135 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3084[var1.field3149] == 0) {
					var1.stream = RawPcmStream.method943(var1.rawSound, var1.stream.method855(), var1.stream.method862(), var1.stream.method847());
				} else {
					var1.stream = RawPcmStream.method943(var1.rawSound, var1.stream.method855(), 0, var1.stream.method847());
					this.superStream.method5083(var1, var1.patch.field3113[var1.field3133] < 0);
				}

				if (var1.patch.field3113[var1.field3133] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3135 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
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

	@ObfuscatedName("w")
	protected int vmethod5260() {
		return 0;
	}

	@ObfuscatedName("n")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
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
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5105(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3134) {
						this.method5263(var3, var2);
						var3.field3134 -= var2;
						break;
					}

					this.method5263(var3, var3.field3134);
					var2 -= var3.field3134;
				} while(!this.superStream.method5106(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1843091022"
	)
	public static void method5272(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(Huffman.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}
}
