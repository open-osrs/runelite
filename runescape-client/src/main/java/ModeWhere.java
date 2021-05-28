import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3686("", 0, new class286[]{class286.field3667}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3702("", 1, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3699("", 2, new class286[]{class286.field3668, class286.field3671, class286.field3667}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3698("", 3, new class286[]{class286.field3668}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3690("", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3687("", 5, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3692("", 6, new class286[]{class286.field3667}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3693("", 8, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3694("", 9, new class286[]{class286.field3668, class286.field3671}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3695("", 10, new class286[]{class286.field3668}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3696("", 11, new class286[]{class286.field3668}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3697("", 12, new class286[]{class286.field3668, class286.field3667}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	field3689("", 13, new class286[]{class286.field3668});

	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 448487515
	)
	@Export("id")
	final int id;
	@ObfuscatedName("e")
	final Set field3700;

	static {
		method5162(); // L: 28
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lky;)V"
	)
	ModeWhere(String var3, int var4, class286[] var5) {
		this.field3700 = new HashSet();
		this.id = var4; // L: 43
		class286[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class286 var8 = var6[var7]; // L: 47
			this.field3700.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field3700 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lmr;I)Lmr;",
		garbageValue = "-391561047"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = Player.method2128(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Lio;",
		garbageValue = "-594011323"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = Frames.getWidget(var0); // L: 198
		if (var1 == -1) { // L: 199
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 200 201
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkl;",
		garbageValue = "1537765097"
	)
	static ModeWhere[] method5162() {
		return new ModeWhere[]{field3702, field3695, field3697, field3686, field3699, field3696, field3692, field3687, field3698, field3694, field3690, field3693, field3689}; // L: 35
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lio;II)I",
		garbageValue = "411912150"
	)
	static final int method5160(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 9890
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 9892
				int var3 = 0; // L: 9893
				int var4 = 0; // L: 9894
				byte var5 = 0; // L: 9895

				while (true) {
					int var6 = var2[var4++]; // L: 9897
					int var7 = 0; // L: 9898
					byte var8 = 0; // L: 9899
					if (var6 == 0) { // L: 9900
						return var3;
					}

					if (var6 == 1) { // L: 9901
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 9902
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 9903
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 9904
						var9 = var2[var4++] << 16; // L: 9905
						var9 += var2[var4++]; // L: 9906
						var10 = Frames.getWidget(var9); // L: 9907
						var11 = var2[var4++]; // L: 9908
						if (var11 != -1 && (!class260.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9909
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9910
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9911
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 9915
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 9916
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 9917
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 9918
						var7 = class93.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 9919
						for (var9 = 0; var9 < 25; ++var9) { // L: 9920
							if (Skills.Skills_enabled[var9]) { // L: 9921
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 9924
						var9 = var2[var4++] << 16; // L: 9925
						var9 += var2[var4++]; // L: 9926
						var10 = Frames.getWidget(var9); // L: 9927
						var11 = var2[var4++]; // L: 9928
						if (var11 != -1 && (!class260.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 9929
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 9930
								if (var11 + 1 == var10.itemIds[var12]) { // L: 9931
									var7 = 999999999; // L: 9932
									break; // L: 9933
								}
							}
						}
					}

					if (var6 == 11) { // L: 9938
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 9939
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 9940
						var9 = Varps.Varps_main[var2[var4++]]; // L: 9941
						int var13 = var2[var4++]; // L: 9942
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 9943
					}

					if (var6 == 14) { // L: 9945
						var9 = var2[var4++]; // L: 9946
						var7 = Skeleton.getVarbit(var9); // L: 9947
					}

					if (var6 == 15) { // L: 9949
						var8 = 1;
					}

					if (var6 == 16) { // L: 9950
						var8 = 2;
					}

					if (var6 == 17) { // L: 9951
						var8 = 3;
					}

					if (var6 == 18) { // L: 9952
						var7 = (class93.localPlayer.x >> 7) + VertexNormal.baseX;
					}

					if (var6 == 19) { // L: 9953
						var7 = (class93.localPlayer.y >> 7) + SoundSystem.baseY;
					}

					if (var6 == 20) { // L: 9954
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 9955
						if (var5 == 0) { // L: 9956
							var3 += var7;
						}

						if (var5 == 1) { // L: 9957
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 9958
							var3 /= var7;
						}

						if (var5 == 3) { // L: 9959
							var3 *= var7;
						}

						var5 = 0; // L: 9960
					} else {
						var5 = var8; // L: 9962
					}
				}
			} catch (Exception var14) { // L: 9965
				return -1; // L: 9966
			}
		} else {
			return -2;
		}
	}
}
