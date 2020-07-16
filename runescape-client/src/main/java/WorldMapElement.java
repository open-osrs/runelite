import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1135374529
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 712564113
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 211021913
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 492639717
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("u")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1414394937
	)
	public int field3251;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1395285175
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("y")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("c")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("h")
	int[] field3243;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 234759337
	)
	int field3252;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1681954435
	)
	int field3242;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 407708591
	)
	int field3254;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 345147075
	)
	int field3255;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("l")
	int[] field3258;
	@ObfuscatedName("t")
	byte[] field3259;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -524595041
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.menuActions = new String[5];
		this.field3252 = Integer.MAX_VALUE;
		this.field3242 = Integer.MAX_VALUE;
		this.field3254 = Integer.MIN_VALUE;
		this.field3255 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "106"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "1696894212"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method5843();
		} else if (var2 == 2) {
			this.sprite2 = var1.method5843();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field3251 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
				}

				if ((var3 & 2) == 2) {
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field3243 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field3243[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field3258 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field3258.length; ++var5) {
					this.field3258[var5] = var1.readInt();
				}

				this.field3259 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field3259[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method5843();
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
					var1.method5843();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)FaceNormal.findEnumerated(GrandExchangeOfferNameComparator.method207(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)FaceNormal.findEnumerated(class219.method4106(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	public void method4548() {
		if (this.field3243 != null) {
			for (int var1 = 0; var1 < this.field3243.length; var1 += 2) {
				if (this.field3243[var1] < this.field3252) {
					this.field3252 = this.field3243[var1];
				} else if (this.field3243[var1] > this.field3254) {
					this.field3254 = this.field3243[var1];
				}

				if (this.field3243[var1 + 1] < this.field3242) {
					this.field3242 = this.field3243[var1 + 1];
				} else if (this.field3243[var1 + 1] > this.field3255) {
					this.field3255 = this.field3243[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llz;",
		garbageValue = "-314713437"
	)
	@Export("getSpriteBool")
	public Sprite getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Llz;",
		garbageValue = "1760825025"
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
				var2 = GameShell.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1240109519"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkn;Llf;I)Llf;",
		garbageValue = "1394866461"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			int var4 = var2 - 1;
			var4 |= var4 >>> 1;
			var4 |= var4 >>> 2;
			var4 |= var4 >>> 4;
			var4 |= var4 >>> 8;
			var4 |= var4 >>> 16;
			var3 = var4 + 1;
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var7 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var7) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILhg;ZI)V",
		garbageValue = "284772848"
	)
	static void method4566(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = ClanChat.getWorldMap().getMapArea(var0);
		int var4 = class60.localPlayer.plane;
		int var5 = (class60.localPlayer.x >> 7) + class182.baseX;
		int var6 = (class60.localPlayer.y >> 7) + SecureRandomFuture.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		ClanChat.getWorldMap().method6538(var3, var7, var1, var2);
	}
}
