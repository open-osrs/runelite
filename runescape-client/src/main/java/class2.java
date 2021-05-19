import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("o")
public class class2 {
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 1803015327
	)
	static int field18;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -3980940730251975189L
	)
	long field23;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -161660797
	)
	int field19;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	IterableNodeDeque field22;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class2(Buffer var1) {
		this.field19 = -1; // L: 9
		this.field22 = new IterableNodeDeque(); // L: 10
		this.method22(var1); // L: 28
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "2001634742"
	)
	void method22(Buffer var1) {
		this.field23 = var1.readLong(); // L: 32
		this.field19 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34
			Object var3;
			if (var2 == 3) {
				var3 = new class13(this);
			} else if (var2 == 1) {
				var3 = new class8(this);
			} else if (var2 == 13) {
				var3 = new class26(this);
			} else if (var2 == 4) {
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class22(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class23(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class21(this);
			} else if (var2 == 14) {
				var3 = new class18(this);
			} else if (var2 == 8) {
				var3 = new class6(this);
			} else if (var2 == 9) {
				var3 = new class0(this);
			} else if (var2 == 10) {
				var3 = new class4(this);
			} else if (var2 == 11) {
				var3 = new class1(this);
			} else if (var2 == 12) {
				var3 = new class15(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException("");
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod339(var1);
			this.field22.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;B)V",
		garbageValue = "62"
	)
	public void method25(class11 var1) {
		if (var1.field103 == this.field23 && this.field19 == var1.field90) {
			for (class14 var2 = (class14)this.field22.last(); var2 != null; var2 = (class14)this.field22.previous()) {
				var2.vmethod338(var1); // L: 62
			}

			++var1.field90;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "158273003"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 35
		if (var1 != null) { // L: 36
			int var2 = var0.offset; // L: 37
			var0.writeInt(var1.id); // L: 38

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 39
				if (var1.creationErrors[var3] != 0) { // L: 40
					var0.writeByte(var1.creationErrors[var3]); // L: 41
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 45
						Field var5;
						int var6;
						if (var4 == 0) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							var6 = Reflection.getInt(var5, (Object)null); // L: 48
							var0.writeByte(0); // L: 49
							var0.writeInt(var6); // L: 50
						} else if (var4 == 1) { // L: 52
							var5 = var1.fields[var3]; // L: 53
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 54
							var0.writeByte(0); // L: 55
						} else if (var4 == 2) { // L: 57
							var5 = var1.fields[var3]; // L: 58
							var6 = var5.getModifiers(); // L: 59
							var0.writeByte(0); // L: 60
							var0.writeInt(var6); // L: 61
						}

						Method var25;
						if (var4 != 3) { // L: 63
							if (var4 == 4) { // L: 83
								var25 = var1.methods[var3]; // L: 84
								var6 = var25.getModifiers(); // L: 85
								var0.writeByte(0); // L: 86
								var0.writeInt(var6); // L: 87
							}
						} else {
							var25 = var1.methods[var3]; // L: 64
							byte[][] var10 = var1.arguments[var3]; // L: 65
							Object[] var7 = new Object[var10.length]; // L: 66

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 67
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 68
								var7[var8] = var9.readObject(); // L: 69
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 71
							if (var11 == null) { // L: 72
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 73
								var0.writeByte(1); // L: 74
								var0.writeLong(((Number)var11).longValue()); // L: 75
							} else if (var11 instanceof String) { // L: 77
								var0.writeByte(2); // L: 78
								var0.writeStringCp1252NullTerminated((String)var11); // L: 79
							} else {
								var0.writeByte(4); // L: 81
							}
						}
					} catch (ClassNotFoundException var13) { // L: 90
						var0.writeByte(-10); // L: 91
					} catch (InvalidClassException var14) { // L: 93
						var0.writeByte(-11); // L: 94
					} catch (StreamCorruptedException var15) { // L: 96
						var0.writeByte(-12); // L: 97
					} catch (OptionalDataException var16) { // L: 99
						var0.writeByte(-13); // L: 100
					} catch (IllegalAccessException var17) { // L: 102
						var0.writeByte(-14); // L: 103
					} catch (IllegalArgumentException var18) { // L: 105
						var0.writeByte(-15); // L: 106
					} catch (InvocationTargetException var19) { // L: 108
						var0.writeByte(-16); // L: 109
					} catch (SecurityException var20) { // L: 111
						var0.writeByte(-17); // L: 112
					} catch (IOException var21) { // L: 114
						var0.writeByte(-18); // L: 115
					} catch (NullPointerException var22) { // L: 117
						var0.writeByte(-19); // L: 118
					} catch (Exception var23) { // L: 120
						var0.writeByte(-20); // L: 121
					} catch (Throwable var24) { // L: 123
						var0.writeByte(-21); // L: 124
					}
				}
			}

			var0.writeCrc(var2); // L: 127
			var1.remove(); // L: 128
		}
	} // L: 129

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-56"
	)
	public static boolean method28(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public static void method26() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 537
	} // L: 538

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIB)V",
		garbageValue = "23"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10283
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10284
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10287
			var3 = UserComparator9.Widget_getSpellActionName(var0); // L: 10288
			if (var3 != null) { // L: 10289
				InterfaceParent.insertMenuItemNoShift(var3, HorizontalAlignment.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10290
			}
		}

		if (var0.buttonType == 3) { // L: 10294
			InterfaceParent.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10295
		}

		if (var0.buttonType == 4) { // L: 10298
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10299
		}

		if (var0.buttonType == 5) { // L: 10302
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10303
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10306
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10307
		}

		int var4;
		int var13;
		if (var0.type == 2) { // L: 10310
			var13 = 0; // L: 10311

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10312
				for (int var15 = 0; var15 < var0.width; ++var15) { // L: 10313
					int var16 = (var0.paddingX + 32) * var15; // L: 10314
					int var7 = (var0.paddingY + 32) * var4; // L: 10315
					if (var13 < 20) { // L: 10316
						var16 += var0.inventoryXOffsets[var13]; // L: 10317
						var7 += var0.inventoryYOffsets[var13]; // L: 10318
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) { // L: 10320
						Client.dragItemSlotDestination = var13; // L: 10321
						NPCComposition.hoveredItemContainer = var0; // L: 10322
						if (var0.itemIds[var13] > 0) { // L: 10323
							ItemComposition var8 = Strings.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 10324
							if (Client.isItemSelected == 1 && Varcs.method2329(class26.getWidgetFlags(var0))) { // L: 10325
								if (var0.id != class35.selectedItemWidget || var13 != UserComparator8.selectedItemSlot) { // L: 10326
									InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 10327
								}
							} else if (Client.isSpellSelected && Varcs.method2329(class26.getWidgetFlags(var0))) { // L: 10331
								if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 16) == 16) { // L: 10332
									InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 10333
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10338
								int var10 = -1; // L: 10339
								if (Client.shiftClickDrop && class13.method213()) { // L: 10340
									var10 = var8.getShiftClickIndex(); // L: 10341
								}

								int var11;
								if (Varcs.method2329(class26.getWidgetFlags(var0))) { // L: 10343
									for (var11 = 4; var11 >= 3; --var11) { // L: 10344
										if (var10 != var11) { // L: 10345
											class32.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 10346
										}
									}
								}

								if (WorldMapIcon_0.method3509(class26.getWidgetFlags(var0))) { // L: 10349
									InterfaceParent.insertMenuItemNoShift("Use", HorizontalAlignment.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 10350
								}

								if (Varcs.method2329(class26.getWidgetFlags(var0))) { // L: 10353
									for (var11 = 2; var11 >= 0; --var11) { // L: 10354
										if (var10 != var11) { // L: 10355
											class32.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 10356
										}
									}

									if (var10 >= 0) { // L: 10358
										class32.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 10359
									}
								}

								var9 = var0.itemActions; // L: 10362
								if (var9 != null) { // L: 10363
									for (var11 = 4; var11 >= 0; --var11) { // L: 10364
										if (var9[var11] != null) { // L: 10365
											byte var12 = 0; // L: 10366
											if (var11 == 0) { // L: 10367
												var12 = 39;
											}

											if (var11 == 1) { // L: 10368
												var12 = 40;
											}

											if (var11 == 2) { // L: 10369
												var12 = 41;
											}

											if (var11 == 3) { // L: 10370
												var12 = 42;
											}

											if (var11 == 4) { // L: 10371
												var12 = 43;
											}

											InterfaceParent.insertMenuItemNoShift(var9[var11], HorizontalAlignment.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 10372
										}
									}
								}

								InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 10377
							}
						}
					}

					++var13; // L: 10382
				}
			}
		}

		if (var0.isIf3) { // L: 10386
			if (Client.isSpellSelected) { // L: 10387
				var4 = class26.getWidgetFlags(var0); // L: 10389
				boolean var17 = (var4 >> 21 & 1) != 0; // L: 10391
				if (var17 && (GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 32) == 32) { // L: 10393
					InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10394
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 10399
					String var14;
					if (!class125.method2507(class26.getWidgetFlags(var0), var13) && var0.onOp == null) { // L: 10402
						var14 = null; // L: 10403
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 10406
						var14 = var0.actions[var13]; // L: 10410
					} else {
						var14 = null; // L: 10407
					}

					if (var14 != null) { // L: 10413
						InterfaceParent.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 10414
					}
				}

				var3 = UserComparator9.Widget_getSpellActionName(var0); // L: 10418
				if (var3 != null) { // L: 10419
					InterfaceParent.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10420
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10423
					String var5;
					if (!class125.method2507(class26.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10426
						var5 = null; // L: 10427
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10430
						var5 = var0.actions[var4]; // L: 10434
					} else {
						var5 = null; // L: 10431
					}

					if (var5 != null) { // L: 10437
						class311.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10438
					}
				}

				if (PacketWriter.method2410(class26.getWidgetFlags(var0))) { // L: 10442
					InterfaceParent.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10443
				}
			}
		}

	} // L: 10448
}
