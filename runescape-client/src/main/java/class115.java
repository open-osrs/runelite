import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class115 extends class116 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -816403893
	)
	int field1376;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class115(class119 var1) {
		this.this$0 = var1;
		this.field1376 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1376 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2589(this.field1376);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILhy;Lfy;I)V",
		garbageValue = "-1093015978"
	)
	static final void method2495(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = class245.getObjectDefinition(var4);
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) {
			var10 = var9.sizeX;
			var11 = var9.sizeY;
		} else {
			var10 = var9.sizeY;
			var11 = var9.sizeX;
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) {
			var12 = (var10 >> 1) + var2;
			var13 = var2 + (var10 + 1 >> 1);
		} else {
			var12 = var2;
			var13 = var2 + 1;
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) {
			var14 = var3 + (var11 >> 1);
			var15 = var3 + (var11 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int[][] var16 = Tiles.Tiles_heights[var1];
		int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
		int var18 = (var2 << 7) + (var10 << 6);
		int var19 = (var3 << 7) + (var11 << 6);
		long var20 = class247.calculateTag(var2, var3, 2, var9.int1 == 0, var4);
		int var22 = (var5 << 6) + var6;
		if (var9.int3 == 1) {
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22);
			if (var9.interactType == 1) {
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
				}

				var7.method4208(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
				if (var9.interactType != 0) {
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field985[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3416(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field986[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3416(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) {
					var23 = var5 + 1 & 3;
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) {
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19);
						var25 = var9.getModel(2, var23, var16, var18, var17, var19);
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field985[var5], Tiles.field985[var23], var20, var22);
					if (var9.interactType != 0) {
						var8.method3416(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field986[var5], 0, var20, var22);
					if (var9.interactType != 0) {
						var8.method3416(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
					}

					var7.method4208(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
					if (var9.interactType != 0) {
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field985[var5], 0, 0, 0, var20, var22);
				} else {
					long var24;
					Object var26;
					if (var6 == 5) {
						var23 = 16;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field985[var5], 0, var23 * Tiles.field987[var5], var23 * Tiles.field988[var5], var20, var22);
					} else if (var6 == 6) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var24) {
							var23 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field980[var5], var23 * Tiles.field979[var5], var20, var22);
					} else if (var6 == 7) {
						int var29 = var5 + 2 & 3;
						if (var9.animationId == -1 && var9.transforms == null) {
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22);
					} else if (var6 == 8) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3;
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field980[var5], var23 * Tiles.field979[var5], var20, var22);
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.boolean3, (Renderable)null);
			}

			if (var30 != null) {
				var7.method4208(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	static final void method2501() {
		Client.field559 = 0;
		int var0 = (class67.localPlayer.x >> 7) + WorldMapSectionType.baseX;
		int var1 = (class67.localPlayer.y >> 7) + PlayerComposition.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field559 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field559 = 1;
		}

		if (Client.field559 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field559 = 0;
		}

	}
}
