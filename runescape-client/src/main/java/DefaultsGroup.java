import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final DefaultsGroup field3999;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -111517157
	)
	@Export("group")
	final int group;

	static {
		field3999 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
