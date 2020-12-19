import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("Entity")
public abstract class Entity extends DualNode {
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -1743769759
	)
	static int field1893;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1865957833
	)
	@Export("height")
	public int height;

	protected Entity() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("cf")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "85"
	)
	static long method3340(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') { // L: 23
				var1 += (long)(var5 + 27 - 48);
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
}
