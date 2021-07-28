import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final DefaultsGroup field3904;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -694914585
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1809855359
	)
	@Export("group")
	final int group;

	static {
		field3904 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
