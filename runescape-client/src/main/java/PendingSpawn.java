import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1526505763
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1918488327
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1150411383
	)
	@Export("x")
	int x;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 471891205
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2142358413
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1726933753
	)
	int field1075;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2134886005
	)
	int field1076;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -821600297
	)
	@Export("id")
	int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1752810997
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1311182743
	)
	int field1082;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -472158759
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1663724523
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIILhf;[Lfq;I)V",
		garbageValue = "-79780514"
	)
	static final void method2162(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 258
		int var6 = -1; // L: 259

		while (true) {
			int var7 = var5.method6981(); // L: 261
			if (var7 == 0) { // L: 262
				return; // L: 286
			}

			var6 += var7; // L: 263
			int var8 = 0; // L: 264

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 266
				if (var9 == 0) { // L: 267
					break;
				}

				var8 += var9 - 1; // L: 268
				int var10 = var8 & 63; // L: 269
				int var11 = var8 >> 6 & 63; // L: 270
				int var12 = var8 >> 12; // L: 271
				int var13 = var5.readUnsignedByte(); // L: 272
				int var14 = var13 >> 2; // L: 273
				int var15 = var13 & 3; // L: 274
				int var16 = var11 + var1; // L: 275
				int var17 = var10 + var2; // L: 276
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 277
					int var18 = var12; // L: 278
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 279
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 280
					if (var18 >= 0) { // L: 281
						var19 = var4[var18];
					}

					class92.method2276(var12, var16, var17, var6, var15, var14, var3, var19); // L: 282
				}
			}
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)I",
		garbageValue = "-1849354153"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 11879
		return var1 != null ? var1.integer : var0.flags; // L: 11880 11881
	}
}
