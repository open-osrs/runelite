import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2412("", 0, new class200[]{class200.field2399}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2414("", 1, new class200[]{class200.field2398, class200.field2399}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2404("", 2, new class200[]{class200.field2398, class200.field2400, class200.field2399}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2405("", 3, new class200[]{class200.field2398}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2403("", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2406("", 5, new class200[]{class200.field2398, class200.field2399}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2408("", 6, new class200[]{class200.field2399}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2409("", 8, new class200[]{class200.field2398, class200.field2399}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2402("", 9, new class200[]{class200.field2398, class200.field2400}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2411("", 10, new class200[]{class200.field2398}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2410("", 11, new class200[]{class200.field2398}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2413("", 12, new class200[]{class200.field2398, class200.field2399}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	field2418("", 13, new class200[]{class200.field2398});

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		signature = "Lcg;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1475259781
	)
	@Export("id")
	final int id;
	@ObfuscatedName("k")
	final Set field2416;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I[Lgi;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2416 = new HashSet();
		this.id = var4;
		class200[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class200 var8 = var6[var7];
			this.field2416.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field2416 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(ZZI)I",
		garbageValue = "57776207"
	)
	public static int method3809(boolean var0, boolean var1) {
		byte var2 = 0;
		int var3 = var2 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
		return var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "51"
	)
	static boolean method3810(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
