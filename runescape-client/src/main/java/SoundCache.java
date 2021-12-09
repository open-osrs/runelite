import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("s")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("w")
	static byte[][][] field321;
	@ObfuscatedName("a")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laj;",
		garbageValue = "-53"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laj;",
		garbageValue = "1434349687"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laj;",
		garbageValue = "-806437525"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laj;",
		garbageValue = "-1607899300"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "919700872"
	)
	public static int method833(int var0) {
		return class378.field4233[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120721647"
	)
	static void method823() {
		if (DirectByteArrayCopier.clearLoginScreen) { // L: 309
			AbstractByteArrayCopier.titleboxSprite = null; // L: 310
			class19.titlebuttonSprite = null; // L: 311
			Login.runesSprite = null; // L: 312
			WorldMapCacheName.leftTitleSprite = null; // L: 313
			NPC.rightTitleSprite = null; // L: 314
			Login.logoSprite = null; // L: 315
			Login.title_muteSprite = null; // L: 316
			KeyHandler.options_buttons_0Sprite = null; // L: 317
			LoginType.options_buttons_2Sprite = null; // L: 318
			class148.worldSelectBackSprites = null; // L: 319
			AbstractArchive.worldSelectFlagSprites = null; // L: 320
			UserComparator3.worldSelectArrows = null; // L: 321
			class112.worldSelectStars = null; // L: 322
			class21.field118 = null; // L: 323
			Client.loginScreenRunesAnimation.method2280(); // L: 324
			class260.musicPlayerStatus = 1; // L: 326
			class124.musicTrackArchive = null; // L: 327
			VarcInt.musicTrackGroupId = -1; // L: 328
			class260.musicTrackFileId = -1; // L: 329
			ChatChannel.musicTrackVolume = 0; // L: 330
			DynamicObject.musicTrackBoolean = false; // L: 331
			class260.pcmSampleLength = 2; // L: 332
			ClientPreferences.method2297(true); // L: 334
			DirectByteArrayCopier.clearLoginScreen = false; // L: 335
		}
	} // L: 336

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILju;ZB)V",
		garbageValue = "8"
	)
	static void method831(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapRectangle.getWorldMap().getMapArea(var0); // L: 4527
		int var4 = class340.localPlayer.plane; // L: 4528
		int var5 = (class340.localPlayer.x >> 7) + class131.baseX; // L: 4529
		int var6 = (class340.localPlayer.y >> 7) + TileItem.baseY; // L: 4530
		Coord var7 = new Coord(var4, var5, var6); // L: 4531
		WorldMapRectangle.getWorldMap().method6876(var3, var7, var1, var2); // L: 4532
	} // L: 4533

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1022759307"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class126.getWidgetChild(var1, var2); // L: 9903
		if (var5 != null) { // L: 9904
			if (var5.onOp != null) { // L: 9905
				ScriptEvent var6 = new ScriptEvent(); // L: 9906
				var6.widget = var5; // L: 9907
				var6.opIndex = var0; // L: 9908
				var6.targetName = var4; // L: 9909
				var6.args = var5.onOp; // L: 9910
				class285.runScriptEvent(var6); // L: 9911
			}

			boolean var11 = true; // L: 9913
			if (var5.contentType > 0) { // L: 9914
				var11 = class19.method329(var5);
			}

			if (var11) { // L: 9915
				int var8 = class363.getWidgetFlags(var5); // L: 9917
				int var9 = var0 - 1; // L: 9918
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9920
				if (var7) { // L: 9922
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9925
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2891, Client.packetWriter.isaacCipher); // L: 9927
						var10.packetBuffer.writeInt(var1); // L: 9928
						var10.packetBuffer.writeShort(var2); // L: 9929
						var10.packetBuffer.writeShort(var3); // L: 9930
						Client.packetWriter.addNode(var10); // L: 9931
					}

					if (var0 == 2) { // L: 9933
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2880, Client.packetWriter.isaacCipher); // L: 9935
						var10.packetBuffer.writeInt(var1); // L: 9936
						var10.packetBuffer.writeShort(var2); // L: 9937
						var10.packetBuffer.writeShort(var3); // L: 9938
						Client.packetWriter.addNode(var10); // L: 9939
					}

					if (var0 == 3) { // L: 9941
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2834, Client.packetWriter.isaacCipher); // L: 9943
						var10.packetBuffer.writeInt(var1); // L: 9944
						var10.packetBuffer.writeShort(var2); // L: 9945
						var10.packetBuffer.writeShort(var3); // L: 9946
						Client.packetWriter.addNode(var10); // L: 9947
					}

					if (var0 == 4) { // L: 9949
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2821, Client.packetWriter.isaacCipher); // L: 9951
						var10.packetBuffer.writeInt(var1); // L: 9952
						var10.packetBuffer.writeShort(var2); // L: 9953
						var10.packetBuffer.writeShort(var3); // L: 9954
						Client.packetWriter.addNode(var10); // L: 9955
					}

					if (var0 == 5) { // L: 9957
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2877, Client.packetWriter.isaacCipher); // L: 9959
						var10.packetBuffer.writeInt(var1); // L: 9960
						var10.packetBuffer.writeShort(var2); // L: 9961
						var10.packetBuffer.writeShort(var3); // L: 9962
						Client.packetWriter.addNode(var10); // L: 9963
					}

					if (var0 == 6) { // L: 9965
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2866, Client.packetWriter.isaacCipher); // L: 9967
						var10.packetBuffer.writeInt(var1); // L: 9968
						var10.packetBuffer.writeShort(var2); // L: 9969
						var10.packetBuffer.writeShort(var3); // L: 9970
						Client.packetWriter.addNode(var10); // L: 9971
					}

					if (var0 == 7) { // L: 9973
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2822, Client.packetWriter.isaacCipher); // L: 9975
						var10.packetBuffer.writeInt(var1); // L: 9976
						var10.packetBuffer.writeShort(var2); // L: 9977
						var10.packetBuffer.writeShort(var3); // L: 9978
						Client.packetWriter.addNode(var10); // L: 9979
					}

					if (var0 == 8) { // L: 9981
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2884, Client.packetWriter.isaacCipher); // L: 9983
						var10.packetBuffer.writeInt(var1); // L: 9984
						var10.packetBuffer.writeShort(var2); // L: 9985
						var10.packetBuffer.writeShort(var3); // L: 9986
						Client.packetWriter.addNode(var10); // L: 9987
					}

					if (var0 == 9) { // L: 9989
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2830, Client.packetWriter.isaacCipher); // L: 9991
						var10.packetBuffer.writeInt(var1); // L: 9992
						var10.packetBuffer.writeShort(var2); // L: 9993
						var10.packetBuffer.writeShort(var3); // L: 9994
						Client.packetWriter.addNode(var10); // L: 9995
					}

					if (var0 == 10) { // L: 9997
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2853, Client.packetWriter.isaacCipher); // L: 9999
						var10.packetBuffer.writeInt(var1); // L: 10000
						var10.packetBuffer.writeShort(var2); // L: 10001
						var10.packetBuffer.writeShort(var3); // L: 10002
						Client.packetWriter.addNode(var10); // L: 10003
					}

				}
			}
		}
	} // L: 9923 10005
}
