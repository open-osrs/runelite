import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 456557527
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2004161330"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-59"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-606284417"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class19.readStringIntParameters(var1, this.params); // L: 40
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1271027205"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer; // L: 57
			}
		}

		return var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2); // L: 63
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcf;",
		garbageValue = "15"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = MusicPatchNode.method4776(var1, var0); // L: 38
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 41
		Script var4;
		if (var5 != null) { // L: 42
			var4 = var5; // L: 43
		} else {
			String var6 = String.valueOf(var3); // L: 46
			int var7 = Varcs.archive12.getGroupId(var6); // L: 47
			if (var7 == -1) { // L: 48
				var4 = null; // L: 49
			} else {
				label58: {
					byte[] var8 = Varcs.archive12.takeFileFlat(var7); // L: 52
					if (var8 != null) { // L: 53
						if (var8.length <= 1) { // L: 54
							var4 = null; // L: 55
							break label58; // L: 56
						}

						var5 = NetSocket.newScript(var8); // L: 58
						if (var5 != null) { // L: 59
							Script.Script_cached.put(var5, (long)(var3 << 16)); // L: 60
							var4 = var5; // L: 61
							break label58; // L: 62
						}
					}

					var4 = null; // L: 65
				}
			}
		}

		if (var4 != null) { // L: 68
			return var4; // L: 69
		} else {
			var3 = VarbitComposition.method2935(var2, var0); // L: 71
			Script var11 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 74
			Script var12;
			if (var11 != null) { // L: 75
				var12 = var11; // L: 76
			} else {
				String var13 = String.valueOf(var3); // L: 79
				int var9 = Varcs.archive12.getGroupId(var13); // L: 80
				if (var9 == -1) { // L: 81
					var12 = null; // L: 82
				} else {
					byte[] var10 = Varcs.archive12.takeFileFlat(var9); // L: 85
					if (var10 != null) { // L: 86
						if (var10.length <= 1) { // L: 87
							var12 = null; // L: 88
							return var12 != null ? var12 : null; // L: 101 104
						}

						var11 = NetSocket.newScript(var10); // L: 91
						if (var11 != null) { // L: 92
							Script.Script_cached.put(var11, (long)(var3 << 16)); // L: 93
							var12 = var11; // L: 94
							return var12 != null ? var12 : null;
						}
					}

					var12 = null; // L: 98
				}
			}

			return var12 != null ? var12 : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-560000506"
	)
	static int method2972(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1390
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1391
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var3)); // L: 1392
			return 1; // L: 1393
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1395
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1402
				if (var3.dataText == null) { // L: 1403
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1404
				}

				return 1; // L: 1405
			} else {
				return 2; // L: 1407
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1396
			--var4; // L: 1397
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1398
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1399
			} else {
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1400
		}
	}
}
