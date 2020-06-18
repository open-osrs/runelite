import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class307 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "-549793273"
	)
	static int method5650(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return ArchiveLoader.method1213(var0, var1, var2);
		} else if (var0 < 1100) {
			return GrandExchangeOfferOwnWorldComparator.method1342(var0, var1, var2);
		} else if (var0 < 1200) {
			return InvDefinition.method4530(var0, var1, var2);
		} else if (var0 < 1300) {
			return PlayerType.method4289(var0, var1, var2);
		} else if (var0 < 1400) {
			return GrandExchangeOfferWorldComparator.method137(var0, var1, var2);
		} else if (var0 < 1500) {
			return Tiles.method1199(var0, var1, var2);
		} else if (var0 < 1600) {
			return MusicPatchNode.method3964(var0, var1, var2);
		} else if (var0 < 1700) {
			return ReflectionCheck.method2418(var0, var1, var2);
		} else if (var0 < 1800) {
			return PendingSpawn.method1808(var0, var1, var2);
		} else if (var0 < 1900) {
			return class7.method100(var0, var1, var2);
		} else if (var0 < 2000) {
			return SoundSystem.method2630(var0, var1, var2);
		} else if (var0 < 2100) {
			return GrandExchangeOfferOwnWorldComparator.method1342(var0, var1, var2);
		} else if (var0 < 2200) {
			return InvDefinition.method4530(var0, var1, var2);
		} else if (var0 < 2300) {
			return PlayerType.method4289(var0, var1, var2);
		} else if (var0 < 2400) {
			return GrandExchangeOfferWorldComparator.method137(var0, var1, var2);
		} else if (var0 < 2500) {
			return Tiles.method1199(var0, var1, var2);
		} else if (var0 < 2600) {
			return Huffman.method4099(var0, var1, var2);
		} else if (var0 < 2700) {
			return Clock.method3641(var0, var1, var2);
		} else if (var0 < 2800) {
			return GrandExchangeOffer.method194(var0, var1, var2);
		} else if (var0 < 2900) {
			return WorldMapManager.method717(var0, var1, var2);
		} else if (var0 < 3000) {
			return SoundSystem.method2630(var0, var1, var2);
		} else if (var0 < 3200) {
			return WorldMapEvent.method836(var0, var1, var2);
		} else if (var0 < 3300) {
			return MusicPatchNode.method3969(var0, var1, var2);
		} else if (var0 < 3400) {
			return UrlRequester.method3424(var0, var1, var2);
		} else if (var0 < 3500) {
			return SecureRandomFuture.method2272(var0, var1, var2);
		} else if (var0 < 3700) {
			return class4.method63(var0, var1, var2);
		} else if (var0 < 4000) {
			return NPCDefinition.method4922(var0, var1, var2);
		} else if (var0 < 4100) {
			return SecureRandomCallable.method1203(var0, var1, var2);
		} else if (var0 < 4200) {
			return TileItemPile.method2902(var0, var1, var2);
		} else if (var0 < 4300) {
			return TextureProvider.method2888(var0, var1, var2);
		} else if (var0 < 5100) {
			return Entity.method3376(var0, var1, var2);
		} else if (var0 < 5400) {
			return class231.method4277(var0, var1, var2);
		} else if (var0 < 5600) {
			return class231.method4278(var0, var1, var2);
		} else if (var0 < 5700) {
			return class278.method5158(var0, var1, var2);
		} else if (var0 < 6300) {
			return AttackOption.method2180(var0, var1, var2);
		} else if (var0 < 6600) {
			return LoginScreenAnimation.method1883(var0, var1, var2);
		} else {
			return var0 < 6700 ? WorldMapIcon_0.method265(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		signature = "(IIIIIB)V",
		garbageValue = "51"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = UserComparator3.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) {
			var7 = UserComparator3.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var12 = 0L != var5;
			if (var12) {
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1;
				var12 = !var13;
			}

			if (var12) {
				var10 = var4;
			}

			int[] var19 = class3.sceneMinimapSprite.pixels;
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = Language.Entity_unpackID(var5);
			ObjectDefinition var15 = Canvas.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = UserComparator6.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 1) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var19[var26] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = UserComparator3.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = UserComparator3.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = Language.Entity_unpackID(var5);
			ObjectDefinition var20 = Canvas.getObjectDefinition(var10);
			if (var20.mapSceneId != -1) {
				IndexedSprite var28 = UserComparator6.mapSceneSprites[var20.mapSceneId];
				if (var28 != null) {
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2;
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2;
					var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48);
				}
			} else if (var9 == 9) {
				int var25 = 15658734;
				boolean var27 = var5 != 0L;
				if (var27) {
					boolean var23 = (int)(var5 >>> 16 & 1L) == 1;
					var27 = !var23;
				}

				if (var27) {
					var25 = 15597568;
				}

				int[] var24 = class3.sceneMinimapSprite.pixels;
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var24[var29] = var25;
					var24[var29 + 1 + 512] = var25;
					var24[var29 + 1024 + 2] = var25;
					var24[var29 + 1536 + 3] = var25;
				} else {
					var24[var29 + 1536] = var25;
					var24[var29 + 1 + 1024] = var25;
					var24[var29 + 512 + 2] = var25;
					var24[var29 + 3] = var25;
				}
			}
		}

		var5 = UserComparator3.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = Language.Entity_unpackID(var5);
			ObjectDefinition var21 = Canvas.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = UserComparator6.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var11 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var11 + 48);
				}
			}
		}

	}
}
