import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("v")
	@Export("args")
	Object[] args;
	@ObfuscatedName("n")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1064015207
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 334920693
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2026444209
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1025309887
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -754868141
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("s")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 820352111
	)
	int field1180;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 487377745
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1143010333"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "566555821"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1244600055"
	)
	static String method2086() {
		return ObjectComposition.clientPreferences.hideUsername ? class6.method67(Login.Login_username) : Login.Login_username; // L: 188
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "0"
	)
	static int method2093(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1190
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1191
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var3)); // L: 1192
			return 1; // L: 1193
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1195
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1202
				if (var3.dataText == null) { // L: 1203
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1204
				}

				return 1; // L: 1205
			} else {
				return 2; // L: 1207
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1196
			--var4; // L: 1197
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1198
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1199
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1200
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "-1497241252"
	)
	static final void method2094(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field685; ++var1) { // L: 7453
			int var2 = Client.field686[var1]; // L: 7454
			NPC var3 = Client.npcs[var2]; // L: 7455
			int var4 = var0.readUnsignedByte(); // L: 7456
			int var5;
			int var6;
			int var7;
			if ((var4 & 32) != 0) { // L: 7457
				var5 = var0.method6603(); // L: 7458
				if (var5 == 65535) { // L: 7459
					var5 = -1;
				}

				var6 = var0.method6549(); // L: 7460
				if (var5 == var3.sequence && var5 != -1) { // L: 7461
					var7 = LoginScreenAnimation.SequenceDefinition_get(var5).field1891; // L: 7462
					if (var7 == 1) { // L: 7463
						var3.sequenceFrame = 0; // L: 7464
						var3.sequenceFrameCycle = 0; // L: 7465
						var3.sequenceDelay = var6; // L: 7466
						var3.field1245 = 0; // L: 7467
					}

					if (var7 == 2) { // L: 7469
						var3.field1245 = 0; // L: 7470
					}
				} else if (var5 == -1 || var3.sequence == -1 || LoginScreenAnimation.SequenceDefinition_get(var5).field1885 >= LoginScreenAnimation.SequenceDefinition_get(var3.sequence).field1885) { // L: 7473
					var3.sequence = var5; // L: 7474
					var3.sequenceFrame = 0; // L: 7475
					var3.sequenceFrameCycle = 0; // L: 7476
					var3.sequenceDelay = var6; // L: 7477
					var3.field1245 = 0; // L: 7478
					var3.field1274 = var3.pathLength; // L: 7479
				}
			}

			int var8;
			if ((var4 & 8) != 0) { // L: 7483
				var5 = var0.method6605(); // L: 7484
				var6 = var0.readUnsignedShort(); // L: 7485
				var7 = var3.x - (var5 - VertexNormal.baseX - VertexNormal.baseX) * 64; // L: 7486
				var8 = var3.y - (var6 - SoundSystem.baseY - SoundSystem.baseY) * 64; // L: 7487
				if (var7 != 0 || var8 != 0) { // L: 7488
					var3.field1264 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 2) != 0) { // L: 7490
				var3.definition = StructComposition.getNpcDefinition(var0.method6603()); // L: 7491
				var3.field1239 = var3.definition.size; // L: 7492
				var3.field1289 = var3.definition.rotation; // L: 7493
				var3.walkSequence = var3.definition.walkSequence; // L: 7494
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 7495
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 7496
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 7497
				var3.idleSequence = var3.definition.idleSequence; // L: 7498
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 7499
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 7500
			}

			if ((var4 & 1) != 0) { // L: 7502
				var3.targetIndex = var0.method6603(); // L: 7503
				if (var3.targetIndex == 65535) { // L: 7504
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 128) != 0) { // L: 7506
				var3.field1278 = var0.method6597(); // L: 7507
				var3.field1280 = var0.method6597(); // L: 7508
				var3.field1269 = var0.method6559(); // L: 7509
				var3.field1238 = var0.method6593(); // L: 7510
				var3.field1265 = var0.method6604() + Client.cycle; // L: 7511
				var3.field1283 = var0.method6603() + Client.cycle; // L: 7512
				var3.field1284 = var0.method6604(); // L: 7513
				var3.pathLength = 1; // L: 7514
				var3.field1274 = 0; // L: 7515
				var3.field1278 += var3.pathX[0]; // L: 7516
				var3.field1280 += var3.pathY[0]; // L: 7517
				var3.field1269 += var3.pathX[0]; // L: 7518
				var3.field1238 += var3.pathY[0]; // L: 7519
			}

			if ((var4 & 64) != 0) { // L: 7521
				var5 = var0.method6549(); // L: 7522
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 7523
					for (var6 = 0; var6 < var5; ++var6) { // L: 7524
						var8 = -1; // L: 7526
						var9 = -1; // L: 7527
						var10 = -1; // L: 7528
						var7 = var0.readUShortSmart(); // L: 7529
						if (var7 == 32767) { // L: 7530
							var7 = var0.readUShortSmart(); // L: 7531
							var9 = var0.readUShortSmart(); // L: 7532
							var8 = var0.readUShortSmart(); // L: 7533
							var10 = var0.readUShortSmart(); // L: 7534
						} else if (var7 != 32766) { // L: 7536
							var9 = var0.readUShortSmart(); // L: 7537
						} else {
							var7 = -1; // L: 7539
						}

						var11 = var0.readUShortSmart(); // L: 7540
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 7541
					}
				}

				var6 = var0.method6671(); // L: 7544
				if (var6 > 0) { // L: 7545
					for (var7 = 0; var7 < var6; ++var7) { // L: 7546
						var8 = var0.readUShortSmart(); // L: 7547
						var9 = var0.readUShortSmart(); // L: 7548
						if (var9 != 32767) { // L: 7549
							var10 = var0.readUShortSmart(); // L: 7550
							var11 = var0.method6671(); // L: 7551
							int var12 = var9 > 0 ? var0.method6549() : var11; // L: 7552
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 7553
						} else {
							var3.removeHealthBar(var8); // L: 7555
						}
					}
				}
			}

			if ((var4 & 4) != 0) { // L: 7559
				var3.spotAnimation = var0.method6605(); // L: 7560
				var5 = var0.method6598(); // L: 7561
				var3.field1277 = var5 >> 16; // L: 7562
				var3.field1287 = (var5 & 65535) + Client.cycle; // L: 7563
				var3.spotAnimationFrame = 0; // L: 7564
				var3.spotAnimationFrameCycle = 0; // L: 7565
				if (var3.field1287 > Client.cycle) { // L: 7566
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 7567
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 16) != 0) { // L: 7569
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 7570
				var3.overheadTextCyclesRemaining = 100; // L: 7571
			}
		}

	} // L: 7574
}
