import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1742537505
	)
	public static int WorldMapElement_count;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2104194333
	)
	public final int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1581878653
	)
	public int sprite1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -886122493
	)
	int sprite2;
	@ObfuscatedName("w")
	public String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2144841941
	)
	public int field3243;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1165437927
	)
	public int textSize;
	@ObfuscatedName("d")
	public String[] menuActions;
	@ObfuscatedName("h")
	public String menuTargetName;
	@ObfuscatedName("a")
	int[] field3247;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -880693079
	)
	int field3248;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 328256207
	)
	int field3249;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1153457135
	)
	int field3250;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1976425027
	)
	int field3251;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("r")
	int[] field3253;
	@ObfuscatedName("u")
	byte[] field3242;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 763418107
	)
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.menuActions = new String[5]; // L: 24
		this.field3248 = Integer.MAX_VALUE; // L: 27
		this.field3249 = Integer.MAX_VALUE; // L: 28
		this.field3250 = Integer.MIN_VALUE; // L: 29
		this.field3251 = Integer.MIN_VALUE; // L: 30
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 31
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 32
		this.category = -1; // L: 35
		this.objectId = var1; // L: 38
	} // L: 39

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "-62"
	)
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 50
			if (var2 == 0) { // L: 51
				return; // L: 54
			}

			this.decodeNext(var1, var2); // L: 52
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IB)V",
		garbageValue = "87"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 57
			this.sprite1 = var1.method5634();
		} else if (var2 == 2) { // L: 58
			this.sprite2 = var1.method5634();
		} else if (var2 == 3) { // L: 59
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 60
			this.field3243 = var1.readMedium();
		} else if (var2 == 5) { // L: 61
			var1.readMedium(); // L: 62
		} else if (var2 == 6) { // L: 64
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 65
				var6 = var1.readUnsignedByte(); // L: 66
				if ((var6 & 1) == 0) { // L: 67
				}

				if ((var6 & 2) == 2) { // L: 68
				}
			} else if (var2 == 8) { // L: 70
				var1.readUnsignedByte(); // L: 71
			} else if (var2 >= 10 && var2 <= 14) { // L: 73
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 74
				var6 = var1.readUnsignedByte(); // L: 75
				this.field3247 = new int[var6 * 2]; // L: 76

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 77
					this.field3247[var4] = var1.readShort();
				}

				var1.readInt(); // L: 78
				var4 = var1.readUnsignedByte(); // L: 79
				this.field3253 = new int[var4]; // L: 80

				int var5;
				for (var5 = 0; var5 < this.field3253.length; ++var5) { // L: 81
					this.field3253[var5] = var1.readInt();
				}

				this.field3242 = new byte[var6]; // L: 82

				for (var5 = 0; var5 < var6; ++var5) { // L: 83
					this.field3242[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 85
				if (var2 == 17) { // L: 86
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 87
					var1.method5634(); // L: 88
				} else if (var2 == 19) { // L: 90
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 91
					var1.readInt(); // L: 92
				} else if (var2 == 22) { // L: 94
					var1.readInt(); // L: 95
				} else if (var2 == 23) { // L: 97
					var1.readUnsignedByte(); // L: 98
					var1.readUnsignedByte(); // L: 99
					var1.readUnsignedByte(); // L: 100
				} else if (var2 == 24) { // L: 102
					var1.readShort(); // L: 103
					var1.readShort(); // L: 104
				} else if (var2 == 25) { // L: 106
					var1.method5634(); // L: 107
				} else if (var2 == 28) { // L: 109
					var1.readUnsignedByte(); // L: 110
				} else if (var2 == 29) { // L: 112
					this.horizontalAlignment = (HorizontalAlignment)TextureProvider.findEnumerated(BoundaryObject.method3386(), var1.readUnsignedByte()); // L: 113
				} else if (var2 == 30) { // L: 115
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3221, VerticalAlignment.field3225}; // L: 118
					this.verticalAlignment = (VerticalAlignment)TextureProvider.findEnumerated(var3, var1.readUnsignedByte()); // L: 120
				}
			}
		}

	} // L: 123

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1332765917"
	)
	public void method4469() {
		if (this.field3247 != null) { // L: 126
			for (int var1 = 0; var1 < this.field3247.length; var1 += 2) { // L: 127
				if (this.field3247[var1] < this.field3248) { // L: 128
					this.field3248 = this.field3247[var1];
				} else if (this.field3247[var1] > this.field3250) { // L: 129
					this.field3250 = this.field3247[var1];
				}

				if (this.field3247[var1 + 1] < this.field3249) { // L: 130
					this.field3249 = this.field3247[var1 + 1];
				} else if (this.field3247[var1 + 1] > this.field3251) {
					this.field3251 = this.field3247[var1 + 1]; // L: 131
				}
			}
		}

	} // L: 134

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llp;",
		garbageValue = "435474118"
	)
	public Sprite getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 137
		return this.getSprite(var2); // L: 138
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Llp;",
		garbageValue = "-335461547"
	)
	Sprite getSprite(int var1) {
		if (var1 < 0) { // L: 142
			return null;
		} else {
			Sprite var2 = (Sprite)WorldMapElement_cachedSprites.get((long)var1); // L: 143
			if (var2 != null) { // L: 144
				return var2;
			} else {
				var2 = AbstractUserComparator.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 145
				if (var2 != null) { // L: 146
					WorldMapElement_cachedSprites.put(var2, (long)var1); // L: 147
				}

				return var2; // L: 149
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	public int getObjectId() {
		return this.objectId; // L: 153
	}
}
