import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class426 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1002546903
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1236852851
	)
	@Export("size")
	int size;
	@ObfuscatedName("i")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("b")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("n")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("s")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("l")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "950633701"
	)
	public static boolean method1079(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1315350901"
	)
	static void method1080() {
		Client.packetWriter.clearBuffer(); // L: 2726
		Client.packetWriter.packetBuffer.offset = 0; // L: 2727
		Client.packetWriter.serverPacket = null; // L: 2728
		Client.packetWriter.field1324 = null; // L: 2729
		Client.packetWriter.field1325 = null; // L: 2730
		Client.packetWriter.field1313 = null; // L: 2731
		Client.packetWriter.serverPacketLength = 0; // L: 2732
		Client.packetWriter.field1322 = 0; // L: 2733
		Client.rebootTimer = 0; // L: 2734
		Client.menuOptionsCount = 0; // L: 2736
		Client.isMenuOpen = false; // L: 2737
		Client.minimapState = 0; // L: 2739
		Client.destinationX = 0; // L: 2740

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2741
			Client.players[var0] = null;
		}

		GrandExchangeEvents.localPlayer = null; // L: 2742

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2743
			NPC var1 = Client.npcs[var0]; // L: 2744
			if (var1 != null) { // L: 2745
				var1.targetIndex = -1; // L: 2746
				var1.false0 = false; // L: 2747
			}
		}

		UserComparator10.method2622(); // L: 2750
		Decimator.updateGameState(30); // L: 2751

		for (var0 = 0; var0 < 100; ++var0) { // L: 2752
			Client.field715[var0] = true;
		}

		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 2755
		var2.packetBuffer.writeByte(Client.getWindowedMode()); // L: 2756
		var2.packetBuffer.writeShort(InvDefinition.canvasWidth); // L: 2757
		var2.packetBuffer.writeShort(class321.canvasHeight); // L: 2758
		Client.packetWriter.addNode(var2); // L: 2759
	} // L: 2761

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIILqi;Lki;I)V",
		garbageValue = "1940791589"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12312
		if (var6 > 4225 && var6 < 90000) { // L: 12313
			int var7 = Client.camAngleY & 2047; // L: 12314
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12315
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12316
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12317
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12318
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12319
			int var14 = var5.width / 2 - 25; // L: 12320
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12321
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12322
			byte var17 = 20; // L: 12323
			Canvas.redHintArrowSprite.method8105(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12324
		} else {
			drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12326
		}

	} // L: 12327

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIILqi;Lki;I)V",
		garbageValue = "812723929"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12330
			int var6 = Client.camAngleY & 2047; // L: 12331
			int var7 = var3 * var3 + var2 * var2; // L: 12332
			if (var7 <= 6400) { // L: 12333
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12334
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12335
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12336
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12337
				if (var7 > 2500) {
					var4.method8103(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12338
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12339
				}

			}
		}
	} // L: 12340
}
