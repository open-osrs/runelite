import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class69 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static IndexedSprite field597;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1125497563
	)
	static int field596;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lgd;",
		garbageValue = "-910296846"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 184
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 185
			boolean var5 = true; // L: 187
			int[] var6 = var3.getGroupFileIds(var0); // L: 188

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 189
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 190
				if (var8 == null) { // L: 191
					var5 = false; // L: 192
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 195
					byte[] var10 = var4.getFile(var9, 0); // L: 198
					if (var10 == null) { // L: 199
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 201
				var2 = null; // L: 202
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 206
				} catch (Exception var12) { // L: 208
					var2 = null; // L: 209
				}
			}

			if (var2 != null) { // L: 213
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 214
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "1981003125"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3420
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3421
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3422
				if (var3 == null) { // L: 3423
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3424
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3425
				if (var3.contains(var4, var5)) { // L: 3426
					var4 -= var3.width / 2; // L: 3427
					var5 -= var3.height / 2; // L: 3428
					int var6 = Client.camAngleY & 2047; // L: 3429
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3430
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3431
					int var9 = var8 * var4 + var5 * var7 >> 11; // L: 3432
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3433
					int var11 = var9 + class93.localPlayer.x >> 7; // L: 3434
					int var12 = class93.localPlayer.y - var10 >> 7; // L: 3435
					PacketBufferNode var13 = class21.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher); // L: 3437
					var13.packetBuffer.writeByte(18); // L: 3438
					var13.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3439
					var13.packetBuffer.writeShort(var12 + SoundSystem.baseY); // L: 3440
					var13.packetBuffer.writeShort(var11 + VertexNormal.baseX); // L: 3441
					var13.packetBuffer.writeByte(var4); // L: 3442
					var13.packetBuffer.writeByte(var5); // L: 3443
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3444
					var13.packetBuffer.writeByte(57); // L: 3445
					var13.packetBuffer.writeByte(0); // L: 3446
					var13.packetBuffer.writeByte(0); // L: 3447
					var13.packetBuffer.writeByte(89); // L: 3448
					var13.packetBuffer.writeShort(class93.localPlayer.x); // L: 3449
					var13.packetBuffer.writeShort(class93.localPlayer.y); // L: 3450
					var13.packetBuffer.writeByte(63); // L: 3451
					Client.packetWriter.addNode(var13); // L: 3452
					Client.destinationX = var11; // L: 3453
					Client.destinationY = var12; // L: 3454
				}
			}

		}
	} // L: 3457
}
