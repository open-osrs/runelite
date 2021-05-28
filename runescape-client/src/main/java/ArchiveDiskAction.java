import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = -6353355391446000035L
	)
	static long field3556;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1287454433
	)
	@Export("type")
	int type;
	@ObfuscatedName("n")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
