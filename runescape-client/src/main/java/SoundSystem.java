import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("t")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lab;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class4.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-198091893"
	)
	public static int method780() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "240694548"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-117"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class391.Client_plane][var0][var1];
		if (var2 == null) {
			CollisionMap.scene.removeGroundItemPile(class391.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class65.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				CollisionMap.scene.removeGroundItemPile(class391.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = ClanSettings.calculateTag(var0, var1, 3, false, 0);
				CollisionMap.scene.newGroundItemPile(class391.Client_plane, var0, var1, GraphicsObject.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class391.Client_plane), var5, var9, var13, var8);
			}
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	static final void method778(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2677()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = FriendSystem.getPacketBufferNode(ClientPacket.field2689, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + BufferedSink.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					var3.addNode(var4);
				}
			}
		}
	}
}
