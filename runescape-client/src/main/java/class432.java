import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
final class class432 implements class427 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpd;B)V",
		garbageValue = "25"
	)
	public void vmethod7681(Object var1, Buffer var2) {
		this.method7682((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)Ljava/lang/Object;",
		garbageValue = "1821026092"
	)
	public Object vmethod7683(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpd;I)V",
		garbageValue = "-1807705187"
	)
	void method7682(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
