import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("b")
	static int[][] field1730;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773759277"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "14298"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-570855363"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = HealthBar.readStringIntParameters(var1, this.params); // L: 44
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "89"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return GraphicsObject.method1937(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1494986082"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Varcs.method2326(this.params, var1, var2); // L: 53
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1212560754"
	)
	public static boolean method2846() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lbz;I)V",
		garbageValue = "-1673250002"
	)
	public static final void method2863(PlayerProvider var0) {
		Tiles.pcmPlayerProvider = var0; // L: 45
	} // L: 46
}
