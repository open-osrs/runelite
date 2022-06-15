import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("cn")
	public static char field1258;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1249602607
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfe;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1392818075"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcp;",
		garbageValue = "14"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1385237709"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6147(); // L: 55
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldo;[F[FI)V",
		garbageValue = "-1662385101"
	)
	static void method2355(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 273
			var0.field1464 = var1[0]; // L: 276
			float var3 = var1[3] - var1[0]; // L: 277
			float var4 = var2[3] - var2[0]; // L: 278
			float var5 = var1[1] - var1[0]; // L: 279
			float var6 = 0.0F; // L: 280
			float var7 = 0.0F; // L: 281
			if (0.0D != (double)var5) { // L: 282
				var6 = (var2[1] - var2[0]) / var5; // L: 283
			}

			var5 = var1[3] - var1[2]; // L: 285
			if ((double)var5 != 0.0D) { // L: 286
				var7 = (var2[3] - var2[2]) / var5; // L: 287
			}

			float var8 = 1.0F / (var3 * var3); // L: 289
			float var9 = var3 * var6; // L: 290
			float var10 = var3 * var7; // L: 291
			var0.field1465[0] = (var10 + var9 - var4 - var4) * var8 / var3; // L: 292
			var0.field1465[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8; // L: 293
			var0.field1465[2] = var6; // L: 294
			var0.field1465[3] = var2[0]; // L: 295
		}
	} // L: 274 296

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "9"
	)
	static int method2356(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 85
			boolean var3 = false; // L: 86
			boolean var4 = false; // L: 87
			int var5 = 0; // L: 88
			int var6 = var0.length(); // L: 89

			for (int var7 = 0; var7 < var6; ++var7) { // L: 90
				char var8 = var0.charAt(var7); // L: 91
				if (var7 == 0) { // L: 92
					if (var8 == '-') { // L: 93
						var3 = true; // L: 94
						continue;
					}

					if (var8 == '+') { // L: 97
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 99
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 100
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 101
						throw new NumberFormatException(); // L: 102
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 103
					throw new NumberFormatException();
				}

				if (var3) { // L: 104
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 105
				if (var9 / var1 != var5) { // L: 106
					throw new NumberFormatException();
				}

				var5 = var9; // L: 107
				var4 = true; // L: 108
			}

			if (!var4) { // L: 110
				throw new NumberFormatException();
			} else {
				return var5; // L: 111
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1947801286"
	)
	static final void method2349(int var0, int var1, int var2, int var3) {
		WorldMap.method7376(); // L: 5428
	} // L: 5429
}
