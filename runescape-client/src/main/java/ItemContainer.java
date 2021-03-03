import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("v")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("d")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLgp;S)C",
		garbageValue = "-10976"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "752478045"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1033
			if (Client.gameState == 0) { // L: 1034
				class1.client.method1078();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1035
				Client.loginState = 0; // L: 1036
				Client.field696 = 0; // L: 1037
				Client.field786 = 0; // L: 1038
				Client.timer.method5211(var0); // L: 1039
				if (var0 != 20) { // L: 1040
					class23.method234(false);
				}
			}

			if (var0 != 20 && var0 != 40 && UserComparator6.field2008 != null) { // L: 1042 1043
				UserComparator6.field2008.close(); // L: 1044
				UserComparator6.field2008 = null; // L: 1045
			}

			if (Client.gameState == 25) { // L: 1048
				Client.field720 = 0; // L: 1049
				Client.field785 = 0; // L: 1050
				Client.field717 = 1; // L: 1051
				Client.field718 = 0; // L: 1052
				Client.field719 = 1; // L: 1053
			}

			if (var0 != 5 && var0 != 10) { // L: 1055
				if (var0 == 20) { // L: 1058
					class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1059
				} else if (var0 == 11) { // L: 1061
					class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, false, 4); // L: 1062
				} else {
					WorldMapLabel.method499(); // L: 1064
				}
			} else {
				class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, true, 0); // L: 1056
			}

			Client.gameState = var0; // L: 1065
		}
	} // L: 1066
}
