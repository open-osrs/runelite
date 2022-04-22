import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lo")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("l")
	final String field4047;
	@ObfuscatedName("q")
	@Export("language")
	final String language;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1865036015
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4069, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4069, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4069, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4069, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4065, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4065, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4069, 6, "MX"); // L: 16
		Language[] var0 = new Language[]{Language_ES_MX, Language_FR, Language_ES, Language_NL, Language_EN, Language_PT, Language_DE}; // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 28
		Language[] var2 = var0; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			Language var4 = var2[var3]; // L: 32
			if (Language_valuesOrdered[var4.id] != null) { // L: 34
				throw new IllegalStateException(); // L: 35
			}

			Language_valuesOrdered[var4.id] = var4; // L: 37
		}

	} // L: 41

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llv;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4047 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 60
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1969590033"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 56
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 69
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llx;IIIBZI)V",
		garbageValue = "-1446748586"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 42
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 43
		if (var8 == null) { // L: 44
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 45
			if (var8 == null) { // L: 46
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 47
				if (var8 != null) { // L: 48
					if (var5) { // L: 49
						var8.removeDual(); // L: 50
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 51
						--NetCache.NetCache_pendingWritesCount; // L: 52
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 53
					}

				} else {
					if (!var5) { // L: 57
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 58
						if (var8 != null) { // L: 59
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 61
					var8.archive = var0; // L: 62
					var8.crc = var3; // L: 63
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 66
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 67
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 70
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 71
						++NetCache.NetCache_pendingWritesCount; // L: 72
					}

				}
			}
		}
	} // L: 55 74

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Llo;",
		garbageValue = "-24"
	)
	public static Language method6077(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 64 65
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "532413421"
	)
	static int method6079(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1031
			var0 -= 1000; // L: 1032
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1033
		} else {
			var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1035
		}

		String var4 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1036
		int[] var5 = null; // L: 1037
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1038
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1039
			if (var6 > 0) { // L: 1040
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1041 1042
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1044
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1046

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1047
			if (var4.charAt(var7 - 1) == 's') { // L: 1048
				var8[var7] = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1049
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1051
		if (var7 != -1) { // L: 1052
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1053
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1055
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1056
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1057
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1058
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1059
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1060
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1061
			var3.onVarTransmit = var8; // L: 1062
			var3.varTransmitTriggers = var5; // L: 1063
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1065
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1066
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1067
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1068
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1069
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1070
			var3.onInvTransmit = var8; // L: 1071
			var3.invTransmitTriggers = var5; // L: 1072
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1074
			var3.onStatTransmit = var8; // L: 1075
			var3.statTransmitTriggers = var5; // L: 1076
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1078
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1079
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1080
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1081
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1082
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1083
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1084
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1085
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1086
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1087
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1088
			var3.field3432 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1089
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1090
			var3.field3454 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1091
			var3.field3455 = var8;
		} else if (var0 == 1430) { // L: 1092
			var3.field3416 = var8;
		} else if (var0 == 1431) { // L: 1093
			var3.field3451 = var8;
		} else {
			if (var0 != 1434) { // L: 1094
				return 2; // L: 1095
			}

			var3.field3462 = var8;
		}

		var3.hasListener = true; // L: 1096
		return 1; // L: 1097
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-866525828"
	)
	static int method6091(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3789
			Interpreter.Interpreter_intStackSize -= 2; // L: 3790
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3791
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3792
			if (!Client.isCameraLocked) { // L: 3793
				Client.camAngleX = var3; // L: 3794
				Client.camAngleY = var4; // L: 3795
			}

			return 1; // L: 3797
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3799
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3800
			return 1; // L: 3801
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3803
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3804
			return 1; // L: 3805
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3807
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3808
			if (var3 < 0) { // L: 3809
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3810
			return 1; // L: 3811
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3813
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3814
			return 1; // L: 3815
		} else {
			return 2; // L: 3817
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;IIII)V",
		garbageValue = "-478908474"
	)
	static void method6087(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class131.clientPreferences.method2270() != 0) { // L: 3553
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3554
				int var4 = var0.soundEffects[var1]; // L: 3555
				if (var4 != 0) { // L: 3559
					int var7 = var4 >> 8; // L: 3560
					int var8 = var4 >> 4 & 7; // L: 3561
					int var9 = var4 & 15; // L: 3562
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3563
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3564
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3565
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3566
					int var10 = (var2 - 64) / 128; // L: 3567
					int var11 = (var3 - 64) / 128; // L: 3568
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3569
					++Client.soundEffectCount; // L: 3570
				}

			}
		}
	} // L: 3572

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-695139684"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class155.loadInterface(var0)) { // L: 11183
			VarpDefinition.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11184
		}
	} // L: 11185
}
