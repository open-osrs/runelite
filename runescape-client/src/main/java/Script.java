import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("b")
	String field937;
	@ObfuscatedName("p")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("m")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("t")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1986002175
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 140084379
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 773546685
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2027696431
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)[Loz;",
		garbageValue = "-1725303821"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 155
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILku;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "62"
	)
	public static void method2040(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2); // L: 48
		int var7 = var1.getFileId(var6, var3); // L: 49
		class260.musicPlayerStatus = 1; // L: 51
		class124.musicTrackArchive = var1; // L: 52
		VarcInt.musicTrackGroupId = var6; // L: 53
		class260.musicTrackFileId = var7; // L: 54
		ChatChannel.musicTrackVolume = var4; // L: 55
		DynamicObject.musicTrackBoolean = var5; // L: 56
		class260.pcmSampleLength = var0; // L: 57
	} // L: 59
}
