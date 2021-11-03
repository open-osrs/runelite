import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class134 extends class116 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -1434510609
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1414305525
	)
	int field1501;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1373462747
	)
	int field1502;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class134(class119 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1501 = var1.readInt(); // L: 274
		this.field1502 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2664(this.field1501, this.field1502); // L: 279
	} // L: 280

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1799070908"
	)
	public static String method2788(CharSequence var0) {
		String var1 = FontName.base37DecodeLong(WorldMapScaleHandler.method4096(var0)); // L: 57
		if (var1 == null) {
			var1 = ""; // L: 58
		}

		return var1; // L: 59
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "7395"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4552
	}
}
