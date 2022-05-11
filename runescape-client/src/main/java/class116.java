import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public enum class116 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1470(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1465(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1464(2, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1466(3, 3),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	field1468(4, 4);

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -611288391
	)
	final int field1469;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 79441713
	)
	final int field1467;

	class116(int var3, int var4) {
		this.field1469 = var3; // L: 137
		this.field1467 = var4; // L: 138
	} // L: 139

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1467; // L: 142
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lqb;",
		garbageValue = "650575371"
	)
	public static PrivateChatMode method2686(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field4794, PrivateChatMode.field4793, PrivateChatMode.field4795}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field4796) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "20"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1727484940"
	)
	static boolean method2685() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5012
	}
}
