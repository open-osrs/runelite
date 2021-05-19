import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	static final DefaultsGroup field3903;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1585130707
	)
	@Export("group")
	final int group;

	static {
		field3903 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
