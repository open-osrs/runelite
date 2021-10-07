import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ac")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Laq;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			Timer.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1269217196"
	)
	public static String method759(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lcy;III)V",
		garbageValue = "-1352565651"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (AbstractWorldMapIcon.isWorldMapEvent(var0.type)) {
			class130.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var5 = class13.WorldMapElement_get(class130.worldMapEvent.mapElement);
			var4 = class196.getWorldMapScript(var0.type, var5.objectId, var5.category);
		} else {
			var20 = (Integer)var3[0];
			var4 = class1.getScript(var20);
		}

		if (var4 != null) {
			AbstractByteArrayCopier.Interpreter_intStackSize = 0;
			class54.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field828 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label985: {
				label986: {
					try {
						int var13;
						try {
							var30 = true;
							class12.Interpreter_intLocals = new int[var4.localIntCount];
							int var11 = 0;
							WorldMapID.Interpreter_stringLocals = new String[var4.localStringCount];
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
										var14 = var0.widget != null ? var0.widget.id * -1239763633 * 1169899951 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * -583467391 * -886488703 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id * -1239763633 * 1169899951 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -583467391 * -886488703 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									class12.Interpreter_intLocals[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									WorldMapID.Interpreter_stringLocals[var12++] = var21;
								}
							}

							Interpreter.field818 = var0.field1037;

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

									var14 = class124.method2564(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label985;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7[var20];
								} else if (var33 == ScriptOpcodes.GET_VARP) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var33 == ScriptOpcodes.SET_VARP) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
									NetSocket.changeGameOptions(var13);
								} else if (var33 == ScriptOpcodes.SCONST) {
									Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4.stringOperands[var20];
								} else if (var33 == ScriptOpcodes.JUMP) {
									var20 += var7[var20];
								} else if (var33 == ScriptOpcodes.IF_ICMPNE) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPEQ) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPLT) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGT) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.RETURN) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var30 = false;
										break label986;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var4 = var40.script;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.pc;
									class12.Interpreter_intLocals = var40.intLocals;
									WorldMapID.Interpreter_stringLocals = var40.stringLocals;
								} else if (var33 == ScriptOpcodes.GET_VARBIT) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Varcs.getVarbit(var13);
								} else if (var33 == ScriptOpcodes.SET_VARBIT) {
									var13 = var7[var20];
									MouseRecorder.method2078(var13, Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
								} else if (var33 == ScriptOpcodes.IF_ICMPLE) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.IF_ICMPGE) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == ScriptOpcodes.ILOAD) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class12.Interpreter_intLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.ISTORE) {
									class12.Interpreter_intLocals[var7[var20]] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
								} else if (var33 == ScriptOpcodes.SLOAD) {
									Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = WorldMapID.Interpreter_stringLocals[var7[var20]];
								} else if (var33 == ScriptOpcodes.SSTORE) {
									WorldMapID.Interpreter_stringLocals[var7[var20]] = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
								} else if (var33 == ScriptOpcodes.JOIN_STRING) {
									var13 = var7[var20];
									class54.Interpreter_stringStackSize -= var13;
									var21 = method759(Interpreter.Interpreter_stringStack, class54.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var21;
								} else if (var33 == ScriptOpcodes.POP_INT) {
									--AbstractByteArrayCopier.Interpreter_intStackSize;
								} else if (var33 == ScriptOpcodes.POP_STRING) {
									--class54.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var33 != ScriptOpcodes.INVOKE) {
										if (var33 == ScriptOpcodes.GET_VARC_INT) {
											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Tile.varcs.getInt(var7[var20]);
										} else if (var33 == ScriptOpcodes.SET_VARC_INT) {
											Tile.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
										} else if (var33 == ScriptOpcodes.DEFINE_ARRAY) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == ScriptOpcodes.SET_ARRAY_INT) {
											var13 = var7[var20];
											AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
										} else {
											String var22;
											if (var33 == ScriptOpcodes.GET_VARC_STRING_OLD) {
												var22 = Tile.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING_OLD) {
												Tile.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.GET_VARC_STRING) {
												var22 = Tile.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var22;
											} else if (var33 == ScriptOpcodes.SET_VARC_STRING) {
												Tile.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize]);
											} else if (var33 == ScriptOpcodes.SWITCH) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == ScriptOpcodes.GET_VARCLANSETTING) {
													var39 = ModeWhere.field3804.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var39;
													}
												} else {
													if (var33 != ScriptOpcodes.GET_VARCLAN) {
														throw new IllegalStateException();
													}

													var39 = Coord.field3013.method6291(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class1.getScript(var13);
										int[] var15 = new int[var36.localIntCount];
										String[] var16 = new String[var36.localStringCount];

										for (var17 = 0; var17 < var36.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (AbstractByteArrayCopier.Interpreter_intStackSize - var36.intArgumentCount)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class54.Interpreter_stringStackSize - var36.stringArgumentCount)];
										}

										AbstractByteArrayCopier.Interpreter_intStackSize -= var36.intArgumentCount;
										class54.Interpreter_stringStackSize -= var36.stringArgumentCount;
										ScriptFrame var23 = new ScriptFrame();
										var23.script = var4;
										var23.pc = var20;
										var23.intLocals = class12.Interpreter_intLocals;
										var23.stringLocals = WorldMapID.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										class12.Interpreter_intLocals = var15;
										WorldMapID.Interpreter_stringLocals = var16;
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
									Timer.RunException_sendStackTrace(var27.toString(), var31);
									var30 = false;
									break;
								}

								var27.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
								--var13;
							}
						}
					} finally {
						if (var30) {
							if (Interpreter.field828) {
								Interpreter.field832 = true;
							}

							while (Interpreter.field830.size() > 0) {
								class92 var19 = (class92)Interpreter.field830.remove(0);
								ReflectionCheck.widgetDefaultMenuAction(var19.method2243(), var19.method2254(), var19.method2242(), var19.method2245(), "");
							}

							if (Interpreter.field832) {
								WorldMapLabelSize.method3445();
								Interpreter.field832 = false;
								Interpreter.field828 = false;
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								Timer.RunException_sendStackTrace("Warning: Script " + var4.field956 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					if (Interpreter.field828) {
						Interpreter.field832 = true;
					}

					while (Interpreter.field830.size() > 0) {
						class92 var26 = (class92)Interpreter.field830.remove(0);
						ReflectionCheck.widgetDefaultMenuAction(var26.method2243(), var26.method2254(), var26.method2242(), var26.method2245(), "");
					}

					if (Interpreter.field832) {
						WorldMapLabelSize.method3445();
						Interpreter.field832 = false;
						Interpreter.field828 = false;
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						Timer.RunException_sendStackTrace("Warning: Script " + var4.field956 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				if (Interpreter.field828) {
					Interpreter.field832 = true;
				}

				while (Interpreter.field830.size() > 0) {
					class92 var41 = (class92)Interpreter.field830.remove(0);
					ReflectionCheck.widgetDefaultMenuAction(var41.method2243(), var41.method2254(), var41.method2242(), var41.method2245(), "");
				}

				if (Interpreter.field832) {
					WorldMapLabelSize.method3445();
					Interpreter.field832 = false;
					Interpreter.field828 = false;
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					Timer.RunException_sendStackTrace("Warning: Script " + var4.field956 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			if (Interpreter.field828) {
				Interpreter.field832 = true;
			}

			while (Interpreter.field830.size() > 0) {
				class92 var34 = (class92)Interpreter.field830.remove(0);
				ReflectionCheck.widgetDefaultMenuAction(var34.method2243(), var34.method2254(), var34.method2242(), var34.method2245(), "");
			}

			if (Interpreter.field832) {
				WorldMapLabelSize.method3445();
				Interpreter.field832 = false;
				Interpreter.field828 = false;
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				Timer.RunException_sendStackTrace("Warning: Script " + var4.field956 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "201810757"
	)
	static final int method758(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIB)V",
		garbageValue = "-106"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			GameBuild.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = GameEngine.Widget_getSpellActionName(var0);
			if (var3 != null) {
				GameBuild.insertMenuItemNoShift(var3, FloorUnderlayDefinition.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			GameBuild.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			GameBuild.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			GameBuild.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			GameBuild.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var15 = 0; var15 < var0.width; ++var15) {
					int var6 = (var0.paddingX + 32) * var15;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						Projectile.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = class87.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && Tiles.method2024(WorldMapRegion.getWidgetFlags(var0))) {
								if (var0.id != UserComparator6.selectedItemWidget || var13 != ArchiveDiskAction.selectedItemSlot) {
									GameBuild.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && Tiles.method2024(WorldMapRegion.getWidgetFlags(var0))) {
								if ((ObjectComposition.selectedSpellFlags & 16) == 16) {
									GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop) {
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
									if (var11) {
										var10 = var8.getShiftClickIndex();
									}
								}

								int var16;
								if (Tiles.method2024(WorldMapRegion.getWidgetFlags(var0))) {
									for (var16 = 4; var16 >= 3; --var16) {
										if (var16 != var10) {
											AttackOption.addWidgetItemMenuItem(var0, var8, var13, var16, false);
										}
									}
								}

								if (KeyHandler.method336(WorldMapRegion.getWidgetFlags(var0))) {
									GameBuild.insertMenuItemNoShift("Use", FloorUnderlayDefinition.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (Tiles.method2024(WorldMapRegion.getWidgetFlags(var0))) {
									for (var16 = 2; var16 >= 0; --var16) {
										if (var10 != var16) {
											AttackOption.addWidgetItemMenuItem(var0, var8, var13, var16, false);
										}
									}

									if (var10 >= 0) {
										AttackOption.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var16 = 4; var16 >= 0; --var16) {
										if (var9[var16] != null) {
											byte var12 = 0;
											if (var16 == 0) {
												var12 = 39;
											}

											if (var16 == 1) {
												var12 = 40;
											}

											if (var16 == 2) {
												var12 = 41;
											}

											if (var16 == 3) {
												var12 = 42;
											}

											if (var16 == 4) {
												var12 = 43;
											}

											GameBuild.insertMenuItemNoShift(var9[var16], FloorUnderlayDefinition.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								GameBuild.insertMenuItemNoShift("Examine", FloorUnderlayDefinition.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (ClanChannel.method2748(WorldMapRegion.getWidgetFlags(var0)) && (ObjectComposition.selectedSpellFlags & 32) == 32) {
					GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var14 = GrandExchangeOfferWorldComparator.method5385(var0, var13);
					if (var14 != null) {
						GameBuild.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = GameEngine.Widget_getSpellActionName(var0);
				if (var3 != null) {
					GameBuild.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5 = GrandExchangeOfferWorldComparator.method5385(var0, var4);
					if (var5 != null) {
						StructComposition.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (class18.method271(WorldMapRegion.getWidgetFlags(var0))) {
					GameBuild.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-644936535"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class264.friendsChat != null) {
			PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2713, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class113.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
