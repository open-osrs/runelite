import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("z")
	static final int[] field1711;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2064389097
	)
	static int field1710;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 632538905
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 195506189
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 891667147
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1711 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1711[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "812293859"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 27
			if (var2 == 0) { // L: 28
				return; // L: 31
			}

			this.decodeNext(var1, var2); // L: 29
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IS)V",
		garbageValue = "21911"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 34
			this.baseVar = var1.readUnsignedShort(); // L: 35
			this.startBit = var1.readUnsignedByte(); // L: 36
			this.endBit = var1.readUnsignedByte(); // L: 37
		}

	} // L: 40

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-15726"
	)
	public static int method2813(int var0) {
		return PacketWriter.method2409(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 66
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "-20141"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4597
			var2 = 1;
		}

		if (var3 < 1) { // L: 4598
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4599
		int var6;
		if (var5 < 0) { // L: 4601
			var6 = Client.field820;
		} else if (var5 >= 100) { // L: 4602
			var6 = Client.field872;
		} else {
			var6 = (Client.field872 - Client.field820) * var5 / 100 + Client.field820; // L: 4603
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4604
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field877) { // L: 4605
			var14 = Client.field877; // L: 4606
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4607
			if (var6 > Client.field738) { // L: 4608
				var6 = Client.field738; // L: 4609
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 4610
				var9 = (var2 - var8) / 2; // L: 4611
				if (var4) { // L: 4612
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4613
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4614
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4615
				}

				var0 += var9; // L: 4617
				var2 -= var9 * 2; // L: 4618
			}
		} else if (var7 > Client.field878) { // L: 4621
			var14 = Client.field878; // L: 4622
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4623
			if (var6 < Client.field875) { // L: 4624
				var6 = Client.field875; // L: 4625
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 4626
				var9 = (var3 - var8) / 2; // L: 4627
				if (var4) { // L: 4628
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4629
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4630
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4631
				}

				var1 += var9; // L: 4633
				var3 -= var9 * 2; // L: 4634
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4637
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4638
			int[] var13 = new int[9]; // L: 4640

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 4641
				int var10 = var9 * 32 + 15 + 128; // L: 4642
				int var11 = class21.method281(var10); // L: 4643
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4644
				var11 = PlayerComposition.method4640(var11, var3); // L: 4645
				var13[var9] = var12 * var11 >> 16; // L: 4646
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 4648
		}

		Client.viewportOffsetX = var0; // L: 4651
		Client.viewportOffsetY = var1; // L: 4652
		Client.viewportWidth = var2; // L: 4653
		Client.viewportHeight = var3; // L: 4654
	} // L: 4655

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "7"
	)
	static void method2818(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 11714
			Client.randomDatData = new byte[24];
		}

		class306.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 11715
	} // L: 11716
}
