import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("av")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -490109915
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 963547753
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1228146275
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2073132681
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "108"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2877.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method7532(); // L: 28
			super.fileId = var1.method7532(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "933342926"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2845 = new byte[super.planes][64][64]; // L: 37
		super.field2847 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class239.field2872.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1782342314"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1449526509"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-413234934"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 64
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-21477697"
	)
	static void method4706(boolean var0) {
		byte var1 = 0; // L: 1074
		if (!class118.method2721()) { // L: 1075
			var1 = 12; // L: 1076
		} else if (class82.client.method1128() || class82.client.method1520()) { // L: 1078
			var1 = 10; // L: 1079
		}

		class126.method2799(var1); // L: 1081
		if (var0) { // L: 1082
			Login.Login_username = ""; // L: 1083
			Login.Login_password = ""; // L: 1084
			WorldMapCacheName.field2912 = 0; // L: 1085
			class92.otp = ""; // L: 1086
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1089
			if (class12.clientPreferences.method2241() != null) { // L: 1090
				Login.Login_username = class12.clientPreferences.method2241(); // L: 1091
				Client.Login_isUsernameRemembered = true; // L: 1092
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1094
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1097
			Login.currentLoginField = 1; // L: 1098
		} else {
			Login.currentLoginField = 0; // L: 1101
		}

	} // L: 1104

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1880965646"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7922
			if (Client.isLowDetail && var0 != class128.Client_plane) { // L: 7923
				return;
			}

			long var7 = 0L; // L: 7924
			boolean var9 = true; // L: 7925
			boolean var10 = false; // L: 7926
			boolean var11 = false; // L: 7927
			if (var1 == 0) { // L: 7928
				var7 = class175.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7929
				var7 = class175.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7930
				var7 = class175.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7931
				var7 = class175.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7932
				var12 = class175.scene.getObjectFlags(var0, var2, var3, var7); // L: 7933
				int var14 = NetSocket.Entity_unpackID(var7); // L: 7934
				int var15 = var12 & 31; // L: 7935
				int var16 = var12 >> 6 & 3; // L: 7936
				ObjectComposition var13;
				if (var1 == 0) { // L: 7937
					class175.scene.removeBoundaryObject(var0, var2, var3); // L: 7938
					var13 = class82.getObjectDefinition(var14); // L: 7939
					if (var13.interactType != 0) { // L: 7940
						Client.collisionMaps[var0].method3756(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7942
					class175.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7943
					class175.scene.removeGameObject(var0, var2, var3); // L: 7944
					var13 = class82.getObjectDefinition(var14); // L: 7945
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7946
						return;
					}

					if (var13.interactType != 0) { // L: 7947
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7949
					class175.scene.removeFloorDecoration(var0, var2, var3); // L: 7950
					var13 = class82.getObjectDefinition(var14); // L: 7951
					if (var13.interactType == 1) { // L: 7952
						Client.collisionMaps[var0].method3759(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7955
				var12 = var0; // L: 7956
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7957
					var12 = var0 + 1;
				}

				Fonts.method7226(var0, var12, var2, var3, var4, var5, var6, class175.scene, Client.collisionMaps[var0]); // L: 7958
			}
		}

	} // L: 7961

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "35"
	)
	static String method4707(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12529
		if (Client.gameBuild == 1) { // L: 12530
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12531
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12532
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12533
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12534
			var0 = "local";
		}

		String var3 = ""; // L: 12535
		if (Client.field662 != null) { // L: 12536
			var3 = "/p=" + Client.field662;
		}

		String var4 = "runescape.com"; // L: 12537
		return var2 + var0 + "." + var4 + "/l=" + class263.clientLanguage + "/a=" + class230.field2807 + var3 + "/"; // L: 12538
	}
}
