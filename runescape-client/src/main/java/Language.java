import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("p")
	final String field2380;
	@ObfuscatedName("l")
	@Export("language")
	final String language;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1680963867
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2402, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2402, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2402, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2402, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2397, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2397, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2402, 6, "MX");
		Language[] var0 = method3708();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lge;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2380 = var1;
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
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "379304040"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgi;",
		garbageValue = "-1061791428"
	)
	static Language[] method3708() {
		return new Language[]{Language_PT, Language_NL, Language_ES, Language_DE, Language_EN, Language_FR, Language_ES_MX};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "-1"
	)
	public static Language method3701(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "684258970"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "59"
	)
	static int method3709(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				VarcInt.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class60.method942(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				VarcInt.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class8.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				VarcInt.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Frames.method3356(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = LoginScreenAnimation.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = GameObject.Client_plane;
					var4 = NetFileRequest.baseX * 64 + (PlayerAppearance.localPlayer.x >> 7);
					var5 = class41.baseY * 64 + (PlayerAppearance.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					VarcInt.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class60.method942(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					VarcInt.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class8.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					VarcInt.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Frames.method3356(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					VarcInt.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
