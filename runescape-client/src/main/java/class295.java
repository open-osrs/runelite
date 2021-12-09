import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public enum class295 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3790(-1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3789(0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3793(1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	field3791(2);

	@ObfuscatedName("ak")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1445944371
	)
	final int field3792;

	class295(int var3) {
		this.field3792 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3792; // L: 20
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1999955592"
	)
	public static boolean method5515() {
		long var0 = Ignored.method6459(); // L: 42
		int var2 = (int)(var0 - UserComparator7.field1319); // L: 43
		UserComparator7.field1319 = var0; // L: 44
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
						var3.removeDual(); // L: 67
						NetCache.NetCache_pendingResponses.put(var3, var3.key); // L: 68
						--NetCache.NetCache_pendingWritesCount; // L: 69
						++NetCache.NetCache_pendingResponsesCount; // L: 70
					}

					for (int var15 = 0; var15 < 100; ++var15) { // L: 72
						int var16 = NetCache.NetCache_socket.available(); // L: 73
						if (var16 < 0) { // L: 74
							throw new IOException();
						}

						if (var16 == 0) { // L: 75
							break;
						}

						NetCache.NetCache_loadTime = 0; // L: 76
						byte var5 = 0; // L: 77
						if (class279.NetCache_currentResponse == null) { // L: 78
							var5 = 8;
						} else if (NetCache.field3863 == 0) { // L: 79
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
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 81
							if (var6 > var16) { // L: 82
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6); // L: 83
							if (NetCache.field3866 != 0) { // L: 84
								for (var7 = 0; var7 < var6; ++var7) { // L: 85
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3866;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer; // L: 87
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) { // L: 88
								break;
							}

							if (class279.NetCache_currentResponse == null) { // L: 89
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 90
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 91
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 92
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 93
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 94
								long var11 = (long)(var8 + (var7 << 16)); // L: 95
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 96
								class21.field116 = true; // L: 97
								if (var13 == null) { // L: 98
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 99
									class21.field116 = false; // L: 100
								}

								if (var13 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 105
								class279.NetCache_currentResponse = var13; // L: 106
								class149.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + class279.NetCache_currentResponse.padding); // L: 107
								class149.NetCache_responseArchiveBuffer.writeByte(var9); // L: 108
								class149.NetCache_responseArchiveBuffer.writeInt(var10); // L: 109
								NetCache.field3863 = 8; // L: 110
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 111
							} else if (NetCache.field3863 == 0) { // L: 114
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 115
									NetCache.field3863 = 1; // L: 116
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 117
								} else {
									class279.NetCache_currentResponse = null; // L: 121
								}
							}
						} else {
							var6 = class149.NetCache_responseArchiveBuffer.array.length - class279.NetCache_currentResponse.padding; // L: 127
							var7 = 512 - NetCache.field3863; // L: 128
							if (var7 > var6 - class149.NetCache_responseArchiveBuffer.offset) { // L: 129
								var7 = var6 - class149.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 130
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class149.NetCache_responseArchiveBuffer.array, class149.NetCache_responseArchiveBuffer.offset, var7); // L: 131
							if (NetCache.field3866 != 0) { // L: 132
								for (var8 = 0; var8 < var7; ++var8) { // L: 133
									var10000 = class149.NetCache_responseArchiveBuffer.array;
									var10001 = class149.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3866;
								}
							}

							var22 = class149.NetCache_responseArchiveBuffer; // L: 135
							var22.offset += var7;
							NetCache.field3863 += var7; // L: 136
							if (var6 == class149.NetCache_responseArchiveBuffer.offset) { // L: 137
								if (16711935L == class279.NetCache_currentResponse.key) { // L: 138
									WorldMapLabel.NetCache_reference = class149.NetCache_responseArchiveBuffer; // L: 139

									for (var8 = 0; var8 < 256; ++var8) { // L: 140
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 141
										if (var17 != null) { // L: 142
											WorldMapLabel.NetCache_reference.offset = var8 * 8 + 5; // L: 143
											var10 = WorldMapLabel.NetCache_reference.readInt(); // L: 144
											int var18 = WorldMapLabel.NetCache_reference.readInt(); // L: 145
											var17.loadIndex(var10, var18); // L: 146
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 151
									NetCache.NetCache_crc.update(class149.NetCache_responseArchiveBuffer.array, 0, var6); // L: 152
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 153
									if (var8 != class279.NetCache_currentResponse.crc) { // L: 154
										try {
											NetCache.NetCache_socket.close(); // L: 156
										} catch (Exception var20) { // L: 158
										}

										++NetCache.NetCache_crcMismatches; // L: 159
										NetCache.NetCache_socket = null; // L: 160
										NetCache.field3866 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 161
										return false; // L: 162
									}

									NetCache.NetCache_crcMismatches = 0; // L: 164
									NetCache.NetCache_ioExceptions = 0; // L: 165
									class279.NetCache_currentResponse.archive.write((int)(class279.NetCache_currentResponse.key & 65535L), class149.NetCache_responseArchiveBuffer.array, 16711680L == (class279.NetCache_currentResponse.key & 16711680L), class21.field116); // L: 166
								}

								class279.NetCache_currentResponse.remove(); // L: 168
								if (class21.field116) { // L: 169
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 170
								}

								NetCache.field3863 = 0; // L: 171
								class279.NetCache_currentResponse = null; // L: 172
								class149.NetCache_responseArchiveBuffer = null; // L: 173
							} else {
								if (NetCache.field3863 != 512) { // L: 175
									break;
								}

								NetCache.field3863 = 0;
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
}
