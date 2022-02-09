import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class124 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 2123389290096035419L
	)
	long field1511;
	@ObfuscatedName("l")
	String field1510;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class124(class129 var1) {
		this.this$0 = var1;
		this.field1511 = -1L; // L: 74
		this.field1510 = null; // L: 75
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1511 = var1.readLong(); // L: 82
		}

		this.field1510 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2859(this.field1511, this.field1510, 0); // L: 88
	} // L: 89

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "263719312"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 156
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-28"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4601
			var2 = 1;
		}

		if (var3 < 1) { // L: 4602
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4603
		int var6;
		if (var5 < 0) { // L: 4605
			var6 = Client.field775;
		} else if (var5 >= 100) { // L: 4606
			var6 = Client.field759;
		} else {
			var6 = (Client.field759 - Client.field775) * var5 / 100 + Client.field775; // L: 4607
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4608
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field656) { // L: 4609
			var10 = Client.field656; // L: 4610
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4611
			if (var6 > Client.field763) { // L: 4612
				var6 = Client.field763; // L: 4613
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4614
				var9 = (var2 - var8) / 2; // L: 4615
				if (var4) { // L: 4616
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4617
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4618
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4619
				}

				var0 += var9; // L: 4621
				var2 -= var9 * 2; // L: 4622
			}
		} else if (var7 > Client.field514) { // L: 4625
			var10 = Client.field514; // L: 4626
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4627
			if (var6 < Client.field762) { // L: 4628
				var6 = Client.field762; // L: 4629
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4630
				var9 = (var3 - var8) / 2; // L: 4631
				if (var4) { // L: 4632
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4633
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4634
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4635
				}

				var1 += var9; // L: 4637
				var3 -= var9 * 2; // L: 4638
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4641
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4642
			NetSocket.method3096(var2, var3); // L: 4643
		}

		Client.viewportOffsetX = var0; // L: 4645
		Client.viewportOffsetY = var1; // L: 4646
		Client.viewportWidth = var2; // L: 4647
		Client.viewportHeight = var3; // L: 4648
	} // L: 4649

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljz;I)Ljava/lang/String;",
		garbageValue = "926041177"
	)
	static String method2725(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10251
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10252
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10254
					if (var3 == -1) { // L: 10255
						break;
					}

					var0 = var0.substring(0, var3) + class231.method4766(class376.method6791(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10256
				}
			}
		}

		return var0; // L: 10260
	}
}
