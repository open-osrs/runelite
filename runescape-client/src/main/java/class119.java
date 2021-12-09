import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class119 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "237909291"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "935400693"
	)
	static void method2689() {
		Tiles.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null; // L: 65
		Tiles.Tiles_shapes = null; // L: 66
		WorldMapLabelSize.field2580 = null; // L: 67
		ClanChannelMember.field1504 = null; // L: 68
		SoundCache.field321 = null; // L: 69
		class194.field2280 = null; // L: 70
		Tiles.Tiles_hue = null; // L: 71
		User.Tiles_saturation = null; // L: 72
		Tiles.Tiles_lightness = null; // L: 73
		UserComparator5.Tiles_hueMultiplier = null; // L: 74
		VerticalAlignment.field1874 = null; // L: 75
	} // L: 76
}
