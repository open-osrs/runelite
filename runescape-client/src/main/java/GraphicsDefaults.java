import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1168914555
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -153891603
	)
	public int field4373;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 889630627
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -214563943
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2847389
	)
	public int field4376;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1531771617
	)
	public int field4377;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 822510473
	)
	public int field4378;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1018736855
	)
	public int field4374;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1369265667
	)
	public int field4375;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2053526401
	)
	public int field4381;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1936619473
	)
	public int field4372;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4373 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4376 = -1; // L: 11
		this.field4377 = -1; // L: 12
		this.field4378 = -1; // L: 13
		this.field4374 = -1; // L: 14
		this.field4375 = -1; // L: 15
		this.field4381 = -1; // L: 16
		this.field4372 = -1; // L: 17
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "-901187341"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4370.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 28
				break;
			case 2:
				this.compass = var3.method7532(); // L: 33
				this.field4373 = var3.method7532(); // L: 34
				this.mapScenes = var3.method7532(); // L: 35
				this.headIconsPk = var3.method7532(); // L: 36
				this.field4376 = var3.method7532(); // L: 37
				this.field4377 = var3.method7532(); // L: 38
				this.field4378 = var3.method7532(); // L: 39
				this.field4374 = var3.method7532(); // L: 40
				this.field4375 = var3.method7532(); // L: 41
				this.field4381 = var3.method7532(); // L: 42
				this.field4372 = var3.method7532(); // L: 43
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-62"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 171
			VarcInt.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	static final void method6732(int var0) {
		int[] var1 = InterfaceParent.sceneMinimapSprite.pixels; // L: 5947
		int var2 = var1.length; // L: 5948

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5949
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5950
			var4 = (103 - var3) * 2048 + 24628; // L: 5951

			for (var5 = 1; var5 < 103; ++var5) { // L: 5952
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5953
					class175.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5954
					class175.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5955
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5958
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5959
		InterfaceParent.sceneMinimapSprite.setRaster(); // L: 5960

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5961
			for (var6 = 1; var6 < 103; ++var6) { // L: 5962
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5963
					WorldMapEvent.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5964
					WorldMapEvent.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5967

		for (var5 = 0; var5 < 104; ++var5) { // L: 5968
			for (var6 = 0; var6 < 104; ++var6) { // L: 5969
				long var7 = class175.scene.getFloorDecorationTag(class128.Client_plane, var5, var6); // L: 5970
				if (var7 != 0L) { // L: 5971
					int var9 = NetSocket.Entity_unpackID(var7); // L: 5972
					int var10 = class82.getObjectDefinition(var9).mapIconId; // L: 5973
					if (var10 >= 0 && class120.WorldMapElement_get(var10).field1874) { // L: 5974 5975
						Client.mapIcons[Client.mapIconCount] = class120.WorldMapElement_get(var10).getSpriteBool(false); // L: 5978
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5979
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5980
						++Client.mapIconCount; // L: 5981
					}
				}
			}
		}

		DevicePcmPlayerProvider.rasterProvider.apply(); // L: 5986
	} // L: 5987

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1911416331"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapDecoration.loadInterface(var0)) { // L: 11974
			Widget[] var1 = NetSocket.Widget_interfaceComponents[var0]; // L: 11975

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11976
				Widget var3 = var1[var2]; // L: 11977
				if (var3 != null) { // L: 11978
					var3.modelFrame = 0; // L: 11979
					var3.modelFrameCycle = 0; // L: 11980
				}
			}

		}
	} // L: 11982
}
