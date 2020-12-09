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
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Lla;",
		garbageValue = "557069999"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "877971309"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1901639369"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class195.method3681();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var4 = class219.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					WorldMapSection1.method626(0.9D);
				}

				if (var2 == 2) {
					WorldMapSection1.method626(0.8D);
				}

				if (var2 == 3) {
					WorldMapSection1.method626(0.7D);
				}

				if (var2 == 4) {
					WorldMapSection1.method626(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					WorldMapEvent.method810(255);
				}

				if (var2 == 1) {
					WorldMapEvent.method810(192);
				}

				if (var2 == 2) {
					WorldMapEvent.method810(128);
				}

				if (var2 == 3) {
					WorldMapEvent.method810(64);
				}

				if (var2 == 4) {
					WorldMapEvent.method810(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					WorldMapCacheName.method662(127);
				}

				if (var2 == 1) {
					WorldMapCacheName.method662(96);
				}

				if (var2 == 2) {
					WorldMapCacheName.method662(64);
				}

				if (var2 == 3) {
					WorldMapCacheName.method662(32);
				}

				if (var2 == 4) {
					WorldMapCacheName.method662(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
				Client.field865 = var2;
			}

			if (var4 == 10) {
				if (var2 == 0) {
					class194.method3676(127);
				}

				if (var2 == 1) {
					class194.method3676(96);
				}

				if (var2 == 2) {
					class194.method3676(64);
				}

				if (var2 == 3) {
					class194.method3676(32);
				}

				if (var2 == 4) {
					class194.method3676(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable};
				Client.playerAttackOption = (AttackOption)UrlRequester.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable};
				Client.npcAttackOption = (AttackOption)UrlRequester.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
