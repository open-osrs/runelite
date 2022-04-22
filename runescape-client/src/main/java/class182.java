import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class182 extends DualNode {
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive4")
	static Archive archive4;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10
}
