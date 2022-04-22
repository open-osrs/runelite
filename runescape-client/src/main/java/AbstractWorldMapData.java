import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("hz")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 406251203
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -110127755
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 100910989
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 654356143
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 27961817
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1476238073
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1237188241
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1492092043
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("w")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("k")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("d")
	byte[][][] field2334;
	@ObfuscatedName("m")
	byte[][][] field2342;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[[[[Lhl;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("t")
	boolean field2346;
	@ObfuscatedName("g")
	boolean field2347;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2346 = false;
		this.field2347 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "169222990"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "95"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2346 && this.field2347; // L: 32
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lln;B)V",
		garbageValue = "-10"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2346 = true; // L: 40
				this.field2347 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2334 = null; // L: 48
		this.field2342 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2346 = false; // L: 51
		this.field2347 = false; // L: 52
	} // L: 53

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILpi;I)V",
		garbageValue = "289519849"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4319(var1, var2, var3, var4); // L: 61
			} else {
				this.method4320(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILpi;II)V",
		garbageValue = "-1881481092"
	)
	void method4319(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILpi;IB)V",
		garbageValue = "-121"
	)
	void method4320(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2334[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2342[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7692(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "964749640"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1283249810"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Lln;Lji;I)Z",
		garbageValue = "1083179858"
	)
	public static boolean method4342(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class273.musicPatchesArchive = var0; // L: 26
		class273.musicSamplesArchive = var1; // L: 27
		class273.soundEffectsArchive = var2; // L: 28
		class273.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lca;",
		garbageValue = "-1138182451"
	)
	static ClientPreferences method4344() {
		AccessFile var0 = null; // L: 112
		ClientPreferences var1 = new ClientPreferences(); // L: 113

		try {
			var0 = ModeWhere.getPreferencesFile("", Messages.field1305.name, false); // L: 115
			byte[] var2 = new byte[(int)var0.length()]; // L: 116

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 117 118 121
				var4 = var0.read(var2, var3, var2.length - var3); // L: 119
				if (var4 == -1) {
					throw new IOException(); // L: 120
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 123
		} catch (Exception var6) { // L: 125
		}

		try {
			if (var0 != null) { // L: 127
				var0.close();
			}
		} catch (Exception var5) { // L: 129
		}

		return var1; // L: 130
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-2052179879"
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
							var21[var12] = class430.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class430.loadClassFromDescriptor(var20); // L: 173
						if (class430.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 174
							throw new SecurityException();
						}

						Method[] var13 = class430.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 175
						Method[] var14 = var13; // L: 177

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 178
							Method var16 = var14[var15]; // L: 179
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 181
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 182
								if (var17.length == var21.length) { // L: 183
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
					if (class430.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 152
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class430.loadClassFromDescriptor(var5), var6); // L: 153
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

		class54.reflectionChecks.addFirst(var2); // L: 218
	} // L: 219
}
