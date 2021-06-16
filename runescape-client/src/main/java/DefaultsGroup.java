import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static final DefaultsGroup field3890;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static Bounds field3891;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static AbstractSocket field3887;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1341790971
	)
	@Export("group")
	final int group;

	static {
		field3890 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
