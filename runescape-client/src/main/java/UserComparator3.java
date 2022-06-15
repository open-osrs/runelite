import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dr")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -120700993
	)
	static int field1391;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 761312471
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)I",
		garbageValue = "-18"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "22"
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
							var21[var12] = WorldMapRectangle.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = WorldMapRectangle.loadClassFromDescriptor(var20); // L: 173
						if (WorldMapRectangle.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 174
							throw new SecurityException();
						}

						Method[] var13 = WorldMapRectangle.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 175
						Method[] var14 = var13; // L: 177

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 178
							Method var16 = var14[var15]; // L: 179
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 181
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 182
								if (var17.length == var21.length) { // L: 183
									boolean var18 = true; // L: 184

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 185
										if (var21[var19] != var17[var19]) { // L: 186
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
					if (WorldMapRectangle.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 152
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(WorldMapRectangle.loadClassFromDescriptor(var5), var6); // L: 153
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

		class33.reflectionChecks.addFirst(var2); // L: 218
	} // L: 219

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "13"
	)
	static int method2592(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3277
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3278
			var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3279
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3280
			return 1; // L: 3281
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3283
				Interpreter.Interpreter_stringStackSize -= 2; // L: 3284
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3285
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3286
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3287
				return 1; // L: 3288
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3290
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3291
				var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3292
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + Tile.intToString(var9, true); // L: 3293
				return 1; // L: 3294
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3296
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3297
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3298
				return 1; // L: 3299
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3301
					var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3302
					long var13 = 86400000L * (11745L + (long)var10); // L: 3303
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3304
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3305
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3306
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3307
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3308
					return 1; // L: 3309
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3311
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3319
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3320
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3321
						return 1; // L: 3322
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3324
						Interpreter.Interpreter_stringStackSize -= 2; // L: 3325
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Tile.method4019(WorldMapSection0.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class134.clientLanguage)); // L: 3326
						return 1; // L: 3327
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3329
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3330
							class446.Interpreter_intStackSize -= 2; // L: 3331
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3332
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3333
							var11 = AbstractByteArrayCopier.archive13.takeFile(var5, 0); // L: 3334
							var12 = new Font(var11); // L: 3335
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3336
							return 1; // L: 3337
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3339
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3340
							class446.Interpreter_intStackSize -= 2; // L: 3341
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3342
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3343
							var11 = AbstractByteArrayCopier.archive13.takeFile(var5, 0); // L: 3344
							var12 = new Font(var11); // L: 3345
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3346
							return 1; // L: 3347
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3349
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3350
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3351
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3352
							if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) { // L: 3353
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3354
							}

							return 1; // L: 3355
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3357
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3358
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3359
							return 1; // L: 3360
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3362
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3363
							var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3364
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3365
							return 1; // L: 3366
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3368
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3369
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = StudioGame.isCharPrintable((char)var10) ? 1 : 0; // L: 3370
							return 1; // L: 3371
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3373
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3374
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = FloorOverlayDefinition.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3375
							return 1; // L: 3376
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3378
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3379
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapDecorationType.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3380
							return 1; // L: 3381
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3383
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3384
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class83.isDigit((char)var10) ? 1 : 0; // L: 3385
							return 1; // L: 3386
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3388
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3389
							if (var3 != null) { // L: 3390
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3391
							}

							return 1; // L: 3392
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3394
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3395
							class446.Interpreter_intStackSize -= 2; // L: 3396
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3397
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3398
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3399
							return 1; // L: 3400
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3402
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3403
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3404
							boolean var16 = false; // L: 3405

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3406
								char var7 = var3.charAt(var6); // L: 3407
								if (var7 == '<') { // L: 3408
									var16 = true;
								} else if (var7 == '>') { // L: 3409
									var16 = false;
								} else if (!var16) { // L: 3410
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3412
							return 1; // L: 3413
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3415
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3416
							var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3417
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3418
							return 1; // L: 3419
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3421
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3422
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3423
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3424
							var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3425
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3426
							return 1; // L: 3427
						} else if (var0 == 4122) { // L: 3429
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3430
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3431
							return 1; // L: 3432
						} else {
							return 2; // L: 3434
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3312
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3313
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3314
					if (class101.localPlayer.appearance != null && class101.localPlayer.appearance.isFemale) { // L: 3315
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3316
					}

					return 1; // L: 3317
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "62"
	)
	static int method2590(int var0, Script var1, boolean var2) {
		if (var0 == 7600) { // L: 4891
			--Interpreter.Interpreter_stringStackSize; // L: 4892
			return 1; // L: 4893
		} else if (var0 == 7601) { // L: 4895
			--Interpreter.Interpreter_stringStackSize; // L: 4896
			return 1; // L: 4897
		} else if (var0 == 7602) { // L: 4899
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4900
			return 1; // L: 4901
		} else if (var0 == 7603) { // L: 4903
			--class446.Interpreter_intStackSize; // L: 4904
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4905
			return 1; // L: 4906
		} else if (var0 == 7604) { // L: 4908
			--Interpreter.Interpreter_stringStackSize; // L: 4909
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4910
			return 1; // L: 4911
		} else if (var0 == 7605) { // L: 4913
			--class446.Interpreter_intStackSize; // L: 4914
			return 1; // L: 4915
		} else if (var0 == 7606) { // L: 4917
			class446.Interpreter_intStackSize -= 2; // L: 4918
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4919
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4920
			return 1; // L: 4921
		} else if (var0 == 7607) { // L: 4923
			return 1; // L: 4924
		} else if (var0 == 7608) { // L: 4926
			--Interpreter.Interpreter_stringStackSize; // L: 4927
			return 1; // L: 4928
		} else if (var0 == 7609) { // L: 4930
			--Interpreter.Interpreter_stringStackSize; // L: 4931
			return 1; // L: 4932
		} else if (var0 == 7610) { // L: 4934
			--Interpreter.Interpreter_stringStackSize; // L: 4935
			return 1; // L: 4936
		} else if (var0 == 7611) { // L: 4938
			--class446.Interpreter_intStackSize; // L: 4939
			return 1; // L: 4940
		} else if (var0 == 7612) { // L: 4942
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4943
			return 1; // L: 4944
		} else if (var0 == 7613) { // L: 4946
			--class446.Interpreter_intStackSize; // L: 4947
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4948
			return 1; // L: 4949
		} else if (var0 == 7614) { // L: 4951
			return 1; // L: 4952
		} else if (var0 == 7615) { // L: 4954
			--Interpreter.Interpreter_stringStackSize; // L: 4955
			return 1; // L: 4956
		} else if (var0 == 7616) { // L: 4958
			--Interpreter.Interpreter_stringStackSize; // L: 4959
			class446.Interpreter_intStackSize -= 2; // L: 4960
			return 1; // L: 4961
		} else if (var0 == 7617) { // L: 4963
			--Interpreter.Interpreter_stringStackSize; // L: 4964
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4965
			return 1; // L: 4966
		} else {
			return 2; // L: 4968
		}
	}
}
