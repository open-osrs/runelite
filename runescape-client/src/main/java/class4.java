import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class4 extends class14 {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -750894877
	)
	static int field38;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1782449863
	)
	int field37;
	@ObfuscatedName("e")
	String field40;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field37 = var1.readInt(); // L: 326
		this.field40 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method138(this.field37, this.field40); // L: 331
	} // L: 332
}
