import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, (byte)2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -156777687
	)
	static int field2828;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1514256887
	)
	@Export("type")
	final int type;
	@ObfuscatedName("m")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-1177052487"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 65
		if (var1 != null) { // L: 66
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 67
			var1 = new NPCComposition(); // L: 68
			var1.id = var0; // L: 69
			if (var2 != null) { // L: 70
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 71
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 72
			return var1; // L: 73
		}
	}
}
