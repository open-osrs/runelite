import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -313882237
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1872976045
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 698541949
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1917785735
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 937252763
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 307807739
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -706741873
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1147462173
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1046615135
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -132506543
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 92389715
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -276045913
	)
	int field1931;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 988545829
	)
	int field1925;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 927138423
	)
	int field1933;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1152663609
	)
	int field1920;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1721087493
	)
	int field1932;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -666576693
	)
	int field1936;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1378850457
	)
	int field1937;

	Occluder() {
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	public static boolean method3411() {
		long var0 = User.currentTimeMillis(); // L: 42
		int var2 = (int)(var0 - JagexCache.field2081); // L: 43
		JagexCache.field2081 = var0; // L: 44
		if (var2 > 200) { // L: 45
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2; // L: 46
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 47
			return true;
		} else if (NetCache.NetCache_socket == null) { // L: 48
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) { // L: 50
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 51
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 52
						var4 = new Buffer(4); // L: 53
						var4.writeByte(1); // L: 54
						var4.writeMedium((int)var3.key); // L: 55
						NetCache.NetCache_socket.write(var4.array, 0, 4); // L: 56
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key); // L: 57
						--NetCache.NetCache_pendingPriorityWritesCount; // L: 58
						++NetCache.NetCache_pendingPriorityResponsesCount; // L: 59
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 61
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 62
						var4 = new Buffer(4); // L: 63
						var4.writeByte(0); // L: 64
						var4.writeMedium((int)var3.key); // L: 65
						NetCache.NetCache_socket.write(var4.array, 0, 4); // L: 66
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingResponsesCount;
					}

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = NetCache.NetCache_socket.available();
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0;
						if (NetCache.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3190 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) { // L: 80
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset;
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field3207 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field3207;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (NetCache.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 92
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 94
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								NetCache.field3200 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 99
									NetCache.field3200 = false;
								}

								if (var13 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 105
								NetCache.NetCache_currentResponse = var13; // L: 106
								NetCache.NetCache_responseArchiveBuffer = new Buffer(var10 + var14 + NetCache.NetCache_currentResponse.padding); // L: 107
								NetCache.NetCache_responseArchiveBuffer.writeByte(var9); // L: 108
								NetCache.NetCache_responseArchiveBuffer.writeInt(var10); // L: 109
								NetCache.field3190 = 8; // L: 110
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 111
							} else if (NetCache.field3190 == 0) { // L: 114
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 115
									NetCache.field3190 = 1; // L: 116
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 117
								} else {
									NetCache.NetCache_currentResponse = null; // L: 121
								}
							}
						} else {
							var6 = NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding; // L: 127
							var7 = 512 - NetCache.field3190; // L: 128
							if (var7 > var6 - NetCache.NetCache_responseArchiveBuffer.offset) { // L: 129
								var7 = var6 - NetCache.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 130
								var7 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var7); // L: 131
							if (NetCache.field3207 != 0) { // L: 132
								for (var8 = 0; var8 < var7; ++var8) { // L: 133
									var10000 = NetCache.NetCache_responseArchiveBuffer.array;
									var10001 = var8 + NetCache.NetCache_responseArchiveBuffer.offset;
									var10000[var10001] ^= NetCache.field3207;
								}
							}

							var22 = NetCache.NetCache_responseArchiveBuffer; // L: 135
							var22.offset += var7;
							NetCache.field3190 += var7; // L: 136
							if (var6 == NetCache.NetCache_responseArchiveBuffer.offset) { // L: 137
								if (NetCache.NetCache_currentResponse.key == 16711935L) { // L: 138
									class90.NetCache_reference = NetCache.NetCache_responseArchiveBuffer; // L: 139

									for (var8 = 0; var8 < 256; ++var8) { // L: 140
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 141
										if (var17 != null) { // L: 142
											class90.NetCache_reference.offset = var8 * 8 + 5; // L: 143
											var10 = class90.NetCache_reference.readInt(); // L: 144
											int var18 = class90.NetCache_reference.readInt(); // L: 145
											var17.loadIndex(var10, var18); // L: 146
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 151
									NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var6); // L: 152
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 153
									if (var8 != NetCache.NetCache_currentResponse.crc) { // L: 154
										try {
											NetCache.NetCache_socket.close(); // L: 156
										} catch (Exception var20) { // L: 158
										}

										++NetCache.NetCache_crcMismatches; // L: 159
										NetCache.NetCache_socket = null; // L: 160
										NetCache.field3207 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 161
										return false; // L: 162
									}

									NetCache.NetCache_crcMismatches = 0; // L: 164
									NetCache.NetCache_ioExceptions = 0; // L: 165
									NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, NetCache.field3200); // L: 166
								}

								NetCache.NetCache_currentResponse.remove(); // L: 168
								if (NetCache.field3200) { // L: 169
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 170
								}

								NetCache.field3190 = 0; // L: 171
								NetCache.NetCache_currentResponse = null; // L: 172
								NetCache.NetCache_responseArchiveBuffer = null; // L: 173
							} else {
								if (NetCache.field3190 != 512) { // L: 175
									break;
								}

								NetCache.field3190 = 0;
							}
						}
					}

					return true; // L: 179
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close(); // L: 183
				} catch (Exception var19) { // L: 185
				}

				++NetCache.NetCache_ioExceptions; // L: 186
				NetCache.NetCache_socket = null; // L: 187
				return false; // L: 188
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;S)Ljava/lang/String;",
		garbageValue = "150"
	)
	static String method3413(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 81
				if (var7 == null) { // L: 82
					var1 = var1 + "| " + var6; // L: 100
					return var1; // L: 101
				}

				int var8 = var7.indexOf(40); // L: 83
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9); // L: 86
					int var11 = var10.indexOf(".java:"); // L: 87
					if (var11 >= 0) { // L: 88
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 89
						var1 = var1 + var10 + ' '; // L: 90
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim(); // L: 95
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 96
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1048299537"
	)
	static final int method3412(int var0, int var1) {
		int var2 = DynamicObject.method2357(var0 + 45365, var1 + 91923, 4) - 128 + (DynamicObject.method2357(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (DynamicObject.method2357(var0, var1, 1) - 128 >> 2); // L: 428
		var2 = (int)(0.3D * (double)var2) + 35; // L: 429
		if (var2 < 10) { // L: 430
			var2 = 10;
		} else if (var2 > 60) { // L: 431
			var2 = 60;
		}

		return var2; // L: 432
	}
}
