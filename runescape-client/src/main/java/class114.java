import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class114 {
	@ObfuscatedName("f")
	public static final float field1429;
	@ObfuscatedName("j")
	public static final float field1432;

	static {
		field1429 = Math.ulp(1.0F); // L: 10
		field1432 = 2.0F * field1429; // L: 11
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;ZLmt;I)V",
		garbageValue = "1005410507"
	)
	public static void method2636(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		UserComparator4.ItemDefinition_archive = var0; // L: 84
		ItemComposition.ItemDefinition_modelArchive = var1; // L: 85
		DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var2; // L: 86
		PacketBufferNode.ItemDefinition_fileCount = UserComparator4.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		ItemComposition.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-111"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 38
		boolean var3 = false; // L: 39
		int var4 = 0; // L: 40
		int var5 = var0.length(); // L: 41
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 71
				break;
			}

			label84: {
				char var7 = var0.charAt(var6); // L: 43
				if (var6 == 0) { // L: 44
					if (var7 == '-') { // L: 45
						var2 = true; // L: 46
						break label84;
					}

					if (var7 == '+') { // L: 49
						break label84;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 51
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 52
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 53
						var1 = false; // L: 55
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 58
					var1 = false; // L: 59
					break; // L: 60
				}

				if (var2) { // L: 62
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 63
				if (var4 != var8 / 10) { // L: 64
					var1 = false; // L: 65
					break; // L: 66
				}

				var4 = var8; // L: 68
				var3 = true; // L: 69
			}

			++var6; // L: 42
		}

		return var1; // L: 73
	}
}
