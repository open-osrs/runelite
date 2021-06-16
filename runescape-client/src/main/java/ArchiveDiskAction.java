import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1353855841
	)
	@Export("type")
	int type;
	@ObfuscatedName("e")
	@Export("data")
	byte[] data;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
