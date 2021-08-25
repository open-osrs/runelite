import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kf")
public class class295 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "-115"
	)
	static int method5305(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	static void method5306() {
		Client.packetWriter.addNode(FriendSystem.getPacketBufferNode(ClientPacket.field2684, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
