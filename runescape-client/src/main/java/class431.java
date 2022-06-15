import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
final class class431 implements class428 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqt;B)V",
		garbageValue = "-51"
	)
	public void vmethod7583(Object var1, Buffer var2) {
		this.method7554((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Ljava/lang/Object;",
		garbageValue = "-261873850"
	)
	public Object vmethod7580(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lqt;I)V",
		garbageValue = "590392359"
	)
	void method7554(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llh;II)Z",
		garbageValue = "-140653331"
	)
	static boolean method7559(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 183
		if (var2 == null) { // L: 184
			return false;
		} else {
			ChatChannel.SpriteBuffer_decode(var2); // L: 185
			return true; // L: 186
		}
	}
}
