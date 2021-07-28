import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 874951947
	)
	public int field3846;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("v")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Loh;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3846 = (int)(UrlRequester.method2125() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1608246392"
	)
	static final void method5763(String var0, int var1) {
		PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2587, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByte(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2018320104"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = class122.getTileHeight(var0, var1, GrandExchangeEvent.Client_plane) - var2;
			var0 -= ItemContainer.cameraX;
			var3 -= Bounds.cameraY;
			var1 -= WorldMapArchiveLoader.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class116.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class116.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class117.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class117.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var3 * var5 - var4 * var1 >> 16;
			var1 = var3 * var4 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
