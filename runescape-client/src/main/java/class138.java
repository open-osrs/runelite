import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class138 extends class116 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -4891272861278655519L
	)
	long field1531;
	@ObfuscatedName("q")
	String field1530;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class138(class119 var1) {
		this.this$0 = var1;
		this.field1531 = -1L;
		this.field1530 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1531 = var1.readLong();
		}

		this.field1530 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2637(this.field1531, this.field1530);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2103757057"
	)
	public static boolean method2756(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1334798040"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class386.World_worlds != null) {
			class184.doWorldSorting(0, class386.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30429"
	)
	public static void method2754() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "776366170"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = PlayerComposition.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = PlayerComposition.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class7.method60(var5)) {
				var10 = var4;
			}

			int[] var11 = class11.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = InterfaceParent.Entity_unpackID(var5);
			ObjectComposition var14 = class245.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
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

		var5 = PlayerComposition.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = PlayerComposition.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = InterfaceParent.Entity_unpackID(var5);
			ObjectComposition var24 = class245.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class7.method60(var5)) {
					var12 = 15597568;
				}

				int[] var18 = class11.sceneMinimapSprite.pixels;
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

		var5 = PlayerComposition.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = InterfaceParent.Entity_unpackID(var5);
			ObjectComposition var21 = class245.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48);
				}
			}
		}

	}
}
