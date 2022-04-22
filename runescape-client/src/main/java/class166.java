import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public abstract class class166 {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	String field1784;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/lang/String;)V"
	)
	class166(class155 var1, String var2) {
		this.this$0 = var1; // L: 349
		this.field1784 = var2; // L: 350
	} // L: 351

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1689964957"
	)
	public abstract int vmethod3341();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1535635597"
	)
	public String vmethod3333() {
		return null; // L: 360
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "31414"
	)
	public int vmethod3334() {
		return -1; // L: 364
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1565195200"
	)
	public String method3336() {
		return this.field1784; // L: 354
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqa;",
		garbageValue = "29"
	)
	public static PrivateChatMode method3343(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field4739, PrivateChatMode.field4741, PrivateChatMode.field4738}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field4740) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	static int method3342() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1468
			int var0 = 0; // L: 1469

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1470
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1471
			}

			return var0 * 10000 / Client.field782; // L: 1473
		} else {
			return 10000;
		}
	}
}
