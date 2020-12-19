import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -333963767
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 58962995
	)
	@Export("size")
	int size;
	@ObfuscatedName("x")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("w")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("t")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("j")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("n")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("p")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "527859339"
	)
	static final void method2350(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 139
			for (int var4 = 0; var4 < 8; ++var4) { // L: 140
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 142
			for (var3 = 1; var3 < 8; ++var3) { // L: 143
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 145
			for (var3 = 1; var3 < 8; ++var3) { // L: 146
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 148
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 149
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 150
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 151
}
