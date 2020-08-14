import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("TileItemPile")
public final class TileItemPile {
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 1773920485
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("al")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1785150485
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("second")
	Entity second;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1942211729
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 548225741
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1448931095
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("first")
	Entity first;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("third")
	Entity third;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 8936593533857120715L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1184518539
	)
	@Export("height")
	int height;

	TileItemPile() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;",
		garbageValue = "256"
	)
	public static String method2903(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = class296.method5464(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1884532154"
	)
	static final void method2904(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		ObjectSound.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZS)I",
		garbageValue = "1024"
	)
	static int method2902(int var0, Script var1, boolean var2) {
		String var3;
		int var4;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
			var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3 + var4;
			return 1;
		} else {
			String var9;
			if (var0 == ScriptOpcodes.APPEND) {
				WorldMapEvent.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3 + var9;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3 + class298.intToString(var4, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					long var11 = (11745L + (long)var10) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var11));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var16 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var16] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						WorldMapEvent.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = TileItem.method2259(FriendLoginUpdate.compareStrings(Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize + 1], UserComparator9.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var13;
						Font var14;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							UrlRequester.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var13 = GameBuild.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var14.lineCount(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							UrlRequester.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							var13 = GameBuild.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var14.lineWidth(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							WorldMapEvent.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var9;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3 + (char)var4;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = TileItem.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Varps.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = GameObject.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = class296.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							UrlRequester.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.substring(var4, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							StringBuilder var17 = new StringBuilder(var3.length());
							boolean var15 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var15 = true;
								} else if (var7 == '>') {
									var15 = false;
								} else if (!var15) {
									var17.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var17.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.indexOf(var4);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							WorldMapEvent.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.indexOf(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.UPPERCASE) {
							var3 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					WorldMapEvent.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize];
					var9 = Interpreter.Interpreter_stringStack[WorldMapEvent.Interpreter_stringStackSize + 1];
					if (class60.localPlayer.appearance != null && class60.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var9;
					} else {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-907670239"
	)
	static final void method2901() {
		Client.field787 = 0;
		int var0 = (class60.localPlayer.x >> 7) + class182.baseX;
		int var1 = (class60.localPlayer.y >> 7) + SecureRandomFuture.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field787 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field787 = 1;
		}

		if (Client.field787 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field787 = 0;
		}

	}
}
