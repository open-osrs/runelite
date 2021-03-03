import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -148316237
	)
	static int field2516;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhq;[IIIIS)V",
		garbageValue = "23507"
	)
	void method4102(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2458[var1.field2471] & 4) != 0 && var1.field2486 < 0) {
			int var6 = this.superStream.field2468[var1.field2471] / StructComposition.field3338;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2479) / var6;
				if (var7 > var4) {
					var1.field2479 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2479 += var6 * var7 - 1048576;
				int var8 = StructComposition.field3338 / 100; // L: 82
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2460[var1.field2471] == 0) {
					var1.stream = RawPcmStream.method2845(var1.rawSound, var10.method2728(), var10.method2719(), var10.method2773());
				} else {
					var1.stream = RawPcmStream.method2845(var1.rawSound, var10.method2728(), 0, var10.method2773());
					this.superStream.method3923(var1, var1.patch.field2513[var1.field2475] < 0);
					var1.stream.method2741(var8, var10.method2719());
				}

				if (var1.patch.field2513[var1.field2475] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method2803(var8);
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method2730()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhq;II)V",
		garbageValue = "-1159313608"
	)
	void method4103(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2458[var1.field2471] & 4) != 0 && var1.field2486 < 0) {
			int var3 = this.superStream.field2468[var1.field2471] / StructComposition.field3338;
			int var4 = (var3 + 1048575 - var1.field2479) / var3;
			var1.field2479 = var3 * var2 + var1.field2479 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field2460[var1.field2471] == 0) { // L: 110
					var1.stream = RawPcmStream.method2845(var1.rawSound, var1.stream.method2728(), var1.stream.method2719(), var1.stream.method2773()); // L: 111
				} else {
					var1.stream = RawPcmStream.method2845(var1.rawSound, var1.stream.method2728(), 0, var1.stream.method2773()); // L: 114
					this.superStream.method3923(var1, var1.patch.field2513[var1.field2475] < 0); // L: 115
				}

				if (var1.patch.field2513[var1.field2475] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2479 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("e")
	protected int vmethod4099() {
		return 0;
	}

	@ObfuscatedName("q")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3927(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2484) {
						this.method4102(var6, var1, var4, var5, var5 + var4);
						var6.field2484 -= var5;
						break;
					}

					this.method4102(var6, var1, var4, var6.field2484, var5 + var4); // L: 46
					var4 += var6.field2484;
					var5 -= var6.field2484;
				} while(!this.superStream.method3953(var6, var1, var4, var5));
			}
		}

	} // L: 54

	@ObfuscatedName("s")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3927(var3)) {
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field2484) {
						this.method4103(var3, var2);
						var3.field2484 -= var2; // L: 68
						break;
					}

					this.method4103(var3, var3.field2484);
					var2 -= var3.field2484;
				} while(!this.superStream.method3953(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILgz;Lfe;I)Z",
		garbageValue = "604178296"
	)
	public static final boolean method4098(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class182.directions[var6][var7] = 99; // L: 25
		class182.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class182.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var18 != var11) { // L: 34
			var4 = class182.bufferX[var11]; // L: 35
			var5 = class182.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				class182.field2118 = var4; // L: 43
				class182.field2124 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class182.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class182.bufferX[var18] = var4 - 1; // L: 49
				class182.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class182.directions[var16 - 1][var17] = 2; // L: 52
				class182.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class182.bufferX[var18] = var4 + 1; // L: 56
				class182.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class182.directions[var16 + 1][var17] = 8; // L: 59
				class182.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class182.bufferX[var18] = var4; // L: 63
				class182.bufferY[var18] = var5 - 1; // L: 64
				var18 = var18 + 1 & 4095; // L: 65
				class182.directions[var16][var17 - 1] = 1; // L: 66
				class182.distances[var16][var17 - 1] = var15; // L: 67
			}

			if (var17 < 127 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 69
				class182.bufferX[var18] = var4; // L: 70
				class182.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class182.directions[var16][var17 + 1] = 4; // L: 73
				class182.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class182.bufferX[var18] = var4 - 1; // L: 77
				class182.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class182.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class182.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class182.bufferX[var18] = var4 + 1; // L: 84
				class182.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class182.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class182.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class182.bufferX[var18] = var4 - 1; // L: 91
				class182.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class182.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class182.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class182.bufferX[var18] = var4 + 1; // L: 98
				class182.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class182.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class182.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		class182.field2118 = var4; // L: 105
		class182.field2124 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1484291347"
	)
	static int method4118(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1328
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1329
			AbstractWorldMapData.addGameMessage(0, "", var7); // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1334
			UserComparator7.performPlayerAnimation(UserComparator9.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1122) { // L: 1339
				Interpreter.field1120 = true; // L: 1340
			}

			return 1; // L: 1342
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1345
				var16 = 0; // L: 1346
				if (WorldMapDecoration.isNumber(var7)) { // L: 1347
					var16 = class217.parseInt(var7);
				}

				PacketBufferNode var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 1349
				var14.packetBuffer.writeInt(var16); // L: 1350
				Client.packetWriter.addNode(var14); // L: 1351
				return 1; // L: 1352
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1355
					var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher); // L: 1357
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1358
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1359
					Client.packetWriter.addNode(var12); // L: 1360
					return 1; // L: 1361
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1364
					var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher); // L: 1366
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1367
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1368
					Client.packetWriter.addNode(var12); // L: 1369
					return 1; // L: 1370
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1373
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1374
						class7.method83(var10, var4); // L: 1375
						return 1; // L: 1376
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1379
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1380
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1381
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1382
						Widget var15 = class237.getWidget(var9); // L: 1383
						FriendSystem.clickWidget(var15, var10, var16); // L: 1384
						return 1; // L: 1385
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1388
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1389
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1390
						Widget var13 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1391
						FriendSystem.clickWidget(var13, var10, var16); // L: 1392
						return 1; // L: 1393
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class8.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1396
						return 1; // L: 1397
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.roofsHidden ? 1 : 0; // L: 1400
						return 1; // L: 1401
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapSectionType.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1404
						class23.savePreferences(); // L: 1405
						return 1; // L: 1406
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1409
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1410
						WorldMapRectangle.openURL(var7, var8, false); // L: 1411
						return 1; // L: 1412
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1415
						var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2331, Client.packetWriter.isaacCipher); // L: 1417
						var12.packetBuffer.writeShort(var10); // L: 1418
						Client.packetWriter.addNode(var12); // L: 1419
						return 1; // L: 1420
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1423
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1424
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1425
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1426
						if (var4.length() > 500) { // L: 1427
							return 1;
						} else if (var5.length() > 500) { // L: 1428
							return 1;
						} else {
							PacketBufferNode var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher); // L: 1429
							var6.packetBuffer.writeShort(1 + WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var4) + WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var5)); // L: 1430
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1431
							var6.packetBuffer.method5778(var10); // L: 1432
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1433
							Client.packetWriter.addNode(var6); // L: 1434
							return 1; // L: 1435
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1438
						return 1; // L: 1439
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1442
						return 1; // L: 1443
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1446
						return 1; // L: 1447
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1450
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1451
						}

						return 1; // L: 1452
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1455
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1456
						}

						return 1; // L: 1457
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1460
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1461
						}

						return 1; // L: 1462
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1465
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1466
						}

						return 1; // L: 1467
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1470
						return 1; // L: 1471
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1474
						return 1; // L: 1475
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1478
						return 1; // L: 1479
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Tiles.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1482
						return 1; // L: 1483
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.getTapToDrop() ? 1 : 0; // L: 1486
						return 1; // L: 1487
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1490
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1491
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1492
						return 1; // L: 1493
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1496
						return 1; // L: 1497
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 1500
						return 1; // L: 1501
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 1504
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class25.canvasHeight; // L: 1505
						return 1; // L: 1506
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 1509
						return 1; // L: 1510
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 1513
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1516
						return 1; // L: 1517
					} else if (var0 == 3136) {
						Client.field705 = 3; // L: 1520
						Client.field699 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1521
						return 1; // L: 1522
					} else if (var0 == 3137) {
						Client.field705 = 2; // L: 1525
						Client.field699 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1526
						return 1; // L: 1527
					} else if (var0 == 3138) {
						Client.field705 = 0; // L: 1530
						return 1; // L: 1531
					} else if (var0 == 3139) {
						Client.field705 = 1; // L: 1534
						return 1; // L: 1535
					} else if (var0 == 3140) {
						Client.field705 = 3; // L: 1538
						Client.field699 = var2 ? class277.scriptDotWidget.id * 584503877 * -1745850227 : Interpreter.scriptActiveWidget.id * 584503877 * -1745850227; // L: 1539
						return 1; // L: 1540
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1543
							WorldMapSectionType.clientPreferences.hideUsername = var11; // L: 1544
							class23.savePreferences(); // L: 1545
							return 1; // L: 1546
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.hideUsername ? 1 : 0; // L: 1549
							return 1; // L: 1550
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1553
							Client.Login_isUsernameRemembered = var11; // L: 1554
							if (!var11) { // L: 1555
								WorldMapSectionType.clientPreferences.rememberedUsername = ""; // L: 1556
								class23.savePreferences(); // L: 1557
							}

							return 1; // L: 1559
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 1562
							return 1; // L: 1563
						} else if (var0 == 3145) {
							return 1; // L: 1566
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1569
							if (var11 == WorldMapSectionType.clientPreferences.titleMusicDisabled) { // L: 1570
								WorldMapSectionType.clientPreferences.titleMusicDisabled = !var11; // L: 1571
								class23.savePreferences(); // L: 1572
							}

							return 1; // L: 1574
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.titleMusicDisabled ? 0 : 1; // L: 1577
							return 1; // L: 1578
						} else if (var0 == 3148) {
							return 1; // L: 1581
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1584
							return 1; // L: 1585
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1588
							return 1; // L: 1589
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1592
							return 1; // L: 1593
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1596
							return 1; // L: 1597
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 1600
							return 1; // L: 1601
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ViewportMouse.method3161(); // L: 1604
							return 1; // L: 1605
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 1608
							return 1; // L: 1609
						} else if (var0 == 3156) {
							return 1; // L: 1612
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1615
							return 1; // L: 1616
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1619
							return 1; // L: 1620
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1623
							return 1; // L: 1624
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1627
							return 1; // L: 1628
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 1631
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1632
							return 1; // L: 1633
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 1636
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1637
							return 1; // L: 1638
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 1641
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1642
							return 1; // L: 1643
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 1646
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1647
							return 1; // L: 1648
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 1651
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1652
							return 1; // L: 1653
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1656
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1657
							return 1; // L: 1658
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1661
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1662
							return 1; // L: 1663
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 1666
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1667
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1668
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1669
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1670
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1671
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1672
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1673
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1674
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1675
							return 1; // L: 1676
						} else if (var0 == 3169) {
							return 1; // L: 1679
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1682
							return 1; // L: 1683
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1686
							return 1; // L: 1687
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 1690
							return 1; // L: 1691
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 1694
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1695
							return 1; // L: 1696
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 1699
							return 1; // L: 1700
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1703
							return 1; // L: 1704
						} else if (var0 == 3176) {
							return 1; // L: 1707
						} else if (var0 == 3177) {
							return 1; // L: 1710
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 1713
							return 1; // L: 1714
						} else if (var0 == 3179) {
							return 1; // L: 1717
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 1720
							return 1; // L: 1721
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100); // L: 1724
							Decimator.method2707((double)(0.5F + (float)var10 / 200.0F)); // L: 1725
							return 1; // L: 1726
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)WorldMapSectionType.clientPreferences.field1072 - 0.5F); // L: 1729
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 100 - Math.round(var3); // L: 1730
							return 1; // L: 1731
						} else {
							return 2; // L: 1733
						}
					}
				}
			}
		}
	}
}
