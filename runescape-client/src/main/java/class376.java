import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public abstract class class376 extends class242 implements class427 {
	@ObfuscatedSignature(
		descriptor = "(Lkr;Llu;I)V"
	)
	protected class376(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lnu;",
		garbageValue = "-1605592337"
	)
	protected abstract class378 vmethod7211(int var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	public int method6782() {
		return super.field2806; // L: 19
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1833568936"
	)
	public Object vmethod7649(int var1) {
		class378 var2 = this.vmethod7211(var1); // L: 24
		return var2 != null && var2.method6799() ? var2.method6800() : null; // L: 25 26
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Lpo;",
		garbageValue = "1706426985"
	)
	public class428 method6784(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class378 var3 = this.vmethod7211(var2); // L: 31
		class428 var4 = new class428(var2); // L: 32
		Class var5 = var3.field4270.field4492; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4575 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4575 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4575 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class423.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class423 var6 = (class423)var5.newInstance(); // L: 39
				var6.method7625(var1); // L: 40
				var4.field4575 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IB)I",
		garbageValue = "7"
	)
	static final int method6791(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10440
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10442
				int var3 = 0; // L: 10443
				int var4 = 0; // L: 10444
				byte var5 = 0; // L: 10445

				while (true) {
					int var6 = var2[var4++]; // L: 10447
					int var7 = 0; // L: 10448
					byte var8 = 0; // L: 10449
					if (var6 == 0) { // L: 10450
						return var3;
					}

					if (var6 == 1) { // L: 10451
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10452
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10453
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10454
						var9 = var2[var4++] << 16; // L: 10455
						var9 += var2[var4++]; // L: 10456
						var10 = class130.getWidget(var9); // L: 10457
						var11 = var2[var4++]; // L: 10458
						if (var11 != -1 && (!Client.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10459
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10460
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10461
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10465
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10466
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10467
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10468
						var7 = WorldMapSprite.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10469
						for (var9 = 0; var9 < 25; ++var9) { // L: 10470
							if (Skills.Skills_enabled[var9]) { // L: 10471
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10474
						var9 = var2[var4++] << 16; // L: 10475
						var9 += var2[var4++]; // L: 10476
						var10 = class130.getWidget(var9); // L: 10477
						var11 = var2[var4++]; // L: 10478
						if (var11 != -1 && (!Client.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10479
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10480
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10481
									var7 = 999999999; // L: 10482
									break; // L: 10483
								}
							}
						}
					}

					if (var6 == 11) { // L: 10488
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10489
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10490
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10491
						int var13 = var2[var4++]; // L: 10492
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10493
					}

					if (var6 == 14) { // L: 10495
						var9 = var2[var4++]; // L: 10496
						var7 = class375.getVarbit(var9); // L: 10497
					}

					if (var6 == 15) { // L: 10499
						var8 = 1;
					}

					if (var6 == 16) { // L: 10500
						var8 = 2;
					}

					if (var6 == 17) { // L: 10501
						var8 = 3;
					}

					if (var6 == 18) { // L: 10502
						var7 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX;
					}

					if (var6 == 19) { // L: 10503
						var7 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY;
					}

					if (var6 == 20) { // L: 10504
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10505
						if (var5 == 0) { // L: 10506
							var3 += var7;
						}

						if (var5 == 1) { // L: 10507
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10508
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10509
							var3 *= var7;
						}

						var5 = 0; // L: 10510
					} else {
						var5 = var8; // L: 10512
					}
				}
			} catch (Exception var14) { // L: 10515
				return -1; // L: 10516
			}
		} else {
			return -2;
		}
	}
}
