import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class54 {
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("p")
	static byte[][][] field419;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1254980557"
	)
	public static int method1111(int var0) {
		return class138.method2827(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 60
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbf;",
		garbageValue = "108"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "-18"
	)
	static int method1101(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1185
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1186
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.itemId; // L: 1187
			return 1; // L: 1188
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1190
			if (var3.itemId != -1) { // L: 1191
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 1192
			}

			return 1; // L: 1193
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1195
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1196
			return 1; // L: 1197
		} else {
			return 2; // L: 1199
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "86"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4463
			if (class174.loadInterface(var0)) { // L: 4464
				Widget[] var1 = WorldMapSection1.Widget_interfaceComponents[var0]; // L: 4465

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4466
					Widget var3 = var1[var2]; // L: 4467
					if (var3.onLoad != null) { // L: 4468
						ScriptEvent var4 = new ScriptEvent(); // L: 4469
						var4.widget = var3; // L: 4470
						var4.args = var3.onLoad; // L: 4471
						SoundSystem.runScript(var4, 5000000, 0); // L: 4472
					}
				}

			}
		}
	} // L: 4475

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)Lng;",
		garbageValue = "-542542901"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class133.worldMap; // L: 648
	}
}
