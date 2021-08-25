import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 595222393
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1776288687
	)
	@Export("count")
	int count;
	@ObfuscatedName("m")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("k")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIB)V",
		garbageValue = "-38"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (FaceNormal.isWorldMapEvent(var0.type)) {
			class138.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = class54.WorldMapElement_get(class138.worldMapEvent.mapElement);
			var4 = InterfaceParent.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = WorldMapAreaData.getScript(var20);
		}

		if (var4 != null) {
			class240.Interpreter_intStackSize = 0;
			Interpreter.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field829 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label986: {
				label987: {
					try {
						int var13;
						try {
							var30 = true;
							Interpreter.Interpreter_intLocals = new int[var4.localIntCount];
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
										var14 = var0.widget != null ? var0.widget.id * 296163183 * 1986537359 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * -777771557 * -1838330285 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id * 296163183 * 1986537359 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -777771557 * -1838330285 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									Interpreter.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field813 = var0.field1035;

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

									var14 = WorldMapLabelSize.method3385(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label986;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
									InvDefinition.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
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
									Interpreter.Interpreter_intLocals = var40.intLocals;
									Interpreter.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class247.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									Decimator.method1049(var13, Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									class240.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									Interpreter.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									Interpreter.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									Interpreter.Interpreter_stringStackSize -= var13;
									var21 = class300.method5381(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--class240.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--Interpreter.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = GrandExchangeEvent.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											GrandExchangeEvent.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											class240.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = GrandExchangeEvent.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												GrandExchangeEvent.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = GrandExchangeEvent.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												GrandExchangeEvent.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = class317.field3858.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = class117.field1388.method6231(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = WorldMapAreaData.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (class240.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										class240.Interpreter_intStackSize -= var36.intArgumentCount;
										Interpreter.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = Interpreter.Interpreter_intLocals;
										var23.stringLocals = Interpreter.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										Interpreter.Interpreter_intLocals = var15;
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
							class4.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label987;
						}
					} finally {
						if (var30) {
							if (Interpreter.field829) {
								Interpreter.field827 = true;
							}

							while (Interpreter.field818.size() > 0) {
								class92 var19 = (class92)Interpreter.field818.remove(0);
								MouseHandler.widgetDefaultMenuAction(var19.method2233(), var19.method2232(), var19.method2243(), var19.method2234(), "");
							}

							if (Interpreter.field827) {
								FriendsChat.method5904();
								Interpreter.field827 = false;
								Interpreter.field829 = false;
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class4.RunException_sendStackTrace("Warning: Script " + var4.field941 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field829) {
						Interpreter.field827 = true;
					}

					while (Interpreter.field818.size() > 0) {
						class92 var41 = (class92)Interpreter.field818.remove(0);
						MouseHandler.widgetDefaultMenuAction(var41.method2233(), var41.method2232(), var41.method2243(), var41.method2234(), "");
					}

					if (Interpreter.field827) {
						FriendsChat.method5904();
						Interpreter.field827 = false;
						Interpreter.field829 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class4.RunException_sendStackTrace("Warning: Script " + var4.field941 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field829) {
					Interpreter.field827 = true;
				}

				while (Interpreter.field818.size() > 0) {
					class92 var26 = (class92)Interpreter.field818.remove(0);
					MouseHandler.widgetDefaultMenuAction(var26.method2233(), var26.method2232(), var26.method2243(), var26.method2234(), "");
				}

				if (Interpreter.field827) {
					FriendsChat.method5904();
					Interpreter.field827 = false;
					Interpreter.field829 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class4.RunException_sendStackTrace("Warning: Script " + var4.field941 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			if (Interpreter.field829) {
				Interpreter.field827 = true;
			}

			while (Interpreter.field818.size() > 0) {
				class92 var34 = (class92)Interpreter.field818.remove(0);
				MouseHandler.widgetDefaultMenuAction(var34.method2233(), var34.method2232(), var34.method2243(), var34.method2234(), "");
			}

			if (Interpreter.field827) {
				FriendsChat.method5904();
				Interpreter.field827 = false;
				Interpreter.field829 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class4.RunException_sendStackTrace("Warning: Script " + var4.field941 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "([Ljd;II)V",
		garbageValue = "-1059727702"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class13.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class139.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class87.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class139.runScriptEvent(var5);
				}
			}
		}

	}
}
