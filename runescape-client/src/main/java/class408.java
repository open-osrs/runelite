import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
final class class408 implements class405 {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -271022059
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "246575309"
	)
	public void vmethod7273(Object var1, Buffer var2) {
		this.method7238((Long)var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "3"
	)
	public Object vmethod7271(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lpi;I)V",
		garbageValue = "-1540315910"
	)
	void method7238(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
