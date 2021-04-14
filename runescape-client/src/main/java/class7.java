import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class7 extends class16 {
	@ObfuscatedName("f")
	String field53;
	@ObfuscatedName("o")
	byte field54;
	@ObfuscatedName("u")
	byte field55;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		this.field53 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field53 != null) {
			var1.readUnsignedByte(); // L: 159
			this.field54 = var1.readByte();
			this.field55 = var1.readByte();
		}

	} // L: 163

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		var1.field25 = this.field53;
		if (this.field53 != null) {
			var1.field31 = this.field54;
			var1.field30 = this.field55;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljh;IB)Lgy;",
		garbageValue = "-76"
	)
	public static PacketBufferNode method100(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2235, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5;
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) {
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		class2.method34(var4.packetBuffer, var1); // L: 167
		if (var0 == class232.field2808.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "1261631339"
	)
	static String method107(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lel;I)V",
		garbageValue = "1168682149"
	)
	static final void method104(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 81
			for (var10 = 0; var10 < 8; ++var10) { // L: 82
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 83
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var20 = new Buffer(var0); // L: 86

		for (var10 = 0; var10 < 4; ++var10) { // L: 87
			for (int var11 = 0; var11 < 64; ++var11) { // L: 88
				for (int var12 = 0; var12 < 64; ++var12) { // L: 89
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 90
						int var17 = var11 & 7; // L: 95
						int var18 = var12 & 7; // L: 96
						int var19 = var7 & 3; // L: 99
						int var16;
						if (var19 == 0) { // L: 100
							var16 = var17; // L: 101
						} else if (var19 == 1) { // L: 104
							var16 = var18; // L: 105
						} else if (var19 == 2) { // L: 108
							var16 = 7 - var17; // L: 109
						} else {
							var16 = 7 - var18; // L: 112
						}

						WorldMapData_1.loadTerrain(var20, var1, var16 + var2, var3 + WorldMapSection0.method3058(var11 & 7, var12 & 7, var7), 0, 0, var7); // L: 114
					} else {
						WorldMapData_1.loadTerrain(var20, 0, -1, -1, 0, 0, 0); // L: 116
					}
				}
			}
		}

	} // L: 120

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "875003793"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 6897
			if (Client.isLowDetail && var0 != class26.Client_plane) { // L: 6898
				return;
			}

			long var7 = 0L; // L: 6899
			boolean var9 = true; // L: 6900
			boolean var10 = false; // L: 6901
			boolean var11 = false; // L: 6902
			if (var1 == 0) { // L: 6903
				var7 = WorldMapArea.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 6904
				var7 = WorldMapArea.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 6905
				var7 = WorldMapArea.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 6906
				var7 = WorldMapArea.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 6907
				var12 = WorldMapArea.scene.getObjectFlags(var0, var2, var3, var7); // L: 6908
				int var38 = WorldMapSection1.Entity_unpackID(var7); // L: 6909
				int var39 = var12 & 31; // L: 6910
				int var40 = var12 >> 6 & 3; // L: 6911
				ObjectComposition var13;
				if (var1 == 0) { // L: 6912
					WorldMapArea.scene.removeBoundaryObject(var0, var2, var3); // L: 6913
					var13 = class19.getObjectDefinition(var38); // L: 6914
					if (var13.interactType != 0) { // L: 6915
						Client.collisionMaps[var0].method2616(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 6917
					WorldMapArea.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 6918
					WorldMapArea.scene.removeGameObject(var0, var2, var3); // L: 6919
					var13 = class19.getObjectDefinition(var38); // L: 6920
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 6921
						return;
					}

					if (var13.interactType != 0) { // L: 6922
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 6924
					WorldMapArea.scene.removeFloorDecoration(var0, var2, var3); // L: 6925
					var13 = class19.getObjectDefinition(var38); // L: 6926
					if (var13.interactType == 1) { // L: 6927
						Client.collisionMaps[var0].method2621(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 6930
				var12 = var0; // L: 6931
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 6932
					var12 = var0 + 1;
				}

				Scene var41 = WorldMapArea.scene; // L: 6933
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 6934
				ObjectComposition var15 = class19.getObjectDefinition(var4); // L: 6936
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 6939
					var16 = var15.sizeX; // L: 6944
					var17 = var15.sizeY; // L: 6945
				} else {
					var16 = var15.sizeY; // L: 6940
					var17 = var15.sizeX; // L: 6941
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 6951
					var18 = (var16 >> 1) + var2; // L: 6952
					var19 = var2 + (var16 + 1 >> 1); // L: 6953
				} else {
					var18 = var2; // L: 6956
					var19 = var2 + 1; // L: 6957
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 6959
					var20 = var3 + (var17 >> 1); // L: 6960
					var21 = var3 + (var17 + 1 >> 1); // L: 6961
				} else {
					var20 = var3; // L: 6964
					var21 = var3 + 1; // L: 6965
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 6967
				int var23 = var22[var19][var21] + var22[var19][var20] + var22[var18][var20] + var22[var18][var21] >> 2; // L: 6968
				int var24 = (var2 << 7) + (var16 << 6); // L: 6969
				int var25 = (var3 << 7) + (var17 << 6); // L: 6970
				long var26 = AttackOption.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 6971
				int var28 = (var5 << 6) + var6; // L: 6972
				if (var15.int3 == 1) { // L: 6973
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 6974
					if (var15.animationId == -1 && var15.transforms == null) { // L: 6976
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 6977
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 6978
					if (var15.interactType == 1) { // L: 6979
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 6982
					if (var6 >= 12) { // L: 6990
						if (var15.animationId == -1 && var15.transforms == null) { // L: 6992
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 6993
						}

						var41.method3445(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 6994
						if (var15.interactType != 0) { // L: 6995
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 6998
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7000
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7001
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1094[var5], 0, var26, var28); // L: 7002
						if (var15.interactType != 0) { // L: 7003
							var14.method2613(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7006
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7008
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7009
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1098[var5], 0, var26, var28); // L: 7010
						if (var15.interactType != 0) { // L: 7011
							var14.method2613(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7014
							var29 = var5 + 1 & 3; // L: 7015
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7018
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7019
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7020
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7023
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7024
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field1094[var5], Tiles.field1094[var29], var26, var28); // L: 7026
							if (var15.interactType != 0) { // L: 7027
								var14.method2613(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7030
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7032
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7033
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1098[var5], 0, var26, var28); // L: 7034
							if (var15.interactType != 0) { // L: 7035
								var14.method2613(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7038
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7040
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7041
							}

							var41.method3445(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7042
							if (var15.interactType != 0) { // L: 7043
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7046
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7048
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7049
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1094[var5], 0, 0, 0, var26, var28); // L: 7050
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7053
								var29 = 16; // L: 7054
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7055
								if (var30 != 0L) { // L: 7056
									var29 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7058
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7059
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field1094[var5], 0, var29 * Tiles.field1097[var5], var29 * Tiles.field1100[var5], var26, var28); // L: 7060
							} else if (var6 == 6) { // L: 7063
								var29 = 8; // L: 7064
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7065
								if (0L != var30) { // L: 7066
									var29 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7068
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7069
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1101[var5], var29 * Tiles.field1099[var5], var26, var28); // L: 7070
							} else if (var6 == 7) { // L: 7073
								int var35 = var5 + 2 & 3; // L: 7075
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7076
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7077
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7078
							} else if (var6 == 8) { // L: 7081
								var29 = 8; // L: 7082
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7083
								if (var30 != 0L) { // L: 7084
									var29 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7087
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7088
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7089
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7090
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7093
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 7094
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1101[var5], var29 * Tiles.field1099[var5], var26, var28); // L: 7096
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 6984
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.field3621, (Renderable)null); // L: 6985
					}

					if (var36 != null) { // L: 6986
						var41.method3445(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 6987
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7101
}
