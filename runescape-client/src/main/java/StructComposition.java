import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1581798947
	)
	public static int field3338;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1222397412"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "1068696099"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = TextureProvider.readStringIntParameters(var1, this.params); // L: 44
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1838065399"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-15071"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class69.method1258(this.params, var1, var2); // L: 67
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;Lig;B)V",
		garbageValue = "76"
	)
	public static void method4734(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		Frames.field1904 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49
}
