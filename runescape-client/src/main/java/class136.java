import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class136 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -855933295
	)
	int field1571;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1571 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "23"
	)
	void vmethod3152(Buffer var1) {
		this.field1571 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1764669808"
	)
	void vmethod3153(ClanChannel var1) {
		var1.removeMember(this.field1571); // L: 96
	} // L: 97

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1053003515"
	)
	public static final synchronized long method2931() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class269.field3149) { // L: 15
			class269.field3147 += class269.field3149 - var0; // L: 16
		}

		class269.field3149 = var0; // L: 18
		return class269.field3147 + var0; // L: 19
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "885015273"
	)
	static final void method2923() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3493
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3494
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3495
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3507
				if (var1 == null) { // L: 3508
					Object var10000 = null; // L: 3509
					var1 = SoundEffect.readSoundEffect(class182.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3510
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3511
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3512
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3518
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3520
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3521
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3522
						int var5 = var4 * 128 + 64 - GrandExchangeEvents.localPlayer.x; // L: 3523
						if (var5 < 0) { // L: 3524
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3525
						int var7 = var6 * 128 + 64 - GrandExchangeEvents.localPlayer.y; // L: 3526
						if (var7 < 0) { // L: 3527
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3528
						if (var8 > var3) { // L: 3529
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3530
							continue; // L: 3531
						}

						if (var8 < 0) { // L: 3533
							var8 = 0;
						}

						var2 = (var3 - var8) * class131.clientPreferences.method2270() / var3; // L: 3534
					} else {
						var2 = class131.clientPreferences.method2243(); // L: 3536
					}

					if (var2 > 0) { // L: 3537
						RawSound var9 = var1.toRawSound().resample(WorldMapRectangle.decimator); // L: 3538
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3539
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3540
						StructComposition.pcmStreamMixer.addSubStream(var10); // L: 3541
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3543
				}
			} else {
				--Client.soundEffectCount; // L: 3496

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3497
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3498
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3499
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3500
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3501
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3502
				}

				--var0; // L: 3504
			}
		}

		if (Client.field746 && !class307.method5789()) { // L: 3546
			if (class131.clientPreferences.method2321() != 0 && Client.currentTrackGroupId != -1) { // L: 3547
				class18.method266(class16.archive6, Client.currentTrackGroupId, 0, class131.clientPreferences.method2321(), false);
			}

			Client.field746 = false; // L: 3548
		}

	} // L: 3550
}
