import java.io.IOException;
import java.security.SecureRandom;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1982051309
	)
	static int widgetDragDuration;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1829902819
	)
	static int graphicsTickTimeIdx;
	@ObfuscatedName("gc")
	static int[][] xteaKeys;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1415372023
	)
	int orientationA;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -506654425
	)
	int tileHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1147548215
	)
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1940819727
	)
	int y;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1131836163
	)
	int orientationB;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public Entity entity1;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public Entity entity2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 6638213269109827123L
	)
	public long tag;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1666155333
	)
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1497980399"
	)
	public static boolean method3384() {
		long var0 = PacketWriter.currentTimeMillis(); // L: 42
		int var2 = (int)(var0 - NetCache.field3195); // L: 43
		NetCache.field3195 = var0; // L: 44
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
						if (TilePaint.NetCache_currentResponse == null) { // L: 78
							var5 = 8;
						} else if (NetCache.field3205 == 0) { // L: 79
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
							if (NetCache.field3208 != 0) { // L: 84
								for (var7 = 0; var7 < var6; ++var7) { // L: 85
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field3208;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer; // L: 87
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) { // L: 88
								break;
							}

							if (TilePaint.NetCache_currentResponse == null) { // L: 89
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 90
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 91
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 92
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 93
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 94
								long var11 = (long)(var8 + (var7 << 16)); // L: 95
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 96
								UrlRequest.field1986 = true; // L: 97
								if (var13 == null) { // L: 98
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 99
									UrlRequest.field1986 = false; // L: 100
								}

								if (var13 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 105
								TilePaint.NetCache_currentResponse = var13; // L: 106
								class224.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + TilePaint.NetCache_currentResponse.padding); // L: 107
								class224.NetCache_responseArchiveBuffer.writeByte(var9); // L: 108
								class224.NetCache_responseArchiveBuffer.writeInt(var10); // L: 109
								NetCache.field3205 = 8; // L: 110
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 111
							} else if (NetCache.field3205 == 0) { // L: 114
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 115
									NetCache.field3205 = 1; // L: 116
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 117
								} else {
									TilePaint.NetCache_currentResponse = null; // L: 121
								}
							}
						} else {
							var6 = class224.NetCache_responseArchiveBuffer.array.length - TilePaint.NetCache_currentResponse.padding; // L: 127
							var7 = 512 - NetCache.field3205; // L: 128
							if (var7 > var6 - class224.NetCache_responseArchiveBuffer.offset) { // L: 129
								var7 = var6 - class224.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 130
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class224.NetCache_responseArchiveBuffer.array, class224.NetCache_responseArchiveBuffer.offset, var7); // L: 131
							if (NetCache.field3208 != 0) { // L: 132
								for (var8 = 0; var8 < var7; ++var8) { // L: 133
									var10000 = class224.NetCache_responseArchiveBuffer.array;
									var10001 = var8 + class224.NetCache_responseArchiveBuffer.offset;
									var10000[var10001] ^= NetCache.field3208;
								}
							}

							var22 = class224.NetCache_responseArchiveBuffer; // L: 135
							var22.offset += var7;
							NetCache.field3205 += var7; // L: 136
							if (var6 == class224.NetCache_responseArchiveBuffer.offset) { // L: 137
								if (16711935L == TilePaint.NetCache_currentResponse.key) { // L: 138
									MenuAction.NetCache_reference = class224.NetCache_responseArchiveBuffer; // L: 139

									for (var8 = 0; var8 < 256; ++var8) { // L: 140
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 141
										if (var17 != null) { // L: 142
											MenuAction.NetCache_reference.offset = var8 * 8 + 5; // L: 143
											var10 = MenuAction.NetCache_reference.readInt(); // L: 144
											int var18 = MenuAction.NetCache_reference.readInt(); // L: 145
											var17.loadIndex(var10, var18); // L: 146
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 151
									NetCache.NetCache_crc.update(class224.NetCache_responseArchiveBuffer.array, 0, var6); // L: 152
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 153
									if (var8 != TilePaint.NetCache_currentResponse.crc) { // L: 154
										try {
											NetCache.NetCache_socket.close(); // L: 156
										} catch (Exception var20) { // L: 158
										}

										++NetCache.NetCache_crcMismatches; // L: 159
										NetCache.NetCache_socket = null; // L: 160
										NetCache.field3208 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 161
										return false; // L: 162
									}

									NetCache.NetCache_crcMismatches = 0; // L: 164
									NetCache.NetCache_ioExceptions = 0; // L: 165
									TilePaint.NetCache_currentResponse.archive.write((int)(TilePaint.NetCache_currentResponse.key & 65535L), class224.NetCache_responseArchiveBuffer.array, 16711680L == (TilePaint.NetCache_currentResponse.key & 16711680L), UrlRequest.field1986); // L: 166
								}

								TilePaint.NetCache_currentResponse.remove(); // L: 168
								if (UrlRequest.field1986) { // L: 169
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 170
								}

								NetCache.field3205 = 0; // L: 171
								TilePaint.NetCache_currentResponse = null; // L: 172
								class224.NetCache_responseArchiveBuffer = null; // L: 173
							} else {
								if (NetCache.field3205 != 512) { // L: 175
									break;
								}

								NetCache.field3205 = 0;
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lju;",
		garbageValue = "1966430023"
	)
	static HorizontalAlignment[] method3386() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3479, HorizontalAlignment.field3481}; // L: 14
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;Lic;Lge;B)Z",
		garbageValue = "72"
	)
	public static boolean method3385(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class206.musicPatchesArchive = var0; // L: 26
		class206.musicSamplesArchive = var1; // L: 27
		ModelData0.soundEffectsArchive = var2; // L: 28
		class206.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-579146436"
	)
	static SecureRandom method3387() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}
}
