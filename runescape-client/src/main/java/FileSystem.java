import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Hashtable;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("c")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("v")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("q")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "-127"
	)
	static float method3281(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var2 * var3 + var0[var4]; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLlb;I)C",
		garbageValue = "2136665955"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 82
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1243687493"
	)
	public static void method3282() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 117
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 118
	} // L: 119

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1055608683"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 572
		if (class162.garbageCollector == null || !class162.garbageCollector.isValid()) { // L: 573
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 575

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 576
					if (var2.isValid()) { // L: 578
						class162.garbageCollector = var2; // L: 579
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 580
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 581
					}
				}
			} catch (Throwable var11) { // L: 586
			}
		}

		if (class162.garbageCollector != null) { // L: 588
			long var9 = class115.method2692(); // L: 589
			long var3 = class162.garbageCollector.getCollectionTime(); // L: 590
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 591
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 592
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 593
				if (0L != var7) { // L: 594
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 596
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 597
		}

		return var0; // L: 599
	}
}
