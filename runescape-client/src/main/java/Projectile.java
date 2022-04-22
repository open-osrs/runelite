import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("by")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1442012707
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 895014891
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -420653117
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1496061701
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1469136561
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1839040857
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1959449499
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1003905831
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -466516667
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1789079227
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1371380693
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("p")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("w")
	@Export("x")
	double x;
	@ObfuscatedName("k")
	@Export("y")
	double y;
	@ObfuscatedName("d")
	@Export("z")
	double z;
	@ObfuscatedName("m")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("u")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("t")
	@Export("speed")
	double speed;
	@ObfuscatedName("g")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1968761335
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1799408283
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -957445753
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 75771285
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = ClientPreferences.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class163.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "5"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ClientPreferences.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "385748138"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method3844(); // L: 92
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	static void method1975(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpz;II)V",
		garbageValue = "168694674"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1283[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1283; // L: 81
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = LoginPacket.method5195(var0); // L: 86
						var10000 = Players.field1283; // L: 87
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						PlayerComposition.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1283[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1283; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = LoginPacket.method5195(var0); // L: 108
							var10000 = Players.field1283; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							PlayerComposition.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1283[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1283; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = LoginPacket.method5195(var0); // L: 130
								var10000 = Players.field1283; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (class175.updateExternalPlayer(var0, var7)) { // L: 134
								var10000 = Players.field1283;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1283[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1283; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = LoginPacket.method5195(var0); // L: 152
									var10000 = Players.field1283; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (class175.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1283;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1283; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 173
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 174
							var5 = Client.players[var4]; // L: 175
							var6 = var0.readUnsignedByte(); // L: 176
							if ((var6 & 64) != 0) { // L: 177
								var6 += var0.readUnsignedByte() << 8;
							}

							Login.method1932(var0, var4, var5, var6); // L: 178
						}

						if (var0.offset - var2 != var1) { // L: 181
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 182
						}
					}
				}
			}
		}
	} // L: 184

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-574030857"
	)
	static int method1976(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1470
			var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1471
			Actor.addGameMessage(0, "", var7); // L: 1472
			return 1; // L: 1473
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1476
			GrandExchangeOfferOwnWorldComparator.performPlayerAnimation(GrandExchangeEvents.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1477
			return 1; // L: 1478
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) { // L: 1481
				Interpreter.field841 = true; // L: 1482
			}

			return 1; // L: 1484
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1487
				var15 = 0; // L: 1488
				if (class300.isNumber(var7)) { // L: 1489
					var15 = class19.method288(var7);
				}

				PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 1491
				var13.packetBuffer.writeInt(var15); // L: 1492
				Client.packetWriter.addNode(var13); // L: 1493
				return 1; // L: 1494
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1497
					var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 1499
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1500
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1501
					Client.packetWriter.addNode(var11); // L: 1502
					return 1; // L: 1503
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1506
					var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 1508
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1509
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1510
					Client.packetWriter.addNode(var11); // L: 1511
					return 1; // L: 1512
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1515
						var4 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1516
						MidiPcmStream.method5366(var10, var4); // L: 1517
						return 1; // L: 1518
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1521
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1522
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1523
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1524
						Widget var14 = class127.getWidget(var9); // L: 1525
						ParamComposition.clickWidget(var14, var10, var15); // L: 1526
						return 1; // L: 1527
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1530
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1531
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1532
						Widget var12 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1533
						ParamComposition.clickWidget(var12, var10, var15); // L: 1534
						return 1; // L: 1535
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						GameBuild.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1538
						return 1; // L: 1539
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2263() ? 1 : 0; // L: 1542
						return 1; // L: 1543
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class131.clientPreferences.method2246(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1546
						return 1; // L: 1547
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 1550
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1551
						class391.openURL(var7, var8, false); // L: 1552
						return 1; // L: 1553
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1556
						var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher); // L: 1558
						var11.packetBuffer.writeShort(var10); // L: 1559
						Client.packetWriter.addNode(var11); // L: 1560
						return 1; // L: 1561
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1564
						class122.Interpreter_stringStackSize -= 2; // L: 1565
						var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 1566
						String var5 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 1567
						if (var4.length() > 500) { // L: 1568
							return 1;
						} else if (var5.length() > 500) { // L: 1569
							return 1;
						} else {
							PacketBufferNode var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher); // L: 1570
							var6.packetBuffer.writeShort(1 + class425.stringCp1252NullTerminatedByteSize(var4) + class425.stringCp1252NullTerminatedByteSize(var5)); // L: 1571
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1572
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1573
							var6.packetBuffer.method7703(var10); // L: 1574
							Client.packetWriter.addNode(var6); // L: 1575
							return 1; // L: 1576
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1579
						return 1; // L: 1580
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1583
						return 1; // L: 1584
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1587
						return 1; // L: 1588
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1591
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1592
						}

						return 1; // L: 1593
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1596
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1597
						}

						return 1; // L: 1598
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1601
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1602
						}

						return 1; // L: 1603
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1606
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1607
						}

						return 1; // L: 1608
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1611
						return 1; // L: 1612
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1615
						return 1; // L: 1616
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1619
						return 1; // L: 1620
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1623
						return 1; // L: 1624
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = User.getTapToDrop() ? 1 : 0; // L: 1627
						return 1; // L: 1628
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1631
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1632
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1633
						return 1; // L: 1634
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1637
						return 1; // L: 1638
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 1641
						return 1; // L: 1642
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.canvasWidth; // L: 1645
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class321.canvasHeight; // L: 1646
						return 1; // L: 1647
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 1650
						return 1; // L: 1651
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1654
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1657
						return 1; // L: 1658
					} else if (var0 == 3136) {
						Client.field668 = 3; // L: 1661
						Client.field628 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1662
						return 1; // L: 1663
					} else if (var0 == 3137) {
						Client.field668 = 2; // L: 1666
						Client.field628 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1667
						return 1; // L: 1668
					} else if (var0 == 3138) {
						Client.field668 = 0; // L: 1671
						return 1; // L: 1672
					} else if (var0 == 3139) {
						Client.field668 = 1; // L: 1675
						return 1; // L: 1676
					} else if (var0 == 3140) {
						Client.field668 = 3; // L: 1679
						Client.field628 = var2 ? WorldMapID.scriptDotWidget.id * 1389111653 * 785571949 : Interpreter.scriptActiveWidget.id * 1389111653 * 785571949; // L: 1680
						return 1; // L: 1681
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1684
							class131.clientPreferences.method2230(var3); // L: 1685
							return 1; // L: 1686
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2317() ? 1 : 0; // L: 1689
							return 1; // L: 1690
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1693
							Client.Login_isUsernameRemembered = var3; // L: 1694
							if (!var3) { // L: 1695
								class131.clientPreferences.method2286(""); // L: 1696
							}

							return 1; // L: 1698
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1701
							return 1; // L: 1702
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 1705
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1708
							class131.clientPreferences.method2237(!var3); // L: 1709
							return 1; // L: 1710
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2279() ? 0 : 1; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3148) {
							return 1; // L: 1717
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1724
							return 1; // L: 1725
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1728
							return 1; // L: 1729
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1732
							return 1; // L: 1733
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1736
							return 1; // L: 1737
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class166.method3342(); // L: 1740
							return 1; // L: 1741
						} else if (var0 == 3155) {
							--class122.Interpreter_stringStackSize; // L: 1744
							return 1; // L: 1745
						} else if (var0 == 3156) {
							return 1; // L: 1748
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1751
							return 1; // L: 1752
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1755
							return 1; // L: 1756
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1759
							return 1; // L: 1760
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1763
							return 1; // L: 1764
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 1767
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1768
							return 1; // L: 1769
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 1772
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1773
							return 1; // L: 1774
						} else if (var0 == 3163) {
							--class122.Interpreter_stringStackSize; // L: 1777
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1778
							return 1; // L: 1779
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 1782
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1783
							return 1; // L: 1784
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 1787
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1788
							return 1; // L: 1789
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1792
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1793
							return 1; // L: 1794
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1797
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1798
							return 1; // L: 1799
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1802
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1803
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1804
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1805
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1806
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1807
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1808
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1809
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1810
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 1811
							return 1; // L: 1812
						} else if (var0 == 3169) {
							return 1; // L: 1815
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1818
							return 1; // L: 1819
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1822
							return 1; // L: 1823
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 1826
							return 1; // L: 1827
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 1830
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1831
							return 1; // L: 1832
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 1835
							return 1; // L: 1836
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1839
							return 1; // L: 1840
						} else if (var0 == 3176) {
							return 1; // L: 1843
						} else if (var0 == 3177) {
							return 1; // L: 1846
						} else if (var0 == 3178) {
							--class122.Interpreter_stringStackSize; // L: 1849
							return 1; // L: 1850
						} else if (var0 == 3179) {
							return 1; // L: 1853
						} else if (var0 == 3180) {
							--class122.Interpreter_stringStackSize; // L: 1856
							return 1; // L: 1857
						} else if (var0 == 3181) {
							class113.method2650(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1860
							return 1; // L: 1861
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.method3578(); // L: 1864
							return 1; // L: 1865
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								class122.Interpreter_stringStackSize -= 2; // L: 1872
								return 1; // L: 1873
							} else {
								return var0 == 3188 ? 1 : 2; // L: 1876 1878
							}
						} else {
							--Interpreter.Interpreter_intStackSize; // L: 1868
							return 1; // L: 1869
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-875242540"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11171
	} // L: 11172
}
