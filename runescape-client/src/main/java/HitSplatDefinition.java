import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 94930249
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 686766047
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2105047485
	)
	public int field1944;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1942953281
	)
	int field1953;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1147561849
	)
	int field1954;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1759102975
	)
	int field1955;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1125972115
	)
	int field1956;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1621904885
	)
	public int field1957;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2049678163
	)
	public int field1952;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1036282431
	)
	public int field1959;
	@ObfuscatedName("g")
	String field1960;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2045691497
	)
	public int field1961;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1085768131
	)
	public int field1958;
	@ObfuscatedName("b")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2018519527
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1546252907
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
		this.field1944 = 70; // L: 28
		this.field1953 = -1; // L: 29
		this.field1954 = -1; // L: 30
		this.field1955 = -1; // L: 31
		this.field1956 = -1; // L: 32
		this.field1957 = 0; // L: 33
		this.field1952 = 0; // L: 34
		this.field1959 = -1; // L: 35
		this.field1960 = ""; // L: 36
		this.field1961 = -1; // L: 37
		this.field1958 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "101"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-633903385"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method7352();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field1953 = var1.method7352();
		} else if (var2 == 4) {
			this.field1955 = var1.method7352();
		} else if (var2 == 5) {
			this.field1954 = var1.method7352();
		} else if (var2 == 6) {
			this.field1956 = var1.method7352();
		} else if (var2 == 7) {
			this.field1957 = var1.readShort();
		} else if (var2 == 8) {
			this.field1960 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1944 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1952 = var1.readShort();
		} else if (var2 == 11) {
			this.field1959 = 0;
		} else if (var2 == 12) {
			this.field1961 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field1958 = var1.readShort();
		} else if (var2 == 14) {
			this.field1959 = var1.readUnsignedShort();
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
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;",
		garbageValue = "1373539159"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class375.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class293.method5480(var2) : null; // L: 106 107
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2056247959"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1960; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class121.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "1497260899"
	)
	public SpritePixels method3450() {
		if (this.field1953 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1953); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1953, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1953); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "636789367"
	)
	public SpritePixels method3411() {
		if (this.field1954 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1954); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1954, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1954);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "-140418588"
	)
	public SpritePixels method3418() {
		if (this.field1955 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1955); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1955, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1955); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lpt;",
		garbageValue = "0"
	)
	public SpritePixels method3419() {
		if (this.field1956 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1956); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = class126.SpriteBuffer_getSprite(Frames.field2379, this.field1956, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1956); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Llv;",
		garbageValue = "-26"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = Frames.field2379; // L: 165
				AbstractArchive var4 = class413.HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				Font var2;
				if (!class125.method2744(var3, var5, 0)) { // L: 169
					var2 = null; // L: 170
				} else {
					var2 = Clock.method3125(var4.takeFile(var5, 0)); // L: 173
				}

				if (var2 != null) { // L: 176
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 178
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfg;IB)V",
		garbageValue = "0"
	)
	static void method3456(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 67
		var5.plane = var0; // L: 68
		var5.x = var1 * 128; // L: 69
		var5.y = var2 * 128; // L: 70
		int var6 = var3.sizeX; // L: 71
		int var7 = var3.sizeY; // L: 72
		if (var4 == 1 || var4 == 3) { // L: 73
			var6 = var3.sizeY; // L: 74
			var7 = var3.sizeX; // L: 75
		}

		var5.maxX = (var6 + var1) * 128; // L: 77
		var5.maxY = (var7 + var2) * 128; // L: 78
		var5.soundEffectId = var3.ambientSoundId; // L: 79
		var5.field822 = var3.int7 * 128; // L: 80
		var5.field820 = var3.int5; // L: 81
		var5.field830 = var3.int6; // L: 82
		var5.soundEffectIds = var3.soundEffectIds; // L: 83
		if (var3.transforms != null) { // L: 84
			var5.obj = var3; // L: 85
			var5.set(); // L: 86
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 88
		if (var5.soundEffectIds != null) { // L: 89
			var5.field826 = var5.field820 + (int)(Math.random() * (double)(var5.field830 - var5.field820));
		}

	} // L: 90

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2128803730"
	)
	public static int method3455(int var0) {
		if (var0 > 0) { // L: 196
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 197 198
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1464715593"
	)
	static void method3454() {
		Client.menuOptionsCount = 0; // L: 8124
		Client.isMenuOpen = false; // L: 8125
	} // L: 8126
}
