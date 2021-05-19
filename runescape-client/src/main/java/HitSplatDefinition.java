import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static AbstractArchive field1731;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -562228541
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1310441091
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -654467791
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 926003347
	)
	public int field1735;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -317860375
	)
	int field1732;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1265156123
	)
	int field1750;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 389377947
	)
	int field1746;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -874345173
	)
	int field1747;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1104481509
	)
	public int field1748;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1793396621
	)
	public int field1749;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 208289651
	)
	public int field1743;
	@ObfuscatedName("f")
	String field1751;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2027049703
	)
	public int field1752;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1572052995
	)
	public int field1753;
	@ObfuscatedName("w")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -965854333
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 329700349
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	public HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field1735 = 70; // L: 28
		this.field1732 = -1; // L: 29
		this.field1750 = -1; // L: 30
		this.field1746 = -1; // L: 31
		this.field1747 = -1; // L: 32
		this.field1748 = 0; // L: 33
		this.field1749 = 0; // L: 34
		this.field1743 = -1; // L: 35
		this.field1751 = ""; // L: 36
		this.field1752 = -1; // L: 37
		this.field1753 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-135808343"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 49
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1862722203"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6464();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1732 = var1.method6464();
		} else if (var2 == 4) {
			this.field1746 = var1.method6464();
		} else if (var2 == 5) {
			this.field1750 = var1.method6464();
		} else if (var2 == 6) {
			this.field1747 = var1.method6464();
		} else if (var2 == 7) {
			this.field1748 = var1.readShort();
		} else if (var2 == 8) {
			this.field1751 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 60
			this.field1735 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1749 = var1.readShort();
		} else if (var2 == 11) {
			this.field1743 = 0;
		} else if (var2 == 12) {
			this.field1752 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1753 = var1.readShort();
		} else if (var2 == 14) {
			this.field1743 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 71
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lep;",
		garbageValue = "-20229"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ObjectComposition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		if (var2 != -1) {
			HitSplatDefinition var4 = (HitSplatDefinition)HitSplatDefinition_cached.get((long)var2);
			HitSplatDefinition var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = HitSplatDefinition_archive.takeFile(32, var2);
				var4 = new HitSplatDefinition();
				if (var5 != null) { // L: 104
					var4.decode(new Buffer(var5));
				}

				HitSplatDefinition_cached.put(var4, (long)var2);
				var3 = var4;
			}

			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2025907756"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1751;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2; // L: 120
			}

			var2 = var2.substring(0, var3) + PendingSpawn.intToString(var1, false) + var2.substring(var3 + 2); // L: 118
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1353066238"
	)
	public SpritePixels method2890() {
		if (this.field1732 < 0) { // L: 124
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1732); // L: 125
			if (var1 != null) { // L: 126
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1732, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1732);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1885835544"
	)
	public SpritePixels method2893() {
		if (this.field1750 < 0) { // L: 134
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1750);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1750, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1750);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1224895394"
	)
	public SpritePixels method2871() {
		if (this.field1746 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1746);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1746, 0); // L: 147
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1746); // L: 148
				}

				return var1; // L: 150
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1519234970"
	)
	public SpritePixels method2872() {
		if (this.field1747 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1747); // L: 155
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1747, 0); // L: 157
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1747);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "247804226"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font) HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field1731;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Username.method5711(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 177
					Font var6;
					if (var7 == null) {
						var6 = null; // L: 180
					} else {
						Font var8 = new Font(var7, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels);
						class243.SpriteBuffer_xOffsets = null;
						class396.SpriteBuffer_yOffsets = null;
						ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
						class372.SpriteBuffer_spriteHeights = null;
						AccessFile.SpriteBuffer_spritePalette = null; // L: 189
						class396.SpriteBuffer_pixels = null; // L: 190
						var6 = var8; // L: 192
					}

					var2 = var6; // L: 194
				}

				if (var2 != null) { // L: 197
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 199
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092279976"
	)
	public static boolean method2896() {
		long var0 = Archive.currentTimeMillis(); // L: 42
		int var2 = (int)(var0 - SecureRandomCallable.field1108); // L: 43
		SecureRandomCallable.field1108 = var0; // L: 44
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
						if (class7.NetCache_currentResponse == null) { // L: 78
							var5 = 8;
						} else if (NetCache.field3626 == 0) { // L: 79
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
							if (NetCache.field3629 != 0) { // L: 84
								for (var7 = 0; var7 < var6; ++var7) { // L: 85
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3629;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer; // L: 87
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) { // L: 88
								break;
							}

							if (class7.NetCache_currentResponse == null) { // L: 89
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 90
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 91
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 92
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 93
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 94
								long var11 = (long)(var8 + (var7 << 16)); // L: 95
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 96
								PlayerType.field3563 = true; // L: 97
								if (var13 == null) { // L: 98
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 99
									PlayerType.field3563 = false; // L: 100
								}

								if (var13 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 105
								class7.NetCache_currentResponse = var13; // L: 106
								NetCache.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + class7.NetCache_currentResponse.padding); // L: 107
								NetCache.NetCache_responseArchiveBuffer.writeByte(var9); // L: 108
								NetCache.NetCache_responseArchiveBuffer.writeInt(var10); // L: 109
								NetCache.field3626 = 8; // L: 110
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 111
							} else if (NetCache.field3626 == 0) { // L: 114
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 115
									NetCache.field3626 = 1; // L: 116
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 117
								} else {
									class7.NetCache_currentResponse = null; // L: 121
								}
							}
						} else {
							var6 = NetCache.NetCache_responseArchiveBuffer.array.length - class7.NetCache_currentResponse.padding; // L: 127
							var7 = 512 - NetCache.field3626; // L: 128
							if (var7 > var6 - NetCache.NetCache_responseArchiveBuffer.offset) { // L: 129
								var7 = var6 - NetCache.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 130
								var7 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var7); // L: 131
							if (NetCache.field3629 != 0) { // L: 132
								for (var8 = 0; var8 < var7; ++var8) { // L: 133
									var10000 = NetCache.NetCache_responseArchiveBuffer.array;
									var10001 = NetCache.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3629;
								}
							}

							var22 = NetCache.NetCache_responseArchiveBuffer; // L: 135
							var22.offset += var7;
							NetCache.field3626 += var7; // L: 136
							if (var6 == NetCache.NetCache_responseArchiveBuffer.offset) { // L: 137
								if (class7.NetCache_currentResponse.key == 16711935L) { // L: 138
									SecureRandomCallable.NetCache_reference = NetCache.NetCache_responseArchiveBuffer; // L: 139

									for (var8 = 0; var8 < 256; ++var8) { // L: 140
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 141
										if (var17 != null) { // L: 142
											SecureRandomCallable.NetCache_reference.offset = var8 * 8 + 5; // L: 143
											var10 = SecureRandomCallable.NetCache_reference.readInt(); // L: 144
											int var18 = SecureRandomCallable.NetCache_reference.readInt(); // L: 145
											var17.loadIndex(var10, var18); // L: 146
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 151
									NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var6); // L: 152
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 153
									if (var8 != class7.NetCache_currentResponse.crc) { // L: 154
										try {
											NetCache.NetCache_socket.close(); // L: 156
										} catch (Exception var20) { // L: 158
										}

										++NetCache.NetCache_crcMismatches; // L: 159
										NetCache.NetCache_socket = null; // L: 160
										NetCache.field3629 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 161
										return false; // L: 162
									}

									NetCache.NetCache_crcMismatches = 0; // L: 164
									NetCache.NetCache_ioExceptions = 0; // L: 165
									class7.NetCache_currentResponse.archive.write((int)(class7.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (class7.NetCache_currentResponse.key & 16711680L), PlayerType.field3563); // L: 166
								}

								class7.NetCache_currentResponse.remove(); // L: 168
								if (PlayerType.field3563) { // L: 169
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 170
								}

								NetCache.field3626 = 0; // L: 171
								class7.NetCache_currentResponse = null; // L: 172
								NetCache.NetCache_responseArchiveBuffer = null; // L: 173
							} else {
								if (NetCache.field3626 != 512) { // L: 175
									break;
								}

								NetCache.field3626 = 0;
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

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2037549792"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4336
	}
}
