import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1870134493
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 11799
	} // L: 11800

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 11803
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lem;",
		garbageValue = "-1875014155"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1497706067"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 17
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1033303884"
	)
	static void method2286() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-918339029"
	)
	static final int method2285() {
		return Client.menuOptionsCount - 1; // L: 9101
	}
}
