import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dv")
public enum class126 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1478(3, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1472(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1475(0, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1471(2, 3);

	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -137966849
	)
	static int field1477;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1230952189
	)
	public final int field1476;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1895212337
	)
	@Export("id")
	final int id;

	class126(int var3, int var4) {
		this.field1476 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILfv;Lfl;I)Z",
		garbageValue = "773199709"
	)
	public static final boolean method2595(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class160.directions[var6][var7] = 99; // L: 25
		class160.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class160.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class160.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var11 != var18) { // L: 34
			var4 = class160.bufferX[var11]; // L: 35
			var5 = class160.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				Login.field1033 = var4; // L: 43
				GrandExchangeOfferOwnWorldComparator.field608 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class160.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class160.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class160.bufferX[var18] = var4 - 1; // L: 49
				class160.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class160.directions[var16 - 1][var17] = 2; // L: 52
				class160.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class160.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class160.bufferX[var18] = var4 + 1; // L: 56
				class160.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class160.directions[var16 + 1][var17] = 8; // L: 59
				class160.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class160.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class160.bufferX[var18] = var4;
				class160.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16][var17 - 1] = 1;
				class160.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class160.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class160.bufferX[var18] = var4; // L: 70
				class160.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class160.directions[var16][var17 + 1] = 4; // L: 73
				class160.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class160.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class160.bufferX[var18] = var4 - 1; // L: 77
				class160.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class160.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class160.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class160.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class160.bufferX[var18] = var4 + 1; // L: 84
				class160.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class160.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class160.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class160.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class160.bufferX[var18] = var4 - 1; // L: 91
				class160.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class160.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class160.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class160.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class160.bufferX[var18] = var4 + 1; // L: 98
				class160.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class160.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class160.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		Login.field1033 = var4; // L: 105
		GrandExchangeOfferOwnWorldComparator.field608 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "985430780"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 133
		var2.size = var0.readUnsignedByte(); // L: 134
		var2.id = var0.readInt(); // L: 135
		var2.operations = new int[var2.size]; // L: 136
		var2.creationErrors = new int[var2.size]; // L: 137
		var2.fields = new Field[var2.size]; // L: 138
		var2.intReplaceValues = new int[var2.size]; // L: 139
		var2.methods = new Method[var2.size]; // L: 140
		var2.arguments = new byte[var2.size][][]; // L: 141

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 142
			try {
				int var4 = var0.readUnsignedByte(); // L: 144
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 145
					if (var4 == 3 || var4 == 4) { // L: 155
						var5 = var0.readStringCp1252NullTerminated(); // L: 156
						var6 = var0.readStringCp1252NullTerminated(); // L: 157
						var7 = var0.readUnsignedByte(); // L: 158
						String[] var8 = new String[var7]; // L: 159

						for (int var9 = 0; var9 < var7; ++var9) { // L: 160
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 161
						byte[][] var10 = new byte[var7][]; // L: 162
						int var12;
						if (var4 == 3) { // L: 163
							for (int var11 = 0; var11 < var7; ++var11) { // L: 164
								var12 = var0.readInt(); // L: 165
								var10[var11] = new byte[var12]; // L: 166
								var0.readBytes(var10[var11], 0, var12); // L: 167
							}
						}

						var2.operations[var3] = var4; // L: 170
						Class[] var21 = new Class[var7]; // L: 171

						for (var12 = 0; var12 < var7; ++var12) { // L: 172
							var21[var12] = FontName.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = FontName.loadClassFromDescriptor(var20); // L: 173
						if (FontName.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 174
							throw new SecurityException();
						}

						Method[] var13 = FontName.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 175
						Method[] var14 = var13; // L: 177

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 178
							Method var16 = var14[var15]; // L: 179
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 181
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 182
								if (var21.length == var17.length) { // L: 183
									boolean var18 = true; // L: 184

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 185
										if (var17[var19] != var21[var19]) { // L: 186
											var18 = false; // L: 187
											break; // L: 188
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 191
										var2.methods[var3] = var16; // L: 192
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 199
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 146
					var6 = var0.readStringCp1252NullTerminated(); // L: 147
					var7 = 0; // L: 148
					if (var4 == 1) { // L: 149
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 150
					var2.intReplaceValues[var3] = var7; // L: 151
					if (FontName.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 152
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(FontName.loadClassFromDescriptor(var5), var6); // L: 153
				}
			} catch (ClassNotFoundException var24) { // L: 202
				var2.creationErrors[var3] = -1; // L: 203
			} catch (SecurityException var25) { // L: 205
				var2.creationErrors[var3] = -2; // L: 206
			} catch (NullPointerException var26) { // L: 208
				var2.creationErrors[var3] = -3; // L: 209
			} catch (Exception var27) { // L: 211
				var2.creationErrors[var3] = -4; // L: 212
			} catch (Throwable var28) { // L: 214
				var2.creationErrors[var3] = -5; // L: 215
			}
		}

		class69.reflectionChecks.addFirst(var2); // L: 218
	} // L: 219

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69
}
