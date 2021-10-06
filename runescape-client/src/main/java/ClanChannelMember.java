import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("l")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -817842065
	)
	@Export("world")
	public int world;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}
}
