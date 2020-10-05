import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	static final DefaultsGroup field3828;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -116036803
	)
	final int group;

	static {
		field3828 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
