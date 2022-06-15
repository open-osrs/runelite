import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("i")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("c")
	byte[] field3184;
	@ObfuscatedName("v")
	byte[] field3181;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 444022475
	)
	int field3182;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1028117213
	)
	int field3190;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1704743957
	)
	int field3185;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1934945847
	)
	int field3183;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 986515665
	)
	int field3186;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 952644039
	)
	int field3187;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 270113767
	)
	int field3188;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "527401858"
	)
	public static HealthBarDefinition method5244(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1387162064"
	)
	public static boolean method5243(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class340.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}
}
