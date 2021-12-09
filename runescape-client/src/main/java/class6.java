import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
public enum class6 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	field15(0, 0);

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1871029833
	)
	final int field16;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1895798535
	)
	final int field17;

	class6(int var3, int var4) {
		this.field16 = var3; // L: 16
		this.field17 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field17; // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)Lpl;",
		garbageValue = "516089190"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class147.method3009(var0, var1, var2) ? null : class124.method2754(); // L: 42 43
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-760591386"
	)
	static final void method55(String var0) {
		PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher); // L: 183
		var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0)); // L: 184
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 185
		Client.packetWriter.addNode(var1); // L: 186
	} // L: 187

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1352378176"
	)
	static int method56(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 1182
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1183
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.itemId; // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1187
			if (var3.itemId != -1) { // L: 1188
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1189
			}

			return 1; // L: 1190
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1192
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1193
			return 1; // L: 1194
		} else {
			return 2; // L: 1196
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "124"
	)
	static final void method50(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 6094
		if (var8 < 0) { // L: 6095
			var8 = 0;
		} else if (var8 > 100) { // L: 6096
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 6097
		int var7 = var5 * var9 / 256; // L: 6098
		var8 = 2048 - var3 & 2047; // L: 6101
		var9 = 2048 - var4 & 2047; // L: 6102
		int var10 = 0; // L: 6103
		int var11 = 0; // L: 6104
		int var12 = var7; // L: 6105
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 6106
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 6107
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 6108
			var15 = var14 * var11 - var7 * var13 >> 16; // L: 6109
			var12 = var7 * var14 + var13 * var11 >> 16; // L: 6110
			var11 = var15; // L: 6111
		}

		if (var9 != 0) { // L: 6113
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 6114
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 6115
			var15 = var10 * var14 + var12 * var13 >> 16; // L: 6116
			var12 = var14 * var12 - var10 * var13 >> 16; // L: 6117
			var10 = var15; // L: 6118
		}

		if (Client.isCameraLocked) { // L: 6120
			class127.field1498 = var0 - var10; // L: 6121
			class117.field1433 = var1 - var11; // L: 6122
			class33.field243 = var2 - var12; // L: 6123
			class142.field1615 = var3; // L: 6124
			ApproximateRouteStrategy.field460 = var4; // L: 6125
		} else {
			UserComparator7.cameraX = var0 - var10; // L: 6128
			AbstractByteArrayCopier.cameraY = var1 - var11; // L: 6129
			UserComparator10.cameraZ = var2 - var12; // L: 6130
			UserComparator7.cameraPitch = var3; // L: 6131
			class379.cameraYaw = var4; // L: 6132
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class7.oculusOrbFocalPointX >> 7 != class340.localPlayer.x >> 7 || Actor.oculusOrbFocalPointY >> 7 != class340.localPlayer.y >> 7)) { // L: 6134 6135
			var13 = class340.localPlayer.plane; // L: 6136
			var14 = (class7.oculusOrbFocalPointX >> 7) + class131.baseX; // L: 6137
			var15 = (Actor.oculusOrbFocalPointY >> 7) + TileItem.baseY; // L: 6138
			BuddyRankComparator.method2547(var14, var15, var13, true); // L: 6139
		}

	} // L: 6142

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2023788755"
	)
	static final void method48(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12539
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2990()) { // L: 12540
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12541
				PacketWriter var4 = Client.packetWriter; // L: 12542
				PacketBufferNode var5 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2903, var4.isaacCipher); // L: 12543
				var5.packetBuffer.writeByte(4 + class116.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12544
				var5.packetBuffer.writeByte(var0); // L: 12545
				var5.packetBuffer.writeShort(var1); // L: 12546
				var5.packetBuffer.writeBoolean(var2); // L: 12547
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12548
				var4.addNode(var5); // L: 12549
			}
		}
	} // L: 12550
}
