import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("o")
	String field959;
	@ObfuscatedName("h")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("g")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("l")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 138857027
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 736868675
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -674733225
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1049907835
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lpq;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)[Lpq;",
		garbageValue = "-256970075"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 151
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "762866023"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3394
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3395
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3396
				if (var3 == null) { // L: 3397
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3398
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3399
				if (var3.contains(var4, var5)) { // L: 3400
					var4 -= var3.width / 2; // L: 3401
					var5 -= var3.height / 2; // L: 3402
					int var6 = Client.camAngleY & 2047; // L: 3403
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3404
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3405
					int var9 = var4 * var8 + var7 * var5 >> 11; // L: 3406
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 3407
					int var11 = var9 + class19.localPlayer.x >> 7; // L: 3408
					int var12 = class19.localPlayer.y - var10 >> 7; // L: 3409
					PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 3411
					var13.packetBuffer.writeByte(18); // L: 3412
					var13.packetBuffer.method7795(var11 + ApproximateRouteStrategy.baseX); // L: 3413
					var13.packetBuffer.writeShort(var12 + class250.baseY); // L: 3414
					var13.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3415
					var13.packetBuffer.writeByte(var4); // L: 3416
					var13.packetBuffer.writeByte(var5); // L: 3417
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3418
					var13.packetBuffer.writeByte(57); // L: 3419
					var13.packetBuffer.writeByte(0); // L: 3420
					var13.packetBuffer.writeByte(0); // L: 3421
					var13.packetBuffer.writeByte(89); // L: 3422
					var13.packetBuffer.writeShort(class19.localPlayer.x); // L: 3423
					var13.packetBuffer.writeShort(class19.localPlayer.y); // L: 3424
					var13.packetBuffer.writeByte(63); // L: 3425
					Client.packetWriter.addNode(var13); // L: 3426
					Client.destinationX = var11; // L: 3427
					Client.destinationY = var12; // L: 3428
				}
			}

		}
	} // L: 3431
}
