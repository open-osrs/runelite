import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class15 extends class14 {
	@ObfuscatedName("t")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 264898961
	)
	static int field133;
	@ObfuscatedName("gx")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("h")
	String field130;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class15(class2 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field130 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.field91 = this.field130; // L: 237
	} // L: 238

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1257540454"
	)
	static final void method228() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3682
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3683
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3684
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3696
				if (var1 == null) { // L: 3697
					Object var10000 = null; // L: 3698
					var1 = SoundEffect.readSoundEffect(class14.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3699
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays; // L: 3700
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3701
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3707
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3709
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3710
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3711
						int var5 = var4 * 128 + 64 - class35.localPlayer.x; // L: 3712
						if (var5 < 0) { // L: 3713
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3714
						int var7 = var6 * 128 + 64 - class35.localPlayer.y; // L: 3715
						if (var7 < 0) { // L: 3716
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3717
						if (var8 > var3) { // L: 3718
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3719
							continue; // L: 3720
						}

						if (var8 < 0) { // L: 3722
							var8 = 0;
						}

						var2 = (var3 - var8) * class12.clientPreferences.areaSoundEffectsVolume / var3; // L: 3723
					} else {
						var2 = class12.clientPreferences.soundEffectsVolume; // L: 3725
					}

					if (var2 > 0) { // L: 3726
						RawSound var9 = var1.toRawSound().resample(class3.decimator); // L: 3727
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3728
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3729
						FloorOverlayDefinition.pcmStreamMixer.addSubStream(var10); // L: 3730
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3732
				}
			} else {
				--Client.soundEffectCount; // L: 3685

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3686
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3687
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3688
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3689
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3690
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3691
				}

				--var0; // L: 3693
			}
		}

		if (Client.field866) { // L: 3735
			boolean var12;
			if (class232.musicPlayerStatus != 0) { // L: 3738
				var12 = true; // L: 3739
			} else {
				var12 = class232.midiPcmStream.isReady(); // L: 3742
			}

			if (!var12) { // L: 3744
				if (class12.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) { // L: 3745
					World.method1684(class29.archive6, Client.currentTrackGroupId, 0, class12.clientPreferences.musicVolume, false);
				}

				Client.field866 = false; // L: 3746
			}
		}

	} // L: 3749

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8929
			Widget var0 = PacketWriter.getWidgetChild(class6.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8930
			if (var0 != null && var0.onTargetLeave != null) { // L: 8931
				ScriptEvent var1 = new ScriptEvent(); // L: 8932
				var1.widget = var0; // L: 8933
				var1.args = var0.onTargetLeave; // L: 8934
				class259.runScriptEvent(var1); // L: 8935
			}

			Client.field773 = -1; // L: 8937
			Client.isSpellSelected = false; // L: 8938
			VerticalAlignment.invalidateWidget(var0); // L: 8939
		}
	} // L: 8940
}
