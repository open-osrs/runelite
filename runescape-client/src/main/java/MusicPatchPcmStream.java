import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("aw")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ldd;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		signature = "(Lgw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lhm;[IIIIB)V",
		garbageValue = "7"
	)
	void method4040(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2460[var1.field2479] & 4) != 0 && var1.field2490 < 0) {
			int var6 = this.superStream.field2454[var1.field2479] / class237.field3113;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2478) / var6;
				if (var7 > var4) {
					var1.field2478 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2478 += var7 * var6 - 1048576;
				int var8 = class237.field3113 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2463[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2674(var1.rawSound, var10.method2747(), var10.method2680(), var10.method2710());
				} else {
					var1.stream = RawPcmStream.method2674(var1.rawSound, var10.method2747(), 0, var10.method2710());
					this.superStream.method3852(var1, var1.patch.field2521[var1.field2481] < 0);
					var1.stream.method2685(var8, var10.method2680());
				}

				if (var1.patch.field2521[var1.field2481] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method2732(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method2691()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lhm;II)V",
		garbageValue = "948558076"
	)
	void method4041(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2460[var1.field2479] & 4) != 0 && var1.field2490 < 0) {
			int var3 = this.superStream.field2454[var1.field2479] / class237.field3113;
			int var4 = (var3 + 1048575 - var1.field2478) / var3;
			var1.field2478 = var3 * var2 + var1.field2478 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2463[var1.field2479] == 0) {
					var1.stream = RawPcmStream.method2674(var1.rawSound, var1.stream.method2747(), var1.stream.method2680(), var1.stream.method2710());
				} else {
					var1.stream = RawPcmStream.method2674(var1.rawSound, var1.stream.method2747(), 0, var1.stream.method2710());
					this.superStream.method3852(var1, var1.patch.field2521[var1.field2481] < 0);
				}

				if (var1.patch.field2521[var1.field2481] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2478 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "()Ldf;"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Ldf;"
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

	@ObfuscatedName("u")
	protected int vmethod4037() {
		return 0;
	}

	@ObfuscatedName("a")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3870(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2495) {
						this.method4040(var6, var1, var4, var5, var4 + var5);
						var6.field2495 -= var5;
						break;
					}

					this.method4040(var6, var1, var4, var6.field2495, var5 + var4);
					var4 += var6.field2495;
					var5 -= var6.field2495;
				} while(!this.superStream.method3897(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("w")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3870(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2495) {
						this.method4041(var3, var2);
						var3.field2495 -= var2;
						break;
					}

					this.method4041(var3, var3.field2495);
					var2 -= var3.field2495;
				} while(!this.superStream.method3897(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-836395445"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
