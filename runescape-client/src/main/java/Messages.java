import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("n")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2111099267
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("n")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class299.base37Table[(int)(var6 - 37L * var0)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "618047929"
	)
	static void method2372() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 50
	} // L: 51
}
