import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class33 {
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = -395666535
	)
	static int field243;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1774695568"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class242.loadInterface(var0)) {
				Widget[] var1 = MouseRecorder.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						ScriptFrame.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059461480"
	)
	static final void method656() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == class20.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field538);
					if (var0.isFinished) {
						var0.remove();
					} else {
						class7.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "79"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class7.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) {
			var7 = class7.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class116.method2671(var5)) {
				var10 = var4;
			}

			int[] var11 = class29.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = PacketWriter.Entity_unpackID(var5);
			ObjectComposition var14 = class148.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = AbstractWorldMapData.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class7.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class7.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = PacketWriter.Entity_unpackID(var5);
			ObjectComposition var24 = class148.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = AbstractWorldMapData.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class116.method2671(var5)) {
					var12 = 15597568;
				}

				int[] var18 = class29.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = class7.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = PacketWriter.Entity_unpackID(var5);
			ObjectComposition var21 = class148.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = AbstractWorldMapData.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}
}
