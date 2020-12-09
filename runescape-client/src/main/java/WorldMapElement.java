import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Liy;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1991794269
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1735605345
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 733089851
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2004503055
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2118102397
	)
	public int field3251;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1394872311
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("e")
	public boolean field3250;
	@ObfuscatedName("m")
	public boolean field3263;
	@ObfuscatedName("c")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("i")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("f")
	int[] field3254;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1853395127
	)
	int field3255;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1120447861
	)
	int field3256;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1444444969
	)
	int field3257;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 765833913
	)
	int field3258;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("s")
	int[] field3261;
	@ObfuscatedName("o")
	byte[] field3242;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1907461079
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field3250 = true;
		this.field3263 = false;
		this.menuActions = new String[5];
		this.field3255 = Integer.MAX_VALUE;
		this.field3256 = Integer.MAX_VALUE;
		this.field3257 = Integer.MIN_VALUE;
		this.field3258 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-1959908559"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-694353382"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method5559();
		} else if (var2 == 2) {
			this.sprite2 = var1.method5559();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field3251 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field3250 = false;
				}

				if ((var6 & 2) == 2) {
					this.field3263 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field3254 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field3254[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field3261 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field3261.length; ++var5) {
					this.field3261[var5] = var1.readInt();
				}

				this.field3242 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field3242[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method5559();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method5559();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field3491, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3490};
					this.horizontalAlignment = (HorizontalAlignment)UrlRequester.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.field3225, VerticalAlignment.field3229, VerticalAlignment.VerticalAlignment_centered};
					this.verticalAlignment = (VerticalAlignment)UrlRequester.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-604734124"
	)
	void method4391() {
		if (this.field3254 != null) {
			for (int var1 = 0; var1 < this.field3254.length; var1 += 2) {
				if (this.field3254[var1] < this.field3255) {
					this.field3255 = this.field3254[var1];
				} else if (this.field3254[var1] > this.field3257) {
					this.field3257 = this.field3254[var1];
				}

				if (this.field3254[var1 + 1] < this.field3256) {
					this.field3256 = this.field3254[var1 + 1];
				} else if (this.field3254[var1 + 1] > this.field3258) {
					this.field3258 = this.field3254[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llm;",
		garbageValue = "-375882692"
	)
	@Export("getSpriteBool")
	public Sprite getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Llm;",
		garbageValue = "954144981"
	)
	@Export("getSprite")
	Sprite getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			Sprite var2 = (Sprite)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Skills.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1401841512"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Liw;",
		garbageValue = "1557457090"
	)
	public static FloorUnderlayDefinition method4405(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
