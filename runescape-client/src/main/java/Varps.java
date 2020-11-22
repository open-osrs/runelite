import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("f")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("b")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("l")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;Liw;Liw;I)V",
		garbageValue = "-990913751"
	)
	public static void method4126(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Decimator.Widget_archive = var0; // L: 186
		GameBuild.Widget_modelsArchive = var1; // L: 187
		Widget.Widget_spritesArchive = var2; // L: 188
		Widget.Widget_fontsArchive = var3; // L: 189
		Widget.Widget_interfaceComponents = new Widget[Decimator.Widget_archive.getGroupCount()][]; // L: 190
		Widget.Widget_loadedInterfaces = new boolean[Decimator.Widget_archive.getGroupCount()]; // L: 191
	} // L: 192

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1995457762"
	)
	public static int method4122(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lbi;III)V",
		garbageValue = "-843887273"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4177
			int var3 = class105.SequenceDefinition_get(var1).field3551; // L: 4178
			if (var3 == 1) { // L: 4179
				var0.sequenceFrame = 0; // L: 4180
				var0.sequenceFrameCycle = 0; // L: 4181
				var0.sequenceDelay = var2; // L: 4182
				var0.field1022 = 0; // L: 4183
			}

			if (var3 == 2) { // L: 4185
				var0.field1022 = 0; // L: 4186
			}
		} else if (var1 == -1 || var0.sequence == -1 || class105.SequenceDefinition_get(var1).field3545 >= class105.SequenceDefinition_get(var0.sequence).field3545) { // L: 4189
			var0.sequence = var1; // L: 4190
			var0.sequenceFrame = 0; // L: 4191
			var0.sequenceFrameCycle = 0; // L: 4192
			var0.sequenceDelay = var2; // L: 4193
			var0.field1022 = 0; // L: 4194
			var0.field1034 = var0.pathLength; // L: 4195
		}

	} // L: 4197
}
