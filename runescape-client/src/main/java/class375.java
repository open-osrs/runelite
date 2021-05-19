import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
final class class375 implements class370 {
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnk;I)V",
		garbageValue = "-2099055755"
	)
	public void vmethod6366(Object var1, Buffer var2) {
		this.method6360((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Ljava/lang/Object;",
		garbageValue = "-559339148"
	)
	public Object vmethod6362(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnk;I)V",
		garbageValue = "233977802"
	)
	void method6360(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39
}
