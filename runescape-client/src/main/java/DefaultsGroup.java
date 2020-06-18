import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llm;"
	)
	static final DefaultsGroup field3822;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1462614597
	)
	@Export("group")
	final int group;

	static {
		field3822 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
