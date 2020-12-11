import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1756359553
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1376256815
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 112778991
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-671846279"
	)
	@Export("getObjectDefinition")
	public static ObjectDefinition getObjectDefinition(int var0) {
		ObjectDefinition var1 = (ObjectDefinition)ObjectDefinition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectDefinition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectDefinition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectDefinition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfo;B)V",
		garbageValue = "-44"
	)
	static final void method381(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 96
			for (var10 = 0; var10 < 8; ++var10) { // L: 97
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 98
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0); // L: 101

		for (var10 = 0; var10 < 4; ++var10) { // L: 102
			for (int var11 = 0; var11 < 64; ++var11) { // L: 103
				for (int var12 = 0; var12 < 64; ++var12) { // L: 104
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 105
						int var15 = var2 + class51.method815(var11 & 7, var12 & 7, var7); // L: 108
						int var18 = var11 & 7; // L: 111
						int var19 = var12 & 7; // L: 112
						int var20 = var7 & 3; // L: 115
						int var17;
						if (var20 == 0) { // L: 116
							var17 = var19; // L: 117
						} else if (var20 == 1) { // L: 120
							var17 = 7 - var18; // L: 121
						} else if (var20 == 2) { // L: 124
							var17 = 7 - var19; // L: 125
						} else {
							var17 = var18; // L: 128
						}

						Huffman.loadTerrain(var21, var1, var15, var3 + var17, 0, 0, var7); // L: 130
					} else {
						Huffman.loadTerrain(var21, 0, -1, -1, 0, 0, 0); // L: 132
					}
				}
			}
		}

	} // L: 136

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1662959699"
	)
	static final void method380(boolean var0) {
		if (var0) { // L: 2970
			Client.field872 = Login.field1200 ? class169.field2019 : class169.field2020; // L: 2971
		} else {
			LinkedHashMap var1 = Timer.clientPreferences.parameters; // L: 2974
			String var3 = Login.Login_username; // L: 2976
			int var4 = var3.length(); // L: 2978
			int var5 = 0; // L: 2979

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2980
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field872 = var1.containsKey(var5) ? class169.field2025 : class169.field2021; // L: 2983
		}

	} // L: 2985

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-708398742"
	)
	static final void method382() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6962 6963 6982
			if (var0.hitpoints > 0) { // L: 6964
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) { // L: 6965
				if (var0.objectId < 0 || class234.method4159(var0.objectId, var0.field935)) { // L: 6966
					WorldMapData_1.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field929, var0.field935); // L: 6967
					var0.remove(); // L: 6968
				}
			} else {
				if (var0.delay > 0) { // L: 6972
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.id < 0 || class234.method4159(var0.id, var0.field933))) { // L: 6973 6974
					WorldMapData_1.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field933); // L: 6975
					var0.delay = -1; // L: 6976
					if (var0.id == var0.objectId && var0.objectId == -1) { // L: 6977
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field929 == var0.orientation && var0.field935 == var0.field933) {
						var0.remove(); // L: 6978
					}
				}
			}
		}

	} // L: 6984

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IIB)V",
		garbageValue = "-43"
	)
	static final void method379(MenuAction var0, int var1, int var2) {
		RouteStrategy.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 7481
	} // L: 7482
}
