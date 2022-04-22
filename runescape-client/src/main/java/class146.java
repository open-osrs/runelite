import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class146 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1180397183
	)
	int field1645;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -176284947
	)
	int field1640;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1645 = var1.readInt(); // L: 274
		this.field1640 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2968(this.field1645, this.field1640); // L: 279
	} // L: 280

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgj;",
		garbageValue = "0"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = WorldMapData_0.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}
}
