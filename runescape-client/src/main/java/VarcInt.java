import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static IndexedSprite field3429;
	@ObfuscatedName("u")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "-9"
	)
	void method4933(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method4934(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "635398124"
	)
	void method4934(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true; // L: 40
		}

	} // L: 43

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "20641087"
	)
	public static String method4940(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class301.field3751[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class301.field3751[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class301.field3751[(var6 & 15) << 2 | var7 >>> 6]).append(class301.field3751[var7 & 63]); // L: 67
				} else {
					var3.append(class301.field3751[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class301.field3751[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-581975107"
	)
	static int method4941(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4155
			++Interpreter.Interpreter_stringStackSize; // L: 4156
			return 1; // L: 4157
		} else if (var0 == 6950) { // L: 4159
			++class16.Interpreter_intStackSize; // L: 4160
			return 1; // L: 4161
		} else {
			return 2; // L: 4163
		}
	}
}
