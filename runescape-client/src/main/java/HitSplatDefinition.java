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
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
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
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(64); // L: 19
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field1934 = 70;
		this.field1935 = -1; // L: 29
		this.field1936 = -1; // L: 30
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
	} // L: 43

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-73"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-610372981"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method7400();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field1935 = var1.method7400();
		} else if (var2 == 4) { // L: 73
			this.field1937 = var1.method7400();
		} else if (var2 == 5) { // L: 74
			this.field1936 = var1.method7400();
		} else if (var2 == 6) { // L: 75
			this.field1938 = var1.method7400();
		} else if (var2 == 7) { // L: 76
			this.field1929 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field1942 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field1934 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field1940 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field1943 = 0;
		} else if (var2 == 12) { // L: 81
			this.field1946 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field1944 = var1.readShort();
		} else if (var2 == 14) {
			this.field1943 = var1.readUnsignedShort(); // L: 83
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;",
		garbageValue = "1792198587"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class273.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator6.method2554(var2) : null; // L: 112 113
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
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedFonts.get((long)this.field1935);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1935, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.field1935);
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
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedFonts.get((long)this.field1936);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1936, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.field1936);
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
		if (this.field1937 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedFonts.get((long)this.field1937);
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1937, 0); // L: 150
				if (var1 != null) { // L: 151
					HitSplatDefinition_cachedFonts.put(var1, (long)this.field1937);
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-2015320605"
	)
	public SpritePixels method3454() {
		if (this.field1938 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedFonts.get((long)this.field1938); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1939, this.field1938, 0); // L: 160
				if (var1 != null) { // L: 161
					HitSplatDefinition_cachedFonts.put(var1, (long)this.field1938);
				}

				return var1; // L: 163
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
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)HealthBarDefinition_cached.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				AbstractArchive var3 = field1939; // L: 171
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 172
				int var5 = this.fontId; // L: 173
				Font var2;
				if (!class147.method3009(var3, var5, 0)) { // L: 175
					var2 = null; // L: 176
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 180
					Font var6;
					if (var7 == null) { // L: 182
						var6 = null; // L: 183
					} else {
						Font var8 = new Font(var7, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels); // L: 186
						UserComparator3.method2529(); // L: 187
						var6 = var8; // L: 188
					}

					var2 = var6; // L: 190
				}

				if (var2 != null) { // L: 193
					HealthBarDefinition_cached.put(var2, (long)this.fontId);
				}

				return var2; // L: 195
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
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20); // L: 35
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "77"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 115

		for (int var6 = 0; var6 < var5; ++var6) { // L: 116
			char var7 = var0.charAt(var6 + var1); // L: 117
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 118
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 119
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 120
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 121
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 122
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 123
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 124
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 125
				var3[var6 + var4] = -121;
			} else if (var7 == 710) { // L: 126
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) { // L: 127
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 128
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 129
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 130
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 131
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 132
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 133
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 134
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 135
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 136
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 137
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 138
			} else if (var7 == 732) { // L: 139
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 140
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 141
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 142
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 143
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 144
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 145
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 146
			}
		}

		return var5; // L: 148
	}
}
