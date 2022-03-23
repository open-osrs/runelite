import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class65 {
	@ObfuscatedName("l")
	static final BigInteger field861;
	@ObfuscatedName("n")
	static final BigInteger field862;

	static {
		field861 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field862 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-685134646"
	)
	public static boolean method1875() {
		long var0 = WorldMapSprite.method4989(); // L: 42
		int var2 = (int)(var0 - NetCache.field3976); // L: 43
		NetCache.field3976 = var0; // L: 44
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
						if (NetCache.NetCache_currentResponse == null) { // L: 78
							var5 = 8;
						} else if (NetCache.field3990 == 0) { // L: 79
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
							if (NetCache.field3999 != 0) { // L: 84
								for (var7 = 0; var7 < var6; ++var7) { // L: 85
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3999;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer; // L: 87
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) { // L: 88
								break;
							}

							if (NetCache.NetCache_currentResponse == null) { // L: 89
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 90
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 91
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 92
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 93
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 94
								long var11 = (long)(var8 + (var7 << 16)); // L: 95
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 96
								ClanChannel.field1673 = true; // L: 97
								if (var13 == null) { // L: 98
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 99
									ClanChannel.field1673 = false; // L: 100
								}

								if (var13 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 105
								NetCache.NetCache_currentResponse = var13; // L: 106
								class291.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + NetCache.NetCache_currentResponse.padding); // L: 107
								class291.NetCache_responseArchiveBuffer.writeByte(var9); // L: 108
								class291.NetCache_responseArchiveBuffer.writeInt(var10); // L: 109
								NetCache.field3990 = 8; // L: 110
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 111
							} else if (NetCache.field3990 == 0) { // L: 114
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 115
									NetCache.field3990 = 1; // L: 116
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 117
								} else {
									NetCache.NetCache_currentResponse = null; // L: 121
								}
							}
						} else {
							var6 = class291.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding; // L: 127
							var7 = 512 - NetCache.field3990; // L: 128
							if (var7 > var6 - class291.NetCache_responseArchiveBuffer.offset) { // L: 129
								var7 = var6 - class291.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 130
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class291.NetCache_responseArchiveBuffer.array, class291.NetCache_responseArchiveBuffer.offset, var7); // L: 131
							if (NetCache.field3999 != 0) { // L: 132
								for (var8 = 0; var8 < var7; ++var8) { // L: 133
									var10000 = class291.NetCache_responseArchiveBuffer.array;
									var10001 = class291.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3999;
								}
							}

							var22 = class291.NetCache_responseArchiveBuffer; // L: 135
							var22.offset += var7;
							NetCache.field3990 += var7; // L: 136
							if (var6 == class291.NetCache_responseArchiveBuffer.offset) { // L: 137
								if (NetCache.NetCache_currentResponse.key == 16711935L) { // L: 138
									class122.NetCache_reference = class291.NetCache_responseArchiveBuffer; // L: 139

									for (var8 = 0; var8 < 256; ++var8) { // L: 140
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 141
										if (var17 != null) { // L: 142
											class122.NetCache_reference.offset = var8 * 8 + 5; // L: 143
											var10 = class122.NetCache_reference.readInt(); // L: 144
											int var18 = class122.NetCache_reference.readInt(); // L: 145
											var17.loadIndex(var10, var18); // L: 146
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 151
									NetCache.NetCache_crc.update(class291.NetCache_responseArchiveBuffer.array, 0, var6); // L: 152
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 153
									if (var8 != NetCache.NetCache_currentResponse.crc) { // L: 154
										try {
											NetCache.NetCache_socket.close(); // L: 156
										} catch (Exception var20) { // L: 158
										}

										++NetCache.NetCache_crcMismatches; // L: 159
										NetCache.NetCache_socket = null; // L: 160
										NetCache.field3999 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 161
										return false; // L: 162
									}

									NetCache.NetCache_crcMismatches = 0; // L: 164
									NetCache.NetCache_ioExceptions = 0; // L: 165
									NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), class291.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, ClanChannel.field1673); // L: 166
								}

								NetCache.NetCache_currentResponse.remove(); // L: 168
								if (ClanChannel.field1673) { // L: 169
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 170
								}

								NetCache.field3990 = 0; // L: 171
								NetCache.NetCache_currentResponse = null; // L: 172
								class291.NetCache_responseArchiveBuffer = null; // L: 173
							} else {
								if (NetCache.field3990 != 512) { // L: 175
									break;
								}

								NetCache.field3990 = 0;
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)J",
		garbageValue = "126"
	)
	static long method1867(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-381402387"
	)
	static PacketBufferNode method1876() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "138595425"
	)
	public static int[] method1869() {
		int[] var0 = new int[KeyHandler.field132]; // L: 240

		for (int var1 = 0; var1 < KeyHandler.field132; ++var1) { // L: 241
			var0[var1] = KeyHandler.field139[var1]; // L: 242
		}

		return var0; // L: 244
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIZI)V",
		garbageValue = "561334145"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10170
			Widget var6 = var0[var5]; // L: 10171
			if (var6 != null && var6.parentId == var1) { // L: 10172 10173
				class116.alignWidgetSize(var6, var2, var3, var4); // L: 10174
				class162.alignWidgetPosition(var6, var2, var3); // L: 10175
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10176
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10177
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10178
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10179
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10180
					GrandExchangeEvents.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10182
}
