import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class150 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 2165429326426467319L
	)
	long field1722;
	@ObfuscatedName("q")
	String field1720;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1722 = -1L; // L: 194
		this.field1720 = null; // L: 195
	} // L: 197

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1722 = var1.readLong(); // L: 202
		}

		this.field1720 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2891(this.field1722, this.field1720); // L: 208
	} // L: 209

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "773068902"
	)
	static String method3026(String var0) {
		PlayerType[] var1 = class118.PlayerType_values(); // L: 12681

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12682
			PlayerType var3 = var1[var2]; // L: 12683
			if (var3.modIcon != -1 && var0.startsWith(StudioGame.method5590(var3.modIcon))) { // L: 12685 12686
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12687
				break;
			}
		}

		return var0; // L: 12694
	}
}
