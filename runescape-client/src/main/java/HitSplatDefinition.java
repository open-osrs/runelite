import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static AbstractArchive field1939;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1196014399
	)
	static int field1945;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1020787021
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -583114937
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -308590223
	)
	public int field1934;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2014586653
	)
	int field1935;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2142835759
	)
	int field1936;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1151055999
	)
	int field1937;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -734578061
	)
	int field1938;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 527762707
	)
	public int field1929;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -743842931
	)
	public int field1940;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1359104371
	)
	public int field1943;
	@ObfuscatedName("q")
	String field1942;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1381662827
	)
	public int field1946;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1891074319
	)
	public int field1944;
	@ObfuscatedName("i")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 406628061
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2095157281
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1934 = 70;
		this.field1935 = -1;
		this.field1936 = -1;
		this.field1937 = -1;
		this.field1938 = -1;
		this.field1929 = 0;
		this.field1940 = 0;
		this.field1943 = -1;
		this.field1942 = "";
		this.field1946 = -1;
		this.field1944 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-73"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-610372981"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method7400();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1935 = var1.method7400();
		} else if (var2 == 4) {
			this.field1937 = var1.method7400();
		} else if (var2 == 5) {
			this.field1936 = var1.method7400();
		} else if (var2 == 6) {
			this.field1938 = var1.method7400();
		} else if (var2 == 7) {
			this.field1929 = var1.readShort();
		} else if (var2 == 8) {
			this.field1942 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1934 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1940 = var1.readShort();
		} else if (var2 == 11) {
			this.field1943 = 0;
		} else if (var2 == 12) {
			this.field1946 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1944 = var1.readShort();
		} else if (var2 == 14) {
			this.field1943 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;",
		garbageValue = "1792198587"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class273.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator6.method2554(var2) : null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1610563649"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1942;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + ByteArrayPool.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Lpl;",
		garbageValue = "25"
	)
	public SpritePixels method3451() {
		if (this.field1935 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1935);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1935, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1935);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lpl;",
		garbageValue = "-32"
	)
	public SpritePixels method3452() {
		if (this.field1936 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1936);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1936, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1936);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "1542636708"
	)
	public SpritePixels method3453() {
		if (this.field1937 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1937);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1937, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1937);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-2015320605"
	)
	public SpritePixels method3454() {
		if (this.field1938 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HitSplatDefinition_cachedSprites.get((long)this.field1938);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1938, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1938);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-526352952"
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
				AbstractArchive var3 = field1939;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class147.method3009(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels);
						UserComparator3.method2529();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Liu;Lph;B)Liw;",
		garbageValue = "4"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "77"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}
}
