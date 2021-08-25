import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1602361703
	)
	@Export("type")
	int type;
	@ObfuscatedName("c")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
