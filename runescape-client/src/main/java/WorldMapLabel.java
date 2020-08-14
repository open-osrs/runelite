import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1522349817
	)
	static int field275;
	@ObfuscatedName("n")
	static byte[][][] field269;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -1537954811
	)
	@Export("port3")
	static int port3;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("m")
	@Export("text")
	String text;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1110407141
	)
	@Export("width")
	int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1740933995
	)
	@Export("height")
	int height;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILah;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "578317705"
	)
	@Export("Widget_hasContinueOption")
	public static boolean Widget_hasContinueOption(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lbu;II)V",
		garbageValue = "1472646677"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1) {
		Object[] var2 = var0.args;
		Script var3;
		int var17;
		if (ArchiveDiskActionHandler.isWorldMapEvent(var0.type)) {
			WorldMapSection3.worldMapEvent = (WorldMapEvent)var2[0];
			WorldMapElement var4 = Client.WorldMapElement_get(WorldMapSection3.worldMapEvent.mapElement);
			var3 = class4.getWorldMapScript(var0.type, var4.objectId, var4.category);
		} else {
			var17 = (Integer)var2[0];
			var3 = WorldMapSection0.getScript(var17);
		}

		if (var3 != null) {
			UrlRequester.Interpreter_intStackSize = 0;
			WorldMapEvent.Interpreter_stringStackSize = 0;
			var17 = -1;
			int[] var5 = var3.opcodes;
			int[] var6 = var3.intOperands;
			byte var7 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field1125 = false;

			try {
				int var10;
				try {
					Interpreter.Interpreter_intLocals = new int[var3.localIntCount];
					int var8 = 0;
					Interpreter.Interpreter_stringLocals = new String[var3.localStringCount];
					int var9 = 0;

					int var11;
					String var18;
					for (var10 = 1; var10 < var2.length; ++var10) {
						if (var2[var10] instanceof Integer) {
							var11 = (Integer)var2[var10];
							if (var11 == -2147483647) {
								var11 = var0.mouseX;
							}

							if (var11 == -2147483646) {
								var11 = var0.mouseY;
							}

							if (var11 == -2147483645) {
								var11 = var0.widget != null ? var0.widget.id * 40459347 * 1532053467 : -1;
							}

							if (var11 == -2147483644) {
								var11 = var0.opIndex;
							}

							if (var11 == -2147483643) {
								var11 = var0.widget != null ? var0.widget.childIndex * 1593342751 * 94060767 : -1;
							}

							if (var11 == -2147483642) {
								var11 = var0.dragTarget != null ? var0.dragTarget.id * 40459347 * 1532053467 : -1;
							}

							if (var11 == -2147483641) {
								var11 = var0.dragTarget != null ? var0.dragTarget.childIndex * 1593342751 * 94060767 : -1;
							}

							if (var11 == -2147483640) {
								var11 = var0.keyTyped;
							}

							if (var11 == -2147483639) {
								var11 = var0.keyPressed;
							}

							Interpreter.Interpreter_intLocals[var8++] = var11;
						} else if (var2[var10] instanceof String) {
							var18 = (String)var2[var10];
							if (var18.equals("event_opbase")) {
								var18 = var0.targetName;
							}

							Interpreter.Interpreter_stringLocals[var9++] = var18;
						}
					}

					var10 = 0;
					Interpreter.field1132 = var0.field600;

					while (true) {
						++var10;
						if (var10 > var1) {
							throw new RuntimeException();
						}

						++var17;
						int var29 = var5[var17];
						int var20;
						if (var29 >= 100) {
							boolean var32;
							if (var3.intOperands[var17] == 1) {
								var32 = true;
							} else {
								var32 = false;
							}

							var20 = class307.method5650(var29, var3, var32);
							switch(var20) {
							case 0:
								return;
							case 1:
							default:
								break;
							case 2:
								throw new IllegalStateException();
							}
						} else if (var29 == 0) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6[var17];
						} else if (var29 == ScriptOpcodes.GET_VARP) {
							var11 = var6[var17];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Varps.Varps_main[var11];
						} else if (var29 == ScriptOpcodes.SET_VARP) {
							var11 = var6[var17];
							Varps.Varps_main[var11] = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
							WorldMapSection0.changeGameOptions(var11);
						} else if (var29 == ScriptOpcodes.SCONST) {
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.stringOperands[var17];
						} else if (var29 == ScriptOpcodes.JUMP) {
							var17 += var6[var17];
						} else if (var29 == ScriptOpcodes.IF_ICMPNE) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPEQ) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPLT) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGT) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.RETURN) {
							if (Interpreter.Interpreter_frameDepth == 0) {
								return;
							}

							ScriptFrame var34 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
							var3 = var34.script;
							var5 = var3.opcodes;
							var6 = var3.intOperands;
							var17 = var34.pc;
							Interpreter.Interpreter_intLocals = var34.intLocals;
							Interpreter.Interpreter_stringLocals = var34.stringLocals;
						} else if (var29 == ScriptOpcodes.GET_VARBIT) {
							var11 = var6[var17];
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Widget.getVarbit(var11);
						} else if (var29 == ScriptOpcodes.SET_VARBIT) {
							var11 = var6[var17];
							class257.method4679(var11, Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
						} else if (var29 == ScriptOpcodes.IF_ICMPLE) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.IF_ICMPGE) {
							UrlRequester.Interpreter_intStackSize -= 2;
							if (Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]) {
								var17 += var6[var17];
							}
						} else if (var29 == ScriptOpcodes.ILOAD) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var6[var17]];
						} else if (var29 == ScriptOpcodes.ISTORE) {
							Interpreter.Interpreter_intLocals[var6[var17]] = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						} else if (var29 == ScriptOpcodes.SLOAD) {
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var6[var17]];
						} else if (var29 == ScriptOpcodes.SSTORE) {
							Interpreter.Interpreter_stringLocals[var6[var17]] = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
						} else if (var29 == ScriptOpcodes.JOIN_STRING) {
							var11 = var6[var17];
							WorldMapEvent.Interpreter_stringStackSize -= var11;
							String var31 = StructDefinition.method4718(Interpreter.Interpreter_stringStack, WorldMapEvent.Interpreter_stringStackSize, var11);
							Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var31;
						} else if (var29 == ScriptOpcodes.POP_INT) {
							--UrlRequester.Interpreter_intStackSize;
						} else if (var29 == ScriptOpcodes.POP_STRING) {
							--WorldMapEvent.Interpreter_stringStackSize;
						} else {
							int var15;
							if (var29 != ScriptOpcodes.INVOKE) {
								if (var29 == ScriptOpcodes.GET_VARC_INT) {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = AttackOption.varcs.getInt(var6[var17]);
								} else if (var29 == ScriptOpcodes.SET_VARC_INT) {
									AttackOption.varcs.setInt(var6[var17], Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
								} else if (var29 == ScriptOpcodes.DEFINE_ARRAY) {
									var11 = var6[var17] >> 16;
									var20 = var6[var17] & 65535;
									int var21 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
									if (var21 < 0 || var21 > 5000) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrayLengths[var11] = var21;
									byte var22 = -1;
									if (var20 == 105) {
										var22 = 0;
									}

									for (var15 = 0; var15 < var21; ++var15) {
										Interpreter.Interpreter_arrays[var11][var15] = var22;
									}
								} else if (var29 == ScriptOpcodes.GET_ARRAY_INT) {
									var11 = var6[var17];
									var20 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var11][var20];
								} else if (var29 == ScriptOpcodes.SET_ARRAY_INT) {
									var11 = var6[var17];
									UrlRequester.Interpreter_intStackSize -= 2;
									var20 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
									if (var20 < 0 || var20 >= Interpreter.Interpreter_arrayLengths[var11]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrays[var11][var20] = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING_OLD) {
									var18 = AttackOption.varcs.getStringOld(var6[var17]);
									if (var18 == null) {
										var18 = "null";
									}

									Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var18;
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING_OLD) {
									AttackOption.varcs.setStringOld(var6[var17], Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize]);
								} else if (var29 == ScriptOpcodes.GET_VARC_STRING) {
									var18 = AttackOption.varcs.getString(var6[var17]);
									Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var18;
								} else if (var29 == ScriptOpcodes.SET_VARC_STRING) {
									AttackOption.varcs.setString(var6[var17], Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize]);
								} else {
									if (var29 != ScriptOpcodes.SWITCH) {
										throw new IllegalStateException();
									}

									IterableNodeHashTable var33 = var3.switches[var6[var17]];
									IntegerNode var30 = (IntegerNode)var33.get((long)Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
									if (var30 != null) {
										var17 += var30.integer;
									}
								}
							} else {
								var11 = var6[var17];
								Script var12 = WorldMapSection0.getScript(var11);
								int[] var13 = new int[var12.localIntCount];
								String[] var14 = new String[var12.localStringCount];

								for (var15 = 0; var15 < var12.intArgumentCount; ++var15) {
									var13[var15] = Interpreter.Interpreter_intStack[var15 + (UrlRequester.Interpreter_intStackSize - var12.intArgumentCount)];
								}

								for (var15 = 0; var15 < var12.stringArgumentCount; ++var15) {
									var14[var15] = Interpreter.Interpreter_stringStack[var15 + (WorldMapEvent.Interpreter_stringStackSize - var12.stringArgumentCount)];
								}

								UrlRequester.Interpreter_intStackSize -= var12.intArgumentCount;
								WorldMapEvent.Interpreter_stringStackSize -= var12.stringArgumentCount;
								ScriptFrame var19 = new ScriptFrame();
								var19.script = var3;
								var19.pc = var17;
								var19.intLocals = Interpreter.Interpreter_intLocals;
								var19.stringLocals = Interpreter.Interpreter_stringLocals;
								Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var19;
								var3 = var12;
								var5 = var12.opcodes;
								var6 = var12.intOperands;
								var17 = -1;
								Interpreter.Interpreter_intLocals = var13;
								Interpreter.Interpreter_stringLocals = var14;
							}
						}
					}
				} catch (Exception var27) {
					StringBuilder var24 = new StringBuilder(30);
					var24.append("").append(var3.key).append(" ");

					for (var10 = Interpreter.Interpreter_frameDepth - 1; var10 >= 0; --var10) {
						var24.append("").append(Interpreter.Interpreter_frames[var10].script.key).append(" ");
					}

					var24.append("").append(var7);
					class197.RunException_sendStackTrace(var24.toString(), var27);
				}
			} finally {
				if (Interpreter.field1125) {
					Interpreter.field1118 = true;
					class217.method4092();
					Interpreter.field1118 = false;
					Interpreter.field1125 = false;
				}

			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "88"
	)
	@Export("getEntityUnderMouse")
	public static long getEntityUnderMouse(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "807704553"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1944038316"
	)
	static final void method488() {
		int var0 = class204.field2420 * 128 + 64;
		int var1 = WorldMapManager.field348 * 128 + 64;
		int var2 = Language.getTileHeight(var0, var1, TileItemPile.Client_plane) - field275;
		if (MouseHandler.cameraX < var0) {
			MouseHandler.cameraX = (var0 - MouseHandler.cameraX) * ScriptEvent.field604 / 1000 + MouseHandler.cameraX + class25.field122;
			if (MouseHandler.cameraX > var0) {
				MouseHandler.cameraX = var0;
			}
		}

		if (MouseHandler.cameraX > var0) {
			MouseHandler.cameraX -= ScriptEvent.field604 * (MouseHandler.cameraX - var0) / 1000 + class25.field122;
			if (MouseHandler.cameraX < var0) {
				MouseHandler.cameraX = var0;
			}
		}

		if (WorldMapSection3.cameraY < var2) {
			WorldMapSection3.cameraY = (var2 - WorldMapSection3.cameraY) * ScriptEvent.field604 / 1000 + WorldMapSection3.cameraY + class25.field122;
			if (WorldMapSection3.cameraY > var2) {
				WorldMapSection3.cameraY = var2;
			}
		}

		if (WorldMapSection3.cameraY > var2) {
			WorldMapSection3.cameraY -= ScriptEvent.field604 * (WorldMapSection3.cameraY - var2) / 1000 + class25.field122;
			if (WorldMapSection3.cameraY < var2) {
				WorldMapSection3.cameraY = var2;
			}
		}

		if (ObjectSound.cameraZ < var1) {
			ObjectSound.cameraZ = (var1 - ObjectSound.cameraZ) * ScriptEvent.field604 / 1000 + ObjectSound.cameraZ + class25.field122;
			if (ObjectSound.cameraZ > var1) {
				ObjectSound.cameraZ = var1;
			}
		}

		if (ObjectSound.cameraZ > var1) {
			ObjectSound.cameraZ -= ScriptEvent.field604 * (ObjectSound.cameraZ - var1) / 1000 + class25.field122;
			if (ObjectSound.cameraZ < var1) {
				ObjectSound.cameraZ = var1;
			}
		}

		var0 = DevicePcmPlayerProvider.field435 * 128 + 64;
		var1 = class9.field42 * 128 + 64;
		var2 = Language.getTileHeight(var0, var1, TileItemPile.Client_plane) - class206.field2446;
		int var3 = var0 - MouseHandler.cameraX;
		int var4 = var2 - WorldMapSection3.cameraY;
		int var5 = var1 - ObjectSound.cameraZ;
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
		if (var7 < 128) {
			var7 = 128;
		}

		if (var7 > 383) {
			var7 = 383;
		}

		if (TilePaint.cameraPitch < var7) {
			TilePaint.cameraPitch = (var7 - TilePaint.cameraPitch) * WorldMapCacheName.field329 / 1000 + TilePaint.cameraPitch + class329.field3867;
			if (TilePaint.cameraPitch > var7) {
				TilePaint.cameraPitch = var7;
			}
		}

		if (TilePaint.cameraPitch > var7) {
			TilePaint.cameraPitch -= WorldMapCacheName.field329 * (TilePaint.cameraPitch - var7) / 1000 + class329.field3867;
			if (TilePaint.cameraPitch < var7) {
				TilePaint.cameraPitch = var7;
			}
		}

		int var9 = var8 - Canvas.cameraYaw;
		if (var9 > 1024) {
			var9 -= 2048;
		}

		if (var9 < -1024) {
			var9 += 2048;
		}

		if (var9 > 0) {
			Canvas.cameraYaw = Canvas.cameraYaw + class329.field3867 + var9 * WorldMapCacheName.field329 / 1000;
			Canvas.cameraYaw &= 2047;
		}

		if (var9 < 0) {
			Canvas.cameraYaw -= class329.field3867 + -var9 * WorldMapCacheName.field329 / 1000;
			Canvas.cameraYaw &= 2047;
		}

		int var10 = var8 - Canvas.cameraYaw;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
			Canvas.cameraYaw = var8;
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lhd;III)V",
		garbageValue = "-488696963"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbz;",
		garbageValue = "1553809797"
	)
	static final InterfaceParent method486(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		WorldMapSection3.Widget_resetModelFrames(var1);
		Widget var4 = WorldMapSprite.getWidget(var0);
		class234.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class234.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
			int var7 = Client.menuOpcodes[var5];
			boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
			if (var6) {
				if (var5 < Client.menuOptionsCount - 1) {
					for (int var8 = var5; var8 < Client.menuOptionsCount - 1; ++var8) {
						Client.menuActions[var8] = Client.menuActions[var8 + 1];
						Client.menuTargets[var8] = Client.menuTargets[var8 + 1];
						Client.menuOpcodes[var8] = Client.menuOpcodes[var8 + 1];
						Client.menuIdentifiers[var8] = Client.menuIdentifiers[var8 + 1];
						Client.menuArguments1[var8] = Client.menuArguments1[var8 + 1];
						Client.menuArguments2[var8] = Client.menuArguments2[var8 + 1];
						Client.menuShiftClick[var8] = Client.menuShiftClick[var8 + 1];
					}
				}

				--var5;
				--Client.menuOptionsCount;
			}
		}

		WorldMapEvent.method840(class69.menuWidth / 2 + WorldMapRectangle.menuX, Frames.menuY);
		WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		UserComparator4.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Language.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
