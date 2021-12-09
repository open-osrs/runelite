import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eo")
public class class141 extends class126 {
	@ObfuscatedName("m")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 2275648101234972147L
	)
	long field1610;
	@ObfuscatedName("b")
	String field1607;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 65665449
	)
	int field1608;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class141(class129 var1) {
		this.this$0 = var1;
		this.field1610 = -1L; // L: 93
		this.field1607 = null; // L: 94
		this.field1608 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1610 = var1.readLong(); // L: 102
		}

		this.field1607 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1608 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2850(this.field1610, this.field1607, this.field1608); // L: 109
	} // L: 110

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1452138237"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1880227128"
	)
	static int method2950(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3579
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 3580
			var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3581
			int var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3582
			if (!Client.isCameraLocked) { // L: 3583
				Client.camAngleX = var3; // L: 3584
				Client.camAngleY = var4; // L: 3585
			}

			return 1; // L: 3587
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3589
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3590
			return 1; // L: 3591
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3593
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3594
			return 1; // L: 3595
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3597
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3598
			if (var3 < 0) { // L: 3599
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3600
			return 1; // L: 3601
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3603
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3604
			return 1; // L: 3605
		} else {
			return 2; // L: 3607
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "921441126"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12494
			PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2857, Client.packetWriter.isaacCipher); // L: 12496
			var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0)); // L: 12497
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12498
			Client.packetWriter.addNode(var1); // L: 12499
		}
	} // L: 12500
}
