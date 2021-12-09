import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class125 extends class126 {
	@ObfuscatedName("b")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -542500645
	)
	int field1493;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class125(class129 var1) {
		this.this$0 = var1;
		this.field1493 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1493 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2862(this.field1493); // L: 123
	} // L: 124

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lck;IIB)V",
		garbageValue = "-63"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4946
			int var3 = UserComparator5.SequenceDefinition_get(var1).field2078; // L: 4947
			if (var3 == 1) { // L: 4948
				var0.sequenceFrame = 0; // L: 4949
				var0.sequenceFrameCycle = 0; // L: 4950
				var0.sequenceDelay = var2; // L: 4951
				var0.field1126 = 0; // L: 4952
			}

			if (var3 == 2) { // L: 4954
				var0.field1126 = 0; // L: 4955
			}
		} else if (var1 == -1 || var0.sequence == -1 || UserComparator5.SequenceDefinition_get(var1).field2092 >= UserComparator5.SequenceDefinition_get(var0.sequence).field2092) { // L: 4958
			var0.sequence = var1; // L: 4959
			var0.sequenceFrame = 0; // L: 4960
			var0.sequenceFrameCycle = 0; // L: 4961
			var0.sequenceDelay = var2; // L: 4962
			var0.field1126 = 0; // L: 4963
			var0.field1098 = var0.pathLength; // L: 4964
		}

	} // L: 4966
}
