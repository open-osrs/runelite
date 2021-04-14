import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class243 {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIILfu;[Lel;I)V",
		garbageValue = "-237346608"
	)
	static final void method4399(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 221
		int var6 = -1; // L: 222

		while (true) {
			int var7 = var5.method6595(); // L: 224
			if (var7 == 0) { // L: 225
				return; // L: 249
			}

			var6 += var7; // L: 226
			int var8 = 0; // L: 227

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 229
				if (var9 == 0) { // L: 230
					break;
				}

				var8 += var9 - 1; // L: 231
				int var10 = var8 & 63; // L: 232
				int var11 = var8 >> 6 & 63; // L: 233
				int var12 = var8 >> 12; // L: 234
				int var13 = var5.readUnsignedByte(); // L: 235
				int var14 = var13 >> 2; // L: 236
				int var15 = var13 & 3; // L: 237
				int var16 = var11 + var1; // L: 238
				int var17 = var10 + var2; // L: 239
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 240
					int var18 = var12; // L: 241
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 242
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 243
					if (var18 >= 0) { // L: 244
						var19 = var4[var18];
					}

					class157.method3115(var12, var16, var17, var6, var15, var14, var3, var19); // L: 245
				}
			}
		}
	}
}
