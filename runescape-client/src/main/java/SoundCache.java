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
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laj;",
		garbageValue = "-53"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
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
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
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
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laj;",
		garbageValue = "-1607899300"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "919700872"
	)
	public static int method833(int var0) {
		return class378.field4233[var0 & 16383];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120721647"
	)
	static void method823() {
		if (DirectByteArrayCopier.clearLoginScreen) {
			AbstractByteArrayCopier.titleboxSprite = null;
			class19.titlebuttonSprite = null;
			Login.runesSprite = null;
			WorldMapCacheName.leftTitleSprite = null;
			NPC.rightTitleSprite = null;
			Login.logoSprite = null;
			Login.title_muteSprite = null;
			KeyHandler.options_buttons_0Sprite = null;
			LoginType.options_buttons_2Sprite = null;
			class148.worldSelectBackSprites = null;
			AbstractArchive.worldSelectFlagSprites = null;
			UserComparator3.worldSelectArrows = null;
			class112.worldSelectStars = null;
			class21.field118 = null;
			Client.loginScreenRunesAnimation.method2280();
			class260.musicPlayerStatus = 1;
			class124.musicTrackArchive = null;
			VarcInt.musicTrackGroupId = -1;
			class260.musicTrackFileId = -1;
			ChatChannel.musicTrackVolume = 0;
			DynamicObject.musicTrackBoolean = false;
			class260.pcmSampleLength = 2;
			ClientPreferences.method2297(true);
			DirectByteArrayCopier.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILju;ZB)V",
		garbageValue = "8"
	)
	static void method831(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapRectangle.getWorldMap().getMapArea(var0);
		int var4 = class340.localPlayer.plane;
		int var5 = (class340.localPlayer.x >> 7) + class131.baseX;
		int var6 = (class340.localPlayer.y >> 7) + TileItem.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		WorldMapRectangle.getWorldMap().method6876(var3, var7, var1, var2);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1022759307"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class126.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				class285.runScriptEvent(var6);
			}

			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = class19.method329(var5);
			}

			if (var11) {
				int var8 = class363.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = (var8 >> var9 + 1 & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2891, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 2) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2880, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 3) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2834, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 4) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2821, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 5) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2877, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 6) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2866, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 7) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2822, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 8) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2884, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 9) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2830, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 10) {
						var10 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2853, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

				}
			}
		}
	}
}
