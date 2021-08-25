import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static Bounds field2125;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 944556803
	)
	@Export("type")
	final int type;
	@ObfuscatedName("g")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgu;",
		garbageValue = "0"
	)
	static WorldMapSectionType[] method3770() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1892784316"
	)
	static int method3769(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--Interpreter.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--class240.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--class240.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class240.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--Interpreter.Interpreter_stringStackSize;
								--class240.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class240.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class240.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class240.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class240.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class240.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
