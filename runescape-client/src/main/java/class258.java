import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class258 {
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1214767068"
	)
	static final void method4685(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = SecureRandomCallable.method1233(var5, var6); // L: 4934
		int var7 = 2048 - var3 & 2047; // L: 4935
		int var8 = 2048 - var4 & 2047; // L: 4936
		int var9 = 0; // L: 4937
		int var10 = 0; // L: 4938
		int var11 = var5; // L: 4939
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 4940
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 4941
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 4942
			var14 = var13 * var10 - var5 * var12 >> 16; // L: 4943
			var11 = var13 * var5 + var12 * var10 >> 16; // L: 4944
			var10 = var14; // L: 4945
		}

		if (var8 != 0) { // L: 4947
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 4948
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 4949
			var14 = var13 * var9 + var11 * var12 >> 16; // L: 4950
			var11 = var13 * var11 - var12 * var9 >> 16; // L: 4951
			var9 = var14; // L: 4952
		}

		SecureRandomFuture.cameraX = var0 - var9; // L: 4954
		ArchiveLoader.cameraY = var1 - var10; // L: 4955
		ObjectSound.cameraZ = var2 - var11; // L: 4956
		KeyHandler.cameraPitch = var3; // L: 4957
		class39.cameraYaw = var4; // L: 4958
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (HealthBarUpdate.oculusOrbFocalPointX >> 7 != UserComparator9.localPlayer.x >> 7 || ApproximateRouteStrategy.oculusOrbFocalPointY >> 7 != UserComparator9.localPlayer.y >> 7)) { // L: 4959 4960
			var12 = UserComparator9.localPlayer.plane; // L: 4961
			var13 = (HealthBarUpdate.oculusOrbFocalPointX >> 7) + GrandExchangeOfferNameComparator.baseX; // L: 4962
			var14 = (ApproximateRouteStrategy.oculusOrbFocalPointY >> 7) + NetCache.baseY; // L: 4963
			PacketBufferNode var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher); // L: 4966
			var15.packetBuffer.writeShortLE(var14); // L: 4967
			var15.packetBuffer.method5883(var12); // L: 4968
			var15.packetBuffer.method5736(Client.field746); // L: 4969
			var15.packetBuffer.writeIntME(var13); // L: 4970
			Client.packetWriter.addNode(var15); // L: 4971
		}

	} // L: 4975
}
