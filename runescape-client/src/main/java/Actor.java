import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1978015279
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2029968485
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 197746791
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -98605829
	)
	int field1023;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -55774215
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1367478127
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1558763
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -584031907
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 755646491
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 869838055
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1223187209
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1436374353
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1731805391
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ay")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ap")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ah")
	boolean field1079;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1097782901
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1483909439
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 668210335
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("aw")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bt")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bk")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("br")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("by")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bv")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -200885153
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bg")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -890883463
	)
	int field1048;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1594285789
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -973182859
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -242541553
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 760989061
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1588711653
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1689420355
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2102439421
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 655116259
	)
	int field1056;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 604747837
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1097211523
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2043114549
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1626664047
	)
	int field1060;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1777264679
	)
	int field1061;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1921017577
	)
	int field1062;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 584135247
	)
	int field1063;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -754676609
	)
	int field1064;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1614280993
	)
	int field1065;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -669523835
	)
	int field1073;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1177596115
	)
	int field1067;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1387618969
	)
	int field1050;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 321793587
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -772435111
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1826498157
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 472572481
	)
	int field1072;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -293816803
	)
	int field1074;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1119314223
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cd")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("co")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cm")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -515644987
	)
	int field1078;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1840571553
	)
	int field1066;

	Actor() {
		this.isWalking = false;
		this.field1023 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1079 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1048 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1056 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1072 = 0;
		this.field1074 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1078 = 0;
		this.field1066 = 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1689225091"
	)
	final void method1872() {
		this.pathLength = 0;
		this.field1066 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "46"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = ObjectComposition.method3044(var1);
			var10 = var12.field1725;
			var11 = var12.field1716;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1867872828"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = GraphicsObject.method1647(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1578 == var7.field1578) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "798953019"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = GraphicsObject.method1647(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIB)[Lom;",
		garbageValue = "49"
	)
	public static SpritePixels[] method1884(AbstractArchive var0, int var1, int var2) {
		return !class290.method5208(var0, var1, var2) ? null : class163.method3229();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1455646950"
	)
	static int method1887(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
			class120.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2;
			ParamComposition.performPlayerAnimation(MouseHandler.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field740) {
				Interpreter.field752 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
				var16 = 0;
				if (class249.isNumber(var7)) {
					var16 = NetCache.method5088(var7);
				}

				PacketBufferNode var14 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
					var12 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
					var12 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2637, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
						class108.method2304(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var15 = UrlRequester.getWidget(var9);
						ItemContainer.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
						ItemContainer.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class310.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Decimator.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						MilliClock.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class1.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						InvDefinition.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var12 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class1.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class1.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class1.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var4) + GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.method6685(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class15.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ReflectionCheck.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field569 = 3;
						Client.field483 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field569 = 2;
						Client.field483 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field569 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field569 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field569 = 3;
						Client.field483 = var2 ? GrandExchangeOffer.scriptDotWidget.id * -1996852661 * 611927907 : Interpreter.scriptActiveWidget.id * -1996852661 * 611927907;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Decimator.clientPreferences.hideUsername = var11;
							MilliClock.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								Decimator.clientPreferences.rememberedUsername = "";
								MilliClock.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (var11 == Decimator.clientPreferences.titleMusicDisabled) {
								Decimator.clientPreferences.titleMusicDisabled = !var11;
								MilliClock.savePreferences();
							}

							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptEvent.method1807();
							return 1;
						} else if (var0 == 3155) {
							--class1.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class1.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class1.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class1.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class1.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
							BuddyRankComparator.method2200((double)(0.5F + (float)var10 / 200.0F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)Decimator.clientPreferences.field1117 - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}
}
