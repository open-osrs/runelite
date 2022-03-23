import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return NPC.method2364(); // L: 46
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-1849824347"
	)
	public static boolean method2069(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 149
			int var3 = var2.read(); // L: 150
			var2.seek(0L); // L: 151
			var2.write(var3); // L: 152
			var2.seek(0L); // L: 153
			var2.close(); // L: 154
			if (var1) { // L: 155
				var0.delete();
			}

			return true; // L: 156
		} catch (Exception var4) { // L: 158
			return false; // L: 159
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "57"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1034
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1035
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1036
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1037
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1038
		return var3; // L: 1039
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-555980278"
	)
	static int method2064(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1269
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1286
				var7 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1287
				var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1288
				if (var4 >= 1 && var4 <= 10) { // L: 1289
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1292
					Interpreter.field839.add(var8); // L: 1293
					return 1; // L: 1294
				} else {
					throw new RuntimeException(); // L: 1290
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1296
				class295.Interpreter_intStackSize -= 3; // L: 1297
				int var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 1298
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 1299
				int var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 1300
				if (var5 >= 1 && var5 <= 10) { // L: 1301
					class93 var6 = new class93(var5, var3, var4, HorizontalAlignment.getWidget(var3).itemId); // L: 1304
					Interpreter.field839.add(var6); // L: 1305
					return 1; // L: 1306
				} else {
					throw new RuntimeException(); // L: 1302
				}
			} else {
				return 2; // L: 1308
			}
		} else if (Interpreter.field827 >= 10) { // L: 1270
			throw new RuntimeException(); // L: 1271
		} else {
			if (var0 >= 2000) { // L: 1274
				var7 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1275
			} else {
				var7 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 1277
			}

			if (var7.onResize == null) { // L: 1278
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1279
				var9.widget = var7; // L: 1280
				var9.args = var7.onResize; // L: 1281
				var9.field1053 = Interpreter.field827 + 1; // L: 1282
				Client.scriptEvents.addFirst(var9); // L: 1283
				return 1; // L: 1284
			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZLpy;B)V",
		garbageValue = "88"
	)
	static final void method2066(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7909
				int var2 = var1.readBits(15); // L: 7910
				if (var2 != 32767) { // L: 7911
					boolean var3 = false; // L: 7912
					if (Client.npcs[var2] == null) { // L: 7913
						Client.npcs[var2] = new NPC(); // L: 7914
						var3 = true; // L: 7915
					}

					NPC var4 = Client.npcs[var2]; // L: 7917
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7918
					var4.npcCycle = Client.cycle; // L: 7919
					int var5;
					int var6;
					int var7;
					int var8;
					boolean var9;
					int var10;
					if (class162.field1768) { // L: 7923
						if (var0) { // L: 7924
							var6 = var1.readBits(8); // L: 7925
							if (var6 > 127) { // L: 7926
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7929
							if (var6 > 15) { // L: 7930
								var6 -= 32;
							}
						}

						var5 = var1.readBits(1); // L: 7932
						var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7933
						if (var3) { // L: 7934
							var4.orientation = var4.rotation = var8;
						}

						var4.definition = class9.getNpcDefinition(var1.readBits(14)); // L: 7935
						if (var0) { // L: 7936
							var7 = var1.readBits(8); // L: 7937
							if (var7 > 127) { // L: 7938
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 7941
							if (var7 > 15) { // L: 7942
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1) == 1; // L: 7944
						if (var9) { // L: 7945
							var1.readBits(32); // L: 7946
						}

						var10 = var1.readBits(1); // L: 7948
						if (var10 == 1) { // L: 7949
							Client.field533[++Client.field609 - 1] = var2;
						}
					} else {
						var5 = var1.readBits(1); // L: 7952
						var8 = var1.readBits(1); // L: 7953
						if (var8 == 1) { // L: 7954
							Client.field533[++Client.field609 - 1] = var2;
						}

						if (var0) { // L: 7955
							var7 = var1.readBits(8); // L: 7956
							if (var7 > 127) { // L: 7957
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 7960
							if (var7 > 15) { // L: 7961
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1) == 1; // L: 7963
						if (var9) { // L: 7964
							var1.readBits(32); // L: 7965
						}

						if (var0) { // L: 7967
							var6 = var1.readBits(8); // L: 7968
							if (var6 > 127) { // L: 7969
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7972
							if (var6 > 15) { // L: 7973
								var6 -= 32;
							}
						}

						var4.definition = class9.getNpcDefinition(var1.readBits(14)); // L: 7975
						var10 = Client.defaultRotations[var1.readBits(3)]; // L: 7976
						if (var3) { // L: 7977
							var4.orientation = var4.rotation = var10;
						}
					}

					var4.field1145 = var4.definition.size; // L: 7979
					var4.field1192 = var4.definition.rotation; // L: 7980
					if (var4.field1192 == 0) { // L: 7981
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7982
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7983
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7984
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7985
					var4.idleSequence = var4.definition.idleSequence; // L: 7986
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7987
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7988
					var4.method2353(class19.localPlayer.pathX[0] + var6, class19.localPlayer.pathY[0] + var7, var5 == 1); // L: 7989
					continue; // L: 7990
				}
			}

			var1.exportIndex(); // L: 7991
			return; // L: 7992
		}
	}
}
