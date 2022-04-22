import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		longValue = -1968541600004373947L
	)
	static long field2388;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final WorldMapID field2383;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final WorldMapID field2387;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1523273113
	)
	static int field2386;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 171627445
	)
	@Export("value")
	final int value;

	static {
		field2383 = new WorldMapID(0); // L: 4
		field2387 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1;
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1758610928"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-670115477"
	)
	public static boolean method4360() {
		ReflectionCheck var0 = (ReflectionCheck)class54.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Llx;",
		garbageValue = "-70"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1972
		if (JagexCache.JagexCache_dat2File != null) { // L: 1973
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class115.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class182.masterDisk, var0, var1, var2, var3); // L: 1974
	}
}
