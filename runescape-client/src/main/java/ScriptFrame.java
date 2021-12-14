import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -238445721
	)
	static int field446;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2036578637
	)
	static int field448;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1958186209
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("p")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("m")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lcp;IIB)V",
		garbageValue = "61"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (ClanMate.isWorldMapEvent(var0.type)) {
			FileSystem.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = class78.WorldMapElement_get(FileSystem.worldMapEvent.mapElement);
			var4 = Skeleton.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = class410.getScript(var20);
		}

		if (var4 != null) {
			IsaacCipher.Interpreter_intStackSize = 0;
			class13.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field818 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label956: {
				label957: {
					try {
						int var13;
						try {
							var30 = true;
							SoundCache.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							AbstractUserComparator.Interpreter_stringLocals = new String[var4.localStringCount];
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) {
								if (var3[var13] instanceof Integer) {
									var14 = (Integer)var3[var13];
									if (var14 == -2147483647) {
										var14 = var0.mouseX;
									}

									if (var14 == -2147483646) {
										var14 = var0.mouseY;
									}

									if (var14 == -2147483645) {
										var14 = var0.widget != null ? var0.widget.id * 1695982371 * 2075239563 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * -1765912961 * -1567657601 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 1695982371 * 2075239563 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1765912961 * -1567657601 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									SoundCache.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									AbstractUserComparator.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field815 = var0.field1018;

							while (true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}

								++var20;
								int var33 = var6[var20];
								if (var33 >= 100) {
									boolean var35;
									if (var4.intOperands[var20] == 1) {
										var35 = true;
									} else {
										var35 = false;
									}

									var14 = class112.method2560(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label956;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == ScriptOpcodes.ICONST) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
									class281.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label957;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									SoundCache.Interpreter_intLocals = var40.intLocals;
									AbstractUserComparator.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class273.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									Tile.method3843(var13, Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									IsaacCipher.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SoundCache.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									SoundCache.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AbstractUserComparator.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									AbstractUserComparator.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class13.Interpreter_stringStackSize -= var13;
									var21 = class112.method2565(Interpreter.Interpreter_stringStack, class13.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--IsaacCipher.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class13.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class339.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											class339.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
											if (var24 < 0 || var24 > 5000) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == ScriptOpcodes.GET_ARRAY_INT) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											IsaacCipher.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = class339.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												class339.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = class339.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												class339.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = Friend.field4084.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = BuddyRankComparator.field1342.method6757(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class410.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (IsaacCipher.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class13.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										IsaacCipher.Interpreter_intStackSize -= var36.intArgumentCount;
										class13.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = SoundCache.Interpreter_intLocals;
										var23.stringLocals = AbstractUserComparator.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										SoundCache.Interpreter_intLocals = var15;
										AbstractUserComparator.Interpreter_stringLocals = var16;
									}
								}
							}
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");
							var13 = Interpreter.Interpreter_frameDepth - 1;

							while (true) {
								if (var13 < 0) {
									var27.append("").append(var8);
									AccessFile.RunException_sendStackTrace(var27.toString(), var31);
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							while (Interpreter.field817.size() > 0) {
								class92 var19 = (class92)Interpreter.field817.remove(0);
								SoundCache.widgetDefaultMenuAction(var19.method2340(), var19.method2339(), var19.method2341(), var19.method2348(), "");
							}

							if (Interpreter.field818) {
								Interpreter.field818 = false;
								class4.method28();
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field817.size() > 0) {
						class92 var26 = (class92)Interpreter.field817.remove(0);
						SoundCache.widgetDefaultMenuAction(var26.method2340(), var26.method2339(), var26.method2341(), var26.method2348(), "");
					}

					if (Interpreter.field818) {
						Interpreter.field818 = false;
						class4.method28();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				while (Interpreter.field817.size() > 0) {
					class92 var41 = (class92)Interpreter.field817.remove(0);
					SoundCache.widgetDefaultMenuAction(var41.method2340(), var41.method2339(), var41.method2341(), var41.method2348(), "");
				}

				if (Interpreter.field818) {
					Interpreter.field818 = false;
					class4.method28();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field817.size() > 0) {
				class92 var34 = (class92)Interpreter.field817.remove(0);
				SoundCache.widgetDefaultMenuAction(var34.method2340(), var34.method2339(), var34.method2341(), var34.method2348(), "");
			}

			if (Interpreter.field818) {
				Interpreter.field818 = false;
				class4.method28();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				AccessFile.RunException_sendStackTrace("Warning: Script " + var4.field937 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIIIII)V",
		garbageValue = "280009494"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = var2 + var4 + 932731;
						int var12 = var3 + var5 + 556238;
						int var13 = class260.method5069(var11 + 45365, var12 + 91923, 4) - 128 + (class260.method5069(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (class260.method5069(var11, var12, 1) - 128 >> 2);
						var13 = (int)((double)var13 * 0.3D) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = -var13 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					WorldMapLabelSize.field2580[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1370934798"
	)
	public static void method1110() {
		KitDefinition.KitDefinition_cached.clear();
	}
}
