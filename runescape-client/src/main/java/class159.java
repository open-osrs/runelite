import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class159 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljz;",
		garbageValue = "977172754"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Z",
		garbageValue = "2141791356"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10086
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10087
				int var2 = WorldMapSection0.method3036(var0, var1); // L: 10088
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10089
				if (var0.cs1Comparisons[var1] == 2) { // L: 10090
					if (var2 >= var3) { // L: 10091
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10093
					if (var2 <= var3) { // L: 10094
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10096
					if (var3 == var2) { // L: 10097
						return false;
					}
				} else if (var3 != var2) { // L: 10099
					return false;
				}
			}

			return true; // L: 10101
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144364574"
	)
	static final void method3121() {
		Client.field798 = Client.cycleCntr; // L: 11509
		WorldMapSection2.ClanChat_inClanChat = true; // L: 11510
	} // L: 11511
}
