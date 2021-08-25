import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("is")
public class class247 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1496881371
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -130563317
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-90"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = WorldMapIcon_0.method3741(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "-78"
	)
	static int method4617(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class240.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class87.getWidget(var9);
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
						PacketWriter.scriptDotWidget = var12;
					} else {
						class9.scriptActiveWidget = var12;
					}

					Actor.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
				Widget var10 = class87.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				Actor.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
				var3.children = null;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				class240.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class240.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							PacketWriter.scriptDotWidget = var3;
						} else {
							class9.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class240.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Widget var5 = ParamComposition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						PacketWriter.scriptDotWidget = var5;
					} else {
						class9.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "93"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class16.logOut();
		switch(var0) {
		case 1:
			Message.method1113(24);
			PlatformInfo.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			Message.method1113(24);
			PlatformInfo.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
