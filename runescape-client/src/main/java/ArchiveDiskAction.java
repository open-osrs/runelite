import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1029019227
	)
	@Export("type")
	int type;
	@ObfuscatedName("b")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpl;IIIB)V",
		garbageValue = "1"
	)
	static void method5526(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var6 = (long)(var3 << 16 | var1 << 8 | var2); // L: 42
		var4.put(var0, var6, var0.pixels.length * 4); // L: 44
	} // L: 45

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "128"
	)
	static final void method5527(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 5578
			ModeWhere.worldToScreen((Client.hintArrowX - class131.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - TileItem.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 5579
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5580
				class260.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 5581
}
