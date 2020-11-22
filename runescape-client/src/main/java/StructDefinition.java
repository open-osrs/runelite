import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructDefinition() {
	} // L: 16

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1231164770"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1053369133"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-941858292"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = InvDefinition.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "408521937"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 50
		int var3;
		if (var4 == null) { // L: 52
			var3 = var2; // L: 53
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 56
			if (var5 == null) { // L: 57
				var3 = var2; // L: 58
			} else {
				var3 = var5.integer; // L: 61
			}
		}

		return var3; // L: 63
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "7540"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapSection0.method307(this.params, var1, var2); // L: 67
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "22"
	)
	@Export("getEntityIdUnderMouse")
	public static int getEntityIdUnderMouse(int var0) {
		return ObjectSound.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1317179334"
	)
	public static void method4699() {
		StructDefinition_cached.clear(); // L: 71
	} // L: 72
}
