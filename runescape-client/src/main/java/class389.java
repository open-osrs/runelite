import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
final class class389 implements class388 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lop;B)V",
		garbageValue = "59"
	)
	public void vmethod6878(Object var1, Buffer var2) {
		this.method6830((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Ljava/lang/Object;",
		garbageValue = "-2140031619"
	)
	public Object vmethod6883(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lop;I)V",
		garbageValue = "1046823792"
	)
	void method6830(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
