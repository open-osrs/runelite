import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jj")
public class class273 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-9"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-2100883024"
	)
	static int method5332(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			IsaacCipher.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = ChatChannel.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						WorldMapArea.scriptDotWidget = var12;
					} else {
						Messages.scriptActiveWidget = var12;
					}

					SecureRandomCallable.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
				Widget var10 = ChatChannel.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				SecureRandomCallable.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
				var3.children = null;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--IsaacCipher.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							WorldMapArea.scriptDotWidget = var3;
						} else {
							Messages.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Widget var5 = class126.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						WorldMapArea.scriptDotWidget = var5;
					} else {
						Messages.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-11359"
	)
	public static void method5333(int var0) {
		if (var0 != -1) {
			if (Widget.Widget_loadedInterfaces[var0]) {
				CollisionMap.Widget_archive.clearFilesGroup(var0);
				if (MouseRecorder.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < MouseRecorder.Widget_interfaceComponents[var0].length; ++var2) {
						if (MouseRecorder.Widget_interfaceComponents[var0][var2] != null) {
							if (MouseRecorder.Widget_interfaceComponents[var0][var2].type != 2) {
								MouseRecorder.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						MouseRecorder.Widget_interfaceComponents[var0] = null;
					}

					Widget.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
