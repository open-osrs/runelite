import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public abstract class class16 extends Node {
	@ObfuscatedName("bd")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive15")
	static Archive archive15;

	class16() {
	} // L: 48

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	abstract void vmethod326(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	abstract void vmethod314(class3 var1);
}
