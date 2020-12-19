import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class198 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lje;",
		garbageValue = "1390109728"
	)
	public static HitSplatDefinition method3697(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}
}
