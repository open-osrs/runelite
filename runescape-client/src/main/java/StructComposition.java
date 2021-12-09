import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1697114474"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "260928351"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "76"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = Canvas.readStringIntParameters(var1, this.params);
		}

	} // L: 46

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1808649424"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class12.method158(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1725182955"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Skeleton.method3948(this.params, var1, var2); // L: 53
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public static void method3444() {
		class260.midiPcmStream.clear(); // L: 42
		class260.musicPlayerStatus = 1; // L: 43
		class124.musicTrackArchive = null; // L: 44
	} // L: 45

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public static boolean method3424(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field132[var0] : false; // L: 236 237
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "488868822"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12615
		short[] var2 = new short[16]; // L: 12616
		int var3 = 0; // L: 12617

		for (int var4 = 0; var4 < WorldMapLabelSize.ItemDefinition_fileCount; ++var4) { // L: 12618
			ItemComposition var9 = UserComparator6.ItemDefinition_get(var4); // L: 12619
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12620 12621 12622
				if (var3 >= 250) { // L: 12623
					GraphicsDefaults.foundItemIdCount = -1; // L: 12624
					class113.foundItemIds = null; // L: 12625
					return; // L: 12626
				}

				if (var3 >= var2.length) { // L: 12628
					short[] var6 = new short[var2.length * 2]; // L: 12629

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12630
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12631
				}

				var2[var3++] = (short)var4; // L: 12633
			}
		}

		class113.foundItemIds = var2; // L: 12635
		class336.foundItemIndex = 0; // L: 12636
		GraphicsDefaults.foundItemIdCount = var3; // L: 12637
		String[] var8 = new String[GraphicsDefaults.foundItemIdCount]; // L: 12638

		for (int var5 = 0; var5 < GraphicsDefaults.foundItemIdCount; ++var5) { // L: 12639
			var8[var5] = UserComparator6.ItemDefinition_get(var2[var5]).name;
		}

		KeyHandler.method390(var8, class113.foundItemIds); // L: 12640
	} // L: 12641
}
