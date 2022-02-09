import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("o")
	static final int[] field1929;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1004826275
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 593245031
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1032069569
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1929 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1929[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "2022529608"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "119027723"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			this.baseVar = var1.readUnsignedShort(); // L: 39
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Loo;",
		garbageValue = "-1196339506"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(UrlRequest.cacheDir, "preferences" + var0 + ".dat"); // L: 280
		if (var3.exists()) { // L: 281
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 283
				return var10; // L: 284
			} catch (IOException var9) { // L: 286
			}
		}

		String var4 = ""; // L: 288
		if (WorldMapSectionType.cacheGamebuild == 33) { // L: 289
			var4 = "_rc";
		} else if (WorldMapSectionType.cacheGamebuild == 34) { // L: 290
			var4 = "_wip";
		}

		File var5 = new File(TileItem.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 291
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 292
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 294
				return var6; // L: 295
			} catch (IOException var8) { // L: 297
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 300
			return var6; // L: 301
		} catch (IOException var7) { // L: 303
			throw new RuntimeException(); // L: 304
		}
	}
}
