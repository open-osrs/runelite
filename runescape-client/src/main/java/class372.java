import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
final class class372 implements class371 {
	@ObfuscatedName("m")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -414913701
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnt;I)V",
		garbageValue = "1796019185"
	)
	public void vmethod6536(Object var1, Buffer var2) {
		this.method6492((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)Ljava/lang/Object;",
		garbageValue = "-46"
	)
	public Object vmethod6533(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnt;B)V",
		garbageValue = "5"
	)
	void method6492(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-10"
	)
	public static boolean method6497(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 25
	}
}
