import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class12 extends class16 {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("h")
	String field118;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -775635411
	)
	int field116;
	@ObfuscatedName("o")
	byte field115;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field118 = null; // L: 54
	} // L: 58

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 61
			--var1.offset; // L: 62
			var1.readLong(); // L: 63
		}

		this.field118 = var1.readStringCp1252NullTerminatedOrNull(); // L: 65
		this.field116 = var1.readUnsignedShort(); // L: 66
		this.field115 = var1.readByte(); // L: 67
		var1.readLong(); // L: 68
	} // L: 69

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		class9 var2 = new class9(); // L: 72
		var2.field73 = this.field118; // L: 73
		var2.field80 = this.field116; // L: 74
		var2.field76 = this.field115; // L: 75
		var1.method29(var2); // L: 76
	} // L: 77

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-711210303"
	)
	static void method192(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1237759472"
	)
	public static void method203() {
		class69.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public static void method202() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 163
	} // L: 164
}
