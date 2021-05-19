import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jf")
public class class266 {
	@ObfuscatedName("aq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class261[] var2 = new class261[]{class261.field3203, class261.field3206}; // L: 14
		class261[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class261 var5 = var3[var4]; // L: 18
			if (var5.field3205 > var0) { // L: 20
				var0 = var5.field3205;
			}

			if (var5.field3204 > var1) { // L: 21
				var1 = var5.field3204;
			}
		}

	} // L: 25
}
