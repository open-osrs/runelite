import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1718223303
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1554436787
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1579568443
	)
	@Export("size")
	int size;
	@ObfuscatedName("y")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("j")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("o")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("r")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Ljs;",
		garbageValue = "1563707266"
	)
	public static GameBuild method1228(int var0) {
		GameBuild[] var1 = UserComparator8.method2538(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lbk;IZIZB)I",
		garbageValue = "88"
	)
	static int method1227(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = WorldMapRectangle.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = WorldMapRectangle.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "111"
	)
	static void method1230(int var0, int var1) {
		if (class4.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 3795
			class105.method2357(class160.archive11, var0, 0, class4.clientPreferences.musicVolume, false); // L: 3796
			Client.field862 = true; // L: 3797
		}

	} // L: 3799

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static final void method1229(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7766
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7767
				Client.field712[var4] = true;
			}
		}

	} // L: 7769
}
