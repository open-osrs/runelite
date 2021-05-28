import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class10 extends class14 {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -91373789
	)
	int field85;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class10(class2 var1) {
		this.this$0 = var1;
		this.field85 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field85 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method139(this.field85); // L: 222
	} // L: 223
}
