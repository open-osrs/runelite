import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final DefaultsGroup field3833;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -506210431
	)
	@Export("group")
	final int group;

	static {
		field3833 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
