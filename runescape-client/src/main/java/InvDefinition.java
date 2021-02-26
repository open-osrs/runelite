import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2039181525
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "-26"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-667990593"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lic;",
		garbageValue = "63"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1853243794"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1447
		Login.Login_response2 = var1; // L: 1448
		Login.Login_response3 = var2; // L: 1449
	} // L: 1450
}
