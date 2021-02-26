import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	static Widget[] field362;
	@ObfuscatedName("a")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("w")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("k")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Lkx;IZI)V",
		garbageValue = "1841942277"
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
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lkx;ZI)V",
		garbageValue = "-1098628565"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method5833(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljg;",
		garbageValue = "1068014822"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	public static void method782() {
		if (class297.NetCache_socket != null) { // L: 102
			class297.NetCache_socket.close();
		}

	} // L: 103

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method781() {
		class300.method5473("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 154
	} // L: 155
}
