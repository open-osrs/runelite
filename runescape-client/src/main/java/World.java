import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("World")
public class World {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -49642273
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1914794519
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("s")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("r")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2104390663
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1147317399
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1040415463
	)
	@Export("population")
	int population;
	@ObfuscatedName("b")
	@Export("host")
	String host;
	@ObfuscatedName("t")
	@Export("activity")
	String activity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1070673927
	)
	@Export("location")
	int location;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1367786099
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1167895037"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1033703792"
	)
	boolean method1615() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "20770"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	boolean method1644() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "78921463"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1500446551"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-97"
	)
	boolean method1619() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "-1000029725"
	)
	public static void method1662(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "59"
	)
	static void method1663(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 31
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 32
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 34
					return; // L: 35
				} catch (Exception var5) { // L: 37
				}
			}

			if (class29.field168.startsWith("win") && !var3) { // L: 39 40
				Skills.method5578(var0, 0, "openjs"); // L: 42
				return; // L: 44
			}

			if (class29.field168.startsWith("mac")) { // L: 47
				Skills.method5578(var0, 1, var2); // L: 48
				return; // L: 49
			}

			Skills.method5578(var0, 2, "openjs"); // L: 52
		} else {
			Skills.method5578(var0, 3, "openjs"); // L: 57
		}

	} // L: 60

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-105"
	)
	static final void method1661(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 153
			for (int var4 = 0; var4 < 8; ++var4) { // L: 154
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 156
			for (var3 = 1; var3 < 8; ++var3) { // L: 157
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 159
			for (var3 = 1; var3 < 8; ++var3) { // L: 160
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 162
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 165

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lao;B)V",
		garbageValue = "1"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	static final void method1664(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12037
		var0 = 100 - var0; // L: 12038
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 12039
		Rasterizer3D.Rasterizer3D_setBrightness((double)var1); // L: 12041
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness((double)var1); // L: 12042
		VerticalAlignment.method3446(); // L: 12043
		class12.clientPreferences.method2232((double)var1); // L: 12044
	} // L: 12046
}
