import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
final class class391 implements class388 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "804166773"
	)
	public void vmethod6815(Object var1, Buffer var2) {
		this.method6788((Long)var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "1421946597"
	)
	public Object vmethod6822(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lot;I)V",
		garbageValue = "-1125852058"
	)
	void method6788(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	static final void method6795() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}
}
