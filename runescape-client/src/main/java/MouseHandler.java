import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1215511241
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1775726367
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 85689575
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1306099979
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -4643079622769248037L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1731887577
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 945035617
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -785295255
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 4725999527355171863L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1519434749
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -981711317
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1147584293
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 1021935901074327701L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -192789509
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 647045439
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1945736255
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -2565305597523014613L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-6"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 67
		if (!var1.isAltDown() && var2 != 2) { // L: 68
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 69 70
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 115
			MouseHandler_idleCycles = 0; // L: 116
			MouseHandler_xVolatile = var1.getX(); // L: 117
			MouseHandler_yVolatile = var1.getY(); // L: 118
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 119
		}

	} // L: 121

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 102
			MouseHandler_idleCycles = 0; // L: 103
			MouseHandler_xVolatile = -1; // L: 104
			MouseHandler_yVolatile = -1; // L: 105
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 106
		}

	} // L: 108

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 111
	} // L: 112

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 86
			MouseHandler_idleCycles = 0; // L: 87
			MouseHandler_currentButtonVolatile = 0; // L: 88
		}

		if (var1.isPopupTrigger()) { // L: 90
			var1.consume();
		}

	} // L: 91

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 98
	} // L: 99

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 126
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 127

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 94
			var1.consume();
		}

	} // L: 95

	public final void focusGained(FocusEvent var1) {
	} // L: 123

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 76
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 77
			MouseHandler_lastPressedTimeMillisVolatile = class136.method2931(); // L: 78
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 79
			if (MouseHandler_lastButtonVolatile != 0) { // L: 80
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1283526589"
	)
	static int method613(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 427
			return class168.method3353(var0, var1, var2);
		} else if (var0 < 1100) { // L: 428
			return class7.method54(var0, var1, var2);
		} else if (var0 < 1200) { // L: 429
			return UserComparator9.method2621(var0, var1, var2);
		} else if (var0 < 1300) { // L: 430
			return class134.method2906(var0, var1, var2);
		} else if (var0 < 1400) { // L: 431
			return UserComparator3.method2607(var0, var1, var2);
		} else if (var0 < 1500) { // L: 432
			return Language.method6079(var0, var1, var2);
		} else if (var0 < 1600) { // L: 433
			return class296.method5749(var0, var1, var2);
		} else if (var0 < 1700) { // L: 434
			return SoundSystem.method761(var0, var1, var2);
		} else if (var0 < 1800) { // L: 435
			return class135.method2922(var0, var1, var2);
		} else if (var0 < 1900) { // L: 436
			return NPC.method2361(var0, var1, var2);
		} else if (var0 < 2000) { // L: 437
			return HealthBarUpdate.method2186(var0, var1, var2);
		} else if (var0 < 2100) { // L: 438
			return class7.method54(var0, var1, var2);
		} else if (var0 < 2200) { // L: 439
			return UserComparator9.method2621(var0, var1, var2);
		} else if (var0 < 2300) { // L: 440
			return class134.method2906(var0, var1, var2);
		} else if (var0 < 2400) { // L: 441
			return UserComparator3.method2607(var0, var1, var2);
		} else if (var0 < 2500) {
			return Language.method6079(var0, var1, var2); // L: 442
		} else if (var0 < 2600) { // L: 443
			return ApproximateRouteStrategy.method1124(var0, var1, var2);
		} else if (var0 < 2700) { // L: 444
			return class135.method2921(var0, var1, var2);
		} else if (var0 < 2800) { // L: 445
			return class271.method5220(var0, var1, var2);
		} else if (var0 < 2900) { // L: 446
			return class127.method2840(var0, var1, var2);
		} else if (var0 < 3000) { // L: 447
			return HealthBarUpdate.method2186(var0, var1, var2);
		} else if (var0 < 3200) { // L: 448
			return Projectile.method1976(var0, var1, var2);
		} else if (var0 < 3300) { // L: 449
			return PlayerType.method5803(var0, var1, var2);
		} else if (var0 < 3400) { // L: 450
			return ViewportMouse.method5089(var0, var1, var2);
		} else if (var0 < 3500) { // L: 451
			return SecureRandomFuture.method1985(var0, var1, var2);
		} else if (var0 < 3600) { // L: 452
			return class356.method6582(var0, var1, var2);
		} else if (var0 < 3700) { // L: 453
			return AbstractByteArrayCopier.method5506(var0, var1, var2);
		} else if (var0 < 3800) { // L: 454
			return GameObject.method5111(var0, var1, var2);
		} else if (var0 < 3900) { // L: 455
			return WorldMapSectionType.method4310(var0, var1, var2);
		} else if (var0 < 4000) { // L: 456
			return Player.method2112(var0, var1, var2);
		} else if (var0 < 4100) { // L: 457
			return Strings.method5790(var0, var1, var2);
		} else if (var0 < 4200) {
			return WorldMapLabel.method4354(var0, var1, var2); // L: 458
		} else if (var0 < 4300) { // L: 459
			return NetCache.method5965(var0, var1, var2);
		} else if (var0 < 5100) { // L: 460
			return class151.method3159(var0, var1, var2);
		} else if (var0 < 5400) { // L: 461
			return class160.method3279(var0, var1, var2);
		} else if (var0 < 5600) { // L: 462
			return Language.method6091(var0, var1, var2);
		} else if (var0 < 5700) { // L: 463
			return BufferedSink.method6911(var0, var1, var2);
		} else if (var0 < 6300) { // L: 464
			return SecureRandomFuture.method1984(var0, var1, var2);
		} else if (var0 < 6600) { // L: 465
			return ScriptFrame.method1085(var0, var1, var2);
		} else if (var0 < 6700) { // L: 466
			return class11.method100(var0, var1, var2);
		} else if (var0 < 6800) { // L: 467
			return class271.method5221(var0, var1, var2);
		} else if (var0 < 6900) { // L: 468
			return HealthBar.method2343(var0, var1, var2);
		} else if (var0 < 7000) { // L: 469
			return class10.method87(var0, var1, var2);
		} else if (var0 < 7100) { // L: 470
			return MouseRecorder.method2094(var0, var1, var2);
		} else if (var0 < 7200) { // L: 471
			return Skeleton.method4729(var0, var1, var2);
		} else if (var0 < 7300) { // L: 472
			return class19.method286(var0, var1, var2);
		} else {
			return var0 < 7500 ? ApproximateRouteStrategy.method1123(var0, var1, var2) : 2; // L: 473 474
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-76237077"
	)
	public static String method584(String var0) {
		int var1 = var0.length(); // L: 150
		char[] var2 = new char[var1]; // L: 151
		byte var3 = 2; // L: 152

		for (int var4 = 0; var4 < var1; ++var4) { // L: 153
			char var5 = var0.charAt(var4); // L: 154
			if (var3 == 0) { // L: 155
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 156
				var5 = class129.method2863(var5);
			}

			if (Character.isLetter(var5)) { // L: 157
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 158
				if (Character.isSpaceChar(var5)) { // L: 159
					if (var3 != 2) { // L: 160
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 162
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 163
		}

		return new String(var2); // L: 165
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lpz;B)V",
		garbageValue = "2"
	)
	static final void method593(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field547; ++var1) { // L: 8207
			int var2 = Client.field548[var1]; // L: 8208
			NPC var3 = Client.npcs[var2]; // L: 8209
			int var4 = var0.readUnsignedByte(); // L: 8210
			int var5;
			if (class431.field4602 && (var4 & 64) != 0) { // L: 8211
				var5 = var0.readUnsignedByte(); // L: 8212
				var4 += var5 << 8; // L: 8213
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) { // L: 8215
				var5 = var0.readUnsignedShort(); // L: 8216
				var6 = var0.method7715(); // L: 8217
				if (class431.field4602) { // L: 8218
					var3.field1144 = var0.method7875() == 1; // L: 8219
				}

				var7 = var3.x - (var5 - GrandExchangeOfferOwnWorldComparator.baseX - GrandExchangeOfferOwnWorldComparator.baseX) * 64; // L: 8221
				var8 = var3.y - (var6 - VarcInt.baseY - VarcInt.baseY) * 64; // L: 8222
				if (var7 != 0 || var8 != 0) { // L: 8223
					var3.field1121 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 1024) != 0) { // L: 8225
				var3.field1182 = var0.readInt(); // L: 8226
			}

			if ((var4 & 16) != 0) { // L: 8228
				var3.spotAnimation = var0.readUnsignedShort(); // L: 8229
				var5 = var0.readInt(); // L: 8230
				var3.spotAnimationHeight = var5 >> 16; // L: 8231
				var3.field1134 = (var5 & 65535) + Client.cycle; // L: 8232
				var3.spotAnimationFrame = 0; // L: 8233
				var3.spotAnimationFrameCycle = 0; // L: 8234
				if (var3.field1134 > Client.cycle) { // L: 8235
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8236
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 128) != 0) { // L: 8238
				var5 = var0.readUnsignedByte(); // L: 8239
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 8240
					for (var6 = 0; var6 < var5; ++var6) { // L: 8241
						var8 = -1; // L: 8243
						var9 = -1; // L: 8244
						var10 = -1; // L: 8245
						var7 = var0.readUShortSmart(); // L: 8246
						if (var7 == 32767) { // L: 8247
							var7 = var0.readUShortSmart(); // L: 8248
							var9 = var0.readUShortSmart(); // L: 8249
							var8 = var0.readUShortSmart(); // L: 8250
							var10 = var0.readUShortSmart(); // L: 8251
						} else if (var7 != 32766) { // L: 8253
							var9 = var0.readUShortSmart(); // L: 8254
						} else {
							var7 = -1; // L: 8256
						}

						var11 = var0.readUShortSmart(); // L: 8257
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8258
					}
				}

				var6 = var0.method7773(); // L: 8261
				if (var6 > 0) { // L: 8262
					for (var7 = 0; var7 < var6; ++var7) { // L: 8263
						var8 = var0.readUShortSmart(); // L: 8264
						var9 = var0.readUShortSmart(); // L: 8265
						if (var9 != 32767) { // L: 8266
							var10 = var0.readUShortSmart(); // L: 8267
							var11 = var0.readUnsignedByte(); // L: 8268
							int var12 = var9 > 0 ? var0.method7875() : var11; // L: 8269
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8270
						} else {
							var3.removeHealthBar(var8); // L: 8272
						}
					}
				}
			}

			if (class431.field4602 && (var4 & 256) != 0 || !class431.field4602 && (var4 & 64) != 0) { // L: 8276
				var3.field1129 = var0.method7885(); // L: 8277
				var3.field1160 = var0.method7707(); // L: 8278
				var3.field1132 = var0.readByte(); // L: 8279
				var3.field1161 = var0.readByte(); // L: 8280
				var3.field1143 = var0.method7715() + Client.cycle; // L: 8281
				var3.field1163 = var0.readUnsignedShort() + Client.cycle; // L: 8282
				var3.field1135 = var0.method7715(); // L: 8283
				var3.pathLength = 1; // L: 8284
				var3.field1170 = 0; // L: 8285
				var3.field1129 += var3.pathX[0]; // L: 8286
				var3.field1160 += var3.pathY[0]; // L: 8287
				var3.field1132 += var3.pathX[0]; // L: 8288
				var3.field1161 += var3.pathY[0]; // L: 8289
			}

			if ((var4 & 512) != 0) { // L: 8291
				var3.field1167 = Client.cycle + var0.method7713(); // L: 8292
				var3.field1168 = Client.cycle + var0.method7714(); // L: 8293
				var3.field1169 = var0.readByte(); // L: 8294
				var3.field1114 = var0.method7707(); // L: 8295
				var3.field1171 = var0.method7707(); // L: 8296
				var3.field1122 = (byte)var0.method7742(); // L: 8297
			}

			if ((var4 & 2) != 0) { // L: 8299
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8300
				var3.overheadTextCyclesRemaining = 100; // L: 8301
			}

			if ((var4 & 4) != 0) { // L: 8303
				var3.targetIndex = var0.method7714(); // L: 8304
				if (var3.targetIndex == 65535) { // L: 8305
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 32) != 0) { // L: 8307
				var3.definition = KeyHandler.getNpcDefinition(var0.method7715()); // L: 8308
				var3.field1150 = var3.definition.size; // L: 8309
				var3.field1175 = var3.definition.rotation; // L: 8310
				var3.walkSequence = var3.definition.walkSequence; // L: 8311
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 8312
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 8313
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 8314
				var3.idleSequence = var3.definition.idleSequence; // L: 8315
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 8316
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 8317
			}

			if ((var4 & 8) != 0) { // L: 8319
				var5 = var0.method7713(); // L: 8320
				if (var5 == 65535) { // L: 8321
					var5 = -1; // L: 8322
				}

				var6 = var0.method7875(); // L: 8324
				if (var5 == var3.sequence && var5 != -1) { // L: 8325
					var7 = class163.SequenceDefinition_get(var5).field2161; // L: 8326
					if (var7 == 1) { // L: 8327
						var3.sequenceFrame = 0; // L: 8328
						var3.sequenceFrameCycle = 0; // L: 8329
						var3.sequenceDelay = var6; // L: 8330
						var3.field1152 = 0; // L: 8331
					}

					if (var7 == 2) { // L: 8333
						var3.field1152 = 0; // L: 8334
					}
				} else if (var5 == -1 || var3.sequence == -1 || class163.SequenceDefinition_get(var5).field2155 >= class163.SequenceDefinition_get(var3.sequence).field2155) { // L: 8337
					var3.sequence = var5; // L: 8338
					var3.sequenceFrame = 0; // L: 8339
					var3.sequenceFrameCycle = 0; // L: 8340
					var3.sequenceDelay = var6; // L: 8341
					var3.field1152 = 0; // L: 8342
					var3.field1170 = var3.pathLength; // L: 8343
				}
			}
		}

	} // L: 8348
}
