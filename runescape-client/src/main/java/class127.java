import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class127 extends class126 {
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1317167519
	)
	static int field1498;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -646146065
	)
	int field1503;
	@ObfuscatedName("b")
	boolean field1499;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class127(class129 var1) {
		this.this$0 = var1;
		this.field1503 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1503 = var1.readUnsignedShort(); // L: 184
		this.field1499 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2857(this.field1503, this.field1499); // L: 189
	} // L: 190

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-39935659"
	)
	static void method2770() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 48
	} // L: 49

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "506416860"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 100

		try {
			var0 = class231.getPreferencesFile("", class338.field4054.name, true); // L: 102
			Buffer var1 = SecureRandomFuture.clientPreferences.toBuffer(); // L: 103
			var0.write(var1.array, 0, var1.offset); // L: 104
		} catch (Exception var3) { // L: 106
		}

		try {
			if (var0 != null) { // L: 108
				var0.closeSync(true); // L: 109
			}
		} catch (Exception var2) { // L: 112
		}

	} // L: 113
}
