import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
final class class430 implements class429 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1505376757
	)
	@Export("clientType")
	public static int clientType;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpx;I)V",
		garbageValue = "-2139027116"
	)
	public void vmethod7440(Object var1, Buffer var2) {
		this.method7399((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Ljava/lang/Object;",
		garbageValue = "352015354"
	)
	public Object vmethod7436(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lpx;I)V",
		garbageValue = "819909184"
	)
	void method7399(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
