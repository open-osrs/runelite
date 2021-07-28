import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("h")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("k")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("a")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;IZB)V",
		garbageValue = "-124"
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnv;ZI)V",
		garbageValue = "2145575528"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method6674();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhi;",
		garbageValue = "-1217280037"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2787, ServerPacket.field2746, ServerPacket.field2693, ServerPacket.field2692, ServerPacket.field2695, ServerPacket.field2768, ServerPacket.field2697, ServerPacket.field2719, ServerPacket.field2699, ServerPacket.field2700, ServerPacket.field2701, ServerPacket.field2702, ServerPacket.field2767, ServerPacket.field2704, ServerPacket.field2705, ServerPacket.field2706, ServerPacket.field2707, ServerPacket.field2757, ServerPacket.field2755, ServerPacket.field2710, ServerPacket.field2694, ServerPacket.field2712, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2748, ServerPacket.field2711, ServerPacket.field2750, ServerPacket.field2718, ServerPacket.field2717, ServerPacket.field2728, ServerPacket.field2721, ServerPacket.field2703, ServerPacket.field2723, ServerPacket.field2724, ServerPacket.field2725, ServerPacket.field2726, ServerPacket.field2756, ServerPacket.field2715, ServerPacket.field2729, ServerPacket.field2730, ServerPacket.field2731, ServerPacket.field2774, ServerPacket.field2733, ServerPacket.field2734, ServerPacket.field2735, ServerPacket.field2736, ServerPacket.field2737, ServerPacket.field2738, ServerPacket.field2709, ServerPacket.field2740, ServerPacket.field2741, ServerPacket.field2742, ServerPacket.field2720, ServerPacket.field2744, ServerPacket.field2745, ServerPacket.field2727, ServerPacket.field2732, ServerPacket.field2781, ServerPacket.field2749, ServerPacket.field2770, ServerPacket.field2751, ServerPacket.field2752, ServerPacket.field2747, ServerPacket.field2754, ServerPacket.field2722, ServerPacket.field2769, ServerPacket.field2698, ServerPacket.field2758, ServerPacket.field2759, ServerPacket.field2760, ServerPacket.field2761, ServerPacket.field2762, ServerPacket.field2763, ServerPacket.field2708, ServerPacket.field2765, ServerPacket.field2766, ServerPacket.field2716, ServerPacket.field2783, ServerPacket.field2777, ServerPacket.field2743, ServerPacket.field2771, ServerPacket.field2772, ServerPacket.field2773, ServerPacket.field2691, ServerPacket.field2775, ServerPacket.field2776, ServerPacket.field2764, ServerPacket.field2778, ServerPacket.field2779, ServerPacket.field2780, ServerPacket.field2753, ServerPacket.field2782, ServerPacket.field2696, ServerPacket.field2784, ServerPacket.field2785};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lag;",
		garbageValue = "-58"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class112.getNextWorldListWorld();
	}
}
