import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jz")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("o")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("q")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("l")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfc;",
		garbageValue = "-1123951030"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "73"
	)
	static int method5349(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 858
		Widget var4;
		if (var0 >= 2000) { // L: 860
			var0 -= 1000; // L: 861
			var4 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 862
			var3 = false; // L: 863
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 865
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 866
			var11 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] - 1; // L: 867
			if (var11 >= 0 && var11 <= 9) { // L: 868
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]); // L: 872
				return 1; // L: 873
			} else {
				--class9.Interpreter_stringStackSize; // L: 869
				return 1; // L: 870
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 875
				class12.Interpreter_intStackSize -= 2; // L: 876
				var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 877
				var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 878
				var4.parent = ApproximateRouteStrategy.getWidgetChild(var11, var6); // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 882
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 886
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 887
				return 1; // L: 888
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 890
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 891
				return 1; // L: 892
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 894
				var4.dataText = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 895
				return 1; // L: 896
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 898
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 899
				return 1; // L: 900
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 902
				var4.actions = null; // L: 903
				return 1; // L: 904
			} else if (var0 == 1308) { // L: 906
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1; // L: 907
				return 1; // L: 908
			} else if (var0 == 1309) { // L: 910
				--class12.Interpreter_intStackSize; // L: 911
				return 1; // L: 912
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 914
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 944
						class12.Interpreter_intStackSize -= 2; // L: 945
						var5 = 10; // L: 946
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]}; // L: 947
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]}; // L: 948
						class363.Widget_setKey(var4, var5, var8, var9); // L: 949
						return 1; // L: 950
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 952
						class12.Interpreter_intStackSize -= 3; // L: 953
						var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] - 1; // L: 954
						var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 955
						var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							class152.Widget_setKeyRate(var4, var11, var6, var7); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 963
						var5 = 10; // L: 964
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 965
						var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 966
						class152.Widget_setKeyRate(var4, var5, var6, var7); // L: 967
						return 1; // L: 968
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 970
						--class12.Interpreter_intStackSize; // L: 971
						var11 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] - 1; // L: 972
						if (var11 >= 0 && var11 <= 9) { // L: 973
							Script.Widget_setKeyIgnoreHeld(var4, var11); // L: 976
							return 1; // L: 977
						} else {
							throw new RuntimeException(); // L: 974
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 979
						var5 = 10; // L: 980
						Script.Widget_setKeyIgnoreHeld(var4, var5); // L: 981
						return 1; // L: 982
					} else {
						return 2; // L: 984
					}
				} else {
					byte[] var10 = null; // L: 915
					var8 = null; // L: 916
					if (var3) { // L: 917
						class12.Interpreter_intStackSize -= 10; // L: 918

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class12.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 920 921
						}

						if (var7 > 0) { // L: 923
							var10 = new byte[var7 / 2]; // L: 924
							var8 = new byte[var7 / 2]; // L: 925

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 926
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class12.Interpreter_intStackSize]; // L: 927
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class12.Interpreter_intStackSize + 1]; // L: 928
							}
						}
					} else {
						class12.Interpreter_intStackSize -= 2; // L: 933
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]}; // L: 934
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]}; // L: 935
					}

					var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] - 1; // L: 937
					if (var7 >= 0 && var7 <= 9) { // L: 938
						class363.Widget_setKey(var4, var7, var10, var8); // L: 941
						return 1; // L: 942
					} else {
						throw new RuntimeException(); // L: 939
					}
				}
			}
		}
	}
}
