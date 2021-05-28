import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	static final DefaultsGroup field3892;
	@ObfuscatedName("c")
	static int[] field3894;
	@ObfuscatedName("ad")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1567646551
	)
	@Export("group")
	final int group;

	static {
		field3892 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9
}
