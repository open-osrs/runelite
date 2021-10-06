import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("bm")
	static String field1009;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("q")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("f")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lfn;",
		garbageValue = "1889107784"
	)
	public static HitSplatDefinition method2057(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "159025977"
	)
	static int method2059(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var6;
			if (var2.texture >= 0) {
				var6 = Client.method1588(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var6] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var6 = class275.method5120(var2.hue, var2.saturation, var2.lightness);
				int var5 = Client.method1588(var6, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2066251620"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var0)) {
			MouseHandler.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
		}
	}
}
