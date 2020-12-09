import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jt")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field3490(2, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field3491(0, 2);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1422973227
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2073239653
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "4"
	)
	static int method4729(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = GrandExchangeEvent.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class236.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = GrandExchangeEvents.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					VarcInt.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3] == 1;
					TaskHandler.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamDefinition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var5 = ChatChannel.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var5 = ChatChannel.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var5 = ChatChannel.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							VarcInt.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
							var5 = ChatChannel.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
