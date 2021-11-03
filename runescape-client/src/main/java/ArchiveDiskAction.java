import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1877309383
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@Export("data")
	byte[] data;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
