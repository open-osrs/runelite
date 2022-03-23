import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1221735041
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@Export("data")
	byte[] data;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
