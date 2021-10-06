import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -251028917
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1748239019
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 744846681
	)
	@Export("health")
	int health;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1258923613
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2039342643
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "114"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "-1645463338"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = GrandExchangeOfferTotalQuantityComparator.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "328791269"
	)
	public static void method2161() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	static final void method2158() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method4141(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method4183(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method4141(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method4183(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method4139(var6, var11, var3, var2);
			var11 = Rasterizer3D.method4125(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method4139(var8, var12, var3, var2);
			var12 = Rasterizer3D.method4125(var8, var12, var3, var2);
			class122.field1426 = (var6 + var10) / 2;
			ViewportMouse.field2585 = (var7 + var9) / 2;
			DirectByteArrayCopier.field3212 = (var12 + var11) / 2;
			MilliClock.field1588 = (var10 - var6) / 2;
			ViewportMouse.field2579 = (var9 - var7) / 2;
			class121.field1412 = (var12 - var11) / 2;
			Interpreter.field829 = Math.abs(MilliClock.field1588);
			ViewportMouse.field2580 = Math.abs(ViewportMouse.field2579);
			class19.field98 = Math.abs(class121.field1412);
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1391228177"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[VertexNormal.Client_plane][var0][var1];
		if (var2 == null) {
			PlayerComposition.scene.removeGroundItemPile(VertexNormal.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class87.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				PlayerComposition.scene.removeGroundItemPile(VertexNormal.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = class247.calculateTag(var0, var1, 3, false, 0);
				PlayerComposition.scene.newGroundItemPile(VertexNormal.Client_plane, var0, var1, MidiPcmStream.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, VertexNormal.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
