import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("q")
	public static short[] field1143;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "954576471"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "-1228863072"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5064(); // L: 55
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-391564902"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 188
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 189
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 190
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "2000"
	)
	static final void method2166(boolean var0) {
		UserComparator5.playPcmPlayers(); // L: 5154
		++Client.packetWriter.pendingWrites; // L: 5155
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5156
			Client.packetWriter.pendingWrites = 0; // L: 5157
			if (!Client.field712 && Client.packetWriter.getSocket() != null) { // L: 5158
				PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher); // L: 5160
				Client.packetWriter.addNode(var1); // L: 5161

				try {
					Client.packetWriter.flush(); // L: 5163
				} catch (IOException var3) { // L: 5165
					Client.field712 = true; // L: 5166
				}
			}

		}
	} // L: 5169

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lhz;II)I",
		garbageValue = "110664163"
	)
	static final int method2168(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10080
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10082
				int var3 = 0; // L: 10083
				int var4 = 0; // L: 10084
				byte var5 = 0; // L: 10085

				while (true) {
					int var6 = var2[var4++]; // L: 10087
					int var7 = 0; // L: 10088
					byte var8 = 0; // L: 10089
					if (var6 == 0) { // L: 10090
						return var3;
					}

					if (var6 == 1) { // L: 10091
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10092
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10093
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10094
						var9 = var2[var4++] << 16; // L: 10095
						var9 += var2[var4++]; // L: 10096
						var10 = class237.getWidget(var9); // L: 10097
						var11 = var2[var4++]; // L: 10098
						if (var11 != -1 && (!class281.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10099
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10100
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10101
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10105
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10106
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10107
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10108
						var7 = UserComparator9.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10109
						for (var9 = 0; var9 < 25; ++var9) { // L: 10110
							if (Skills.Skills_enabled[var9]) { // L: 10111
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10114
						var9 = var2[var4++] << 16; // L: 10115
						var9 += var2[var4++]; // L: 10116
						var10 = class237.getWidget(var9); // L: 10117
						var11 = var2[var4++]; // L: 10118
						if (var11 != -1 && (!class281.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10119
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10120
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10121
									var7 = 999999999; // L: 10122
									break; // L: 10123
								}
							}
						}
					}

					if (var6 == 11) { // L: 10128
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10129
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10130
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10131
						int var13 = var2[var4++]; // L: 10132
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10133
					}

					if (var6 == 14) { // L: 10135
						var9 = var2[var4++]; // L: 10136
						var7 = FontName.getVarbit(var9); // L: 10137
					}

					if (var6 == 15) { // L: 10139
						var8 = 1;
					}

					if (var6 == 16) { // L: 10140
						var8 = 2;
					}

					if (var6 == 17) { // L: 10141
						var8 = 3;
					}

					if (var6 == 18) { // L: 10142
						var7 = (UserComparator9.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX;
					}

					if (var6 == 19) { // L: 10143
						var7 = (UserComparator9.localPlayer.y >> 7) + NetCache.baseY;
					}

					if (var6 == 20) { // L: 10144
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10145
						if (var5 == 0) { // L: 10146
							var3 += var7;
						}

						if (var5 == 1) { // L: 10147
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10148
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10149
							var3 *= var7;
						}

						var5 = 0; // L: 10150
					} else {
						var5 = var8; // L: 10152
					}
				}
			} catch (Exception var14) { // L: 10155
				return -1; // L: 10156
			}
		} else {
			return -2;
		}
	}
}
