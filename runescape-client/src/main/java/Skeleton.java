import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1049112805
	)
	static int field2287;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2039033351
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1780750535
	)
	@Export("count")
	int count;
	@ObfuscatedName("f")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("y")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 13
		Buffer var3 = new Buffer(var2); // L: 14
		this.count = var3.readUnsignedByte(); // L: 15
		this.transformTypes = new int[this.count]; // L: 16
		this.labels = new int[this.count][]; // L: 17

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 18
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 19
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 20
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 21
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-651931102"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = FontName.method6299(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2037150007"
	)
	static void method3921() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-698896598"
	)
	static final int method3920(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 804
		int var4 = var0 & var2 - 1; // L: 805
		int var5 = var1 / var2; // L: 806
		int var6 = var1 & var2 - 1; // L: 807
		int var7 = Occluder.method4109(var3, var5); // L: 808
		int var8 = Occluder.method4109(var3 + 1, var5); // L: 809
		int var9 = Occluder.method4109(var3, var5 + 1); // L: 810
		int var10 = Occluder.method4109(var3 + 1, var5 + 1); // L: 811
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 814
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 815
		int var13 = SoundSystem.method806(var9, var10, var4, var2); // L: 818
		int var15 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 821
		int var14 = ((65536 - var15) * var11 >> 16) + (var13 * var15 >> 16); // L: 822
		return var14; // L: 824
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILii;ZI)V",
		garbageValue = "1737731022"
	)
	static void method3922(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = HealthBarUpdate.getWorldMap().getMapArea(var0); // L: 4336
		int var4 = class93.localPlayer.plane; // L: 4337
		int var5 = (class93.localPlayer.x >> 7) + VertexNormal.baseX; // L: 4338
		int var6 = (class93.localPlayer.y >> 7) + SoundSystem.baseY; // L: 4339
		Coord var7 = new Coord(var4, var5, var6); // L: 4340
		HealthBarUpdate.getWorldMap().method6291(var3, var7, var1, var2); // L: 4341
	} // L: 4342
}
