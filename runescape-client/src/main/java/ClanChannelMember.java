import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("n")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -588092421
	)
	@Export("world")
	public int world;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}
}
