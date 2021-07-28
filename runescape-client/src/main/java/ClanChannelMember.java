import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("n")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("s")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1633534337
	)
	@Export("world")
	public int world;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}
}
