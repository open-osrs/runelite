import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 288727621
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 248860015
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1362059855
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("f")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 22843739
	)
	public int field1833;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1370123751
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("x")
	public boolean field1835;
	@ObfuscatedName("c")
	public boolean field1836;
	@ObfuscatedName("j")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("s")
	int[] field1845;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 930567691
	)
	int field1840;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 866597645
	)
	int field1848;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 144925397
	)
	int field1842;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 899868617
	)
	int field1843;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("z")
	int[] field1846;
	@ObfuscatedName("e")
	byte[] field1847;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2089169819
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1835 = true; // L: 24
		this.field1836 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1840 = Integer.MAX_VALUE; // L: 29
		this.field1848 = Integer.MAX_VALUE; // L: 30
		this.field1842 = Integer.MIN_VALUE; // L: 31
		this.field1843 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-1866592266"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-654586001"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method7742();
		} else if (var2 == 2) {
			this.sprite2 = var1.method7742();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1833 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1835 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1836 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1845 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1845[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1846 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1846.length; ++var5) { // L: 83
					this.field1846[var5] = var1.readInt();
				}

				this.field1847 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1847[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method7742(); // L: 90
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
					var1.method7742(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)ChatChannel.findEnumerated(LoginScreenAnimation.method2235(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1944, VerticalAlignment.field1947}; // L: 120
					this.verticalAlignment = (VerticalAlignment)ChatChannel.findEnumerated(var3, var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1239402235"
	)
	public void method3383() {
		if (this.field1845 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1845.length; var1 += 2) { // L: 129
				if (this.field1845[var1] < this.field1840) { // L: 130
					this.field1840 = this.field1845[var1];
				} else if (this.field1845[var1] > this.field1842) { // L: 131
					this.field1842 = this.field1845[var1];
				}

				if (this.field1845[var1 + 1] < this.field1848) { // L: 132
					this.field1848 = this.field1845[var1 + 1];
				} else if (this.field1845[var1 + 1] > this.field1843) {
					this.field1843 = this.field1845[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lql;",
		garbageValue = "921852844"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lql;",
		garbageValue = "-1"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = InterfaceParent.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1723398131"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-496863975"
	)
	public static void method3384(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67
}
