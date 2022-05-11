import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3571(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3570(1, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3558(2, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3559(3, 0),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3560(9, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3556(4, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3564(5, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3563(6, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3572(7, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3565(8, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3566(12, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3567(13, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3557(14, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3569(15, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3576(16, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3561(17, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3568(18, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3573(19, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3574(20, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3575(21, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3562(10, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3577(11, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	field3578(22, 3);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1442497389
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)V",
		garbageValue = "1049661564"
	)
	static final void method5575(Widget var0) {
		int var1 = var0.contentType; // L: 12160
		if (var1 == 324) { // L: 12161
			if (Client.field602 == -1) { // L: 12162
				Client.field602 = var0.spriteId2; // L: 12163
				Client.field763 = var0.spriteId; // L: 12164
			}

			if (Client.playerAppearance.isFemale) { // L: 12166
				var0.spriteId2 = Client.field602;
			} else {
				var0.spriteId2 = Client.field763; // L: 12167
			}

		} else if (var1 == 325) { // L: 12170
			if (Client.field602 == -1) { // L: 12171
				Client.field602 = var0.spriteId2; // L: 12172
				Client.field763 = var0.spriteId; // L: 12173
			}

			if (Client.playerAppearance.isFemale) { // L: 12175
				var0.spriteId2 = Client.field763;
			} else {
				var0.spriteId2 = Client.field602; // L: 12176
			}

		} else if (var1 == 327) { // L: 12179
			var0.modelAngleX = 150; // L: 12180
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12181
			var0.modelType = 5; // L: 12182
			var0.modelId = 0; // L: 12183
		} else if (var1 == 328) { // L: 12186
			var0.modelAngleX = 150; // L: 12187
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12188
			var0.modelType = 5; // L: 12189
			var0.modelId = 1; // L: 12190
		}
	} // L: 12168 12177 12184 12191 12193
}
