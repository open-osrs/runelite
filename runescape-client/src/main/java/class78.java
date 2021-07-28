import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cb")
public class class78 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;I)V",
		garbageValue = "-1717216781"
	)
	public static void method1969(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V",
		garbageValue = "-583175576"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (class216.isWorldMapEvent(var0.type)) {
			BufferedNetSocket.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = HealthBarUpdate.WorldMapElement_get(BufferedNetSocket.worldMapEvent.mapElement);
			var4 = WorldMapRegion.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = class7.getScript(var20);
		}

		if (var4 != null) {
			Interpreter.Interpreter_intStackSize = 0;
			class1.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field752 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label988: {
				label989: {
					try {
						int var13;
						try {
							var30 = true;
							AbstractUserComparator.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							Interpreter.Interpreter_stringLocals = new String[var4.localStringCount];
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
										var14 = var0.widget != null ? var0.widget.id * -1996852661 * 611927907 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * -1948690547 * 1667744581 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id * -1996852661 * 611927907 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1948690547 * 1667744581 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									AbstractUserComparator.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field742 = var0.field961;

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

									var14 = class79.method1977(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label989;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == ScriptOpcodes.ICONST) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									ApproximateRouteStrategy.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									AbstractUserComparator.Interpreter_intLocals = var40.intLocals;
									Interpreter.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									class100.method2227(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									AbstractUserComparator.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class1.Interpreter_stringStackSize -= var13;
									var21 = class181.method3651(Interpreter.Interpreter_stringStack, class1.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--Interpreter.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class1.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											Decimator.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											Interpreter.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = Decimator.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												Decimator.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = Decimator.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												Decimator.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = SpotAnimationDefinition.field1668.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = ScriptFrame.field371.method6059(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class7.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class1.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										Interpreter.Interpreter_intStackSize -= var36.intArgumentCount;
										class1.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = AbstractUserComparator.Interpreter_intLocals;
										var23.stringLocals = Interpreter.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										AbstractUserComparator.Interpreter_intLocals = var15;
										Interpreter.Interpreter_stringLocals = var16;
									}
								}
							}
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}

							var27.append("").append(var8);
							BufferedSink.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label988;
						}
					} finally {
						if (var30) {
							if (Interpreter.field752) {
								Interpreter.field740 = true;
							}

							while (Interpreter.field754.size() > 0) {
								class79 var19 = (class79)Interpreter.field754.remove(0);
								class183.widgetDefaultMenuAction(var19.method1989(), var19.method1976(), var19.method1980(), var19.method1983(), "");
							}

							if (Interpreter.field740) {
								PcmPlayer.method506();
								Interpreter.field740 = false;
								Interpreter.field752 = false;
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								BufferedSink.RunException_sendStackTrace("Warning: Script " + var4.field862 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field752) {
						Interpreter.field740 = true;
					}

					while (Interpreter.field754.size() > 0) {
						class79 var41 = (class79)Interpreter.field754.remove(0);
						class183.widgetDefaultMenuAction(var41.method1989(), var41.method1976(), var41.method1980(), var41.method1983(), "");
					}

					if (Interpreter.field740) {
						PcmPlayer.method506();
						Interpreter.field740 = false;
						Interpreter.field752 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						BufferedSink.RunException_sendStackTrace("Warning: Script " + var4.field862 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field752) {
					Interpreter.field740 = true;
				}

				while (Interpreter.field754.size() > 0) {
					class79 var34 = (class79)Interpreter.field754.remove(0);
					class183.widgetDefaultMenuAction(var34.method1989(), var34.method1976(), var34.method1980(), var34.method1983(), "");
				}

				if (Interpreter.field740) {
					PcmPlayer.method506();
					Interpreter.field740 = false;
					Interpreter.field752 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					BufferedSink.RunException_sendStackTrace("Warning: Script " + var4.field862 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			if (Interpreter.field752) {
				Interpreter.field740 = true;
			}

			while (Interpreter.field754.size() > 0) {
				class79 var26 = (class79)Interpreter.field754.remove(0);
				class183.widgetDefaultMenuAction(var26.method1989(), var26.method1976(), var26.method1980(), var26.method1983(), "");
			}

			if (Interpreter.field740) {
				PcmPlayer.method506();
				Interpreter.field740 = false;
				Interpreter.field752 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				BufferedSink.RunException_sendStackTrace("Warning: Script " + var4.field862 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("f")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
