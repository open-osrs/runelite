import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class114 {
	@ObfuscatedName("k")
	public static final float field1435;
	@ObfuscatedName("a")
	public static final float field1436;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive17")
	static Archive archive17;

	static {
		field1435 = Math.ulp(1.0F); // L: 10
		field1436 = 2.0F * field1435; // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-1342157785"
	)
	public static long method2626(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lgq;",
		garbageValue = "111011513"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 48
			var1 = new SequenceDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 51
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 52
			return var1; // L: 53
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "809732836"
	)
	public static int method2637() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}
}
