import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -566809681
	)
	@Export("group")
	int group;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 597308513
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	boolean field1040;

	InterfaceParent() {
		this.field1040 = false; // L: 8
	} // L: 10

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1118992096"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 94
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-99"
	)
	public static boolean method2086(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 261 262
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbi;B)V",
		garbageValue = "-62"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1994
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1995
			class115.method2638(var0.isMembersOnly()); // L: 1996
		}

		if (var0.properties != Client.worldProperties) { // L: 1998
			class131.method2787(Message.archive8, var0.properties); // L: 1999
		}

		HealthBar.worldHost = var0.host; // L: 2001
		Client.worldId = var0.id; // L: 2002
		Client.worldProperties = var0.properties; // L: 2003
		class346.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2004
		class297.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2005
		class274.currentPort = class346.worldPort; // L: 2006
	} // L: 2007

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-22"
	)
	static final void method2084(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class167.method3254(var5, var6); // L: 5231
		int var7 = 2048 - var3 & 2047; // L: 5232
		int var8 = 2048 - var4 & 2047; // L: 5233
		int var9 = 0; // L: 5234
		int var10 = 0; // L: 5235
		int var11 = var5; // L: 5236
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5237
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5238
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5239
			var14 = var10 * var13 - var12 * var5 >> 16; // L: 5240
			var11 = var13 * var5 + var10 * var12 >> 16; // L: 5241
			var10 = var14; // L: 5242
		}

		if (var8 != 0) { // L: 5244
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5245
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5246
			var14 = var12 * var11 + var9 * var13 >> 16; // L: 5247
			var11 = var13 * var11 - var9 * var12 >> 16; // L: 5248
			var9 = var14; // L: 5249
		}

		if (Client.isCameraLocked) { // L: 5251
			class213.field2598 = var0 - var9; // L: 5252
			FriendsChat.field4141 = var1 - var10; // L: 5253
			class139.field1624 = var2 - var11; // L: 5254
			LoginPacket.field3062 = var3; // L: 5255
			Interpreter.field854 = var4; // L: 5256
		} else {
			class414.cameraX = var0 - var9; // L: 5259
			WorldMapDecoration.cameraY = var1 - var10; // L: 5260
			GrandExchangeOfferOwnWorldComparator.cameraZ = var2 - var11; // L: 5261
			class7.cameraPitch = var3; // L: 5262
			class7.cameraYaw = var4; // L: 5263
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class29.oculusOrbFocalPointX >> 7 != WorldMapSprite.localPlayer.x >> 7 || class121.oculusOrbFocalPointY >> 7 != WorldMapSprite.localPlayer.y >> 7)) { // L: 5265 5266
			var12 = WorldMapSprite.localPlayer.plane; // L: 5267
			var13 = (class29.oculusOrbFocalPointX >> 7) + Canvas.baseX; // L: 5268
			var14 = (class121.oculusOrbFocalPointY >> 7) + class118.baseY; // L: 5269
			DevicePcmPlayerProvider.method361(var13, var14, var12, true); // L: 5270
		}

	} // L: 5273
}
