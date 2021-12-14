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
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "935400693"
	)
	static void method2689() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		WorldMapLabelSize.field2580 = null;
		ClanChannelMember.field1504 = null;
		SoundCache.field321 = null;
		class194.field2280 = null;
		Tiles.Tiles_hue = null;
		User.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		UserComparator5.Tiles_hueMultiplier = null;
		VerticalAlignment.field1874 = null;
	}
}
