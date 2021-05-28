import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -344685783
	)
	static int field629;

	ApproximateRouteStrategy() {
	} // L: 11604

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILfz;I)Z",
		garbageValue = "496202097"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11607
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "-26460885"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = UserComparator5.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = UserList.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1598600139"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class170.method3554(); // L: 10932
		ClientPacket.method4354(); // L: 10933
		int var1 = ClanSettings.VarpDefinition_get(var0).type; // L: 10934
		if (var1 != 0) { // L: 10935
			int var2 = Varps.Varps_main[var0]; // L: 10936
			if (var1 == 1) { // L: 10937
				if (var2 == 1) { // L: 10938
					InterfaceParent.method2082(0.9D);
				}

				if (var2 == 2) { // L: 10939
					InterfaceParent.method2082(0.8D);
				}

				if (var2 == 3) { // L: 10940
					InterfaceParent.method2082(0.7D);
				}

				if (var2 == 4) { // L: 10941
					InterfaceParent.method2082(0.6D);
				}
			}

			if (var1 == 3) { // L: 10943
				if (var2 == 0) { // L: 10944
					PacketWriter.method2402(255);
				}

				if (var2 == 1) { // L: 10945
					PacketWriter.method2402(192);
				}

				if (var2 == 2) { // L: 10946
					PacketWriter.method2402(128);
				}

				if (var2 == 3) { // L: 10947
					PacketWriter.method2402(64);
				}

				if (var2 == 4) { // L: 10948
					PacketWriter.method2402(0);
				}
			}

			if (var1 == 4) { // L: 10950
				if (var2 == 0) { // L: 10951
					WorldMapLabelSize.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 10952
					WorldMapLabelSize.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 10953
					WorldMapLabelSize.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 10954
					WorldMapLabelSize.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 10955
					WorldMapLabelSize.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) { // L: 10957
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) { // L: 10958
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 10959
				Client.field912 = var2;
			}

			if (var1 == 10) { // L: 10960
				if (var2 == 0) { // L: 10961
					LoginPacket.method4373(127);
				}

				if (var2 == 1) { // L: 10962
					LoginPacket.method4373(96);
				}

				if (var2 == 2) { // L: 10963
					LoginPacket.method4373(64);
				}

				if (var2 == 3) { // L: 10964
					LoginPacket.method4373(32);
				}

				if (var2 == 4) { // L: 10965
					LoginPacket.method4373(0);
				}
			}

			if (var1 == 17) { // L: 10967
				Client.followerIndex = var2 & 65535; // L: 10968
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 10970
				var3 = new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden}; // L: 10973
				Client.playerAttackOption = (AttackOption)Messages.findEnumerated(var3, var2); // L: 10975
				if (Client.playerAttackOption == null) { // L: 10976
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 10978
				if (var2 == -1) { // L: 10979
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 10980
				}
			}

			if (var1 == 22) { // L: 10982
				var3 = new AttackOption[]{AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden}; // L: 10985
				Client.npcAttackOption = (AttackOption)Messages.findEnumerated(var3, var2); // L: 10987
				if (Client.npcAttackOption == null) { // L: 10988
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 10990
}
