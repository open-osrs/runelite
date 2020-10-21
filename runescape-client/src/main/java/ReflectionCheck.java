import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -556270823
	)
	static int field1364;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -296860669
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 989914791
	)
	@Export("size")
	int size;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("z")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("q")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("k")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("c")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IZZZS)Lid;",
		garbageValue = "255"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 2297
		if (JagexCache.JagexCache_dat2File != null) { // L: 2298
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, GrandExchangeOfferWorldComparator.masterDisk, var0, var1, var2, var3); // L: 2299
	}
}
