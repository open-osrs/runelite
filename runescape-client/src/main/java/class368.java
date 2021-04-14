import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class368 extends class339 implements class194 {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	AbstractArchive field4121;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	DemotingHashTable field4119;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1297473835
	)
	int field4122;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lmd;",
		garbageValue = "-883591339"
	)
	protected class341 vmethod6425(int var1) {
		synchronized(this.field4119) { // L: 22
			class340 var2 = (class340)this.field4119.get((long)var1); // L: 23
			if (var2 == null) { // L: 24
				var2 = this.method6432(var1); // L: 25
				this.field4119.method3825(var2, (long)var1); // L: 26
			}

			return var2; // L: 29
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lmx;",
		garbageValue = "-665957162"
	)
	class340 method6432(int var1) {
		byte[] var2 = this.field4121.takeFile(this.field4122, var1); // L: 33
		class340 var3 = new class340(var1); // L: 34
		if (var2 != null) {
			var3.method6014(new Buffer(var2)); // L: 35
		}

		return var3; // L: 36
	}

	public Iterator iterator() {
		return new class367(this); // L: 40
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "2140330129"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class9.World_worlds[var6]; // L: 180
			class9.World_worlds[var6] = class9.World_worlds[var1]; // L: 181
			class9.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class9.World_worlds[var9]; // L: 185
				int var12 = WorldMapRectangle.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = WorldMapRectangle.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class9.World_worlds[var9]; // L: 207
					class9.World_worlds[var9] = class9.World_worlds[var7]; // L: 208
					class9.World_worlds[var7++] = var14; // L: 209
				}
			}

			class9.World_worlds[var1] = class9.World_worlds[var7]; // L: 213
			class9.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218
}
