import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kr")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 782629149
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("f")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "32"
	)
	static int method5215(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Interpreter.Widget_unpackTargetMask(WorldMapRegion.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1769707986"
	)
	static void method5216(int var0) {
		class137.tempMenuAction = new MenuAction();
		class137.tempMenuAction.param0 = Client.menuArguments1[var0];
		class137.tempMenuAction.param1 = Client.menuArguments2[var0];
		class137.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class137.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class137.tempMenuAction.action = Client.menuActions[var0];
	}
}
