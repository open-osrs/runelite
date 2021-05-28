import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("o")
public class class12 extends class16 {
	@ObfuscatedName("p")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("v")
	String field125;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2090329987
	)
	int field117;
	@ObfuscatedName("f")
	byte field118;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field125 = null; // L: 54
	} // L: 58

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 61
			--var1.offset; // L: 62
			var1.readLong(); // L: 63
		}

		this.field125 = var1.readStringCp1252NullTerminatedOrNull(); // L: 65
		this.field117 = var1.readUnsignedShort(); // L: 66
		this.field118 = var1.readByte(); // L: 67
		var1.readLong(); // L: 68
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 72
		var2.name = this.field125; // L: 73
		var2.world = this.field117; // L: 74
		var2.rank = this.field118; // L: 75
		var1.addMember(var2); // L: 76
	} // L: 77

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbg;Lbg;IZI)I",
		garbageValue = "-333331035"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1640() ? (var1.method1640() ? 0 : 1) : (var1.method1640() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1638() ? (var1.method1638() ? 0 : 1) : (var1.method1638() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "101"
	)
	static int method173(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3463
			class44.Interpreter_intStackSize -= 2; // L: 3464
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3465
			int var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3466
			if (!Client.isCameraLocked) { // L: 3467
				Client.camAngleX = var3; // L: 3468
				Client.camAngleY = var4; // L: 3469
			}

			return 1; // L: 3471
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3473
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3474
			return 1; // L: 3475
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3477
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3478
			return 1; // L: 3479
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3481
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3482
			if (var3 < 0) { // L: 3483
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3484
			return 1; // L: 3485
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3487
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3488
			return 1; // L: 3489
		} else {
			return 2; // L: 3491
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1117
			if (Client.gameState == 0) { // L: 1118
				class23.client.method501();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1119
				Client.loginState = 0; // L: 1120
				Client.field673 = 0; // L: 1121
				Client.field845 = 0; // L: 1122
				Client.timer.method5591(var0); // L: 1123
				if (var0 != 20) { // L: 1124
					VarbitComposition.method2849(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field688 != null) { // L: 1126 1127
				Client.field688.close(); // L: 1128
				Client.field688 = null; // L: 1129
			}

			if (Client.gameState == 25) { // L: 1132
				Client.field698 = 0; // L: 1133
				Client.field694 = 0; // L: 1134
				Client.field695 = 1; // L: 1135
				Client.field696 = 0; // L: 1136
				Client.field697 = 1; // L: 1137
			}

			if (var0 != 5 && var0 != 10) { // L: 1139
				if (var0 == 20) { // L: 1142
					class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1143
				} else if (var0 == 11) { // L: 1145
					class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, false, 4); // L: 1146
				} else if (Login.clearLoginScreen) { // L: 1149
					class260.titleboxSprite = null; // L: 1150
					Login.titlebuttonSprite = null; // L: 1151
					Login.runesSprite = null; // L: 1152
					Login.leftTitleSprite = null; // L: 1153
					class20.rightTitleSprite = null; // L: 1154
					Fonts.logoSprite = null; // L: 1155
					Decimator.title_muteSprite = null; // L: 1156
					FriendSystem.options_buttons_0Sprite = null; // L: 1157
					GrandExchangeOffer.options_buttons_2Sprite = null; // L: 1158
					class337.worldSelectBackSprites = null; // L: 1159
					class25.worldSelectFlagSprites = null; // L: 1160
					HitSplatDefinition.worldSelectArrows = null; // L: 1161
					class18.worldSelectStars = null; // L: 1162
					class69.field597 = null; // L: 1163
					class24.loginScreenRunesAnimation.method2202(); // L: 1164
					class159.method3192(2); // L: 1165
					StudioGame.method4847(true); // L: 1166
					Login.clearLoginScreen = false; // L: 1167
				}
			} else {
				class179.method3634(SoundCache.archive10, GrandExchangeOfferAgeComparator.archive8, true, 0); // L: 1140
			}

			Client.gameState = var0; // L: 1169
		}
	} // L: 1170
}
