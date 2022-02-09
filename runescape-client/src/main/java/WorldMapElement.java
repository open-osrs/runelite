import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lfr;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1073841185
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "[Ljz;"
	)
	static Widget[] field1784;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 229041495
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 429528577
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 162961485
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1943912081
	)
	public int field1767;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1737738457
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("u")
	public boolean field1769;
	@ObfuscatedName("h")
	public boolean field1773;
	@ObfuscatedName("q")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("x")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("p")
	int[] field1770;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1933187729
	)
	int field1762;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -890732985
	)
	int field1775;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 747675219
	)
	int field1776;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1606317103
	)
	int field1777;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("t")
	int[] field1780;
	@ObfuscatedName("k")
	byte[] field1768;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 90726405
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
		this.field1769 = true; // L: 24
		this.field1773 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1762 = Integer.MAX_VALUE; // L: 29
		this.field1775 = Integer.MAX_VALUE; // L: 30
		this.field1776 = Integer.MIN_VALUE; // L: 31
		this.field1777 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-72"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-82268678"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method7352();
		} else if (var2 == 2) {
			this.sprite2 = var1.method7352();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1767 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1769 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1773 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1770 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1770[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1780 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1780.length; ++var5) { // L: 83
					this.field1780[var5] = var1.readInt();
				}

				this.field1768 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1768[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method7352(); // L: 90
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
					var1.method7352(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1844, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1842}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)class140.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					this.verticalAlignment = (VerticalAlignment)class140.findEnumerated(KeyHandler.method322(), var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	public void method3164() {
		if (this.field1770 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1770.length; var1 += 2) { // L: 129
				if (this.field1770[var1] < this.field1762) { // L: 130
					this.field1762 = this.field1770[var1];
				} else if (this.field1770[var1] > this.field1776) { // L: 131
					this.field1776 = this.field1770[var1];
				}

				if (this.field1770[var1 + 1] < this.field1775) { // L: 132
					this.field1775 = this.field1770[var1 + 1];
				} else if (this.field1770[var1 + 1] > this.field1777) {
					this.field1777 = this.field1770[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpt;",
		garbageValue = "-723757733"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lpt;",
		garbageValue = "-2025134260"
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
				var2 = class126.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1836205442"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
