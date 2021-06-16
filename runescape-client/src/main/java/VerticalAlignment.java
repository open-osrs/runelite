import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	field1679(2, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	field1676(1, 2);

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1564632603
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1142333755
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1250090587"
	)
	static final void method2889(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 5476
		if (var8 < 0) { // L: 5477
			var8 = 0;
		} else if (var8 > 100) { // L: 5478
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 5479
		int var7 = var5 * var9 / 256; // L: 5480
		var8 = 2048 - var3 & 2047; // L: 5483
		var9 = 2048 - var4 & 2047; // L: 5484
		int var10 = 0; // L: 5485
		int var11 = 0; // L: 5486
		int var12 = var7; // L: 5487
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 5488
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5489
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5490
			var15 = var14 * var11 - var13 * var7 >> 16; // L: 5491
			var12 = var11 * var13 + var7 * var14 >> 16; // L: 5492
			var11 = var15; // L: 5493
		}

		if (var9 != 0) { // L: 5495
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 5496
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 5497
			var15 = var12 * var13 + var14 * var10 >> 16; // L: 5498
			var12 = var14 * var12 - var10 * var13 >> 16; // L: 5499
			var10 = var15; // L: 5500
		}

		ObjectSound.cameraX = var0 - var10; // L: 5502
		class160.cameraY = var1 - var11; // L: 5503
		Canvas.cameraZ = var2 - var12; // L: 5504
		class69.cameraPitch = var3; // L: 5505
		class32.cameraYaw = var4; // L: 5506
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (FriendSystem.oculusOrbFocalPointX >> 7 != class262.localPlayer.x >> 7 || VarbitComposition.oculusOrbFocalPointY >> 7 != class262.localPlayer.y >> 7)) { // L: 5507 5508
			var13 = class262.localPlayer.plane; // L: 5509
			var14 = (FriendSystem.oculusOrbFocalPointX >> 7) + class15.baseX; // L: 5510
			var15 = (VarbitComposition.oculusOrbFocalPointY >> 7) + WorldMapSprite.baseY; // L: 5511
			PacketBufferNode var16 = InterfaceParent.getPacketBufferNode(ClientPacket.field2596, Client.packetWriter.isaacCipher); // L: 5514
			var16.packetBuffer.writeShort(var14); // L: 5515
			var16.packetBuffer.method6659(Client.field704); // L: 5516
			var16.packetBuffer.method6640(var13); // L: 5517
			var16.packetBuffer.method6648(var15); // L: 5518
			Client.packetWriter.addNode(var16); // L: 5519
		}

	} // L: 5523
}
