import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1308436771
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("v")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}
}
