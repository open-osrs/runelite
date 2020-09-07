import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 841228159
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "-895598946"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIILec;[Lft;B)V",
		garbageValue = "52"
	)
	static final void method3524(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 205
		int var6 = -1; // L: 206

		while (true) {
			int var7 = var5.method5632(); // L: 208
			if (var7 == 0) { // L: 209
				return; // L: 233
			}

			var6 += var7; // L: 210
			int var8 = 0; // L: 211

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 213
				if (var9 == 0) { // L: 214
					break;
				}

				var8 += var9 - 1; // L: 215
				int var10 = var8 & 63; // L: 216
				int var11 = var8 >> 6 & 63; // L: 217
				int var12 = var8 >> 12; // L: 218
				int var13 = var5.readUnsignedByte(); // L: 219
				int var14 = var13 >> 2; // L: 220
				int var15 = var13 & 3; // L: 221
				int var16 = var11 + var1; // L: 222
				int var17 = var10 + var2; // L: 223
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 224
					int var18 = var12; // L: 225
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 226
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 227
					if (var18 >= 0) { // L: 228
						var19 = var4[var18];
					}

					GrandExchangeOfferWorldComparator.method137(var12, var16, var17, var6, var15, var14, var3, var19); // L: 229
				}
			}
		}
	}
}
