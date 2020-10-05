import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public abstract class Entity extends DualNode {
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static ClanChat clanChat;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -282434447
	)
	public int height;

	protected Entity() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cb")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;B)V",
		garbageValue = "28"
	)
	public static void method3381(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 27
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 28
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 29
	} // L: 30
}
