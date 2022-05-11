import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("m")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field3997;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 834168287
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12
}
