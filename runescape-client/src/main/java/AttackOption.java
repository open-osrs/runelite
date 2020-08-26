import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1798928251
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 10929
	} // L: 10930

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 10933
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "-1998919890"
	)
	static Sprite method2155() {
		Sprite var0 = new Sprite(); // L: 199
		var0.width = class335.SpriteBuffer_spriteWidth; // L: 200
		var0.height = class335.SpriteBuffer_spriteHeight; // L: 201
		var0.xOffset = Username.SpriteBuffer_xOffsets[0]; // L: 202
		var0.yOffset = class335.SpriteBuffer_yOffsets[0]; // L: 203
		var0.subWidth = class335.SpriteBuffer_spriteWidths[0]; // L: 204
		var0.subHeight = class335.SpriteBuffer_spriteHeights[0]; // L: 205
		int var1 = var0.subWidth * var0.subHeight; // L: 206
		byte[] var2 = class92.SpriteBuffer_pixels[0]; // L: 207
		var0.pixels = new int[var1]; // L: 208

		for (int var3 = 0; var3 < var1; ++var3) { // L: 209
			var0.pixels[var3] = TaskHandler.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		Username.SpriteBuffer_xOffsets = null; // L: 211
		class335.SpriteBuffer_yOffsets = null; // L: 212
		class335.SpriteBuffer_spriteWidths = null; // L: 213
		class335.SpriteBuffer_spriteHeights = null; // L: 214
		TaskHandler.SpriteBuffer_spritePalette = null; // L: 215
		class92.SpriteBuffer_pixels = null; // L: 216
		return var0; // L: 218
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "1687533627"
	)
	static int method2152(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12; // L: 1010
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1011
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1012
			return 1; // L: 1013
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1015
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1016
			return 1; // L: 1017
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1019
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1020
			return 1; // L: 1021
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1023
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1024
			return 1; // L: 1025
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1027
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1028
			return 1; // L: 1029
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1031
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1032
			return 1; // L: 1033
		} else {
			return 2; // L: 1035
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1971905807"
	)
	static final void method2154(boolean var0) {
		RouteStrategy.playPcmPlayers(); // L: 5164
		++Client.packetWriter.pendingWrites; // L: 5165
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5166
			Client.packetWriter.pendingWrites = 0; // L: 5167
			if (!Client.field713 && Client.packetWriter.getSocket() != null) { // L: 5168
				PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher); // L: 5170
				Client.packetWriter.addNode(var1); // L: 5171

				try {
					Client.packetWriter.flush(); // L: 5173
				} catch (IOException var3) { // L: 5175
					Client.field713 = true; // L: 5176
				}
			}

		}
	} // L: 5179
}
