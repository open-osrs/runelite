import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class244 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1663390297
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lls;",
		garbageValue = "-2119409839"
	)
	public static PrivateChatMode method4812(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3885, PrivateChatMode.field3886, PrivateChatMode.field3881}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field3884) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CLkn;I)C",
		garbageValue = "-531451700"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)I",
		garbageValue = "-2095765890"
	)
	static int method4805(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 189
		int var2;
		if (var1 == 0) { // L: 191
			var2 = 0;
		} else if (var1 == 1) { // L: 192
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8); // L: 193
		} else {
			var2 = var0.readBits(11); // L: 194
		}

		return var2; // L: 195
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Ljava/lang/String;S)V",
		garbageValue = "128"
	)
	static void method4814(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1708
		Client.archiveLoaders.add(var2); // L: 1709
		Client.field898 += var2.groupCount; // L: 1710
	} // L: 1711
}
