import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class26 extends class14 {
	@ObfuscatedName("eq")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -304679380423541639L
	)
	long field218;
	@ObfuscatedName("c")
	String field217;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -539273789
	)
	int field216;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field218 = -1L; // L: 93
		this.field217 = null; // L: 94
		this.field216 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field218 = var1.readLong(); // L: 102
		}

		this.field217 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field216 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method117(this.field218, this.field217, this.field216); // L: 109
	} // L: 110

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CLkr;I)I",
		garbageValue = "1120032749"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1731637540"
	)
	static void method334() {
		Login.loginIndex = 24; // L: 1561
		class44.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1562
	} // L: 1563

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)I",
		garbageValue = "1598079185"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 11602
		return var1 != null ? var1.integer : var0.flags; // L: 11603 11604
	}
}
