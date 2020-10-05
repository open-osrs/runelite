import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("bl")
	static String otp;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	static Player localPlayer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1823121257
	)
	final int field141;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1477308657
	)
	final int field142;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2124591757
	)
	final int field143;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field141 = var1; // L: 19
		this.field142 = var2; // L: 20
		this.field143 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "459902190"
	)
	boolean method274(float var1) {
		return var1 >= (float)this.field143; // L: 25
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lab;",
		garbageValue = "-681769299"
	)
	static WorldMapLabelSize[] method272() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 15
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lab;",
		garbageValue = "-1798165696"
	)
	static WorldMapLabelSize method270(int var0) {
		WorldMapLabelSize[] var1 = method272(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field142) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IB)V",
		garbageValue = "-8"
	)
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 127
		var2.size = var0.readUnsignedByte(); // L: 128
		var2.id = var0.readInt(); // L: 129
		var2.operations = new int[var2.size]; // L: 130
		var2.creationErrors = new int[var2.size]; // L: 131
		var2.fields = new Field[var2.size]; // L: 132
		var2.intReplaceValues = new int[var2.size]; // L: 133
		var2.methods = new Method[var2.size]; // L: 134
		var2.arguments = new byte[var2.size][][]; // L: 135

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 136
			try {
				int var4 = var0.readUnsignedByte(); // L: 138
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 139
					if (var4 == 3 || var4 == 4) { // L: 149
						var5 = var0.readStringCp1252NullTerminated(); // L: 150
						var6 = var0.readStringCp1252NullTerminated(); // L: 151
						var7 = var0.readUnsignedByte(); // L: 152
						String[] var8 = new String[var7]; // L: 153

						for (int var9 = 0; var9 < var7; ++var9) { // L: 154
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 155
						byte[][] var10 = new byte[var7][]; // L: 156
						int var12;
						if (var4 == 3) { // L: 157
							for (int var11 = 0; var11 < var7; ++var11) { // L: 158
								var12 = var0.readInt(); // L: 159
								var10[var11] = new byte[var12]; // L: 160
								var0.readBytes(var10[var11], 0, var12); // L: 161
							}
						}

						var2.operations[var3] = var4; // L: 164
						Class[] var21 = new Class[var7]; // L: 165

						for (var12 = 0; var12 < var7; ++var12) { // L: 166
							var21[var12] = class197.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class197.loadClassFromDescriptor(var20); // L: 167
						if (class197.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = class197.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var21.length == var17.length) { // L: 177
									boolean var18 = true; // L: 178

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 179
										if (var17[var19] != var21[var19]) { // L: 180
											var18 = false; // L: 181
											break; // L: 182
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 185
										var2.methods[var3] = var16; // L: 186
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 193
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 140
					var6 = var0.readStringCp1252NullTerminated(); // L: 141
					var7 = 0; // L: 142
					if (var4 == 1) { // L: 143
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 144
					var2.intReplaceValues[var3] = var7; // L: 145
					if (class197.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class197.loadClassFromDescriptor(var5), var6); // L: 147
				}
			} catch (ClassNotFoundException var24) { // L: 196
				var2.creationErrors[var3] = -1; // L: 197
			} catch (SecurityException var25) { // L: 199
				var2.creationErrors[var3] = -2; // L: 200
			} catch (NullPointerException var26) { // L: 202
				var2.creationErrors[var3] = -3; // L: 203
			} catch (Exception var27) { // L: 205
				var2.creationErrors[var3] = -4; // L: 206
			} catch (Throwable var28) { // L: 208
				var2.creationErrors[var3] = -5; // L: 209
			}
		}

		class105.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "-71"
	)
	static int method279(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12; // L: 1039
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1040
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1041
			return 1; // L: 1042
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1044
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1045
			return 1; // L: 1046
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1048
			Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.text; // L: 1049
			return 1; // L: 1050
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1052
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1053
			return 1; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1056
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1057
			return 1; // L: 1058
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1060
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1061
			return 1; // L: 1062
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1064
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1065
			return 1; // L: 1066
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1068
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1069
			return 1; // L: 1070
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1072
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1073
			return 1; // L: 1074
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1076
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1077
			return 1; // L: 1078
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1080
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1081
			return 1; // L: 1082
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1084
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1085
			return 1; // L: 1086
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1088
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1089
			return 1; // L: 1090
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1092
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1093
			return 1; // L: 1094
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1096
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1097
			return 1; // L: 1098
		} else {
			return 2; // L: 1100
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Liw;",
		garbageValue = "-1692884564"
	)
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1847
		if (JagexCache.JagexCache_dat2File != null) { // L: 1848
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, Skeleton.masterDisk, var0, var1, var2, var3); // L: 1849
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-775156313"
	)
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 6655
			if (Client.isLowDetail && var0 != Huffman.Client_plane) { // L: 6656
				return;
			}

			long var7 = 0L; // L: 6657
			boolean var9 = true; // L: 6658
			boolean var10 = false; // L: 6659
			boolean var11 = false; // L: 6660
			if (var1 == 0) { // L: 6661
				var7 = ScriptEvent.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 6662
				var7 = ScriptEvent.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 6663
				var7 = ScriptEvent.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 6664
				var7 = ScriptEvent.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 6665
				var12 = ScriptEvent.scene.getObjectFlags(var0, var2, var3, var7); // L: 6666
				int var14 = UserComparator9.Entity_unpackID(var7); // L: 6667
				int var15 = var12 & 31; // L: 6668
				int var16 = var12 >> 6 & 3; // L: 6669
				ObjectDefinition var13;
				if (var1 == 0) { // L: 6670
					ScriptEvent.scene.removeBoundaryObject(var0, var2, var3); // L: 6671
					var13 = MidiPcmStream.getObjectDefinition(var14); // L: 6672
					if (var13.interactType != 0) { // L: 6673
						Client.collisionMaps[var0].method3635(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 6675
					ScriptEvent.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 6676
					ScriptEvent.scene.removeGameObject(var0, var2, var3); // L: 6677
					var13 = MidiPcmStream.getObjectDefinition(var14); // L: 6678
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 6679
						return;
					}

					if (var13.interactType != 0) { // L: 6680
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 6682
					ScriptEvent.scene.removeFloorDecoration(var0, var2, var3); // L: 6683
					var13 = MidiPcmStream.getObjectDefinition(var14); // L: 6684
					if (var13.interactType == 1) { // L: 6685
						Client.collisionMaps[var0].method3638(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 6688
				var12 = var0; // L: 6689
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 6690
					var12 = var0 + 1;
				}

				ObjectDefinition.method4699(var0, var12, var2, var3, var4, var5, var6, ScriptEvent.scene, Client.collisionMaps[var0]); // L: 6691
			}
		}

	} // L: 6694
}
