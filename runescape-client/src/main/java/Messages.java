import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("h")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1894587741
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-826057575"
	)
	static void method2275(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 150
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 151
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 152
	} // L: 153

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-729014462"
	)
	static int method2283(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PlayerComposition.field2561 : VarcInt.field3264; // L: 1012
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1013
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.x; // L: 1014
			return 1; // L: 1015
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1017
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.y; // L: 1018
			return 1; // L: 1019
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1021
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.width; // L: 1022
			return 1; // L: 1023
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1025
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.height; // L: 1026
			return 1; // L: 1027
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1029
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1030
			return 1; // L: 1031
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1033
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.parentId; // L: 1034
			return 1; // L: 1035
		} else {
			return 2; // L: 1037
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "804061602"
	)
	static void method2285() {
		Login.loginIndex = 24; // L: 1517
		GameShell.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1518
	} // L: 1519
}
