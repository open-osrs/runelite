import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static final DefaultsGroup field4313;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1008905745
	)
	@Export("group")
	final int group;

	static {
		field4313 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
