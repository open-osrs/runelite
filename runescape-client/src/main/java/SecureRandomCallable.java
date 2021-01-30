import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("bh")
	@Export("otp")
	static String otp;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 47
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljq;",
		garbageValue = "97561494"
	)
	@Export("ItemDefinition_get")
	public static ItemDefinition ItemDefinition_get(int var0) {
		ItemDefinition var1 = (ItemDefinition)ItemDefinition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = NPC.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemDefinition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemDefinition.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104
				var1.groundActions = null; // L: 105
				var1.inventoryActions = null; // L: 106
				var1.shiftClickIndex = -1; // L: 107
				var1.team = 0; // L: 108
				if (var1.params != null) { // L: 109
					boolean var3 = false; // L: 110

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 111
						ParamDefinition var5 = ChatChannel.getParamDefinition((int)var4.key); // L: 112
						if (var5.autoDisable) { // L: 113
							var4.remove();
						} else {
							var3 = true; // L: 114
						}
					}

					if (!var3) { // L: 116
						var1.params = null;
					}
				}
			}

			ItemDefinition.ItemDefinition_cached.put(var1, (long)var0); // L: 119
			return var1; // L: 120
		}
	}

	@ObfuscatedName("v")
	public static String method1218(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (0L == var0 % 37L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (0L != var0) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class299.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1753340272"
	)
	public static boolean method1216(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 13
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILib;IIIZI)V",
		garbageValue = "141166757"
	)
	public static void method1221(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class206.musicPlayerStatus = 1; // L: 48
		Varps.musicTrackArchive = var1; // L: 49
		HealthBarUpdate.musicTrackGroupId = var2; // L: 50
		class206.musicTrackFileId = var3; // L: 51
		GrandExchangeEvent.musicTrackVolume = var4; // L: 52
		class231.musicTrackBoolean = var5; // L: 53
		WorldMapSection1.pcmSampleLength = var0; // L: 54
	} // L: 55

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	public static void method1220(int var0) {
		class206.musicPlayerStatus = 1; // L: 58
		Varps.musicTrackArchive = null; // L: 59
		HealthBarUpdate.musicTrackGroupId = -1; // L: 60
		class206.musicTrackFileId = -1; // L: 61
		GrandExchangeEvent.musicTrackVolume = 0; // L: 62
		class231.musicTrackBoolean = false; // L: 63
		WorldMapSection1.pcmSampleLength = var0; // L: 64
	} // L: 65

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "997445897"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1489
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1490
			SecureRandomFuture.method2205(var0.isMembersOnly()); // L: 1491
		}

		if (var0.properties != Client.worldProperties) { // L: 1493
			Archive var1 = Messages.archive8; // L: 1494
			int var2 = var0.properties; // L: 1495
			if ((var2 & 536870912) != 0) { // L: 1497
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 1498
			} else if ((var2 & 1073741824) != 0) { // L: 1500
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 1501
			} else {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 1504
			}
		}

		WorldMapSprite.worldHost = var0.host; // L: 1508
		Client.worldId = var0.id; // L: 1509
		Client.worldProperties = var0.properties; // L: 1510
		class278.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1511
		Players.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1512
		ArchiveDiskAction.port3 = class278.port1; // L: 1513
	} // L: 1514

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3843
			Timer.clientPreferences.roofsHidden = !Timer.clientPreferences.roofsHidden; // L: 3844
			GrandExchangeOffer.savePreferences(); // L: 3845
			if (Timer.clientPreferences.roofsHidden) { // L: 3846
				class234.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class234.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3847
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3849
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf; // L: 3850
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3851
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3852
			if (var0.equalsIgnoreCase("errortest")) { // L: 3853
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3854
				WorldMapRectangle.worldMap.showCoord = !WorldMapRectangle.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3855
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3856
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3857
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3858
				LoginScreenAnimation.method1903();
			}
		}

		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher); // L: 3861
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3862
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3863
		Client.packetWriter.addNode(var1); // L: 3864
	} // L: 3865

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703246278"
	)
	static final void method1217() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11009
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11010
			var1.clearIsInClanChat(); // L: 11011
		}

	} // L: 11013
}
