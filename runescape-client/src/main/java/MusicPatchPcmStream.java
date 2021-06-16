import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lie;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIIIB)V",
		garbageValue = "0"
	)
	void method4761(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2851[var1.field2898] & 4) != 0 && var1.field2903 < 0) { // L: 73
			int var6 = this.superStream.field2856[var1.field2898] / class341.field3921; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2899) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field2899 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field2899 += var7 * var6 - 1048576; // L: 81
				int var8 = class341.field3921 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field2854[var1.field2898] == 0) { // L: 86
					var1.stream = RawPcmStream.method937(var1.rawSound, var10.method957(), var10.method948(), var10.method949()); // L: 87
				} else {
					var1.stream = RawPcmStream.method937(var1.rawSound, var10.method957(), 0, var10.method949()); // L: 90
					this.superStream.method4567(var1, var1.patch.field2882[var1.field2910] < 0); // L: 91
					var1.stream.method953(var8, var10.method948()); // L: 92
				}

				if (var1.patch.field2882[var1.field2910] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method955(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method959()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lib;II)V",
		garbageValue = "-1540806393"
	)
	void method4744(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2851[var1.field2898] & 4) != 0 && var1.field2903 < 0) { // L: 105
			int var3 = this.superStream.field2856[var1.field2898] / class341.field3921; // L: 106
			int var4 = (var3 + 1048575 - var1.field2899) / var3; // L: 107
			var1.field2899 = var3 * var2 + var1.field2899 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field2854[var1.field2898] == 0) { // L: 110
					var1.stream = RawPcmStream.method937(var1.rawSound, var1.stream.method957(), var1.stream.method948(), var1.stream.method949()); // L: 111
				} else {
					var1.stream = RawPcmStream.method937(var1.rawSound, var1.stream.method957(), 0, var1.stream.method949()); // L: 114
					this.superStream.method4567(var1, var1.patch.field2882[var1.field2910] < 0); // L: 115
				}

				if (var1.patch.field2882[var1.field2910] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2899 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
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

	@ObfuscatedName("r")
	protected int vmethod4740() {
		return 0; // L: 34
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method4589(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field2913) { // L: 45
						this.method4761(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field2913 -= var5; // L: 52
						break;
					}

					this.method4761(var6, var1, var4, var6.field2913, var4 + var5); // L: 46
					var4 += var6.field2913; // L: 47
					var5 -= var6.field2913; // L: 48
				} while(!this.superStream.method4590(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("z")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method4589(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field2913) { // L: 62
						this.method4744(var3, var2); // L: 67
						var3.field2913 -= var2; // L: 68
						break;
					}

					this.method4744(var3, var3.field2913); // L: 63
					var2 -= var3.field2913; // L: 64
				} while(!this.superStream.method4590(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-8788"
	)
	static String method4743(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1611002250"
	)
	static final void method4762() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4826 4827 4844
			if (var0.plane == SoundSystem.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4828
				if (Client.cycle >= var0.cycleStart) { // L: 4829
					if (var0.targetIndex > 0) { // L: 4830
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4831
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4832
							var0.setDestination(var1.x, var1.y, ItemContainer.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4834
						int var2 = -var0.targetIndex - 1; // L: 4836
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4837
							var3 = class262.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4838
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, ItemContainer.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4839
						}
					}

					var0.advance(Client.field683); // L: 4841
					DevicePcmPlayerProvider.scene.drawEntity(SoundSystem.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4842
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4846
}
