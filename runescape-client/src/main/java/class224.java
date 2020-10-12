import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class224 {
	@ObfuscatedName("z")
	public static final short[] field2587;
	@ObfuscatedName("k")
	public static final short[][] field2589;
	@ObfuscatedName("s")
	public static final short[] field2584;
	@ObfuscatedName("t")
	public static final short[][] field2586;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static Buffer NetCache_responseArchiveBuffer;

	static {
		field2587 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field2589 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field2584 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field2586 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "61"
	)
	static final boolean method4117(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 165
		Buffer var4 = new Buffer(var0); // L: 166
		int var5 = -1; // L: 167

		label70:
		while (true) {
			int var6 = var4.method5632(); // L: 169
			if (var6 == 0) { // L: 170
				return var3; // L: 201
			}

			var5 += var6; // L: 171
			int var7 = 0; // L: 172
			boolean var8 = false; // L: 173

			while (true) {
				int var9;
				while (!var8) { // L: 175
					var9 = var4.readUShortSmart(); // L: 181
					if (var9 == 0) { // L: 182
						continue label70;
					}

					var7 += var9 - 1; // L: 183
					int var10 = var7 & 63; // L: 184
					int var11 = var7 >> 6 & 63; // L: 185
					int var12 = var4.readUnsignedByte() >> 2; // L: 186
					int var13 = var11 + var1; // L: 187
					int var14 = var10 + var2; // L: 188
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 189
						ObjectDefinition var15 = MidiPcmStream.getObjectDefinition(var5); // L: 190
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 191
							if (!var15.needsModelFiles()) { // L: 192
								++Client.field895; // L: 193
								var3 = false; // L: 194
							}

							var8 = true; // L: 196
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 176
				if (var9 == 0) { // L: 177
					break;
				}

				var4.readUnsignedByte(); // L: 178
			}
		}
	}
}
