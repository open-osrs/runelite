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
		this.field3792 = var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3792;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1999955592"
	)
	public static boolean method5515() {
		long var0 = Ignored.method6459();
		int var2 = (int)(var0 - UserComparator7.field1319);
		UserComparator7.field1319 = var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2;
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
			return true;
		} else if (NetCache.NetCache_socket == null) {
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) {
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
						var4 = new Buffer(4);
						var4.writeByte(1);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingPriorityWritesCount;
						++NetCache.NetCache_pendingPriorityResponsesCount;
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
						var4 = new Buffer(4);
						var4.writeByte(0);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
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
						if (class279.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3863 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) {
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset;
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field3866 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3866;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (class279.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								class21.field116 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									class21.field116 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9;
								class279.NetCache_currentResponse = var13;
								class149.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + class279.NetCache_currentResponse.padding);
								class149.NetCache_responseArchiveBuffer.writeByte(var9);
								class149.NetCache_responseArchiveBuffer.writeInt(var10);
								NetCache.field3863 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field3863 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field3863 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									class279.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = class149.NetCache_responseArchiveBuffer.array.length - class279.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field3863;
							if (var7 > var6 - class149.NetCache_responseArchiveBuffer.offset) {
								var7 = var6 - class149.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class149.NetCache_responseArchiveBuffer.array, class149.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field3866 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = class149.NetCache_responseArchiveBuffer.array;
									var10001 = class149.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3866;
								}
							}

							var22 = class149.NetCache_responseArchiveBuffer;
							var22.offset += var7;
							NetCache.field3863 += var7;
							if (var6 == class149.NetCache_responseArchiveBuffer.offset) {
								if (16711935L == class279.NetCache_currentResponse.key) {
									WorldMapLabel.NetCache_reference = class149.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											WorldMapLabel.NetCache_reference.offset = var8 * 8 + 5;
											var10 = WorldMapLabel.NetCache_reference.readInt();
											int var18 = WorldMapLabel.NetCache_reference.readInt();
											var17.loadIndex(var10, var18);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(class149.NetCache_responseArchiveBuffer.array, 0, var6);
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != class279.NetCache_currentResponse.crc) {
										try {
											NetCache.NetCache_socket.close();
										} catch (Exception var20) {
										}

										++NetCache.NetCache_crcMismatches;
										NetCache.NetCache_socket = null;
										NetCache.field3866 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									class279.NetCache_currentResponse.archive.write((int)(class279.NetCache_currentResponse.key & 65535L), class149.NetCache_responseArchiveBuffer.array, 16711680L == (class279.NetCache_currentResponse.key & 16711680L), class21.field116);
								}

								class279.NetCache_currentResponse.remove();
								if (class21.field116) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field3863 = 0;
								class279.NetCache_currentResponse = null;
								class149.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field3863 != 512) {
									break;
								}

								NetCache.field3863 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var19) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
				return false;
			}
		}
	}
}
