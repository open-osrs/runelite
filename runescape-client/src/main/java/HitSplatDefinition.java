import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	static AbstractArchive field1799;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("p")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1566126037
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2057498117
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -960185975
	)
	public int field1805;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -722283867
	)
	int field1809;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1206908659
	)
	int field1813;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 289668931
	)
	int field1798;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 349750373
	)
	int field1811;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2034733799
	)
	public int field1812;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1578977171
	)
	public int field1807;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -256974621
	)
	public int field1814;
	@ObfuscatedName("m")
	String field1815;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1437250481
	)
	public int field1816;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -379140099
	)
	public int field1820;
	@ObfuscatedName("h")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 880580953
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1573055713
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field1805 = 70; // L: 28
		this.field1809 = -1; // L: 29
		this.field1813 = -1; // L: 30
		this.field1798 = -1; // L: 31
		this.field1811 = -1; // L: 32
		this.field1812 = 0; // L: 33
		this.field1807 = 0; // L: 34
		this.field1814 = -1; // L: 35
		this.field1815 = ""; // L: 36
		this.field1816 = -1; // L: 37
		this.field1820 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "2128528466"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1870837993"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method6946();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field1809 = var1.method6946();
		} else if (var2 == 4) { // L: 73
			this.field1798 = var1.method6946();
		} else if (var2 == 5) { // L: 74
			this.field1813 = var1.method6946();
		} else if (var2 == 6) { // L: 75
			this.field1811 = var1.method6946();
		} else if (var2 == 7) { // L: 76
			this.field1812 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field1815 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field1805 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field1807 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field1814 = 0;
		} else if (var2 == 12) { // L: 81
			this.field1816 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field1820 = var1.readShort();
		} else if (var2 == 14) {
			this.field1814 = var1.readUnsignedShort(); // L: 83
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lfl;",
		garbageValue = "-1137405392"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class119.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Canvas.method372(var2) : null; // L: 112 113
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2122770328"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1815; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + MusicPatchNode2.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1867638082"
	)
	public SpritePixels method3256() {
		if (this.field1809 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1809); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1809, 0); // L: 130
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1809); // L: 131
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Low;",
		garbageValue = "-49"
	)
	public SpritePixels method3286() {
		if (this.field1813 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1813); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1813, 0); // L: 140
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1813); // L: 141
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Low;",
		garbageValue = "16101"
	)
	public SpritePixels method3258() {
		if (this.field1798 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1798); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1798, 0); // L: 150
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1798); // L: 151
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Low;",
		garbageValue = "64"
	)
	public SpritePixels method3281() {
		if (this.field1811 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1811); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1811, 0); // L: 160
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1811); // L: 161
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Lle;",
		garbageValue = "-1825391526"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				AbstractArchive var3 = field1799; // L: 171
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 172
				int var5 = this.fontId; // L: 173
				Font var2;
				if (!BuddyRankComparator.method2502(var3, var5, 0)) { // L: 175
					var2 = null; // L: 176
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 180
					Font var6;
					if (var7 == null) { // L: 182
						var6 = null; // L: 183
					} else {
						Font var8 = new Font(var7, class414.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, UrlRequester.SpriteBuffer_spriteWidths, class414.SpriteBuffer_spriteHeights, SpriteBuffer_spritePalette, class295.SpriteBuffer_pixels); // L: 186
						PacketBuffer.method6913(); // L: 187
						var6 = var8; // L: 188
					}

					var2 = var6; // L: 190
				}

				if (var2 != null) { // L: 193
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 195
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	static final void method3267(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class115.guestClanChannel; // L: 11828
		if (var2 != null && var1 >= 0 && var1 < var2.method2809()) { // L: 11829
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11830
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 11832
				PacketWriter var5 = Client.packetWriter; // L: 11833
				PacketBufferNode var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2750, var5.isaacCipher); // L: 11834
				var6.packetBuffer.writeByte(3 + Client.stringCp1252NullTerminatedByteSize(var4)); // L: 11835
				var6.packetBuffer.writeByte(var0); // L: 11836
				var6.packetBuffer.writeShort(var1); // L: 11837
				var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11838
				var5.addNode(var6); // L: 11839
			}
		}
	} // L: 11831 11840
}
