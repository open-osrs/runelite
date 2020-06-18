import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	static IndexedSprite field206;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1169931065
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lap;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -278806663
	)
	@Export("element")
	int element;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lar;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -475422811
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -463998497
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhg;Lhg;ILap;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "0"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Lar;",
		garbageValue = "35"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1804331962"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1265869629"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "19136800"
	)
	@Export("init")
	void init() {
		this.element = Canvas.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(Client.WorldMapElement_get(this.element));
		WorldMapElement var1 = Client.WorldMapElement_get(this.getElement());
		Sprite var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1486718795"
	)
	static SecureRandom method348() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "([BIIIIIIILem;[Lfz;I)V",
		garbageValue = "1704898412"
	)
	static final void method365(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method5732();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectDefinition var21 = Canvas.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var23 + var2;
					int var32 = var16 & 7;
					int var33 = var15 & 7;
					int var35 = var21.sizeX;
					int var36 = var21.sizeY;
					int var37;
					if ((var20 & 1) == 1) {
						var37 = var35;
						var35 = var36;
						var36 = var37;
					}

					int var34 = var7 & 3;
					int var31;
					if (var34 == 0) {
						var31 = var33;
					} else if (var34 == 1) {
						var31 = 7 - var32 - (var35 - 1);
					} else if (var34 == 2) {
						var31 = 7 - var33 - (var36 - 1);
					} else {
						var31 = var32;
					}

					var37 = var31 + var3;
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
						int var38 = var1;
						if ((Tiles.Tiles_renderFlags[1][var29][var37] & 2) == 2) {
							var38 = var1 - 1;
						}

						CollisionMap var39 = null;
						if (var38 >= 0) {
							var39 = var9[var38];
						}

						class41.method623(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
					}
				}
			}
		}
	}
}
