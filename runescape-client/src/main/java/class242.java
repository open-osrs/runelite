import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public abstract class class242 implements class244 {
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1324634821
	)
	protected int field2806;

	@ObfuscatedSignature(
		descriptor = "(Lkr;Llu;I)V"
	)
	protected class242(StudioGame var1, Language var2, int var3) {
		this.field2806 = var3; // L: 10
	} // L: 11
}
