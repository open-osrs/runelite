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
		SecureRandom var2 = new SecureRandom();
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
		ItemDefinition var1 = (ItemDefinition)ItemDefinition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPC.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemDefinition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				var1.groundActions = null;
				var1.inventoryActions = null;
				var1.shiftClickIndex = -1;
				var1.team = 0;
				if (var1.params != null) {
					boolean var3 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamDefinition var5 = ChatChannel.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var3 = true;
						}
					}

					if (!var3) {
						var1.params = null;
					}
				}
			}

			ItemDefinition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	public static String method1218(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class299.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
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
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILib;IIIZI)V",
		garbageValue = "141166757"
	)
	public static void method1221(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class206.musicPlayerStatus = 1;
		Varps.musicTrackArchive = var1;
		HealthBarUpdate.musicTrackGroupId = var2;
		class206.musicTrackFileId = var3;
		GrandExchangeEvent.musicTrackVolume = var4;
		class231.musicTrackBoolean = var5;
		WorldMapSection1.pcmSampleLength = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	public static void method1220(int var0) {
		class206.musicPlayerStatus = 1;
		Varps.musicTrackArchive = null;
		HealthBarUpdate.musicTrackGroupId = -1;
		class206.musicTrackFileId = -1;
		GrandExchangeEvent.musicTrackVolume = 0;
		class231.musicTrackBoolean = false;
		WorldMapSection1.pcmSampleLength = var0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "997445897"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			SecureRandomFuture.method2205(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = Messages.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		WorldMapSprite.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class278.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		Players.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		ArchiveDiskAction.port3 = class278.port1;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Timer.clientPreferences.roofsHidden = !Timer.clientPreferences.roofsHidden;
			GrandExchangeOffer.savePreferences();
			if (Timer.clientPreferences.roofsHidden) {
				class234.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class234.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				WorldMapRectangle.worldMap.showCoord = !WorldMapRectangle.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				LoginScreenAnimation.method1903();
			}
		}

		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703246278"
	)
	static final void method1217() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInClanChat();
		}

	}
}
