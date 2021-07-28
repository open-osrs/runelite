import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3148(0, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3140(1, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3139(2, 0),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3142(3, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3159(9, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3160(4, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3141(5, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3144(6, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3147(7, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3145(8, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3149(12, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3143(13, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3151(14, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3152(15, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3146(16, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3154(17, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3155(18, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3156(19, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3157(20, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3158(21, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3150(10, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3153(11, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field3161(22, 3);

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2086267501
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljn;",
		garbageValue = "38"
	)
	static class263[] method4892() {
		return new class263[]{class263.field3191, class263.field3189};
	}

	@ObfuscatedName("t")
	static final void method4881(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "933878299"
	)
	static int method4888(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}
}
