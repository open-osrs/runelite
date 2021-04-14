import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
public class class6 extends class14 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1971024859
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -394718965
	)
	int field49;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1266108419
	)
	int field46;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field49 = var1.readInt(); // L: 274
		this.field46 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method178(this.field49, this.field46); // L: 279
	} // L: 280

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V",
		garbageValue = "620748591"
	)
	public static void method97(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lgy;",
		garbageValue = "629458679"
	)
	public static PacketBufferNode method98() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 44
			var0 = new PacketBufferNode(); // L: 45
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 48
		}

		var0.clientPacket = null; // L: 51
		var0.clientPacketLength = 0; // L: 52
		var0.packetBuffer = new PacketBuffer(5000); // L: 53
		return var0; // L: 54
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "1"
	)
	static int method96(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3445
			Client.logoutTimer = 250; // L: 3446
			return 1; // L: 3447
		} else if (var0 != 5631 && var0 != 5633) { // L: 3449
			if (var0 == 5632) { // L: 3453
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 26; // L: 3454
				return 1; // L: 3455
			} else {
				return 2; // L: 3457
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2; // L: 3450
			return 1; // L: 3451
		}
	}
}
