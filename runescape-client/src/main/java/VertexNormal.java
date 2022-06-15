import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 852204679
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2028083131
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1173750943
	)
	@Export("z")
	int z;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -860468825
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhj;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "886166360"
	)
	public static boolean method4528(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field136[var0] : false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIILgg;[Lgv;I)V",
		garbageValue = "-1413330538"
	)
	static final void method4527(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 228
		int var6 = -1; // L: 229

		while (true) {
			int var7 = var5.method7770(); // L: 231
			if (var7 == 0) { // L: 232
				return; // L: 256
			}

			var6 += var7; // L: 233
			int var8 = 0; // L: 234

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 236
				if (var9 == 0) { // L: 237
					break;
				}

				var8 += var9 - 1; // L: 238
				int var10 = var8 & 63; // L: 239
				int var11 = var8 >> 6 & 63; // L: 240
				int var12 = var8 >> 12; // L: 241
				int var13 = var5.readUnsignedByte(); // L: 242
				int var14 = var13 >> 2; // L: 243
				int var15 = var13 & 3; // L: 244
				int var16 = var11 + var1; // L: 245
				int var17 = var10 + var2; // L: 246
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 247
					int var18 = var12; // L: 248
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 249
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 250
					if (var18 >= 0) { // L: 251
						var19 = var4[var18];
					}

					class268.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 252
				}
			}
		}
	}
}
