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
		this.field16 = var3;
		this.field17 = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field17;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)Lpl;",
		garbageValue = "516089190"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class147.method3009(var0, var1, var2) ? null : class124.method2754();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-760591386"
	)
	static final void method55(String var0) {
		PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1352378176"
	)
	static int method56(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "124"
	)
	static final void method50(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var14 * var11 - var7 * var13 >> 16;
			var12 = var7 * var14 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var10 * var14 + var12 * var13 >> 16;
			var12 = var14 * var12 - var10 * var13 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			class127.field1498 = var0 - var10;
			class117.field1433 = var1 - var11;
			class33.field243 = var2 - var12;
			class142.field1615 = var3;
			ApproximateRouteStrategy.field460 = var4;
		} else {
			UserComparator7.cameraX = var0 - var10;
			AbstractByteArrayCopier.cameraY = var1 - var11;
			UserComparator10.cameraZ = var2 - var12;
			UserComparator7.cameraPitch = var3;
			class379.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class7.oculusOrbFocalPointX >> 7 != class340.localPlayer.x >> 7 || Actor.oculusOrbFocalPointY >> 7 != class340.localPlayer.y >> 7)) {
			var13 = class340.localPlayer.plane;
			var14 = (class7.oculusOrbFocalPointX >> 7) + class131.baseX;
			var15 = (Actor.oculusOrbFocalPointY >> 7) + TileItem.baseY;
			BuddyRankComparator.method2547(var14, var15, var13, true);
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2023788755"
	)
	static final void method48(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2990()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2903, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + class116.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				var4.addNode(var5);
			}
		}
	}
}
