import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class279 {
	@ObfuscatedName("ft")
	@Export("worldHost")
	static String worldHost;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;III)Loi;",
		garbageValue = "-1377827748"
	)
	static IndexedSprite method5080(AbstractArchive var0, int var1, int var2) {
		return !VertexNormal.method4477(var0, var1, var2) ? null : WorldMapAreaData.method3896();
	}
}
