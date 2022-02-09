import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2793;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2790;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2791;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final WorldMapCacheName field2792;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final WorldMapCacheName field2795;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;

	static {
		field2793 = new WorldMapCacheName("details"); // L: 4
		field2790 = new WorldMapCacheName("compositemap"); // L: 5
		field2791 = new WorldMapCacheName("compositetexture"); // L: 6
		field2792 = new WorldMapCacheName("area"); // L: 7
		field2795 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-128254341"
	)
	static int method4829(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field850 - 7.0D) * 256.0D); // L: 3638
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1334324157"
	)
	static int method4830(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4344
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4348
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4352
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4356
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4360
							if (var0 != 7031 && var0 != 7032) { // L: 4364
								if (var0 == 7033) { // L: 4369
									--BufferedNetSocket.Interpreter_stringStackSize; // L: 4370
									return 1; // L: 4371
								} else if (var0 != 7036 && var0 != 7037) { // L: 4373
									if (var0 == 7038) { // L: 4377
										--Interpreter.Interpreter_intStackSize; // L: 4378
										return 1; // L: 4379
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4381
										return 2; // L: 4385
									} else {
										--Interpreter.Interpreter_intStackSize; // L: 4382
										return 1; // L: 4383
									}
								} else {
									Interpreter.Interpreter_intStackSize -= 2; // L: 4374
									return 1; // L: 4375
								}
							} else {
								--BufferedNetSocket.Interpreter_stringStackSize; // L: 4365
								--Interpreter.Interpreter_intStackSize; // L: 4366
								return 1; // L: 4367
							}
						} else {
							--Interpreter.Interpreter_intStackSize; // L: 4361
							return 1; // L: 4362
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 4357
						return 1; // L: 4358
					}
				} else {
					Interpreter.Interpreter_intStackSize -= 2; // L: 4353
					return 1; // L: 4354
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 3; // L: 4349
				return 1; // L: 4350
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 5; // L: 4345
			return 1; // L: 4346
		}
	}
}
