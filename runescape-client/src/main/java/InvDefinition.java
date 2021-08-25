import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("g")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1551292247
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1211831239
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "31"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-649649990"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lbh;Lbh;IZIZI)I",
		garbageValue = "1607242229"
	)
	static int method2811(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ChatChannel.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = ChatChannel.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-824292844"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class67.method1877();
		MouseHandler.method609();
		int var1 = UserComparator7.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Varps.method4858(0.9D);
				}

				if (var2 == 2) {
					Varps.method4858(0.8D);
				}

				if (var2 == 3) {
					Varps.method4858(0.7D);
				}

				if (var2 == 4) {
					Varps.method4858(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					WorldMapIcon_1.method3406(255);
				}

				if (var2 == 1) {
					WorldMapIcon_1.method3406(192);
				}

				if (var2 == 2) {
					WorldMapIcon_1.method3406(128);
				}

				if (var2 == 3) {
					WorldMapIcon_1.method3406(64);
				}

				if (var2 == 4) {
					WorldMapIcon_1.method3406(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class17.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class17.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class17.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class17.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class17.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field609 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					WorldMapDecorationType.method5062(127);
				}

				if (var2 == 1) {
					WorldMapDecorationType.method5062(96);
				}

				if (var2 == 2) {
					WorldMapDecorationType.method5062(64);
				}

				if (var2 == 3) {
					WorldMapDecorationType.method5062(32);
				}

				if (var2 == 4) {
					WorldMapDecorationType.method5062(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)class260.findEnumerated(SoundCache.method789(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)class260.findEnumerated(SoundCache.method789(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
