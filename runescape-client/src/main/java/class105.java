import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class105 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljx;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive3")
	static Archive archive3;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1577025565"
	)
	static final int method2414(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
