import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("d")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("c")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("j")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IZI)V",
		garbageValue = "-1186228166"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ZI)V",
		garbageValue = "-770265064"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method6597();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 31
				World.World_request = class32.urlRequester.request(new URL(class244.field2909));
			} else if (World.World_request.isDone()) { // L: 33
				byte[] var0 = World.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class9.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class9.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				class208.sortWorlds(class9.World_worlds, 0, class9.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				World.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			World.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1371665339"
	)
	public static void method3212() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 43
	} // L: 44

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1280452567"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11633
		short[] var2 = new short[16]; // L: 11634
		int var3 = 0; // L: 11635

		for (int var4 = 0; var4 < UserComparator8.ItemDefinition_fileCount; ++var4) { // L: 11636
			ItemComposition var9 = class23.ItemDefinition_get(var4); // L: 11637
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11638 11639 11640
				if (var3 >= 250) { // L: 11641
					ItemLayer.foundItemIdCount = -1; // L: 11642
					class19.foundItemIds = null; // L: 11643
					return; // L: 11644
				}

				if (var3 >= var2.length) { // L: 11646
					short[] var6 = new short[var2.length * 2]; // L: 11647

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11648
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11649
				}

				var2[var3++] = (short)var4; // L: 11651
			}
		}

		class19.foundItemIds = var2; // L: 11653
		class203.foundItemIndex = 0; // L: 11654
		ItemLayer.foundItemIdCount = var3; // L: 11655
		String[] var8 = new String[ItemLayer.foundItemIdCount]; // L: 11656

		for (int var5 = 0; var5 < ItemLayer.foundItemIdCount; ++var5) { // L: 11657
			var8[var5] = class23.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class19.foundItemIds; // L: 11658
		class283.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 11660
	} // L: 11662
}
