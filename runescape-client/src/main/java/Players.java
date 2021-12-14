import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Players")
public class Players {
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("p")
	static byte[] field1243;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	static class185[] field1246;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lpi;"
	)
	static Buffer[] field1248;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 60233761
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("j")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1857354621
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("n")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("r")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("o")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("v")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1591161311
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("h")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static Buffer field1257;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1838137179
	)
	public static int field1247;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive11")
	static Archive archive11;

	static {
		field1243 = new byte[2048];
		field1246 = new class185[2048];
		field1248 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1257 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "2062230724"
	)
	public static void method2382(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1);
		int var6 = var0.getFileId(var5, var2);
		NetSocket.method3118(var0, var5, var6, var3, var4);
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-733179789"
	)
	static final void method2383(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		SecureRandomFuture.clientPreferences.areaSoundEffectsVolume = var0;
		class127.savePreferences();
	}
}
