import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("qm")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("fm")
	static String field2140;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 356488237
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1222085259
	)
	@Export("type")
	final int type;
	@ObfuscatedName("k")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "104390740"
	)
	static final void method3830(int var0) {
		int[] var1 = class11.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
					PlayerComposition.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
					PlayerComposition.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class11.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
					class138.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
					class138.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = PlayerComposition.scene.getFloorDecorationTag(VertexNormal.Client_plane, var5, var6);
				if (0L != var7) {
					int var9 = InterfaceParent.Entity_unpackID(var7);
					int var10 = class245.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class13.WorldMapElement_get(var10).field1634) {
						Client.mapIcons[Client.mapIconCount] = class13.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		class244.rasterProvider.apply();
	}
}
