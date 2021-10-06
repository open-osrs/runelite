import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public enum class112 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1363(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1358(2, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1359(3, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1362(1, 3);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1343295737
	)
	public final int field1361;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -7588353
	)
	@Export("id")
	final int id;

	class112(int var3, int var4) {
		this.field1361 = var3;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfg;",
		garbageValue = "2143323219"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferAgeComparator.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "200795103"
	)
	static void method2474(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1793606804"
	)
	static final void method2468(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field701[var4] = true;
			}
		}

	}
}
