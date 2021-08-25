import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("v")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("f")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("s")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lot;IZB)V",
		garbageValue = "-49"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lot;ZB)V",
		garbageValue = "-12"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method6985();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbg;",
		garbageValue = "-121"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SecureRandomCallable.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = AttackOption.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Loi;",
		garbageValue = "-1458921113"
	)
	public static IndexedSprite method3896() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class413.SpriteBuffer_spriteWidth;
		var0.height = class413.SpriteBuffer_spriteHeight;
		var0.xOffset = class413.SpriteBuffer_xOffsets[0];
		var0.yOffset = class413.SpriteBuffer_yOffsets[0];
		var0.subWidth = InvDefinition.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class413.SpriteBuffer_spriteHeights[0];
		var0.palette = ItemContainer.SpriteBuffer_spritePalette;
		var0.pixels = class283.SpriteBuffer_pixels[0];
		class413.SpriteBuffer_xOffsets = null;
		class413.SpriteBuffer_yOffsets = null;
		InvDefinition.SpriteBuffer_spriteWidths = null;
		class413.SpriteBuffer_spriteHeights = null;
		ItemContainer.SpriteBuffer_spritePalette = null;
		class283.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1896027"
	)
	static boolean method3903() {
		return VarbitComposition.clientPreferences.field1192 >= Client.field485;
	}
}
