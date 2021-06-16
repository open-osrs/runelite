import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class287 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3672;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3671;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3673;

	static {
		field3672 = new class287(); // L: 4
		field3671 = new class287(); // L: 5
		field3673 = new class287(); // L: 6
	}

	class287() {
	} // L: 8

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "-31"
	)
	public static HealthBarDefinition method5260(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}
}
