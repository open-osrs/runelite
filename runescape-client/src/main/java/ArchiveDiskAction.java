import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -458707233
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@Export("data")
	byte[] data;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
