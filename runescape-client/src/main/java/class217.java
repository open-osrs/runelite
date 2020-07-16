import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class217 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIB)[Llz;",
		garbageValue = "-104"
	)
	public static Sprite[] method4091(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class3.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			Sprite[] var5 = new Sprite[class335.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class335.SpriteBuffer_spriteCount; ++var6) {
				Sprite var7 = var5[var6] = new Sprite();
				var7.width = class335.SpriteBuffer_spriteWidth;
				var7.height = UserComparator8.SpriteBuffer_spriteHeight;
				var7.xOffset = class335.SpriteBuffer_xOffsets[var6];
				var7.yOffset = NPC.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class335.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class335.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subHeight * var7.subWidth;
				byte[] var9 = ItemDefinition.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = class335.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			GrandExchangeEvent.method158();
			return var5;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1394672948"
	)
	static final void method4092() {
		PacketBufferNode var0 = UserComparator4.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class41.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class234.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
