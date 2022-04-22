import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
final class class432 implements class427 {
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -951968351
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "-700069158"
	)
	public void vmethod7597(Object var1, Buffer var2) {
		this.method7601((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "-1640188252"
	)
	public Object vmethod7598(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpi;I)V",
		garbageValue = "-1186525563"
	)
	void method7601(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39
}
