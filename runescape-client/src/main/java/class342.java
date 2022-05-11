import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class342 {
	@ObfuscatedName("o")
	static char[] field4158;
	@ObfuscatedName("q")
	static char[] field4161;
	@ObfuscatedName("l")
	static char[] field4160;
	@ObfuscatedName("k")
	static int[] field4159;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1886529381
	)
	static int field4162;

	static {
		field4158 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4158[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4158[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4158[var0] = (char)(var0 + 48 - 52);
		}

		field4158[62] = '+'; // L: 11
		field4158[63] = '/'; // L: 12
		field4161 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4161[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4161[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4161[var0] = (char)(var0 + 48 - 52);
		}

		field4161[62] = '*'; // L: 22
		field4161[63] = '-'; // L: 23
		field4160 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4160[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4160[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4160[var0] = (char)(var0 + 48 - 52);
		}

		field4160[62] = '-'; // L: 33
		field4160[63] = '_'; // L: 34
		field4159 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4159.length; ++var0) { // L: 41
			field4159[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4159[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4159[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4159[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4159; // L: 45
		field4159[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4159; // L: 48
		field4159[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "([Lki;II)V",
		garbageValue = "-1118405651"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11985
			Widget var3 = var0[var2]; // L: 11986
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class434.isComponentHidden(var3))) { // L: 11987 11988 11989
				int var5;
				if (var3.type == 0) { // L: 11990
					if (!var3.isIf3 && class434.isComponentHidden(var3) && var3 != class144.mousedOverWidgetIf1) { // L: 11991
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11992
					if (var3.children != null) { // L: 11993
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11994
					if (var4 != null) { // L: 11995
						var5 = var4.group; // L: 11996
						if (WorldMapDecoration.loadInterface(var5)) { // L: 11998
							drawModelComponents(NetSocket.Widget_interfaceComponents[var5], -1); // L: 11999
						}
					}
				}

				if (var3.type == 6) { // L: 12003
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12004
						boolean var7 = class401.runCs1(var3); // L: 12005
						if (var7) { // L: 12007
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12008
						}

						if (var5 != -1) { // L: 12009
							SequenceDefinition var6 = class114.SequenceDefinition_get(var5); // L: 12010

							for (var3.modelFrameCycle += Client.field727; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3)) { // L: 12011 12012 12019
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12013
								++var3.modelFrame; // L: 12014
								if (var3.modelFrame >= var6.frameIds.length) { // L: 12015
									var3.modelFrame -= var6.frameCount; // L: 12016
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12017
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3451 != 0 && !var3.isIf3) { // L: 12023
						int var8 = var3.field3451 >> 16; // L: 12024
						var5 = var3.field3451 << 16 >> 16; // L: 12025
						var8 *= Client.field727; // L: 12026
						var5 *= Client.field727; // L: 12027
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 12028
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12029
						GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var3); // L: 12030
					}
				}
			}
		}

	} // L: 12034
}
