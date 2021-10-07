import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class276 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	static final class276 field3288;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	static final class276 field3289;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 508241625
	)
	final int field3287;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -259156431
	)
	final int field3290;

	static {
		field3288 = new class276(51, 27, 800, 0, 16, 16);
		field3289 = new class276(25, 28, 800, 656, 40, 40);
	}

	class276(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3287 = var5;
		this.field3290 = var6;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081287191"
	)
	public static void method5122() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}
}
