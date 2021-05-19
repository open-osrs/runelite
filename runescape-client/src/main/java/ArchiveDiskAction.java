import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1113782185
	)
	@Export("type")
	int type;
	@ObfuscatedName("c")
	@Export("data")
	byte[] data;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
