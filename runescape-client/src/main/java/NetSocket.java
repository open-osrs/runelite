import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("n")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("c")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("m")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("k")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("z")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -667333841
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1790870427
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("e")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1964059901
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1087306249
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lei;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4535"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					PlayerType.method5099(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread)this.task.result).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1430321597"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "823949627"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "593938417"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "195666295"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-4"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outOffset == this.outLength) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outOffset == this.outLength) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			}
		} catch (Exception var12) {
			class4.RunException_sendStackTrace((String)null, var12);
		}

	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Loq;II)V",
		garbageValue = "-1829651268"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		int var4;
		int var6;
		byte[] var10000;
		int var19;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var19 = Players.Players_indices[var4];
			if ((Players.field1244[var19] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1244;
					var10000[var19] = (byte)(var10000[var19] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = ReflectionCheck.method1083(var0);
						var10000 = Players.field1244;
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						NetCache.readPlayerUpdate(var0, var19);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var19 = Players.Players_indices[var4];
				if ((Players.field1244[var19] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1244;
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = ReflectionCheck.method1083(var0);
							var10000 = Players.field1244;
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							NetCache.readPlayerUpdate(var0, var19);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var19 = Players.Players_emptyIndices[var4];
					if ((Players.field1244[var19] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1244;
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = ReflectionCheck.method1083(var0);
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else if (MusicPatchNode.updateExternalPlayer(var0, var19)) {
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var19 = Players.Players_emptyIndices[var4];
						if ((Players.field1244[var19] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = ReflectionCheck.method1083(var0);
									var10000 = Players.field1244;
									var10000[var19] = (byte)(var10000[var19] | 2);
								} else if (MusicPatchNode.updateExternalPlayer(var0, var19)) {
									var10000 = Players.field1244;
									var10000[var19] = (byte)(var10000[var19] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1244;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = Client.players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 4) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}

							byte var7 = -1;
							if ((var6 & 512) != 0) {
								var7 = var0.method6901();
							}

							if ((var6 & 256) != 0) {
								var5.field1135 = var0.method6899();
								var5.field1141 = var0.method6899();
								var5.field1121 = var0.method6848();
								var5.field1110 = var0.method6899();
								var5.field1139 = var0.method6940() + Client.cycle;
								var5.field1140 = var0.readUnsignedShort() + Client.cycle;
								var5.field1101 = var0.readUnsignedShort();
								if (var5.field1074) {
									var5.field1135 += var5.tileX;
									var5.field1141 += var5.tileY;
									var5.field1121 += var5.tileX;
									var5.field1110 += var5.tileY;
									var5.pathLength = 0;
								} else {
									var5.field1135 += var5.pathX[0];
									var5.field1141 += var5.pathY[0];
									var5.field1121 += var5.pathX[0];
									var5.field1110 += var5.pathY[0];
									var5.pathLength = 1;
								}

								var5.field1152 = 0;
							}

							if ((var6 & 8192) != 0) {
								Players.field1245[var4] = var0.method6899();
							}

							int var8;
							int var9;
							if ((var6 & 16) != 0) {
								var8 = var0.method6940();
								if (var8 == 65535) {
									var8 = -1;
								}

								var9 = var0.method6844();
								PacketWriter.performPlayerAnimation(var5, var8, var9);
							}

							if ((var6 & 32) != 0) {
								var5.overheadText = var0.readStringCp1252NullTerminated();
								if (var5.overheadText.charAt(0) == '~') {
									var5.overheadText = var5.overheadText.substring(1);
									SecureRandomCallable.addGameMessage(2, var5.username.getName(), var5.overheadText);
								} else if (var5 == class129.localPlayer) {
									SecureRandomCallable.addGameMessage(2, var5.username.getName(), var5.overheadText);
								}

								var5.isAutoChatting = false;
								var5.overheadTextColor = 0;
								var5.overheadTextEffect = 0;
								var5.overheadTextCyclesRemaining = 150;
							}

							if ((var6 & 8) != 0) {
								var5.targetIndex = var0.method6940();
								if (var5.targetIndex == 65535) {
									var5.targetIndex = -1;
								}
							}

							int var11;
							int var12;
							int var15;
							if ((var6 & 64) != 0) {
								var8 = var0.method6940();
								PlayerType var16 = (PlayerType)class260.findEnumerated(StructComposition.PlayerType_values(), var0.method6844());
								boolean var10 = var0.readUnsignedByte() == 1;
								var11 = var0.method6849();
								var12 = var0.offset;
								if (var5.username != null && var5.appearance != null) {
									boolean var13 = false;
									if (var16.isUser && class20.friendSystem.isIgnored(var5.username)) {
										var13 = true;
									}

									if (!var13 && Client.field602 == 0 && !var5.isHidden) {
										Players.field1255.offset = 0;
										var0.method7010(Players.field1255.array, 0, var11);
										Players.field1255.offset = 0;
										String var14 = AbstractFont.escapeBrackets(class113.method2480(FloorDecoration.method4029(Players.field1255)));
										var5.overheadText = var14.trim();
										var5.overheadTextColor = var8 >> 8;
										var5.overheadTextEffect = var8 & 255;
										var5.overheadTextCyclesRemaining = 150;
										var5.isAutoChatting = var10;
										var5.field1108 = var5 != class129.localPlayer && var16.isUser && "" != Client.field647 && var14.toLowerCase().indexOf(Client.field647) == -1;
										if (var16.isPrivileged) {
											var15 = var10 ? 91 : 1;
										} else {
											var15 = var10 ? 90 : 2;
										}

										if (var16.modIcon != -1) {
											SecureRandomCallable.addGameMessage(var15, ApproximateRouteStrategy.method1122(var16.modIcon) + var5.username.getName(), var14);
										} else {
											SecureRandomCallable.addGameMessage(var15, var5.username.getName(), var14);
										}
									}
								}

								var0.offset = var12 + var11;
							}

							if ((var6 & 2048) != 0) {
								var5.spotAnimation = var0.method6853();
								var8 = var0.readInt();
								var5.field1134 = var8 >> 16;
								var5.field1133 = (var8 & 65535) + Client.cycle;
								var5.spotAnimationFrame = 0;
								var5.spotAnimationFrameCycle = 0;
								if (var5.field1133 > Client.cycle) {
									var5.spotAnimationFrame = -1;
								}

								if (var5.spotAnimation == 65535) {
									var5.spotAnimation = -1;
								}
							}

							if ((var6 & 2) != 0) {
								var8 = var0.readUnsignedByte();
								byte[] var23 = new byte[var8];
								Buffer var17 = new Buffer(var23);
								var0.method7010(var23, 0, var8);
								Players.field1246[var4] = var17;
								var5.read(var17);
							}

							if ((var6 & 128) != 0) {
								var5.field1096 = var0.method6853();
								if (var5.pathLength == 0) {
									var5.orientation = var5.field1096;
									var5.field1096 = -1;
								}
							}

							if ((var6 & 1) != 0) {
								var8 = var0.method6844();
								int var18;
								int var20;
								int var22;
								if (var8 > 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var11 = -1;
										var12 = -1;
										var22 = -1;
										var20 = var0.readUShortSmart();
										if (var20 == 32767) {
											var20 = var0.readUShortSmart();
											var12 = var0.readUShortSmart();
											var11 = var0.readUShortSmart();
											var22 = var0.readUShortSmart();
										} else if (var20 != 32766) {
											var12 = var0.readUShortSmart();
										} else {
											var20 = -1;
										}

										var18 = var0.readUShortSmart();
										var5.addHitSplat(var20, var12, var11, var22, Client.cycle, var18);
									}
								}

								var9 = var0.readUnsignedByte();
								if (var9 > 0) {
									for (var20 = 0; var20 < var9; ++var20) {
										var11 = var0.readUShortSmart();
										var12 = var0.readUShortSmart();
										if (var12 != 32767) {
											var22 = var0.readUShortSmart();
											var18 = var0.method6844();
											var15 = var12 > 0 ? var0.method7007() : var18;
											var5.addHealthBar(var11, Client.cycle, var12, var22, var18, var15);
										} else {
											var5.removeHealthBar(var11);
										}
									}
								}
							}

							if ((var6 & 1024) != 0) {
								for (var8 = 0; var8 < 3; ++var8) {
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}

							if (var5.field1074) {
								if (var7 == 127) {
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									byte var21;
									if (var7 != -1) {
										var21 = var7;
									} else {
										var21 = Players.field1245[var4];
									}

									var5.method2072(var5.tileX, var5.tileY, var21);
								}
							}
						}

						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(B)Lno;",
		garbageValue = "14"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class65.worldMap;
	}
}
