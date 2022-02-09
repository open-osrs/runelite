import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class91 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Ljava/lang/String;Ljava/lang/String;I)Lpg;",
		garbageValue = "502535767"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 69
		int var4 = var0.getFileId(var3, var2); // L: 70
		IndexedSprite var5;
		if (!class125.method2744(var0, var3, var4)) { // L: 73
			var5 = null; // L: 74
		} else {
			var5 = class317.method5780(); // L: 77
		}

		return var5; // L: 79
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Ljz;III)V",
		garbageValue = "-732657194"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3536
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3537
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3538
				if (var3 == null) { // L: 3539
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3540
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3541
				if (var3.contains(var4, var5)) { // L: 3542
					var4 -= var3.width / 2; // L: 3543
					var5 -= var3.height / 2; // L: 3544
					int var6 = Client.camAngleY & 2047; // L: 3545
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3546
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3547
					int var9 = var7 * var5 + var8 * var4 >> 11; // L: 3548
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3549
					int var11 = var9 + WorldMapSprite.localPlayer.x >> 7; // L: 3550
					int var12 = WorldMapSprite.localPlayer.y - var10 >> 7; // L: 3551
					PacketBufferNode var13 = class135.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher); // L: 3553
					var13.packetBuffer.writeByte(18); // L: 3554
					var13.packetBuffer.method7403(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3555
					var13.packetBuffer.method7555(var11 + Canvas.baseX); // L: 3556
					var13.packetBuffer.method7555(var12 + class118.baseY); // L: 3557
					var13.packetBuffer.writeByte(var4); // L: 3558
					var13.packetBuffer.writeByte(var5); // L: 3559
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3560
					var13.packetBuffer.writeByte(57); // L: 3561
					var13.packetBuffer.writeByte(0); // L: 3562
					var13.packetBuffer.writeByte(0); // L: 3563
					var13.packetBuffer.writeByte(89); // L: 3564
					var13.packetBuffer.writeShort(WorldMapSprite.localPlayer.x); // L: 3565
					var13.packetBuffer.writeShort(WorldMapSprite.localPlayer.y); // L: 3566
					var13.packetBuffer.writeByte(63); // L: 3567
					Client.packetWriter.addNode(var13); // L: 3568
					Client.destinationX = var11; // L: 3569
					Client.destinationY = var12; // L: 3570
				}
			}

		}
	} // L: 3573
}
