import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class204 {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 326799997
	)
	static int foundItemIdCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("q")
	static int[][][] field2421;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Lir;",
		garbageValue = "57"
	)
	public static HealthBarDefinition method3780(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1; // L: 38
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcy;",
		garbageValue = "-39"
	)
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class13.method129(var1, var0); // L: 37
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 40
		Script var4;
		if (var5 != null) { // L: 41
			var4 = var5; // L: 42
		} else {
			String var6 = String.valueOf(var3); // L: 45
			int var7 = ApproximateRouteStrategy.archive12.getGroupId(var6); // L: 46
			if (var7 == -1) { // L: 47
				var4 = null; // L: 48
			} else {
				label59: {
					byte[] var8 = ApproximateRouteStrategy.archive12.takeFileFlat(var7); // L: 51
					if (var8 != null) { // L: 52
						if (var8.length <= 1) { // L: 53
							var4 = null; // L: 54
							break label59; // L: 55
						}

						var5 = UserComparator7.newScript(var8); // L: 57
						if (var5 != null) { // L: 58
							Script.Script_cached.put(var5, (long)(var3 << 16)); // L: 59
							var4 = var5; // L: 60
							break label59; // L: 61
						}
					}

					var4 = null; // L: 64
				}
			}
		}

		if (var4 != null) { // L: 67
			return var4; // L: 68
		} else {
			int var12 = (var2 + 40000 << 8) + var0; // L: 72
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16)); // L: 77
			Script var13;
			if (var14 != null) { // L: 78
				var13 = var14; // L: 79
			} else {
				String var9 = String.valueOf(var12); // L: 82
				int var10 = ApproximateRouteStrategy.archive12.getGroupId(var9); // L: 83
				if (var10 == -1) { // L: 84
					var13 = null; // L: 85
				} else {
					byte[] var11 = ApproximateRouteStrategy.archive12.takeFileFlat(var10); // L: 88
					if (var11 != null) { // L: 89
						if (var11.length <= 1) { // L: 90
							var13 = null; // L: 91
							return var13 != null ? var13 : null; // L: 104 107
						}

						var14 = UserComparator7.newScript(var11); // L: 94
						if (var14 != null) { // L: 95
							Script.Script_cached.put(var14, (long)(var12 << 16)); // L: 96
							var13 = var14; // L: 97
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 101
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2091339129"
	)
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 150
	}
}
