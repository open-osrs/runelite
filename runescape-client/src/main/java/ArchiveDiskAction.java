import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 502285257
	)
	@Export("type")
	int type;
	@ObfuscatedName("c")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
