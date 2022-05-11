import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class135 extends class128 {
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ab")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("o")
	boolean field1614;
	@ObfuscatedName("q")
	byte field1613;
	@ObfuscatedName("l")
	byte field1615;
	@ObfuscatedName("k")
	byte field1622;
	@ObfuscatedName("a")
	byte field1616;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class135(class131 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1614 = var1.readUnsignedByte() == 1; // L: 251
		this.field1613 = var1.readByte(); // L: 252
		this.field1615 = var1.readByte(); // L: 253
		this.field1622 = var1.readByte(); // L: 254
		this.field1616 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.allowGuests = this.field1614; // L: 259
		var1.field1633 = this.field1613; // L: 260
		var1.field1641 = this.field1615; // L: 261
		var1.field1642 = this.field1622; // L: 262
		var1.field1648 = this.field1616; // L: 263
	} // L: 264
}
