import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
public class class197 {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("n")
	static int[] field2375;

	static {
		new Object();
		field2375 = new int[33]; // L: 8
		field2375[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2375[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;B)V",
		garbageValue = "52"
	)
	public static void method3828(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1647502"
	)
	static int method3844(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 735
			var0 -= 1000; // L: 736
			var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 737
		} else {
			var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 739
		}

		IsaacCipher.invalidateWidget(var3); // L: 740
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 741
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 761
				var3.modelType = 2; // L: 762
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 766
				var3.modelType = 3; // L: 767
				var3.modelId = UserComparator9.localPlayer.appearance.getChatHeadId(); // L: 768
				return 1; // L: 769
			} else {
				return 2; // L: 771
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 742
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 743
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 744
			var3.itemId = var4; // L: 745
			var3.itemQuantity = var5; // L: 746
			ItemComposition var6 = class281.ItemDefinition_get(var4); // L: 747
			var3.modelAngleX = var6.xan2d; // L: 748
			var3.modelAngleY = var6.yan2d; // L: 749
			var3.modelAngleZ = var6.zan2d; // L: 750
			var3.modelOffsetX = var6.offsetX2d; // L: 751
			var3.modelOffsetY = var6.offsetY2d; // L: 752
			var3.modelZoom = var6.zoom2d; // L: 753
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 754
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 755
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 756
			}

			if (var3.field2648 > 0) { // L: 757
				var3.modelZoom = var3.modelZoom * 32 / var3.field2648;
			} else if (var3.rawWidth > 0) { // L: 758
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 759
		}
	}
}
