import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ko")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static GameBuild field3456;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2093064869
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1621243431"
	)
	static int method5500(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class13.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + ByteArrayPool.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					long var13 = 86400000L * (11745L + (long)var10);
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class13.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class194.method3926(class144.compareStrings(Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1], ScriptFrame.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							IsaacCipher.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
							var11 = class1.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							IsaacCipher.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
							var11 = class1.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class13.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3 + (char)var9;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = AbstractWorldMapData.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapIcon_0.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = HealthBarDefinition.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class277.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							IsaacCipher.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class13.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class13.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
					if (class340.localPlayer.appearance != null && class340.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Z",
		garbageValue = "1540402679"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
