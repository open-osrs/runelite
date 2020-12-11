import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("cs")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("v")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("x")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("w")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1311924603
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1513216297
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1973345543
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1310900639
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lla;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 22

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Lla;",
		garbageValue = "557069999"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 153
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "877971309"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 221
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 225
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1901639369"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class195.method3681(); // L: 10684

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 10686
			if (var1.obj != null) { // L: 10687
				var1.set();
			}
		}

		int var4 = class219.VarpDefinition_get(var0).type; // L: 10690
		if (var4 != 0) { // L: 10691
			int var2 = Varps.Varps_main[var0]; // L: 10692
			if (var4 == 1) { // L: 10693
				if (var2 == 1) { // L: 10694
					WorldMapSection1.method626(0.9D);
				}

				if (var2 == 2) { // L: 10695
					WorldMapSection1.method626(0.8D);
				}

				if (var2 == 3) { // L: 10696
					WorldMapSection1.method626(0.7D);
				}

				if (var2 == 4) { // L: 10697
					WorldMapSection1.method626(0.6D);
				}
			}

			if (var4 == 3) { // L: 10699
				if (var2 == 0) { // L: 10700
					WorldMapEvent.method810(255);
				}

				if (var2 == 1) { // L: 10701
					WorldMapEvent.method810(192);
				}

				if (var2 == 2) { // L: 10702
					WorldMapEvent.method810(128);
				}

				if (var2 == 3) { // L: 10703
					WorldMapEvent.method810(64);
				}

				if (var2 == 4) { // L: 10704
					WorldMapEvent.method810(0);
				}
			}

			if (var4 == 4) { // L: 10706
				if (var2 == 0) { // L: 10707
					WorldMapCacheName.method662(127);
				}

				if (var2 == 1) { // L: 10708
					WorldMapCacheName.method662(96);
				}

				if (var2 == 2) { // L: 10709
					WorldMapCacheName.method662(64);
				}

				if (var2 == 3) { // L: 10710
					WorldMapCacheName.method662(32);
				}

				if (var2 == 4) { // L: 10711
					WorldMapCacheName.method662(0);
				}
			}

			if (var4 == 5) { // L: 10713
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) { // L: 10714
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 10715
				Client.field865 = var2;
			}

			if (var4 == 10) { // L: 10716
				if (var2 == 0) { // L: 10717
					class194.method3676(127);
				}

				if (var2 == 1) { // L: 10718
					class194.method3676(96);
				}

				if (var2 == 2) { // L: 10719
					class194.method3676(64);
				}

				if (var2 == 3) { // L: 10720
					class194.method3676(32);
				}

				if (var2 == 4) { // L: 10721
					class194.method3676(0);
				}
			}

			if (var4 == 17) { // L: 10723
				Client.followerIndex = var2 & 65535; // L: 10724
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 10726
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable}; // L: 10729
				Client.playerAttackOption = (AttackOption)UrlRequester.findEnumerated(var3, var2); // L: 10731
				if (Client.playerAttackOption == null) { // L: 10732
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 10734
				if (var2 == -1) { // L: 10735
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 10736
				}
			}

			if (var4 == 22) { // L: 10738
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable}; // L: 10741
				Client.npcAttackOption = (AttackOption)UrlRequester.findEnumerated(var3, var2); // L: 10743
				if (Client.npcAttackOption == null) { // L: 10744
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 10746
}
