import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("StructDefinition")
public class StructDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructDefinition() {
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2018201430"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "1854456107"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "1912740742"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = PacketWriter.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "101"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 54
		String var3;
		if (var4 == null) { // L: 56
			var3 = var2; // L: 57
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 60
			if (var5 == null) { // L: 61
				var3 = var2; // L: 62
			} else {
				var3 = (String)var5.obj; // L: 65
			}
		}

		return var3; // L: 67
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1032705828"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		Tiles.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 8236
	} // L: 8237
}
