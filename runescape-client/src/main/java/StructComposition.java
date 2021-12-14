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
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1697114474"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "260928351"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
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

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1808649424"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class12.method158(this.params, var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1725182955"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Skeleton.method3948(this.params, var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public static void method3444() {
		class260.midiPcmStream.clear();
		class260.musicPlayerStatus = 1;
		class124.musicTrackArchive = null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public static boolean method3424(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field132[var0] : false;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "488868822"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < WorldMapLabelSize.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = UserComparator6.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					GraphicsDefaults.foundItemIdCount = -1;
					class113.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class113.foundItemIds = var2;
		class336.foundItemIndex = 0;
		GraphicsDefaults.foundItemIdCount = var3;
		String[] var8 = new String[GraphicsDefaults.foundItemIdCount];

		for (int var5 = 0; var5 < GraphicsDefaults.foundItemIdCount; ++var5) {
			var8[var5] = UserComparator6.ItemDefinition_get(var2[var5]).name;
		}

		KeyHandler.method390(var8, class113.foundItemIds);
	}
}
