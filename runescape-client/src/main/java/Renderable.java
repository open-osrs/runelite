import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -942600749
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("ci")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-2056798771"
	)
	public static byte[] method4079(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? SequenceDefinition.method3087(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldj;",
		garbageValue = "74672048"
	)
	static AttackOption[] method4080() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden}; // L: 11795
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1751967768"
	)
	static int method4078(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4217
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4221
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4225
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4229
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4233
							if (var0 != 7031 && var0 != 7032) { // L: 4237
								if (var0 == 7033) { // L: 4242
									--class13.Interpreter_stringStackSize; // L: 4243
									return 1; // L: 4244
								} else if (var0 != 7036 && var0 != 7037) { // L: 4246
									if (var0 == 7038) { // L: 4250
										--WorldMapCacheName.Interpreter_intStackSize; // L: 4251
										return 1; // L: 4252
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4254
										return 2; // L: 4258
									} else {
										--WorldMapCacheName.Interpreter_intStackSize; // L: 4255
										return 1; // L: 4256
									}
								} else {
									WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4247
									return 1; // L: 4248
								}
							} else {
								--class13.Interpreter_stringStackSize; // L: 4238
								--WorldMapCacheName.Interpreter_intStackSize; // L: 4239
								return 1; // L: 4240
							}
						} else {
							--WorldMapCacheName.Interpreter_intStackSize; // L: 4234
							return 1; // L: 4235
						}
					} else {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4230
						return 1; // L: 4231
					}
				} else {
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4226
					return 1; // L: 4227
				}
			} else {
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 4222
				return 1; // L: 4223
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 5; // L: 4218
			return 1; // L: 4219
		}
	}
}
