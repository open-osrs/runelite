import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Ljw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lji;[IIIII)V",
		garbageValue = "-2062540713"
	)
	void method5281(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3247[var1.field3308] & 4) != 0 && var1.field3316 < 0) { // L: 73
			int var6 = this.superStream.field3259[var1.field3308] / PcmPlayer.field300; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3322) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3322 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3322 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field300 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3257[var1.field3308] == 0) { // L: 86
					var1.stream = RawPcmStream.method829(var1.rawSound, var10.method884(), var10.method805(), var10.method806()); // L: 87
				} else {
					var1.stream = RawPcmStream.method829(var1.rawSound, var10.method884(), 0, var10.method806()); // L: 90
					this.superStream.method5091(var1, var1.patch.field3287[var1.field3307] < 0); // L: 91
					var1.stream.method810(var8, var10.method805()); // L: 92
				}

				if (var1.patch.field3287[var1.field3307] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method812(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method935()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lji;II)V",
		garbageValue = "-1512136486"
	)
	void method5297(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3247[var1.field3308] & 4) != 0 && var1.field3316 < 0) { // L: 105
			int var3 = this.superStream.field3259[var1.field3308] / PcmPlayer.field300; // L: 106
			int var4 = (var3 + 1048575 - var1.field3322) / var3; // L: 107
			var1.field3322 = var3 * var2 + var1.field3322 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3257[var1.field3308] == 0) { // L: 110
					var1.stream = RawPcmStream.method829(var1.rawSound, var1.stream.method884(), var1.stream.method805(), var1.stream.method806()); // L: 111
				} else {
					var1.stream = RawPcmStream.method829(var1.rawSound, var1.stream.method884(), 0, var1.stream.method806()); // L: 114
					this.superStream.method5091(var1, var1.patch.field3287[var1.field3307] < 0); // L: 115
				}

				if (var1.patch.field3287[var1.field3307] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3322 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
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

	@ObfuscatedName("s")
	protected int vmethod5295() {
		return 0; // L: 34
	}

	@ObfuscatedName("r")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5113(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3321) { // L: 45
						this.method5281(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3321 -= var5; // L: 52
						break;
					}

					this.method5281(var6, var1, var4, var6.field3321, var5 + var4); // L: 46
					var4 += var6.field3321; // L: 47
					var5 -= var6.field3321; // L: 48
				} while(!this.superStream.method5114(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("y")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5113(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3321) { // L: 62
						this.method5297(var3, var2); // L: 67
						var3.field3321 -= var2; // L: 68
						break;
					}

					this.method5297(var3, var3.field3321); // L: 63
					var2 -= var3.field3321; // L: 64
				} while(!this.superStream.method5114(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lki;II)V",
		garbageValue = "1623622888"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11746
			Widget var3 = var0[var2]; // L: 11747
			if (var3 != null) { // L: 11748
				if (var3.type == 0) { // L: 11749
					if (var3.children != null) { // L: 11750
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11751
					if (var4 != null) { // L: 11752
						WorldMapLabelSize.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11754
					var5 = new ScriptEvent(); // L: 11755
					var5.widget = var3; // L: 11756
					var5.args = var3.onDialogAbort; // L: 11757
					class144.runScriptEvent(var5); // L: 11758
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11760
					if (var3.childIndex >= 0) { // L: 11761
						Widget var6 = class92.getWidget(var3.id); // L: 11762
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11763
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11767
					var5.widget = var3; // L: 11768
					var5.args = var3.onSubChange; // L: 11769
					class144.runScriptEvent(var5); // L: 11770
				}
			}
		}

	} // L: 11773
}
