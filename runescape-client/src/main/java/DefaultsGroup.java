import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static final DefaultsGroup field4011;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -989464317
	)
	@Export("group")
	final int group;

	static {
		field4011 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
