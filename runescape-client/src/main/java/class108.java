import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class108 extends class103 {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 219249765
	)
	int field1331;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 378364321
	)
	int field1326;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 704376051
	)
	int field1327;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1492195551
	)
	int field1330;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class108(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1331 = var1.readInt();
		this.field1330 = var1.readInt();
		this.field1326 = var1.readUnsignedByte();
		this.field1327 = var1.readUnsignedByte();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2372(this.field1331, this.field1330, this.field1326, this.field1327);
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "573927202"
	)
	static void method2304(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, GraphicsObject.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != MouseHandler.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method6786(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6693(var3[var6]);
					var8.packetBuffer.method6776(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2569, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.method6685(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6683(0);
					var8.packetBuffer.method6693(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class120.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553122887"
	)
	static void method2294() {
		if (Client.field489 && MouseHandler.localPlayer != null) {
			int var0 = MouseHandler.localPlayer.pathX[0];
			int var1 = MouseHandler.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			KeyHandler.oculusOrbFocalPointX = MouseHandler.localPlayer.x;
			int var2 = class122.getTileHeight(MouseHandler.localPlayer.x, MouseHandler.localPlayer.y, GrandExchangeEvent.Client_plane) - Client.camFollowHeight;
			if (var2 < class270.field3532) {
				class270.field3532 = var2;
			}

			ArchiveDiskAction.oculusOrbFocalPointY = MouseHandler.localPlayer.y;
			Client.field489 = false;
		}

	}
}
