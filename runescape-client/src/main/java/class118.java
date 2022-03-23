import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class118 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1452;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1444;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1443;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1446;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1445;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static final class118 field1448;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1928429829
	)
	final int field1449;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1028613151
	)
	final int field1450;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -529565057
	)
	final int field1447;

	static {
		field1452 = new class118(0, 0, (String)null, 0);
		field1444 = new class118(1, 1, (String)null, 9);
		field1443 = new class118(2, 2, (String)null, 3);
		field1446 = new class118(3, 3, (String)null, 6); // L: 17
		field1445 = new class118(4, 4, (String)null, 1);
		field1448 = new class118(5, 5, (String)null, 3);
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1449 = var1;
		this.field1450 = var2; // L: 26
		this.field1447 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "69492922"
	)
	int method2727() {
		return this.field1447; // L: 31
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1450;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llp;I)I",
		garbageValue = "-1161089510"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = MenuAction.method1877(var9); // L: 33
			byte var11;
			if (var10 == 198) { // L: 36
				var11 = 69; // L: 37
			} else if (var10 == 230) { // L: 40
				var11 = 101; // L: 41
			} else if (var10 == 223) { // L: 44
				var11 = 115; // L: 45
			} else if (var10 == 338) { // L: 48
				var11 = 69; // L: 49
			} else if (var10 == 339) { // L: 52
				var11 = 101; // L: 53
			} else {
				var11 = 0; // L: 56
			}

			var8 = var11; // L: 58
			var9 = GameEngine.standardizeChar(var9, var2); // L: 59
			var10 = GameEngine.standardizeChar(var10, var2); // L: 60
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 61
				var9 = Character.toLowerCase(var9); // L: 62
				var10 = Character.toLowerCase(var10); // L: 63
				if (var10 != var9) {
					return WorldMapData_0.lowercaseChar(var9, var2) - WorldMapData_0.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 67

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 68
			if (var2 == Language.Language_FR) { // L: 69
				var5 = var3 - 1 - var17; // L: 70
				var6 = var4 - 1 - var17; // L: 71
			} else {
				var6 = var17; // L: 73
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 74
			var12 = var1.charAt(var6); // L: 75
			if (var18 != var12 && Character.toUpperCase(var18) != Character.toUpperCase(var12)) { // L: 76
				var18 = Character.toLowerCase(var18); // L: 77
				var12 = Character.toLowerCase(var12); // L: 78
				if (var12 != var18) {
					return WorldMapData_0.lowercaseChar(var18, var2) - WorldMapData_0.lowercaseChar(var12, var2); // L: 79
				}
			}
		}

		var17 = var3 - var4; // L: 82
		if (var17 != 0) { // L: 83
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 84
				var12 = var0.charAt(var19); // L: 85
				char var13 = var1.charAt(var19); // L: 86
				if (var12 != var13) { // L: 87
					return WorldMapData_0.lowercaseChar(var12, var2) - WorldMapData_0.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 89
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)Ljava/lang/String;",
		garbageValue = "54"
	)
	public static String method2737(Buffer var0) {
		return DynamicObject.method1988(var0, 32767); // L: 64
	}
}
