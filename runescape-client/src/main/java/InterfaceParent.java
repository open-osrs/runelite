import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 387813291
	)
	@Export("group")
	int group;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 482755605
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	boolean field1020;

	InterfaceParent() {
		this.field1020 = false;
	}

	@ObfuscatedName("n")
	public static String method2045(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class320.base37Table[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "1930304193"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbg;",
		garbageValue = "-298362630"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapSection1.method3843(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = SecureRandomCallable.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label58: {
					byte[] var8 = SecureRandomCallable.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label58;
						}

						var5 = AttackOption.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label58;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			var3 = LoginPacket.method4571(var2, var0);
			Script var11 = (Script)Script.Script_cached.get((long)(var3 << 16));
			Script var12;
			if (var11 != null) {
				var12 = var11;
			} else {
				String var13 = String.valueOf(var3);
				int var9 = SecureRandomCallable.archive12.getGroupId(var13);
				if (var9 == -1) {
					var12 = null;
				} else {
					byte[] var10 = SecureRandomCallable.archive12.takeFileFlat(var9);
					if (var10 != null) {
						if (var10.length <= 1) {
							var12 = null;
							return var12 != null ? var12 : null;
						}

						var11 = AttackOption.newScript(var10);
						if (var11 != null) {
							Script.Script_cached.put(var11, (long)(var3 << 16));
							var12 = var11;
							return var12 != null ? var12 : null;
						}
					}

					var12 = null;
				}
			}

			return var12 != null ? var12 : null;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "2022031093"
	)
	static final void method2044(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = CollisionMap.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = CollisionMap.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = CollisionMap.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = CollisionMap.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = CollisionMap.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = HealthBarDefinition.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1083 = var4;
		var0.field1088 = var5;
	}
}
