import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static GameBuild field1334;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -690692767
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1674280871
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 96
	} // L: 99

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;",
		garbageValue = "-1425925685"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 102

		for (int var6 = this.count; var6 > 0; --var6) { // L: 103
			if (var6 != 100) { // L: 104
				this.messages[var6] = this.messages[var6 - 1]; // L: 105
			}
		}

		if (var5 == null) { // L: 107
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 109
			var5.removeDual(); // L: 110
			var5.set(var1, var2, var4, var3); // L: 111
		}

		this.messages[0] = var5; // L: 113
		if (this.count < 100) { // L: 114
			++this.count;
		}

		return var5; // L: 115
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbk;",
		garbageValue = "50"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 119 120
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "771657019"
	)
	@Export("size")
	int size() {
		return this.count; // L: 124
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "-921051133"
	)
	static PacketBufferNode method2363() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)Lau;",
		garbageValue = "-2139002337"
	)
	static WorldMapSprite method2375(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class39.convertJpgToSprite(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lht;I[B[BI)V",
		garbageValue = "1292250703"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2668 == null) { // L: 902
			if (var2 == null) { // L: 903
				return; // L: 909
			}

			var0.field2668 = new byte[11][]; // L: 904
			var0.field2649 = new byte[11][]; // L: 905
			var0.field2670 = new int[11]; // L: 906
			var0.field2671 = new int[11]; // L: 907
		}

		var0.field2668[var1] = var2; // L: 911
		if (var2 != null) {
			var0.field2667 = true; // L: 912
		} else {
			var0.field2667 = false; // L: 914

			for (int var4 = 0; var4 < var0.field2668.length; ++var4) { // L: 915
				if (var0.field2668[var4] != null) { // L: 916
					var0.field2667 = true; // L: 917
					break;
				}
			}
		}

		var0.field2649[var1] = var3; // L: 922
	} // L: 923

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	static final void method2381() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3496
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3497
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3498
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3510
				if (var1 == null) { // L: 3511
					Object var10000 = null; // L: 3512
					var1 = SoundEffect.readSoundEffect(Username.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3513
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3514
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3515
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3521
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3523
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3524
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3525
						int var5 = var4 * 128 + 64 - PlayerType.localPlayer.x; // L: 3526
						if (var5 < 0) { // L: 3527
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3528
						int var7 = var6 * 128 + 64 - PlayerType.localPlayer.y; // L: 3529
						if (var7 < 0) { // L: 3530
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3531
						if (var8 > var3) { // L: 3532
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3533
							continue; // L: 3534
						}

						if (var8 < 0) { // L: 3536
							var8 = 0;
						}

						var2 = (var3 - var8) * Client.areaSoundEffectVolume / var3; // L: 3537
					} else {
						var2 = Client.soundEffectVolume; // L: 3539
					}

					if (var2 > 0) { // L: 3540
						RawSound var9 = var1.toRawSound().resample(NetSocket.decimator); // L: 3541
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3542
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3543
						GrandExchangeEvents.pcmStreamMixer.addSubStream(var10); // L: 3544
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3546
				}
			} else {
				--Client.soundEffectCount; // L: 3499

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3500
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3501
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3502
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3503
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3504
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3505
				}

				--var0; // L: 3507
			}
		}

		if (Client.field916 && !class58.method957()) { // L: 3549
			if (Client.musicVolume != 0 && Client.currentTrackGroupId != -1) { // L: 3550
				Canvas.method952(ApproximateRouteStrategy.archive6, Client.currentTrackGroupId, 0, Client.musicVolume, false);
			}

			Client.field916 = false; // L: 3551
		}

	} // L: 3553
}
