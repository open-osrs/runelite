import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("do")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I",
		garbageValue = "-1157970116"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lfq;",
		garbageValue = "-2066827638"
	)
	public static Clock method2592() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-966652469"
	)
	static int method2595(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4547
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4551
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4555
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4559
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4563
							if (var0 != 7031 && var0 != 7032) { // L: 4567
								if (var0 == 7033) { // L: 4572
									--ChatChannel.Interpreter_stringStackSize; // L: 4573
									return 1; // L: 4574
								} else if (var0 != 7036 && var0 != 7037) { // L: 4576
									if (var0 == 7038) { // L: 4580
										--class295.Interpreter_intStackSize; // L: 4581
										return 1; // L: 4582
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4584
										return 2; // L: 4588
									} else {
										--class295.Interpreter_intStackSize; // L: 4585
										return 1; // L: 4586
									}
								} else {
									class295.Interpreter_intStackSize -= 2; // L: 4577
									return 1; // L: 4578
								}
							} else {
								--ChatChannel.Interpreter_stringStackSize; // L: 4568
								--class295.Interpreter_intStackSize; // L: 4569
								return 1; // L: 4570
							}
						} else {
							--class295.Interpreter_intStackSize; // L: 4564
							return 1; // L: 4565
						}
					} else {
						class295.Interpreter_intStackSize -= 2; // L: 4560
						return 1; // L: 4561
					}
				} else {
					class295.Interpreter_intStackSize -= 2; // L: 4556
					return 1; // L: 4557
				}
			} else {
				class295.Interpreter_intStackSize -= 3; // L: 4552
				return 1; // L: 4553
			}
		} else {
			class295.Interpreter_intStackSize -= 5; // L: 4548
			return 1; // L: 4549
		}
	}
}
