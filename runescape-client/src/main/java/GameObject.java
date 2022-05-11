import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -942035955
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -97756121
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 174940337
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 474371985
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -178209059
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1571383405
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1260565151
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1892090883
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1693444283
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -986708627
	)
	int field2697;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -24170279
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 9002525375587932575L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -304681645
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbb;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = PcmPlayer.method744(var1, var0); // L: 38
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 41
		Script var4;
		if (var5 != null) { // L: 42
			var4 = var5; // L: 43
		} else {
			String var6 = String.valueOf(var3); // L: 46
			int var7 = class115.archive12.getGroupId(var6); // L: 47
			if (var7 == -1) { // L: 48
				var4 = null; // L: 49
			} else {
				label59: {
					byte[] var8 = class115.archive12.takeFileFlat(var7); // L: 52
					if (var8 != null) { // L: 53
						if (var8.length <= 1) { // L: 54
							var4 = null; // L: 55
							break label59; // L: 56
						}

						var5 = PcmPlayer.newScript(var8); // L: 58
						if (var5 != null) { // L: 59
							Script.Script_cached.put(var5, (long)(var3 << 16)); // L: 60
							var4 = var5; // L: 61
							break label59; // L: 62
						}
					}

					var4 = null; // L: 65
				}
			}
		}

		if (var4 != null) { // L: 68
			return var4; // L: 69
		} else {
			int var12 = (-3 - var2 << 8) + var0; // L: 73
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16)); // L: 78
			Script var13;
			if (var14 != null) { // L: 79
				var13 = var14; // L: 80
			} else {
				String var9 = String.valueOf(var12); // L: 83
				int var10 = class115.archive12.getGroupId(var9); // L: 84
				if (var10 == -1) { // L: 85
					var13 = null; // L: 86
				} else {
					byte[] var11 = class115.archive12.takeFileFlat(var10); // L: 89
					if (var11 != null) { // L: 90
						if (var11.length <= 1) { // L: 91
							var13 = null; // L: 92
							return var13 != null ? var13 : null; // L: 105 108
						}

						var14 = PcmPlayer.newScript(var11); // L: 95
						if (var14 != null) { // L: 96
							Script.Script_cached.put(var14, (long)(var12 << 16)); // L: 97
							var13 = var14; // L: 98
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 102
				}
			}

			return var13 != null ? var13 : null;
		}
	}
}
