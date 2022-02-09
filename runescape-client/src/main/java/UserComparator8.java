import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		longValue = -2764549140117055915L
	)
	static long field1347;
	@ObfuscatedName("hk")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;B)I",
		garbageValue = "-21"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-2066646515"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method2449() {
		class33.method626(); // L: 2778
		ReflectionCheck.method631(); // L: 2779
		KitDefinition.KitDefinition_cached.clear(); // L: 2781
		class21.method301(); // L: 2783
		class113.method2603(); // L: 2784
		ItemComposition.ItemDefinition_cached.clear(); // L: 2786
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 2787
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 2788
		Clock.method3121(); // L: 2790
		WorldMapSectionType.method4726(); // L: 2791
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2793
		class87.method2222(); // L: 2795
		class115.HitSplatDefinition_cachedSprites.method7213(); // L: 2796
		FloorOverlayDefinition.HitSplatDefinition_cached.method7213(); // L: 2797
		class67.method1897(); // L: 2798
		class18.method268(); // L: 2799
		MouseRecorder.method2100(); // L: 2800
		HealthBarDefinition.method3246(); // L: 2801
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2803
		Language.method5812(); // L: 2805
		VertexNormal.method4265(); // L: 2806
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2807
		Script.Script_cached.clear(); // L: 2808
		class7.archive0.clearFiles(); // L: 2809
		Client.archive1.clearFiles(); // L: 2810
		Tile.archive3.clearFiles(); // L: 2811
		class403.archive4.clearFiles(); // L: 2812
		Client.archive5.clearFiles(); // L: 2813
		WorldMapLabelSize.archive6.clearFiles(); // L: 2814
		WorldMapLabelSize.archive7.clearFiles(); // L: 2815
		Message.archive8.clearFiles(); // L: 2816
		class9.archive9.clearFiles(); // L: 2817
		Tile.archive10.clearFiles(); // L: 2818
		class252.archive11.clearFiles(); // L: 2819
		class148.archive12.clearFiles(); // L: 2820
	} // L: 2821
}
