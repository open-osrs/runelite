import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lka;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("a")
	final String field3793;
	@ObfuscatedName("u")
	@Export("language")
	final String language;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1152037753
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3811, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3811, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3811, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3811, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3809, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3809, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3811, 6, "MX");
		Language[] var0 = new Language[]{Language_NL, Language_FR, Language_ES_MX, Language_EN, Language_ES, Language_DE, Language_PT};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lki;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3793 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "4"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1391914360"
	)
	static final int method5397(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "-6"
	)
	static int method5401(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ObjectComposition.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = GrandExchangeOfferWorldComparator.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = SequenceDefinition.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class393.World_worlds[var8].id) {
							var7 = class393.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class240.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3] == 1;
					AbstractWorldMapIcon.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class240.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var5 = WorldMapIcon_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ScriptEvent.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ScriptEvent.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class240.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var5 = WorldMapIcon_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = HitSplatDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = HitSplatDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class240.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var5 = WorldMapIcon_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class65.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class65.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class240.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var5 = WorldMapIcon_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = HorizontalAlignment.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = HorizontalAlignment.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--class240.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--class240.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.field487;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class393.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
