import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1459599171
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "723580004"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "-1873217499"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILfg;Lfy;I)Z",
		garbageValue = "823697752"
	)
	static final boolean method2715(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class161.directions[var6][var7] = 99;
		class161.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class161.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class161.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class161.bufferX[var11];
			var5 = class161.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				SoundSystem.field219 = var4;
				class161.field1896 = var5;
				return true;
			}

			int var15 = class161.distances[var16][var17] + 1;
			if (var16 > 0 && class161.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17] = 2;
				class161.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class161.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17] = 8;
				class161.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class161.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class161.bufferX[var18] = var4;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16][var17 - 1] = 1;
				class161.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class161.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class161.bufferX[var18] = var4;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16][var17 + 1] = 4;
				class161.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class161.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17 - 1] = 3;
				class161.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class161.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17 - 1] = 9;
				class161.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class161.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class161.bufferX[var18] = var4 - 1;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 - 1][var17 + 1] = 6;
				class161.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class161.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class161.bufferX[var18] = var4 + 1;
				class161.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class161.directions[var16 + 1][var17 + 1] = 12;
				class161.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		SoundSystem.field219 = var4;
		class161.field1896 = var5;
		return false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099813697"
	)
	static void method2713() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1467913465"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
