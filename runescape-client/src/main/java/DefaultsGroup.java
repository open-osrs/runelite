import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final DefaultsGroup field4311;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1482438781
	)
	@Export("group")
	final int group;

	static {
		field4311 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1715985756"
	)
	static void method6936(Buffer var0, int var1) {
		UserComparator6.method2646(var0.array, var1); // L: 12572
		if (JagexCache.JagexCache_randomDat != null) { // L: 12574
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12576
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12577
			} catch (Exception var3) { // L: 12579
			}
		}

	} // L: 12582
}
