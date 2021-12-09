import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2128430095
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1548608787
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1438813025
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -638140105
	)
	public int field1756;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1797672819
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("v")
	public boolean field1758;
	@ObfuscatedName("d")
	public boolean field1759;
	@ObfuscatedName("h")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("g")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("e")
	int[] field1762;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1652119417
	)
	int field1770;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 158634661
	)
	int field1764;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 772894737
	)
	int field1763;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1373703661
	)
	int field1766;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("x")
	int[] field1749;
	@ObfuscatedName("z")
	byte[] field1769;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -783407031
	)
	@Export("category")
	public int category;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1758 = true; // L: 24
		this.field1759 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1770 = Integer.MAX_VALUE; // L: 29
		this.field1764 = Integer.MAX_VALUE; // L: 30
		this.field1763 = Integer.MIN_VALUE; // L: 31
		this.field1766 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-20"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IS)V",
		garbageValue = "2466"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method7400();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method7400();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1756 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				if ((var3 & 1) == 0) { // L: 69
					this.field1758 = false;
				}

				if ((var3 & 2) == 2) { // L: 70
					this.field1759 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var3 = var1.readUnsignedByte(); // L: 77
				this.field1762 = new int[var3 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) { // L: 79
					this.field1762[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1749 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1749.length; ++var5) { // L: 83
					this.field1749[var5] = var1.readInt();
				}

				this.field1769 = new byte[var3]; // L: 84

				for (var5 = 0; var5 < var3; ++var5) { // L: 85
					this.field1769[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method7400(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method7400(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)class130.findEnumerated(class186.method3739(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					this.verticalAlignment = (VerticalAlignment)class130.findEnumerated(MouseHandler.method651(), var1.readUnsignedByte()); // L: 118
				}
			}
		}

	} // L: 121

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2062943344"
	)
	public void method3173() {
		if (this.field1762 != null) { // L: 124
			for (int var1 = 0; var1 < this.field1762.length; var1 += 2) { // L: 125
				if (this.field1762[var1] < this.field1770) { // L: 126
					this.field1770 = this.field1762[var1];
				} else if (this.field1762[var1] > this.field1763) { // L: 127
					this.field1763 = this.field1762[var1];
				}

				if (this.field1762[var1 + 1] < this.field1764) { // L: 128
					this.field1764 = this.field1762[var1 + 1];
				} else if (this.field1762[var1 + 1] > this.field1766) {
					this.field1766 = this.field1762[var1 + 1]; // L: 129
				}
			}
		}

	} // L: 132

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpl;",
		garbageValue = "690648807"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 135
		return this.getSprite(var2); // L: 136
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "-89662038"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 140
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)PlayerAppearance_cachedModels.get((long)var1); // L: 141
			if (var2 != null) { // L: 142
				return var2;
			} else {
				var2 = class6.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 143
				if (var2 != null) { // L: 144
					PlayerAppearance_cachedModels.put(var2, (long)var1); // L: 145
				}

				return var2; // L: 147
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 151
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5179"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		UrlRequest.method2489(); // L: 8786
		Client.menuActions[0] = "Cancel"; // L: 8787
		Client.menuTargets[0] = ""; // L: 8788
		Client.menuOpcodes[0] = 1006; // L: 8789
		Client.menuShiftClick[0] = false; // L: 8790
		Client.menuOptionsCount = 1; // L: 8791
	} // L: 8792
}
