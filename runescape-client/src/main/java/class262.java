import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class262 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("hi")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-92"
	)
	public static int method5001(int var0) {
		return class360.field4035[var0 & 16383];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-163228645"
	)
	public static int method5002(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1091946178"
	)
	static void method4999(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class321.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
