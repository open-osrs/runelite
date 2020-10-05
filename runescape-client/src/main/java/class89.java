import java.math.BigInteger;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class89 {
	@ObfuscatedName("i")
	static final BigInteger field1161;
	@ObfuscatedName("o")
	static final BigInteger field1164;

	static {
		field1161 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field1164 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1737643934"
	)
	static void method2127() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 50

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 51
			var1.clearIsFromFriend(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1760703138"
	)
	static void method2130(int var0) {
		Login.loginIndex = 12; // L: 1733
		Login.field1210 = var0; // L: 1734
	} // L: 1735

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "602324309"
	)
	static final void forceDisconnect(int var0) {
		ViewportMouse.logOut(); // L: 2510
		switch(var0) { // L: 2511
		case 1:
			Login.loginIndex = 24; // L: 2520
			UrlRequester.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2521
			break;
		case 2:
			GrandExchangeOfferTotalQuantityComparator.method169(); // L: 2514
		}

	} // L: 2526

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-29"
	)
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 4945
			int var3 = ArchiveLoader.getTileHeight(var0, var1, Huffman.Client_plane) - var2; // L: 4950
			var0 -= VertexNormal.cameraX; // L: 4951
			var3 -= FaceNormal.cameraY; // L: 4952
			var1 -= AbstractWorldMapData.cameraZ; // L: 4953
			int var4 = Rasterizer3D.Rasterizer3D_sine[PacketBuffer.cameraPitch]; // L: 4954
			int var5 = Rasterizer3D.Rasterizer3D_cosine[PacketBuffer.cameraPitch]; // L: 4955
			int var6 = Rasterizer3D.Rasterizer3D_sine[ServerPacket.cameraYaw]; // L: 4956
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ServerPacket.cameraYaw]; // L: 4957
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 4958
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 4959
			var0 = var8; // L: 4960
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 4961
			var1 = var3 * var4 + var5 * var1 >> 16; // L: 4962
			if (var1 >= 50) { // L: 4964
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 4965
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 4966
			} else {
				Client.viewportTempX = -1; // L: 4969
				Client.viewportTempY = -1; // L: 4970
			}

		} else {
			Client.viewportTempX = -1; // L: 4946
			Client.viewportTempY = -1; // L: 4947
		}
	} // L: 4948 4972
}
