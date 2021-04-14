import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
final class class370 implements class369 {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 692421353
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnu;B)V",
		garbageValue = "32"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6444((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Ljava/lang/Object;",
		garbageValue = "-2127791785"
	)
	public Object vmethod6492(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnu;I)V",
		garbageValue = "843542220"
	)
	void method6444(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
