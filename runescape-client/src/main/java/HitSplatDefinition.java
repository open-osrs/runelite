import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -78193355
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -867488021
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 566909491
	)
	public int field1998;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2072278043
	)
	int field1999;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -367586383
	)
	int field2000;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 530891065
	)
	int field2001;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1859926009
	)
	int field2002;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 621557545
	)
	public int field2003;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1339697259
	)
	public int field2004;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2090677099
	)
	public int field2005;
	@ObfuscatedName("y")
	String field2010;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 859094637
	)
	public int field2007;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 494157579
	)
	public int field2011;
	@ObfuscatedName("z")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -608530201
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1991065381
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
		this.field1998 = 70; // L: 28
		this.field1999 = -1; // L: 29
		this.field2000 = -1; // L: 30
		this.field2001 = -1; // L: 31
		this.field2002 = -1; // L: 32
		this.field2003 = 0; // L: 33
		this.field2004 = 0; // L: 34
		this.field2005 = -1; // L: 35
		this.field2010 = ""; // L: 36
		this.field2007 = -1; // L: 37
		this.field2011 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1833933416"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "127877365"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method7692();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field1999 = var1.method7692();
		} else if (var2 == 4) { // L: 73
			this.field2001 = var1.method7692();
		} else if (var2 == 5) { // L: 74
			this.field2000 = var1.method7692();
		} else if (var2 == 6) { // L: 75
			this.field2002 = var1.method7692();
		} else if (var2 == 7) { // L: 76
			this.field2003 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field2010 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field1998 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field2004 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field2005 = 0;
		} else if (var2 == 12) { // L: 81
			this.field2007 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field2011 = var1.readShort();
		} else if (var2 == 14) {
			this.field2005 = var1.readUnsignedShort(); // L: 83
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgs;",
		garbageValue = "-505226354"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator3.method2602(var2) : null; // L: 112 113
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "864399323"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2010; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + ItemLayer.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "872036041"
	)
	public SpritePixels method3625() {
		if (this.field1999 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1999); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field1999, 0); // L: 130
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1999); // L: 131
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1662028806"
	)
	public SpritePixels method3640() {
		if (this.field2000 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2000); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2000, 0); // L: 140
				if (var1 != null) { // L: 141
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2000);
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "927571164"
	)
	public SpritePixels method3626() {
		if (this.field2001 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2001); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2001, 0); // L: 150
				if (var1 != null) { // L: 151
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2001);
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1943622040"
	)
	public SpritePixels method3627() {
		if (this.field2002 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2002); // L: 158
			if (var1 != null) { // L: 159
				return var1;
			} else {
				var1 = class6.SpriteBuffer_getSprite(class282.field3261, this.field2002, 0); // L: 160
				if (var1 != null) { // L: 161
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2002);
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lmd;",
		garbageValue = "-1180066279"
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
				var1 = class163.method3322(class282.field3261, class349.HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 170
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 171
				}

				return var1; // L: 173
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "12"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}
}
