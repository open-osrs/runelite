import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lam;"
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
		descriptor = "(Ljm;[IIIIB)V",
		garbageValue = "110"
	)
	void method5439(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3210[var1.field3284] & 4) != 0 && var1.field3278 < 0) { // L: 73
			int var6 = this.superStream.field3207[var1.field3284] / PcmPlayer.field287; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3270) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3270 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3270 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field287 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3229[var1.field3284] == 0) { // L: 86
					var1.stream = RawPcmStream.method775(var1.rawSound, var10.method819(), var10.method918(), var10.method782()); // L: 87
				} else {
					var1.stream = RawPcmStream.method775(var1.rawSound, var10.method819(), 0, var10.method782()); // L: 90
					this.superStream.method5264(var1, var1.patch.field3250[var1.field3269] < 0); // L: 91
					var1.stream.method890(var8, var10.method918()); // L: 92
				}

				if (var1.patch.field3250[var1.field3269] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method802(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method792()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IB)V",
		garbageValue = "79"
	)
	void method5440(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3210[var1.field3284] & 4) != 0 && var1.field3278 < 0) { // L: 105
			int var3 = this.superStream.field3207[var1.field3284] / PcmPlayer.field287; // L: 106
			int var4 = (var3 + 1048575 - var1.field3270) / var3; // L: 107
			var1.field3270 = var3 * var2 + var1.field3270 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3229[var1.field3284] == 0) { // L: 110
					var1.stream = RawPcmStream.method775(var1.rawSound, var1.stream.method819(), var1.stream.method918(), var1.stream.method782()); // L: 111
				} else {
					var1.stream = RawPcmStream.method775(var1.rawSound, var1.stream.method819(), 0, var1.stream.method782()); // L: 114
					this.superStream.method5264(var1, var1.patch.field3250[var1.field3269] < 0); // L: 115
				}

				if (var1.patch.field3250[var1.field3269] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3270 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Laz;"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Laz;"
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
	protected int vmethod5437() {
		return 0; // L: 34
	}

	@ObfuscatedName("y")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5287(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3283) { // L: 45
						this.method5439(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3283 -= var5; // L: 52
						break;
					}

					this.method5439(var6, var1, var4, var6.field3283, var5 + var4); // L: 46
					var4 += var6.field3283; // L: 47
					var5 -= var6.field3283; // L: 48
				} while(!this.superStream.method5317(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("s")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5287(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3283) { // L: 62
						this.method5440(var3, var2); // L: 67
						var3.field3283 -= var2; // L: 68
						break;
					}

					this.method5440(var3, var3.field3283); // L: 63
					var2 -= var3.field3283; // L: 64
				} while(!this.superStream.method5317(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZIZB)I",
		garbageValue = "44"
	)
	static int method5445(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class133.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = class133.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lcq;ZB)V",
		garbageValue = "38"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12012
		int var3 = (int)var0.key; // L: 12013
		var0.remove(); // L: 12014
		if (var1 && var2 != -1 && class228.Widget_loadedInterfaces[var2]) { // L: 12015 12016 12017
			Widget_archive.clearFilesGroup(var2); // L: 12018
			if (SoundCache.Widget_interfaceComponents[var2] != null) { // L: 12019
				boolean var4 = true; // L: 12020

				for (int var5 = 0; var5 < SoundCache.Widget_interfaceComponents[var2].length; ++var5) { // L: 12021
					if (SoundCache.Widget_interfaceComponents[var2][var5] != null) { // L: 12022
						if (SoundCache.Widget_interfaceComponents[var2][var5].type != 2) { // L: 12023
							SoundCache.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 12024
						}
					}
				}

				if (var4) { // L: 12027
					SoundCache.Widget_interfaceComponents[var2] = null;
				}

				class228.Widget_loadedInterfaces[var2] = false; // L: 12028
			}
		}

		for (IntegerNode var6 = (IntegerNode)Client.widgetFlags.first(); var6 != null; var6 = (IntegerNode)Client.widgetFlags.next()) { // L: 12031
			if ((long)var2 == (var6.key >> 48 & 65535L)) { // L: 12032
				var6.remove(); // L: 12033
			}
		}

		Widget var7 = class140.getWidget(var3); // L: 12037
		if (var7 != null) { // L: 12038
			ChatChannel.invalidateWidget(var7);
		}

		if (Client.rootInterface != -1) { // L: 12039
			class7.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12040
}
